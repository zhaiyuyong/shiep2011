package com.zyy.javaee.project.action;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zyy.javaee.project.po.Information;
import com.zyy.javaee.project.po.Manager;
import com.zyy.javaee.project.service.InformationManager;
import com.zyy.javaee.project.vo.InformationForm;

@Component("informationAction")
@Scope("prototype")
public class InfromationAction extends ActionSupport implements ModelDriven{
	private Integer id = (Integer)ServletActionContext.getRequest().getSession().getAttribute("current_manager_id");
	private InformationManager informationManager;
	private Information information ;
	
	private Integer infoId; 
	private InformationForm informationForm = new InformationForm();
	public Information getInformation() {
		return information;
	}

	public void setInformation(Information information) {
		this.information = information;
	}

	public Integer getInfoId() {
		return infoId;
	}

	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}
	private List<Information> informations;
	public List<Information> getInformations() {
		return informations;
	}

	public void setInformations(List<Information> informations) {
		this.informations = informations;
	}

	

	public InformationManager getInformationManager() {
		return informationManager;
	}

	@Resource(name = "informationManager")
	public void setInformationManager(InformationManager informationManager) {
		this.informationManager = informationManager;
	}
	
	public String delete() throws Exception{
		this.informationManager.deleteInformation(infoId);
		return "delete";
	}
	/**
	 * 所有Information
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception {
		this.informations = this.informationManager.getAll();
		//System.out.println(this.informations.size());
		
		return "list";
	}
	/**
	 * 增加Information
	 * @return
	 * @throws Exception
	 */
	public String add()throws Exception{	
		//System.out.println(this.title+"   "+this.content);
		//System.out.println("id======================"+id);
		Information information = new Information();
		information.setTitle(this.informationForm.getTitle());
		//System.out.println("title = = = =="+this.informationForm.getTitle());
		information.setContent(this.informationForm.getContent());
		information.setTime(new Date());
		//System.out.println("begin select this manager");
		Manager manager = this.informationManager.getManager(id);
		information.setManager(manager);
		//System.out.println("begin add information");
		this.informationManager.addInformation(information);
		return "add";
	}
	/**
	 * 查看信息
	 * @return
	 * @throws Exception
	 */
	public String look()throws Exception{
		this.information = this.informationManager.getInformation(infoId);	
		return "look";
	}
	public String update()throws Exception{
		
		System.out.println("infoID=========="+this.infoId);
		System.out.println(this.informationForm.getId());
		Information information = this.informationManager.getInformation(this.informationForm.getId());
		System.out.println((information==null)+""+information.getId());
		information.setId(this.informationForm.getId());
		information.setTitle(this.informationForm.getTitle());
		information.setContent(this.informationForm.getContent());
		information.setTime(new Date());
		Manager manager = this.informationManager.getManager(id);
		information.setManager(manager);
		
		this.informationManager.updateInformation(information);
		return "update";
	}

	public Object getModel() {
		// TODO Auto-generated method stub
		return informationForm;
	}
	
}
