package dao;

import module.User;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */
public class UserDao  extends HibernateDaoSupport  {

    public User login(String name){
        String hql = "from User where name = ? ";
        List<User> list = this.getHibernateTemplate().find(hql, name);
        if(list!=null&&list.size()>0){
            return list.get(0);
        }
        return null;
    }

    public void save(User user) {
        this.getHibernateTemplate().save(user);
    }


}
