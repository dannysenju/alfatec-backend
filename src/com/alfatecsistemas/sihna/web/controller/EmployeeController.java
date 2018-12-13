package com.alfatecsistemas.sihna.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alfatecsistemas.sihna.dto.EmployeeDTO;
import com.alfatecsistemas.sihna.service.DepartmentService;
import com.alfatecsistemas.sihna.service.EmployeeService;

/**
 * employee controller
 * 
 * @author danny
 *
 */
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private DepartmentService departmentService;

	/**
	 * get method to return a list of departments in model object
	 * 
	 * @return
	 */
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ModelAndView getAllEmployess() {

		List<EmployeeDTO> list = employeeService.findAllEmployees();

		// return back to index.jsp
		ModelAndView model = new ModelAndView("employees");
		model.addObject("list", list);

		return model;

	}

	/**
	 * It displays a form to input data, here "command" is a reserved request
	 * attribute which is used to display object data into form
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/empform")
	public String showform(Model model) {
		model.addAttribute("command", new EmployeeDTO());
		model.addAttribute("departments", departmentService.findAllDepartments());
		return "empform";
	}

	/**
	 * It saves object into database. The @ModelAttribute puts request data into
	 * model object. You need to mention RequestMethod.POST method because default
	 * request is GET
	 * 
	 * @param empDTO
	 * @return
	 */
	@RequestMapping(value = "/employees/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("emp") EmployeeDTO empDTO) {
		employeeService.save(empDTO);
		// will redirect to view employees request mapping
		return "redirect:/employees";
	}

	/**
	 * It deletes record for the given id in URL and redirects to /employees
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable int id) {
		employeeService.delete((long) id);
		return "redirect:/employees";
	}

	/**
	 * It displays object data into form for the given id. The @PathVariable puts
	 * URL data into variable.
	 * 
	 * @param id
	 * @param m
	 * @return
	 */
	@RequestMapping(value = "/employees/editemp/{id}")
	public String edit(@PathVariable Long id, Model m) {
		EmployeeDTO empDTO = employeeService.findById(id);
		m.addAttribute("departments", departmentService.findAllDepartments());
		m.addAttribute("command", empDTO);
		return "empeditform";
	}
	
	/* It updates model object. */
    @RequestMapping(value="/employees/editemp/{id}",method = RequestMethod.PUT)  
    public String editsave(@ModelAttribute("emp") EmployeeDTO employeeDTO){  
        
    	employeeService.update(employeeDTO);
    	
    	return "redirect:/employees";  
    }  

}
