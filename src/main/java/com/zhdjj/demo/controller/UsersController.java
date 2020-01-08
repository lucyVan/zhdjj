package com.zhdjj.demo.controller;

import com.zhdjj.demo.pojo.*;
import com.zhdjj.demo.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.List;

@RestController
@RequestMapping("Users")
@Api("UsersController")
public class UsersController {

    @Autowired
    UsersService usersService;

    @PostMapping("/Login")
    @ApiOperation(value = "登录", tags = "用户管理", notes = "实现登录功能")
    public Bools Login(@RequestBody Users users) {
        return usersService.Login(users);
    }

    @PostMapping("/Registered")
    @ApiOperation(value = "注册", tags = "用户管理", notes = "实现注册功能")
    public Bools Registered(@RequestBody Users users) {
        return usersService.Registered(users);
    }

    @PostMapping("/UpdatePassword")
    @ApiOperation(value = "修改密码", tags = "用户管理", notes = "实现修改密码功能")
    public Bools UpdatePassword(@RequestBody Users users) {
        return usersService.UpdatePassword(users);
    }

    @PostMapping("/AddTips")
    @ApiOperation(value = "发表心得", tags = "心得管理", notes = "实现发表心得功能")
    public Bools AddTips(@RequestBody Tips tips) {
        return usersService.AddTips(tips);
    }

    @PostMapping("/AllTips")
    @ApiOperation(value = "查询已发心得", tags = "心得管理", notes = "查询当前账号已经发了哪些心得")
    public List<Tips> AllTips(@RequestBody Users users) {
        return usersService.AllTips(users);
    }

    @PostMapping("/CountTips")
    @ApiOperation(value = "查询已发心得数", tags = "心得管理", notes = "实现“我”中已发心得数量")
    public Ints CountTips(@RequestBody Users users) {
        return usersService.CountTips(users);
    }

    @DeleteMapping("/RemoveTips")
    @ApiOperation(value = "删除心得", tags = "心得管理", notes = "实现删除功能")
    public Bools RemoveTips(@RequestBody Tips tips) {
        return usersService.RemoveTips(tips);
    }

    @PostMapping("/AddTipsComment")
    @ApiOperation(value = "添加心得评论", tags = "心得管理", notes = "实现对心得进行评论功能")
    public Bools AddTipsComment(@RequestBody Tipscomment tipscomment) {
        return usersService.AddTipsComment(tipscomment);
    }

    @DeleteMapping("/RemoveComment")
    @ApiOperation(value = "删除心得评论", tags = "心得管理", notes = "实现删除心得评论功能")
    public Bools RemoveComment(@RequestBody Tipscomment tipscomment) {
        return usersService.RemoveComment(tipscomment);
    }

    @PostMapping("/CountFocused")
    @ApiOperation(value = "查询粉丝数", tags = "用户关系管理", notes = "实现“我”界面中粉丝数量")
    public Ints CountFocused(@RequestBody Users users) {
        return usersService.CountFocused(users);
    }

    @PostMapping("/AddFocus")
    @ApiOperation(value = "添加关注", tags = "用户关系管理", notes = "实现添加关注功能")
    public Bools AddFocus(@RequestBody Focus focus) {
        return usersService.AddFocus(focus);
    }

    @DeleteMapping("/RemoveFocus")
    @ApiOperation(value = "取消关注", tags = "用户关系管理", notes = "实现取消关注功能")
    public Bools RemoveFocus(@RequestBody Focus focus) {
        return usersService.RemoveFocus(focus);
    }

    @PostMapping("/CountArticleLike")
    @ApiOperation(value = "查询文章点赞数", tags = "文章管理", notes = "根据文章id查询文章点赞数，实现文章页面左下角功能")
    public Ints CountArticleLike(@RequestBody Article article) {
        return usersService.CountArticleLike(article);
    }

    @DeleteMapping("/RemoveArticleLike")
    @ApiOperation(value = "取消文章点赞", tags = "文章管理", notes = "实现取消文章点赞功能")
    public Bools RemoveArticleLike(@RequestBody Articlelike articlelike) {
        return usersService.RemoveArticleLike(articlelike);
    }

    @PostMapping("/AddArticleLike")
    @ApiOperation(value = "给文章点赞", tags = "文章管理", notes = "实现给文章点赞的功能")
    public Bools AddArticleLike(@RequestBody Articlelike articlelike) {
        return usersService.AddArticleLike(articlelike);
    }

    @PostMapping("/CountArticleCollection")
    @ApiOperation(value = "查询文章收藏数", tags = "文章管理", notes = "查询当前文章收藏数")
    public Ints CountArticleCollection(@RequestBody Article article) {
        return usersService.CountArticleCollection(article);
    }

    @PostMapping("/AddArticleCollection")
    @ApiOperation(value = "文章收藏", tags = "文章管理", notes = "实现文章收藏功能")
    public Bools AddArticleCollection(@RequestBody Articlecollection articlecollection) {
        return usersService.AddArticleCollection(articlecollection);
    }

    @DeleteMapping("/RemoveArticleCollection")
    @ApiOperation(value = "取消文章收藏", tags = "文章管理", notes = "取消文章收藏")
    public Bools RemoveArticleCollection(@RequestBody Articlecollection articlecollection) {
        return usersService.RemoveArticleCollection(articlecollection);
    }

    @PostMapping("/CountTipsLike")
    @ApiOperation(value = "查询心得点赞数", tags = "心得管理", notes = "实现心得左下角点赞数")
    public Ints CountTipsLike(@RequestBody Tips tips) {
        return usersService.CountTipsLike(tips);
    }

    @PostMapping("/AddTipsLike")
    @ApiOperation(value = "给心得点赞", tags = "心得管理", notes = "实现心得点赞功能")
    public Bools AddTipsLike(@RequestBody Tipslike tipslike) {
        return usersService.AddTipsLike(tipslike);
    }

    @DeleteMapping("/RemoveTipsLike")
    @ApiOperation(value = "取消心得点赞", tags = "心得管理", notes = "取消给心得点赞功能")
    public Bools RemoveTipsLike(@RequestBody Tipslike tipslike) {
        return usersService.RemoveTipsLike(tipslike);
    }

    @PostMapping("/CountTipsCollection")
    @ApiOperation(value = "查询心得收藏数", tags = "心得管理", notes = "实现心得左下角收藏数")
    public Ints CountTipsCollection(@RequestBody Tips tips) {
        return usersService.CountTipsCollection(tips);
    }

    @PostMapping("/AddTipsCollection")
    @ApiOperation(value = "心得收藏", tags = "心得管理", notes = "实现心得收藏功能")
    public Bools AddTipsCollection(@RequestBody Tipscollection tipscollection) {
        return usersService.AddTipsCollection(tipscollection);
    }

    @DeleteMapping("/RemoveTipsCollection")
    @ApiOperation(value = "取消心得收藏", tags = "心得管理", notes = "实现心得取消收藏功能")
    public Bools RemoveTipsCollection(@RequestBody Tipscollection tipscollection) {
        return usersService.RemoveTipsCollection(tipscollection);
    }

    @PostMapping("/AllShoppingChart")
    @ApiOperation(value = "查询购物车", tags = "商品管理", notes = "实现购物车查询功能")
    public List<Shoppingchart> AllShoppingChart(@RequestBody Users users) {
        return usersService.AllShoppingChart(users);
    }

    @PostMapping("/AddShoppingChart")
    @ApiOperation(value = "添加购物车", tags = "商品管理", notes = "实现购物车添加功能")
    public Bools AddShoppingChart(@RequestBody Shoppingchart shoppingchart) {
        return usersService.AddShoppingChart(shoppingchart);
    }

    @DeleteMapping("/RemoveShoppingChart")
    @ApiOperation(value = "取消购物车", tags = "商品管理", notes = "实现购物车删除功能")
    public Bools RemoveShoppingChart(@RequestBody Shoppingchart shoppingchart) {
        return usersService.RemoveShoppingChart(shoppingchart);
    }

    @PostMapping("/CountArticleComments")
    @ApiOperation(value = "查询文章评论数", tags = "文章管理", notes = "文章左下角显示评论数")
    public Ints CountArticleComments(@RequestBody Article article) {
        return usersService.CountArticleComments(article);
    }

    @PostMapping("/AllArticleComments")
    @ApiOperation(value = "查询文章所有评论", tags = "文章管理", notes = "文章点击显示所有评论")
    public List<Articlecomment> AllArticleComments(@RequestBody Article article) {
        return usersService.AllArticleComments(article);
    }

    @PostMapping("/AddArticleComments")
    @ApiOperation(value = "添加文章评论", tags = "文章管理", notes = "实现对文章进行评论")
    public Bools AddArticleComments(@RequestBody Articlecomment articlecomment) {
        return usersService.AddArticleComments(articlecomment);
    }

    @DeleteMapping("/RemoveArticleComments")
    @ApiOperation(value = "删除文章评论", tags = "文章管理", notes = "实现删除对文章的评论")
    public Bools RemoveArticleComments(@RequestBody Articlecomment articlecomment) {
        return usersService.RemoveArticleComments(articlecomment);
    }

    @PostMapping("/AllFocus")
    @ApiOperation(value = "查询所有关注", tags = "用户关系管理", notes = "实现查询所有关注的功能")
    public List<Focus> AllFocus(@RequestBody Users users) {
        return usersService.AllFocus(users);
    }

    @PostMapping("/AllFocused")
    @ApiOperation(value = "查询所有粉丝", tags = "用户关系管理", notes = "实现查询所有粉丝的功能")
    public List<Focus> AllFocused(@RequestBody Users users) {
        return usersService.AllFocused((users));
    }

    @PostMapping("/CountFocus")
    @ApiOperation(value = "查询关注数", tags = "用户关系管理", notes = "实现查询关注数的功能")
    public Ints CountFocus(Users users) {
        return usersService.CountFocus(users);
    }

    @PostMapping("/AllNotice")
    @ApiOperation(value = "查询所有消息", tags = "消息管理", notes = "实现右上角查询消息功能")
    public List<Notice> AllNotice(@RequestBody Users users) {
        return usersService.AllNotice(users);
    }

    @PostMapping("/UpdateNoticeStuts")
    @ApiOperation(value = "标记消息状态", tags = "消息管理", notes = "将消息标记为已读")
    public Bools UpdateNoticeStatus(@RequestBody Notice notice) {
        return usersService.UpdateNoticeStatus(notice);
    }

    @DeleteMapping("/RemoveNotice")
    @ApiOperation(value = "删除消息", tags = "消息管理", notes = "实现删除消息功能")
    public Bools RemoveNotice(@RequestBody Notice notice) {
        return usersService.RemoveNotice(notice);
    }

    @GetMapping("/AllArticle0")
    @ApiOperation(value = "查询所有美妆文章", tags = "文章管理", notes = "初始化显示所有美妆文章")
    public List<Article> AllArticle0() {
        return usersService.AllArticle0();
    }

    @GetMapping("/AllArticle1")
    @ApiOperation(value = "查询所有护肤文章", tags = "文章管理", notes = "初始化显示所有护肤文章")
    public List<Article> AllArticle1() {
        return usersService.AllArticle1();
    }

    @PostMapping("/FindShop")
    @ApiOperation(value = "搜索产品", tags = "商品管理", notes = "搜索框根据关键字搜索产品")
    public List<Shop> FindShop(@RequestBody Shop shop) {
        return usersService.FindShop(shop);
    }

    @PostMapping("/FindArticle")
    @ApiOperation(value = "搜索文章", tags = "文章管理", notes = "搜索框根据关键字搜索文章")
    public List<Article> FindArticle(@RequestBody Article article) {
        return usersService.FindArticle(article);
    }

    @PostMapping("/FindTips")
    @ApiOperation(value = "搜索心得", tags = "心得管理", notes = "搜索框根据关键字搜索心得")
    public List<Tips> FindTips(@RequestBody Tips tips) {
        return usersService.FindTips(tips);
    }

    @PostMapping("/FindUsers")
    @ApiOperation(value = "搜索用户", tags = "用户管理", notes = "搜索框根据关键字搜索用户")
    public List<Users> FindUsers(@RequestBody Users users) {
        return usersService.FindUsers(users);
    }

    @PostMapping("/SelectShopById")
    @ApiOperation(value = "查询商品", tags = "商品管理", notes = "根据商品ID查询商品详情")
    public Shop SelectShopById(@RequestBody Shop shop) {
        return usersService.SelectShopById(shop);
    }

    @PostMapping("/SelectArticleById")
    @ApiOperation(value = "查询文章详情", tags = "文章管理", notes = "查询文章详情")
    public Article SelectArticleById(Article article) {
        return usersService.SelectArticleById(article);
    }

    @PostMapping("/SelectAuthorById")
    @ApiOperation(value = "查询作者详情", tags = "文章管理", notes = "查询作者详情")
    public Author SelectAuthorById(Author author) {
        return usersService.SelectAuthorById(author);
    }

    @PostMapping("/faceAI")
    @ApiOperation(value = "调用接口", tags = "核心功能", notes = "调用测肤接口")
    public void faceAI(String Authorization, String body) throws Exception {
        String url = "https://api.yimei.ai/v2/api/face/analysis/1";
        Connection connection = Jsoup.connect(url);
        connection.data("Content-Type","application/x-www-form-urlencoded");
        connection.data("Authorization", Authorization);
        connection.data("Content-Length", String.valueOf(body.length()));
        Document document = connection.post();
        System.out.println(document.toString());
//        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
//        httpURLConnection.setUseCaches(false);
//        httpURLConnection.setDoOutput(true);
//        httpURLConnection.setRequestMethod("POST");
////        System.out.println(httpURLConnection.getRequestMethod());
//        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//        httpURLConnection.setRequestProperty("Authorization", Authorization);
//        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(body.length()));

//        OutputStream outputStream = null;
//        OutputStreamWriter outputStreamWriter = null;
//        InputStream inputStream = null;
//        InputStreamReader inputStreamReader = null;
//        BufferedReader reader = null;
//        StringBuffer resultBuffer = new StringBuffer();
//        String tempLine = null;
//        try {
//            outputStream = httpURLConnection.getOutputStream();
//            outputStreamWriter = new OutputStreamWriter(outputStream);
//            outputStreamWriter.write(body);
//            outputStreamWriter.flush();
//            //响应失败
////            if (httpURLConnection.getResponseCode() != 200) {
////                throw new Exception("HTTP Request is not success, Response code is " + httpURLConnection.getResponseCode());
////            }
//            //接收响应流
//            inputStream = httpURLConnection.getInputStream();
//            inputStreamReader = new InputStreamReader(inputStream);
//            reader = new BufferedReader(inputStreamReader);
//            while ((tempLine = reader.readLine()) != null) {
//                resultBuffer.append(tempLine);
//            }
//            System.out.println(1);
//            System.out.println(tempLine);
//        } finally {
//            if (outputStreamWriter != null) outputStreamWriter.close();
//            if (outputStream != null) outputStream.close();
//            if (reader != null) reader.close();
//            if (inputStreamReader != null) inputStreamReader.close();
//            if (inputStream != null) inputStream.close();
//        }
    }
}