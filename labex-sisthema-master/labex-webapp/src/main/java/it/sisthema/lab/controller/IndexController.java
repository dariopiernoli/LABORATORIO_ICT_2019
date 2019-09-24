package it.sisthema.lab.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.sisthema.lab.beans.Account;
import it.sisthema.lab.dao.AccountDao;

@Controller
public class IndexController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("accountDaoImpl") // Test JdbcTemplate
    private AccountDao accountDao;

    @GetMapping({ "/", "/index" })
    public String index(Model model) {
        // @RequestParam(value = "msg", required = false, defaultValue = "Mondo") String
        // name
        runJDBC();

        model.addAttribute("msg", "database creato");
        return "index";
    }

    void runJDBC() {

        jdbcTemplate.execute("DROP TABLE accounts IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE accounts("
                + "id SERIAL, nome VARCHAR(255), cognome VARCHAR(255), denominazione VARCHAR(255)), cf VARCHAR(255)), piva VARCHAR(255))");

        List<Account> accounts = Arrays.asList(new Account("Francesco", "Minelli", "denom1", "AAABBB97L05H501K", "01234567890"),
                new Account("Flavia", "Minelli", "denom2", "AAABBB97L05H501L", "12345678901"));

        accounts.forEach(account -> {
            System.out.println("Saving...{}" + account.getNome());
            accountDao.save(account);
        });

        // count
        System.out.println("[COUNT] Total books: {}" + accountDao.count());

    }
}
