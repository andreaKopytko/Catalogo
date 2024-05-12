package mobi.skiopiskio.catalogo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mobi.skiopiskio.catalogo.services.CatalogoService;

@Controller
@RequestMapping("/")
public class CatalogoController {

    private CatalogoService service;

    @GetMapping("catalogo")
    public ModelAndView viewHomePage() {
        return new ModelAndView("homepage");
    }

    @GetMapping("catalogo/nuovo")
    public ModelAndView catalogoForm() {
        return new ModelAndView("catalogoForm");
    }

}
