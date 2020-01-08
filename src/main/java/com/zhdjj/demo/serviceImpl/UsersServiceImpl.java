package com.zhdjj.demo.serviceImpl;

import com.zhdjj.demo.dao.*;
import com.zhdjj.demo.pojo.*;
import com.zhdjj.demo.service.UsersService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersMapper usersMapper;

    @Autowired
    TipsMapper tipsMapper;

    @Autowired
    TipscommentMapper tipscommentMapper;

    @Autowired
    FocusMapper focusMapper;

    @Autowired
    ArticleclassfyMapper articleclassfyMapper;

    @Autowired
    ArticlecollectionMapper articlecollectionMapper;

    @Autowired
    ArticlecommentMapper articlecommentMapper;

    @Autowired
    ArticleArticleclassfyMapper articleArticleclassfyMapper;

    @Autowired
    ArticlelikeMapper articlelikeMapper;

    @Autowired
    ArticleMapper articleMapper;

    @Autowired
    AuthorMapper authorMapper;

    @Autowired
    NoticeMapper noticeMapper;

    @Autowired
    ShopclassfyMapper shopclassfyMapper;

    @Autowired
    ShopMapper shopMapper;

    @Autowired
    ShoppingchartMapper shoppingchartMapper;

    @Autowired
    ShopShopclassfyMapper shopShopclassfyMapper;

    @Autowired
    TipslikeMapper tipslikeMapper;

    @Autowired
    TipscollectionMapper tipscollectionMapper;

    Bools bools = new Bools();
    Ints ints = new Ints();

    @Override
    public Bools Login(Users users) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andUserNameEqualTo(users.getUserName());
        List<Users> usersList = usersMapper.selectByExample(usersExample);
        if (usersList.isEmpty()) {
            bools.setResult(false);
            return bools;
        }
        if (usersList.get(0).getUserPassword().equals(users.getUserPassword())) {
            bools.setResult(true);
            return bools;
        } else {
            bools.setResult(false);
            return bools;
        }
    }

    @Override
    public Bools Registered(Users users) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andUserNameEqualTo(users.getUserName());
        List<Users> usersList = usersMapper.selectByExample(usersExample);
        if (usersList.isEmpty()) {
            if (usersMapper.insert(users) == 0) {
                bools.setResult(false);
                return bools;
            } else {
                bools.setResult(true);
                return bools;
            }
        } else {
            bools.setResult(false);
            return bools;
        }
    }

    @Override
    public Bools UpdatePassword(Users users) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andUserNameEqualTo(users.getUserName());
        if (usersMapper.updateByExampleSelective(users, usersExample) == 0) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public Bools AddTips(Tips tips) {
        if (tipsMapper.insert(tips) == 0) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public List<Tips> AllTips(Users users) {
        TipsExample tipsExample = new TipsExample();
        TipsExample.Criteria criteria = tipsExample.createCriteria();
        criteria.andUserIdEqualTo(users.getUserId());
        List<Tips> list = tipsMapper.selectByExample(tipsExample);
        for (Tips item : list) {
            item.setUsers(usersMapper.selectByPrimaryKey(item.getUserId()));
        }
        return list;
    }

    @Override
    public Bools RemoveTips(Tips tips) {
        if (tipsMapper.deleteByPrimaryKey(tips.getTipId()) == 0) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public Bools AddTipsComment(Tipscomment tipscomment) {
        if (tipscommentMapper.insert(tipscomment) == 0) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public Bools RemoveComment(Tipscomment tipscomment) {
        if (tipscommentMapper.deleteByPrimaryKey(tipscomment.getCommentId()) == 0) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public Ints CountTips(Users users) {
        TipscommentExample tipscommentExample = new TipscommentExample();
        TipscommentExample.Criteria criteria = tipscommentExample.createCriteria();
        criteria.andUserIdEqualTo(users.getUserId());
        ints.setResult(tipscommentMapper.countByExample(tipscommentExample));
        return ints;
    }

    @Override
    public Ints CountFocused(Users users) {
        FocusExample focusExample = new FocusExample();
        FocusExample.Criteria criteria = focusExample.createCriteria();
        criteria.andFocusIdEqualTo(users.getUserId());
        ints.setResult(focusMapper.countByExample(focusExample));
        return ints;
    }

    @Override
    public Ints CountFocus(Users users) {
        FocusExample focusExample = new FocusExample();
        FocusExample.Criteria criteria = focusExample.createCriteria();
        criteria.andUserIdEqualTo(users.getUserId());
        ints.setResult(focusMapper.countByExample(focusExample));
        return ints;
    }

    @Override
    public Bools AddFocus(Focus focus) {
        if (focusMapper.insert(focus) == 0) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public Bools RemoveFocus(Focus focus) {
        FocusExample focusExample = new FocusExample();
        FocusExample.Criteria criteria = focusExample.createCriteria();
        criteria.andUserIdEqualTo(focus.getUserId());
        criteria.andFocusIdEqualTo(focus.getFocusId());
        if (focusMapper.deleteByExample(focusExample) == 0) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public List<Focus> AllFocus(Users users) {
        FocusExample focusExample = new FocusExample();
        FocusExample.Criteria criteria = focusExample.createCriteria();
        criteria.andUserIdEqualTo(users.getUserId());
        List<Focus> list = focusMapper.selectByExample(focusExample);
        for (Focus item : list) {
            item.setFocus(usersMapper.selectByPrimaryKey(item.getFocusId()));
        }
        return list;
    }

    @Override
    public List<Focus> AllFocused(Users users) {
        FocusExample focusExample = new FocusExample();
        FocusExample.Criteria criteria = focusExample.createCriteria();
        criteria.andFocusIdEqualTo(users.getUserId());
        List<Focus> list = focusMapper.selectByExample(focusExample);
        for (Focus item : list) {
            item.setUsers(usersMapper.selectByPrimaryKey(item.getUserId()));
        }
        return list;
    }

    @Override
    public Ints CountArticleLike(Article article) {
        ArticlelikeExample articlelileExample = new ArticlelikeExample();
        ArticlelikeExample.Criteria criteria = articlelileExample.createCriteria();
        criteria.andArticleIdEqualTo(article.getArticleId());
        ints.setResult(articlelikeMapper.countByExample(articlelileExample));
        return ints;
    }

    @Override
    public Bools AddArticleLike(Articlelike articlelike) {
        if (0 == articlelikeMapper.insert(articlelike)) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public Bools RemoveArticleLike(Articlelike articlelike) {
        ArticlelikeExample articlelileExample = new ArticlelikeExample();
        ArticlelikeExample.Criteria criteria = articlelileExample.createCriteria();
        criteria.andArticleIdEqualTo(articlelike.getArticleId());
        criteria.andUserIdEqualTo(articlelike.getUserId());
        if (0 == articlelikeMapper.deleteByExample(articlelileExample)) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public Ints CountArticleCollection(Article article) {
        ArticlecollectionExample articlecollectionExample = new ArticlecollectionExample();
        ArticlecollectionExample.Criteria criteria = articlecollectionExample.createCriteria();
        criteria.andArticleIdEqualTo(article.getArticleId());
        ints.setResult(articlecollectionMapper.countByExample(articlecollectionExample));
        return ints;
    }

    @Override
    public Bools AddArticleCollection(Articlecollection articlecollection) {
        if (0 == articlecollectionMapper.insert(articlecollection)) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public Bools RemoveArticleCollection(Articlecollection articlecollection) {
        ArticlecollectionExample articlecollectionExample = new ArticlecollectionExample();
        ArticlecollectionExample.Criteria criteria = articlecollectionExample.createCriteria();
        criteria.andArticleIdEqualTo(articlecollection.getArticleId());
        criteria.andUserIdEqualTo(articlecollection.getUserId());
        if (0 == articlecollectionMapper.deleteByExample(articlecollectionExample)) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public Ints CountTipsLike(Tips tips) {
        TipslikeExample tipslikeExample = new TipslikeExample();
        TipslikeExample.Criteria criteria = tipslikeExample.createCriteria();
        criteria.andTipIdEqualTo(tips.getTipId());
        ints.setResult(tipslikeMapper.countByExample(tipslikeExample));
        return ints;
    }

    @Override
    public Bools AddTipsLike(Tipslike tipslike) {
        if (0 == tipslikeMapper.insert(tipslike)) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public Bools RemoveTipsLike(Tipslike tipslike) {
        TipslikeExample tipslikeExample = new TipslikeExample();
        TipslikeExample.Criteria criteria = tipslikeExample.createCriteria();
        criteria.andTipIdEqualTo(tipslike.getTipId());
        criteria.andUserIdEqualTo(tipslike.getUserId());
        if (0 == tipslikeMapper.deleteByExample(tipslikeExample)) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public Ints CountTipsCollection(Tips tips) {
        TipscollectionExample tipsCollectionExample = new TipscollectionExample();
        TipscollectionExample.Criteria criteria = tipsCollectionExample.createCriteria();
        criteria.andTipIdEqualTo(tips.getTipId());
        ints.setResult(tipscollectionMapper.countByExample(tipsCollectionExample));
        return ints;
    }

    @Override
    public Bools AddTipsCollection(Tipscollection tipsCollection) {
        if (0 == tipscollectionMapper.insert(tipsCollection)) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public Bools RemoveTipsCollection(Tipscollection tipsCollection) {
        TipscollectionExample tipscollectionExample = new TipscollectionExample();
        TipscollectionExample.Criteria criteria = tipscollectionExample.createCriteria();
        criteria.andTipIdEqualTo(tipsCollection.getTipId());
        criteria.andUserIdEqualTo(tipsCollection.getUserId());
        if (0 == tipscollectionMapper.deleteByExample(tipscollectionExample)) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public Ints CountArticleComments(Article article) {
        ArticlecommentExample articlecommentExample = new ArticlecommentExample();
        ArticlecommentExample.Criteria criteria = articlecommentExample.createCriteria();
        criteria.andArticleIdEqualTo(article.getArticleId());
        ints.setResult(articlecommentMapper.countByExample(articlecommentExample));
        return ints;
    }

    @Override
    public List<Articlecomment> AllArticleComments(Article article) {
        ArticlecommentExample articlecommentExample = new ArticlecommentExample();
        ArticlecommentExample.Criteria criteria = articlecommentExample.createCriteria();
        criteria.andArticleIdEqualTo(article.getArticleId());
        List<Articlecomment> list = articlecommentMapper.selectByExample(articlecommentExample);
        for (Articlecomment item : list) {
            item.setUsers(usersMapper.selectByPrimaryKey(item.getUserId()));
            item.setArticle(articleMapper.selectByPrimaryKey(item.getArticleId()));
        }
        return list;
    }

    @Override
    public Bools AddArticleComments(Articlecomment articlecomment) {
        if (0 == articlecommentMapper.insert(articlecomment)) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public Bools RemoveArticleComments(Articlecomment articlecomment) {
        if (articlecommentMapper.deleteByPrimaryKey(articlecomment.getCommentId()) == 0) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public Bools AddShoppingChart(Shoppingchart shoppingchart) {
        if (shoppingchartMapper.insert(shoppingchart) == 0) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public Bools RemoveShoppingChart(Shoppingchart shoppingchart) {
        ShoppingchartExample shoppingchartExample = new ShoppingchartExample();
        ShoppingchartExample.Criteria criteria = shoppingchartExample.createCriteria();
        criteria.andShopIdEqualTo(shoppingchart.getShopId());
        criteria.andUserIdEqualTo(shoppingchart.getUserId());
        if (shoppingchartMapper.deleteByExample(shoppingchartExample) == 0) {
            bools.setResult(false);
            return bools;
        } else {
            bools.setResult(true);
            return bools;
        }
    }

    @Override
    public List<Shoppingchart> AllShoppingChart(Users users) {
        ShoppingchartExample shoppingchartExample = new ShoppingchartExample();
        ShoppingchartExample.Criteria criteria = shoppingchartExample.createCriteria();
        criteria.andUserIdEqualTo(users.getUserId());
        List<Shoppingchart> list = shoppingchartMapper.selectByExample(shoppingchartExample);
        for (Shoppingchart item : list) {
            Shop shop = shopMapper.selectByPrimaryKey(item.getShopId());
            shop.setShopclassfy(shopclassfyMapper.selectByPrimaryKey(shop.getShopclassfyId()));
            item.setShop(shop);
        }
        return list;
    }

    @Override
    public List<Notice> AllNotice(Users users) {
        NoticeExample noticeExample = new NoticeExample();
        NoticeExample.Criteria criteria = noticeExample.createCriteria();
        criteria.andUsersIdEqualTo(users.getUserId());
        List<Notice> list = noticeMapper.selectByExample(noticeExample);
        for (Notice item : list) {
            item.setUsers(usersMapper.selectByPrimaryKey(item.getUsersId()));
        }
        return list;
    }

    @Override
    public Bools UpdateNoticeStatus(Notice notice) {
        if (noticeMapper.updateByPrimaryKeySelective(notice) == 1) {
            bools.setResult(true);
        } else {
            bools.setResult(false);
        }
        return bools;
    }

    @Override
    public Bools RemoveNotice(Notice notice) {
        if (noticeMapper.deleteByPrimaryKey(notice.getNoticeId()) == 1) {
            bools.setResult(true);
        } else {
            bools.setResult(false);
        }
        return bools;
    }

    @Override
    public List<Article> AllArticle0() {
        ArticleExample articleExample = new ArticleExample();
        ArticleExample.Criteria criteria = articleExample.createCriteria();
        criteria.andArticleClassfyEqualTo(0);
        List<Article> list = articleMapper.selectByExample(articleExample);
        for (Article item : list) {
            item.setAuthor(authorMapper.selectByPrimaryKey(item.getAuthorId()));
        }
        return list;
    }

    @Override
    public List<Article> AllArticle1() {
        ArticleExample articleExample = new ArticleExample();
        ArticleExample.Criteria criteria = articleExample.createCriteria();
        criteria.andArticleClassfyEqualTo(1);
        List<Article> list = articleMapper.selectByExample(articleExample);
        for (Article item : list) {
            item.setAuthor(authorMapper.selectByPrimaryKey(item.getAuthorId()));
        }
        return list;
    }

    @Override
    public List<Shop> FindShop(Shop shop) {
        ShopExample shopExample = new ShopExample();
        ShopExample.Criteria criteria = shopExample.createCriteria();
        criteria.andShopNameLike(shop.getShopName());
        return shopMapper.selectByExample(shopExample);
    }

    @Override
    public List<Article> FindArticle(Article article) {
        ArticleExample articleExample = new ArticleExample();
        ArticleExample.Criteria criteria = articleExample.createCriteria();
        criteria.andArticleNameLike(article.getArticleName());
        List<Article> list = articleMapper.selectByExample(articleExample);
        for (Article item : list) {
            item.setAuthor(authorMapper.selectByPrimaryKey(item.getAuthorId()));
        }
        return list;
    }

    @Override
    public List<Tips> FindTips(Tips tips) {
        TipsExample tipsExample = new TipsExample();
        TipsExample.Criteria criteria = tipsExample.createCriteria();
        criteria.andTipNameLike(tips.getTipName());
        List<Tips> list = tipsMapper.selectByExample(tipsExample);
        for (Tips item : list) {
            item.setUsers(usersMapper.selectByPrimaryKey(item.getUserId()));
        }
        return list;
    }

    @Override
    public List<Users> FindUsers(Users users) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andUserNameLike(users.getUserName());
        return usersMapper.selectByExample(usersExample);
    }

    @Override
    public Shop SelectShopById(Shop shop) {
        shop = shopMapper.selectByPrimaryKey(shop.getShopId());
        shop.setShopclassfy(shopclassfyMapper.selectByPrimaryKey(shop.getShopclassfyId()));
        return shop;
    }

    @Override
    public Article SelectArticleById(Article article) {
        article = articleMapper.selectByPrimaryKey(article.getArticleId());
        article.setAuthor(authorMapper.selectByPrimaryKey(article.getAuthorId()));
        article.setShop(shopMapper.selectByPrimaryKey(article.getArticleShop()));
        return article;
    }

    @Override
    public Author SelectAuthorById(Author author) {
        return authorMapper.selectByPrimaryKey(author.getAuthorId());
    }
}
