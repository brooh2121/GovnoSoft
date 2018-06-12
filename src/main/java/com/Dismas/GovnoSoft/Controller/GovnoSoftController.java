package com.Dismas.GovnoSoft.Controller;

import com.Dismas.GovnoSoft.Bean.Program;
import com.Dismas.GovnoSoft.Dao.ProgramDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Dmitry on 11.06.2018.
 */
@Controller
public class GovnoSoftController {
    @Autowired
    ProgramDao dao;

    @RequestMapping("/")
    public ModelAndView startPage(){
        return new ModelAndView("hello");
    }

    @RequestMapping("/viewprogram")
    public ModelAndView viewprogram(){
        List<Program> list = dao.getPrograms();
        return new ModelAndView("viewprogram","list" ,list);
    }

    @RequestMapping("/test")
    public ModelAndView testPage(){return new ModelAndView("test");}
}
