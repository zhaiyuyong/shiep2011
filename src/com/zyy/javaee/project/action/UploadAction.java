package com.zyy.javaee.project.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
@Component("uploadAction")
@Scope("prototype")
public class UploadAction extends ActionSupport{

	private String username;
	private File file;//指向临时文件
	private String fileFileName;//FileName固定的
	private String fileContentType;//ContentType固定的file为表单的name
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}



	@Override
	public String execute() throws Exception {
		String root = ServletActionContext.getRequest().getRealPath("/upload");
		//String root = "D:/images";
		System.out.println("root======="+root);
		System.out.println("username="+username);
		
		InputStream is = new FileInputStream(file);
		System.out.println("path:"+file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println("fileFileName=="+fileFileName);
		
		File destFile = new File(root,fileFileName);
		
		OutputStream os = new FileOutputStream(destFile);
		
		byte[] buffer = new byte[400];
		int length = 0;
		while((length=is.read(buffer))!=-1){
			os.write(buffer,0,length);
			//Thread.sleep(1000);
		}
		is.close();
		os.close();
		
		
		
		return "success";
	}

}
