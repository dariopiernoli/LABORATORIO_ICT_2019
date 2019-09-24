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

import it.sisthema.lab.beans.Account;
import it.sisthema.lab.dao.AccountDao;

@Controller
@RequestMapping("/accounts")
public class AccountController {

    @Autowired(required = true)
    JdbcTemplate jdbcTemplate;

    @Autowired(required = true)
    @Qualifier("accountDaoImpl") // Test JdbcTemplate
    private AccountDao accountDao;

    @GetMapping({ "/list" })
    public String list(Model model) {
        List<Account> accounts = accountDao.findAll();

        model.addAttribute(model.addAttribute("accounts", accounts));
        return "account_list";
    }

    @GetMapping({ "/new" })
    public String newForm(Model model, @RequestParam String azione) {
    	Account account = new Account();

        model.addAttribute(model.addAttribute(account));
        model.addAttribute("azione", azione);
        return "account_form";
    }

    @GetMapping({ "/get" })
    public String get(Model model, @RequestParam String id, @RequestParam String azione) {
    	Account account = accountDao.findById(Long.parseLong(id));

        model.addAttribute(model.addAttribute(account));
        model.addAttribute("azione", azione);
        return "account_form";
    }

    @GetMapping("/delete")
    public String delete(Model model, @RequestParam String id, @RequestParam String azione) {

    	accountDao.deleteById(Long.parseLong(id));

        return "redirect:list";
    }

    @PostMapping("/insert")
    public String insert(@ModelAttribute Account account, Model model) {

        System.out.println("update record");
        accountDao.save(account);

        return "redirect:list";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Account account, Model model) {

        System.out.println("update record");
        accountDao.update(account);

        return "redirect:list";
    }
}