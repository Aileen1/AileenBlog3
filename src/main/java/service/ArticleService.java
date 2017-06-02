package service;

import dao.ArticleDao;
import module.Article;

import java.util.List;

/**
 * Created by Administrator on 2017/5/31.
 */
public class ArticleService {


    private ArticleDao articleDao;

    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    public List<Article> obtainArticle() {
        return articleDao.obtainArticle();
    }
}
