package com.javaEdu.springMVCBoard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaEdu.springMVCBoard.service.BService;



@Controller
public class BController {
	
	@Autowired
	@Qualifier("BListService")
	BService bListService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()");
		bListService.execute(model);
		
		return "list";
	}
	
	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view()");
		
		return "write_view";
	}
	
	
	@Autowired
	@Qualifier("BWriteService")
	BService bWriteService;
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("write()");
		
		model.addAttribute("request", request);
		bWriteService.execute(model);
		
		return "redirect:list";
	}
	
	@Autowired
	@Qualifier("BContentService")
	BService bContentService;
	
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		System.out.println("content_view()");
		
		model.addAttribute("request", request);
		bContentService.execute(model);
		
		return "content_view";
	}
	
	@Autowired
	@Qualifier("BModifyService")
	BService bModifyService;
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("modify()");
		
		model.addAttribute("request", request);
		bModifyService.execute(model);
		
		return "redirect:list";
	}
	
	@Autowired
	@Qualifier("BReplyViewService")
	BService bReplyViewService;
	
	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		System.out.println("reply_view()");
		
		model.addAttribute("request", request);
		bReplyViewService.execute(model);
		
		return "reply_view";
	}
	
	@Autowired
	@Qualifier("BReplyService")
	BService bReplyService;
	
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("reply()");
		
		model.addAttribute("request", request);
		bReplyService.execute(model);
		
		return "redirect:list";
	}
	
	@Autowired
	@Qualifier("BDeleteService")
	BService bDeleteService;
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete()");
		
		model.addAttribute("request", request);
		bDeleteService.execute(model);
		
		return "redirect:list";
	}

}
