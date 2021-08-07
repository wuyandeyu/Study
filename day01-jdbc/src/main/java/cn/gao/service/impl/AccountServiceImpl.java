package cn.gao.service.impl;

import cn.gao.dao.IAccountDao;
import cn.gao.dao.impl.IAccountDaoImpl;
import cn.gao.factory.BeanFactory;
import cn.gao.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
    private IAccountDao iAccountDao = (IAccountDao) BeanFactory.getBean("accountDao");

    //单例成员变量，有性能强于多线程，缺点多线程
    //多例
    private int x=1;
    @Override
    public void saveAccount() {
        iAccountDao.saveAccount();
        System.out.println(x);
        x++;
    }
}
