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

import it.sisthema.lab.beans.Contact;
import it.sisthema.lab.dao.ContactDao;

@Controller
@RequestMapping("/contacts")

public class ContactController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("contactDaoImpl") // Test JdbcTemplate
    private ContactDao contactDao;

    @GetMapping({ "/list" })
    public String list(Model model) {
        List<Contact> contacts = contactDao.findAll();

        model.addAttribute(model.addAttribute("contacts", contacts));
        return "contact_list";
    }

    @GetMapping({ "/new" })
    public String newForm(Model model, @RequestParam String azione) {
        Contact contact = new Contact();

        model.addAttribute(model.addAttribute(contact));
        model.addAttribute("azione", azione);
        return "contact_form";
    }

    @GetMapping({ "/get" })
    public String get(Model model, @RequestParam String id, @RequestParam String azione) {
        Contact contact = contactDao.findById(Long.parseLong(id));

        model.addAttribute(model.addAttribute(contact));
        model.addAttribute("azione", azione);
        return "contact_form";
    }

    @GetMapping("/delete")
    public String delete(Model model, @RequestParam String id, @RequestParam String azione) {

        contactDao.deleteById(Long.parseLong(id));

        return "redirect:list";
    }

    @PostMapping("/insert")
    public String insert(@ModelAttribute Contact contact, Model model) {

        System.out.println("update record");
        contactDao.save(contact);

        return "redirect:list";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Contact contact, Model model) {

        System.out.println("update record");
        contactDao.update(contact);

        return "redirect:list";
    }
}