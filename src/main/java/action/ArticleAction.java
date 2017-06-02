package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import module.Article;
import service.ArticleService;

import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */
public class ArticleAction   extends ActionSupport {

    private ArticleService articleService;

    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }

    public String obtainArticle(){
        //查询文章并保存到值栈中
        List<Article> obtainArticle = articleService.obtainArticle();
        ActionContext.getContext().getValueStack().set("obtainArticle", obtainArticle);
        return "success";

    }
}
