package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import dao.UserDao;
import module.User;
import org.apache.struts2.ServletActionContext;
import service.UserService;

/**
 * Created by Administrator on 2017/5/30.
 */
public class UserAction  extends ActionSupport implements ModelDriven<User> {

    // 获取前端的模型驱动
    private User user = new User();

    private UserService userService;

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getModel() {
        return user;
    }

    public String loginPage() {
        return "loginPage";
    }

    public String registPage() {
        return "registPage";
    }

    public String login(){
        User checkByName = userService.login(user.getName());
        // 当存在给用户时
        if (checkByName != null) {
            // 判断该用户的密码是否正确
            if (user.getPassword().equals(checkByName.getPassword())) {
                //将用户放到session中
                ServletActionContext.getRequest().getSession()
                        .setAttribute("existUser", checkByName);
                return "success";
            } else {
                this.addActionError("登录失败:用户名或密码错误!");
                return "loginPage";
            }
            // 当该用户不存在时
        } else {
            this.addActionError("用户不存在，请登录");
            return "registPage";
        }

    }

    public String regist(){
        User user1 = userDao.login(user.getName());
        if(user1 == null){
            userDao.save(user);
            return "loginPage";
        }else{
            this.addActionError("用户已存在！");
            return "registPage";
        }
    }
    //用户退出的方法
    public String quit() {
        ServletActionContext.getRequest().getSession().invalidate();
        return "quit";
    }
}
