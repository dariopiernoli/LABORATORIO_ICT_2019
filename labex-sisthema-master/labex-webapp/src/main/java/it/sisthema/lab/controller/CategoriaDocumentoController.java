package it.sisthema.lab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.sisthema.lab.beans.CategoriaDocumento;
import it.sisthema.lab.dao.CategoriaDocumentoDao;

@Controller
@RequestMapping("/documents")
public class CategoriaDocumentoController {



    @Autowired(required = true)
    JdbcTemplate jdbcTemplate;

    @Autowired(required = true)
    @Qualifier("documentDaoImpl") // Test JdbcTemplate
    private CategoriaDocumentoDao documentDao;

    @GetMapping({ "/list" })
    public String list(Model model) {
        List<CategoriaDocumento> documents = documentDao.findAll();

        model.addAttribute(model.addAttribute("documents", documents));
        return "document_list";
    }

    @GetMapping({ "/new" })
    public String newForm(Model model, @RequestParam String azione) {
    	CategoriaDocumento document = new CategoriaDocumento();

        model.addAttribute(model.addAttribute(document));
        model.addAttribute("azione", azione);
        return "document_form";
    }

    @GetMapping({ "/get" })
    public String get(Model model, @RequestParam String id, @RequestParam String azione) {
    	CategoriaDocumento document = documentDao.findById(Long.parseLong(id));

        model.addAttribute(model.addAttribute(document));
        model.addAttribute("azione", azione);
        return "document_form";
    }

    @GetMapping("/delete")
    public String delete(Model model, @RequestParam String id, @RequestParam String azione) {

    	documentDao.deleteById(Long.parseLong(id));

        return "redirect:list";
    }

    @PostMapping("/insert")
    public String insert(@ModelAttribute CategoriaDocumento document, Model model) {

        System.out.println("update record");
        documentDao.save(document);

        return "redirect:list";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute CategoriaDocumento document, Model model) {

        System.out.println("update record");
        documentDao.update(document);

        return "redirect:list";
    }
}