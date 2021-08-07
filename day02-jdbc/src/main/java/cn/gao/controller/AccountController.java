package cn.gao.controller;

import cn.gao.service.IAccountService;
import cn.gao.service.impl.IAccountServiceImpl;

public class AccountController {
    private IAccountService iAccountService = new IAccountServiceImpl();
    public static void main(String[] args) {
        new AccountController().iAccountService.saveAccount();
    }
}
