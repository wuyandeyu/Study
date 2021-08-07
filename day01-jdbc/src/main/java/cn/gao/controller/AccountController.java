package cn.gao.controller;

import cn.gao.service.IAccountService;
import cn.gao.service.impl.AccountServiceImpl;

public class AccountController {
    private IAccountService iAccountService= new AccountServiceImpl();
    public static void main(String[] args) {
        new AccountController().iAccountService.saveAccount();
    }
}
