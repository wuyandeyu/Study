package cn.gao.dao.impl;

import cn.gao.dao.IAccountDao;

public class IAccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("存储了");
    }
}
