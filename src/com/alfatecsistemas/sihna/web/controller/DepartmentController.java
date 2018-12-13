package com.alfatecsistemas.sihna.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alfatecsistemas.sihna.dto.DepartmentDTO;
import com.alfatecsistemas.sihna.dto.EmployeeDTO;
import com.alfatecsistemas.sihna.service.DepartmentService;
import com.alfatecsistemas.sihna.service.EmployeeService;

/**
 * department controller
 * 
 * @author danny
 *
 */
@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private EmployeeService employeeService;

	/**
	 * get method to return a list of departments in model object
	 * 
	 * @return
	 */
	@RequestMapping(value = "/departments", method = RequestMethod.GET)
	public ModelAndView getAllDepartments() {
		List<DepartmentDTO> listDepartment = departmentService.findAllDepartments();
		// return back to index.jsp
		ModelAndView model = new ModelAndView("departments");
		model.addObject("listDepartments", listDepartment);
		return model;
	}

	/**
	 * get method to return a list of employees by department in model object
	 * 
	 * @return
	 */
	@RequestMapping(value = "/departments/{id}/employees", method = RequestMethod.GET)
	public ModelAndView getAllEmployeesByDepartmentId(@PathVariable Long id) {

		List<EmployeeDTO> listEmployees = employeeService.findAllEmployeesByDepartmentId(id);
		// return back to index.jsp
		ModelAndView model = new ModelAndView("departmentdetails");
		model.addObject("list", listEmployees);
		model.addObject("dptName", departmentService.findById(id).getName());

		return model;

	}

	/**
	 * It displays a form to input data, here "command" is a reserved request
	 * attribute which is used to display object data into form
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/deptform")
	public String showform(Model model) {
		model.addAttribute("command", new DepartmentDTO());
		return "deptform";
	}

	/**
	 * It saves object into database. The @ModelAttribute puts request data into
	 * model object. You need to mention RequestMethod.POST method because default
	 * request is GET
	 * 
	 * @param deptDTO
	 * @return
	 */
	@RequestMapping(value = "/departments/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("dept") DepartmentDTO deptDTO) {
		departmentService.save(deptDTO);
		// will redirect to view departments request mapping
		return "redirect:/departments";
	}

	
	/**
	 * find and get an employee within a department through his id 
	 * 
	 * @param searchString
	 * @return
	 */
	@RequestMapping(value = "/departments/{id}/employees/search", method = RequestMethod.GET)
	public ModelAndView searchEmployeeById(@RequestParam("searchTerm") String searchString) {

		ModelAndView mav = new ModelAndView("employeedetails");

		EmployeeDTO employee = employeeService.findById(Long.parseLong(searchString));
		mav.addObject("searchResult", employee);

		return mav;
	}

}
