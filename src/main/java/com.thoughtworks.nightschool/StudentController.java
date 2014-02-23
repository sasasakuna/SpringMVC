package com.thoughtworks.nightschool;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.*;
import java.util.HashMap;

@Controller
public class StudentController extends AbstractController{

    @RequestMapping("/students")
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
                                                 HttpServletResponse response) throws Exception{
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("studentOne","50"));
        students.add(new Student("studentTwo","60"));
        students.add(new Student("studentThree","70"));
        students.add(new Student("studentFour","80"));
        students.add(new Student("studentFive","90"));

//        Map<String, String> map = new HashMap<String, String>();
//        map.put("studentOne","50");
//        map.put("studentTwo","60");
//        map.put("studentThree","70");
//        map.put("studentFour","80");
//        map.put("studentFive","90");

        ModelAndView model = new ModelAndView("students");
        model.addObject("students",students);




        return model;
    }
}