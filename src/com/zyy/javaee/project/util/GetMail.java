package com.zyy.javaee.project.util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.FetchProfile;
import javax.mail.Folder;
import javax.mail.Header;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;

public class GetMail {
	String POP3Host = "POP3.126.com";
	public GetMail(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}


	String user = "";
	String password = "";
	Session session = null;
	
	Folder folder = null;
	
	Store store = null;

	public GetMail() {
		super();
	}

	public String getPOP3Host() {
		return POP3Host;
	}

	public void setPOP3Host(String pOP3Host) {
		POP3Host = pOP3Host;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Folder getFolder() {
		return folder;
	}

	public void setFolder(Folder folder) {
		this.folder = folder;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	
	//连接邮件服务器
	public void connect() throws Exception{
		POP3Auth auth = new POP3Auth();
		
		auth.setAount(user, password);
		
		Properties prop = new Properties();
		
		prop.put("mail.pop3.host", POP3Host);
		
		session  =Session.getDefaultInstance(prop, auth);
		
		store = session.getStore("pop3");
		store.connect(POP3Host, user, password);
		
		folder = store.getDefaultFolder().getFolder("INBOX");
		folder.open(Folder.READ_ONLY);
	}
	//获得所有邮件的列表
	public Message[] getAllMail()throws Exception{
		this.connect();
		
		Message[] msg = folder.getMessages();
		FetchProfile profile = new FetchProfile();
		profile.add(FetchProfile.Item.ENVELOPE);
		folder.fetch(msg, profile);
		
		return msg;
	}
 
	//取得邮件列表的信息
	public List getMailInfo(Message[] msg)throws Exception{
		List result = new ArrayList();
		
		Map map = null;
		Multipart mp = null;
		BodyPart part = null;
		String disp = null;
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
		Enumeration henum = null;
		for(int i=0;i<msg.length;i++){
			
			map = new HashMap();
			//读取邮件ID
			henum = msg[i].getAllHeaders();
			Header h = null;
			while(henum.hasMoreElements()){
				h = (Header)henum.nextElement();
				if(h.getName().equals("Message-ID")){
					map.put("ID", h.getValue());
				}
			}
			
			map.put("subject", msg[i].getSubject());
			
			String sender = msg[i].getFrom()[0].toString();
			sender = new String(sender.getBytes("GBK"),"ISO8859-1");
			map.put("sender",sender);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("msg[i].getFrom()[0].toString()"+sender);
			
			
			
			map.put("senddate", fmt.format(msg[i].getSentDate()));
			
			map.put("size", new Integer(msg[i].getSize()));
			
			map.put("hasAttach", "&nbsp;");
			
			//判断是否有附件
			if(msg[i].isMimeType("multipart/*")){
				mp = (Multipart)msg[i].getContent();
				//遍历每一个Multipart对象
				for(int j=0;j<mp.getCount();j++){
					part = mp.getBodyPart(j);
					disp = part.getDisposition();
					System.out.println("disp===null:::::::::"+(disp==null));
					//如果有附件
					if(disp!=null&&(disp.equals(Part.ATTACHMENT)||disp.equals(Part.INLINE))){
						//设置有附件的特征值
						map.put("hasAttach", "1");
					}
				}
				
			}
			result.add(map);
		}
		
		return result;
	}
	
	
	//查找指定邮件
	public Message findMail(String id)throws Exception{
		Message[] msg = getAllMail();
		
		Enumeration henum = null;
		
		Header h = null;
		
		for(int i=0;i<msg.length;i++){
			henum = msg[i].getAllHeaders();
			while(henum.hasMoreElements()){
				h=(Header)henum.nextElement();
				if(h.getName().equals("Message-ID")&&(h.getValue().equals(id))){
					return msg[i];
				}
			}
		}
		return null;
	}
	//读取邮件内容
	public Map readMail(String basePath,String id)throws Exception{
		Map map = new HashMap();
		System.out.println("id=============="+id);
		
		
		Message msg  = findMail(id);
		
		System.out.println("msg =  null============================="+(msg==null));
		
		map.put("subject", msg.getSubject());
		map.put("sender", msg.getFrom()[0].toString());
		map.put("attach", "");
		
		if(msg.isMimeType("text/*")){
			map.put("content", msg.getContent().toString());
		}else{
			StringBuffer result = new StringBuffer();
			Multipart mp = (Multipart)msg.getContent();
			BodyPart part = null;
			String disp = null;
			
			for(int j=0;j<mp.getCount();j++){
				part = mp.getBodyPart(j);
				disp = part.getDescription();
				if(disp!=null&&(disp.equals(Part.ATTACHMENT)||disp.equals(Part.INLINE))){
					String filename = part.getFileName();
					filename = new String(filename.getBytes("ISO8859-1"),"gb2312");
					
					map.put("attach", filename);
					
					InputStream in = part.getInputStream();
					filename = basePath+"/"+filename;
					
					FileOutputStream out = new FileOutputStream(new File(filename));
					
					byte[] content = new byte[255];
					int read = 0;
					while((read=in.read(content))!=-1){
						out.write(content);
					}
					out.close();
					in.close();
				}else{
					result.append(part.getContent().toString());
				}
			}
			map.put("content", result.toString());
		}
		return map;
	}
	

	static class POP3Auth extends Authenticator{
		String user,password;
		void setAount(String user,String password){
			this.user = user;
			this.password = password;			
		}
		protected PasswordAuthentication getPasswordAuthentication(){
			return new PasswordAuthentication(user, password);
		}
	}
	
	
	
	
}
