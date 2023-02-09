package com.javaEdu.springMVCBoard.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.javaEdu.springMVCBoard.dao.IRepository;

@Service
public class BWriteService implements BService {
	
	@Autowired
	IRepository repository;

	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		repository.write(bName, bTitle, bContent);
		
	}

}
