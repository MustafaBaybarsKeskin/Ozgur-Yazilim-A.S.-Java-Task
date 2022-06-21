package com.hospital.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hospital.exception.RecordNotFoundException;
import com.hospital.model.ReportEntity;
import com.hospital.service.ReportService;

@Controller
//@RequestMapping("/")
public class ReportController {

	@Autowired
	ReportService service;
	
	@RequestMapping(path = {"/","/search"})
	public String getAllReports(ReportEntity reportEntity, Model model, String keyword) {
		System.out.println("getAllReports");
		
		if(keyword!=null) {
			List<ReportEntity> list = service.getByKeyword(keyword);
			model.addAttribute("reports", list);
		} else {
			List<ReportEntity> list = service.getAllReports();
			model.addAttribute("reports", list);
		}
		
		return "list-reports";
	}
	
	@RequestMapping(path = {"/edit", "/edit/{id}"})
	public String editReportById(Model model, @PathVariable("id") Optional<Long> id) throws RecordNotFoundException 
	{
		System.out.println("editReportById" + id);
		if (id.isPresent()) {
			ReportEntity entity = service.getReportById(id.get());
			model.addAttribute("report", entity);
		} else {
			model.addAttribute("report", new ReportEntity());
		}
				
		return "add-edit-reports";
	}
	
	@RequestMapping(path = "/delete/{id}")
	public String deleteReportById(Model model, @PathVariable("id") Long id) throws RecordNotFoundException 
	{
		
		System.out.println("deleteReportById" + id);		
		service.deleteReportById(id);
		return "redirect:/";
	}
	
	@RequestMapping(path = "/createReport", method = RequestMethod.POST)
	public String createOrUpdateReport(ReportEntity report) 
	{
		System.out.println("createOrUpdateReport");
		
		service.createOrUpdateReport(report);
		
		return "redirect:/";
	}
	
}
