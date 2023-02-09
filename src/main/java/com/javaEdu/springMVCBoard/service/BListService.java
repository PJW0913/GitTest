package com.javaEdu.springMVCBoard.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.javaEdu.springMVCBoard.dao.IRepository;
import com.javaEdu.springMVCBoard.dto.BDto;

@Service
public class BListService implements BService {
	
	@Autowired
	IRepository repository;

	@Override
	public void execute(Model model) {

		ArrayList<BDto> dtos = repository.list();
		model.addAttribute("list", dtos);
		
	}

}
