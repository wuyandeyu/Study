package cn.gao.controller;

import cn.gao.factory.BeanFactory;
import cn.gao.service.IAccountService;

public class AccountFactoryController {

    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            IAccountService iAccountService = (IAccountService) BeanFactory.getBean("accountService");
            System.out.println(iAccountService);
            iAccountService.saveAccount();
        }
    }
}
