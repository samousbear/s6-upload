package com.woniu.web.action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.woniu.utils.WebUUID;

public class UserAction extends ActionSupport{
	private File[] photo;
	private String[] 	photoFileName;
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String upload() throws Exception {
		for (int j = 0; j < photo.length; j++) {
			String fname = WebUUID.uuid();
			int index = photoFileName[j].lastIndexOf(".");
			String ext = photoFileName[j].substring(index);
			String path = ServletActionContext.getServletContext().getRealPath("/images");
			System.out.println(path);
			FileUtils.copyFile(photo[j], new File(path, fname + ext));
		}
		return null;
	}
	public File[] getPhoto() {
		return photo;
	}
	public void setPhoto(File[] photo) {
		this.photo = photo;
	}
	public String[] getPhotoFileName() {
		return photoFileName;
	}
	public void setPhotoFileName(String[] photoFileName) {
		this.photoFileName = photoFileName;
	}
	
}
