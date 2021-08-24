package cn.gao.service.impl;

import cn.gao.dao.AccountDao;
import cn.gao.service.AccountService;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;


    @Override
    public void saveAccount() {
          accountDao.saveAccount();
    }
}
