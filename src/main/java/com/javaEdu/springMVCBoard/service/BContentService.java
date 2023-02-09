package com.javaEdu.springMVCBoard.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.javaEdu.springMVCBoard.dao.IRepository;
import com.javaEdu.springMVCBoard.dto.BDto;

@Service
public class BContentService implements BService{
	
	@Autowired
	IRepository repository;

	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bId = request.getParameter("bId");
		
		BDto dto = repository.contentView(bId);
		
		model.addAttribute("content_view",dto);
		
	}

}
