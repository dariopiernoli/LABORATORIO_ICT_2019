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

import it.sisthema.lab.beans.Spedizione;
import it.sisthema.lab.dao.SpedizioneDao;

@Controller
@RequestMapping("/spedizioni")
public class SpedizioneController {

    @Autowired(required = true)
    JdbcTemplate jdbcTemplate;

    @Autowired(required = true)
    @Qualifier("spedizioneDaoImpl") // Test JdbcTemplate
    private SpedizioneDao spedizioneDao;

    @GetMapping({ "/list" })
    public String list(Model model) {
        List<Spedizione> spedizioni = spedizioneDao.findAll();

        model.addAttribute(model.addAttribute("spedizioni", spedizioni));
        return "spedizione_list";
    }

    @GetMapping({ "/new" })
    public String newForm(Model model, @RequestParam String azione) {
    	Spedizione spedizione = new Spedizione();

        model.addAttribute(model.addAttribute(spedizione));
        model.addAttribute("azione", azione);
        return "document_form";
    }

    @GetMapping({ "/get" })
    public String get(Model model, @RequestParam String id, @RequestParam String azione) {
    	Spedizione spedizione = spedizioneDao.findById(Long.parseLong(id));

        model.addAttribute(model.addAttribute(spedizione));
        model.addAttribute("azione", azione);
        return "spedizione_form";
    }

    @GetMapping("/delete")
    public String delete(Model model, @RequestParam String id, @RequestParam String azione) {

    	spedizioneDao.deleteById(Long.parseLong(id));

        return "redirect:list";
    }

    @PostMapping("/insert")
    public String insert(@ModelAttribute Spedizione spedizione, Model model) {

        System.out.println("update record");
        spedizioneDao.save(spedizione);

        return "redirect:list";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Spedizione spedizione, Model model) {

        System.out.println("update record");
        spedizioneDao.update(spedizione);

        return "redirect:list";
    }

}
