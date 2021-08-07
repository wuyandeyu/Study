package cn.gao.service.impl;

import cn.gao.dao.IAccountDao;
import cn.gao.dao.impl.IAccountDaoImpl;
import cn.gao.service.IAccountService;

public class IAccountServiceImpl implements IAccountService {
    private IAccountDao iAccountDao = new IAccountDaoImpl();
    @Override
    public void saveAccount() {
        iAccountDao.saveAccount();
    }
}
