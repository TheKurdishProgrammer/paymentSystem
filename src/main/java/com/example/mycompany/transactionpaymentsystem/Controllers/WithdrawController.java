package com.example.mycompany.transactionpaymentsystem.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/withdraw")
public class WithdrawController {


    @RequestMapping(value = {"/",""})
    public String withdrawMoney() {
        return "withdraw";

    }

}