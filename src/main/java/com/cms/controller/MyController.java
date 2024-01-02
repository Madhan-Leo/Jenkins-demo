package com.cms.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cms.bean.Carz;
import com.cms.dao.CarDAO;

@Controller
public class MyController {

	@Autowired
	CarDAO dao;


	@RequestMapping("InsertCar")
	public ModelAndView loadInsertcar() {
		ModelAndView mv = new ModelAndView("InsertCar");

		return mv;
	}

	@RequestMapping("PerformInsert")
	public ModelAndView performInsert(@ModelAttribute("bean") Carz bean) {

		ModelAndView mv = new ModelAndView();

		try {
			dao.insertCar(bean);
			mv.setViewName("InsertCarSuccess");
		} catch (Exception e) {
			mv.setViewName("InsertCarFail");
		}

		return mv;
	}

}
