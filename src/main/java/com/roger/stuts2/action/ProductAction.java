package com.roger.stuts2.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.AllowedMethods;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage(value = "basePackage")
@Namespace("/")
@Action(value = "product")
@Result(name = "index" , location = "view/index.jsp")
@AllowedMethods(value = "show")
public class ProductAction extends ActionSupport {

	private static final long serialVersionUID = 8098134080909371855L;

	public String show() {
		return "index";
	}

}
