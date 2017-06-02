package dao;

import module.Article;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */
public class ArticleDao  extends HibernateDaoSupport {
    //获取所有的文章
    public List<Article> obtainArticle(){
        String sql = "from Article ";
        List<Article> list = getHibernateTemplate().find(sql);
        if(list!=null&&list.size()>0){
            return list;
        }
        return null;
    }

    public Article addArticle(String title){
        String sql = "from Article where title = ?";
        List<Article> objects = this.getHibernateTemplate().find(sql, title);
        if(objects!=null&&objects.size()>0){
            return objects.get(0);
        }
        return null;
    }

}
