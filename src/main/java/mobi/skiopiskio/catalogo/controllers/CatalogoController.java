package mobi.skiopiskio.catalogo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mobi.skiopiskio.catalogo.domains.Prodotto;
import mobi.skiopiskio.catalogo.services.CatalogoService;

@Controller
@RequestMapping("/")
public class CatalogoController {

    private CatalogoService service = new CatalogoService();

    @GetMapping("catalogo")
    public ModelAndView viewHomePage() {
        ArrayList<Prodotto> collezione = service.getProdotti(); 
        return new ModelAndView("homepage").addObject("collezione", collezione);
    }

    @GetMapping("catalogo/nuovo")
    public ModelAndView catalogoForm() {
        return new ModelAndView("catalogoForm").addObject(new Prodotto());
    }

    @PostMapping("/new")
    public ModelAndView newProductHandler(@ModelAttribute Prodotto prodotto) {
        service.addProdotto(prodotto);
        return new ModelAndView("homepage");
    }

    @GetMapping(params = "code")
    public ModelAndView productInfo(@RequestParam("code") String code) {
        Prodotto chosenProduct = service.getProdottoByCode(code);
        return new ModelAndView("productInfo").addObject("product", chosenProduct);
    }

}