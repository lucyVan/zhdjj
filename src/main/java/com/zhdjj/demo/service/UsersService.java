package com.zhdjj.demo.service;

import com.zhdjj.demo.pojo.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersService {

    //    登录
    Bools Login(Users users);

    //    注册
    Bools Registered(Users users);

    //    修改密码
    Bools UpdatePassword(Users users);

    //    查询粉丝数
    Ints CountFocused(Users users);

    //    添加关注
    Bools AddFocus(Focus focus);

    //    取消关注
    Bools RemoveFocus(Focus focus);

    //    查询所有关注
    List<Focus> AllFocus(Users users);

    //    查询所有粉丝
    List<Focus> AllFocused(Users users);

    //    查询文章点赞数
    Ints CountArticleLike(Article article);

    //    给文章点赞
    Bools AddArticleLike(Articlelike articlelike);

    //    取消文章点赞
    Bools RemoveArticleLike(Articlelike articlelike);

    //    查询文章收藏数
    Ints CountArticleCollection(Article article);

    //    文章收藏
    Bools AddArticleCollection(Articlecollection articlecollection);

    //    取消文章收藏
    Bools RemoveArticleCollection(Articlecollection articlecollection);

    //    查询心得点赞数
    Ints CountTipsLike(Tips tips);

    //    给心得点赞
    Bools AddTipsLike(Tipslike tipslike);

    //    取消心得点赞
    Bools RemoveTipsLike(Tipslike tipslike);

    //    查询心得收藏数
    Ints CountTipsCollection(Tips tips);

    //    心得收藏
    Bools AddTipsCollection(Tipscollection tipscollection);

    //    取消心得收藏
    Bools RemoveTipsCollection(Tipscollection tipscollection);

    //    查询购物车
    List<Shoppingchart> AllShoppingChart(Users users);

    //    添加购物车
    Bools AddShoppingChart(Shoppingchart shoppingchart);

    //    取消购物车
    Bools RemoveShoppingChart(Shoppingchart shoppingchart);

    //    查询文章评论数
    Ints CountArticleComments(Article article);

    //    查询文章所有评论
    List<Articlecomment> AllArticleComments(Article article);

    //    添加文章评论
    Bools AddArticleComments(Articlecomment articlecomment);

    //    删除文章评论
    Bools RemoveArticleComments(Articlecomment articlecomment);

    //    发表心得
    Bools AddTips(Tips tips);

    //    查询已发心得
    List<Tips> AllTips(Users users);

    //    删除心得
    Bools RemoveTips(Tips tips);

    //    添加心得评论
    Bools AddTipsComment(Tipscomment tipscomment);

    //    删除心得评论
    Bools RemoveComment(Tipscomment tipscomment);

    //查询已发心得数
    Ints CountTips(Users users);

    //查询关注数
    Ints CountFocus(Users users);

    //查询所有消息
    List<Notice> AllNotice(Users users);

    //标记消息状态
    Bools UpdateNoticeStatus(Notice notice);

    //删除消息
    Bools RemoveNotice(Notice notice);

    //查询所有美妆文章
    List<Article> AllArticle0();

    //查询所有护肤文章
    List<Article> AllArticle1();

    //搜索产品
    List<Shop> FindShop(Shop shop);

    //搜索文章
    List<Article> FindArticle(Article article);

    //搜索心得
    List<Tips> FindTips(Tips tips);

    //搜索用户
    List<Users> FindUsers(Users users);

    //查询商品
    Shop SelectShopById(Shop shop);

    //查询文章详情
    Article SelectArticleById(Article article);

    //查询作者详情
    Author SelectAuthorById(Author author);
}
