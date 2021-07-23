package com.a0521.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.a0521.pma.dao.ProjectRepository;
import com.a0521.pma.entity.Project;

@Controller
public class HomeController {

//	@Autowired
//	ProjectRepository proRepo;

	@GetMapping("/")
	public String displayHome() {
//		List<Project> projects = proRepo.findAll();
//		model.addAttribute("projectList", projects);
		return "main/home";
	}
}
