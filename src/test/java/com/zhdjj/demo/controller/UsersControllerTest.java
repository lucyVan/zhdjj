package com.zhdjj.demo.controller;

import com.zhdjj.demo.DemoApplication;
import com.zhdjj.demo.controller.UsersController;
import com.zhdjj.demo.pojo.Users;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * UsersController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>01/03/2020</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class UsersControllerTest {
    @Autowired
    UsersController usersController;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: Login(@RequestBody Users users)
     */
    @Test
    public void testLogin() throws Exception {
        Users users = new Users();
        users.setUserId(1);
        users.setUserName("123");
        users.setUserPassword("123");
        usersController.Login(users);
    }

    /**
     * Method: Registered(@RequestBody Users users)
     */
    @Test
    public void testRegistered() throws Exception {
        Users users = new Users();
        users.setUserId(1);
        users.setUserName("123");
        users.setUserPassword("123");
        usersController.Registered(users);
    }

    /**
     * Method: UpdatePassword(@RequestBody Users users)
     */
    @Test
    public void testUpdatePassword() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: AddTips(@RequestBody Tips tips)
     */
    @Test
    public void testAddTips() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: AllTips(@RequestBody Users users)
     */
    @Test
    public void testAllTips() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: CountTips(@RequestBody Users users)
     */
    @Test
    public void testCountTips() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: RemoveTips(@RequestBody Tips tips)
     */
    @Test
    public void testRemoveTips() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: AddTipsComment(@RequestBody Tipscomment tipscomment)
     */
    @Test
    public void testAddTipsComment() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: RemoveComment(@RequestBody Tipscomment tipscomment)
     */
    @Test
    public void testRemoveComment() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: CountFocused(@RequestBody Users users)
     */
    @Test
    public void testCountFocused() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: AddFocus(@RequestBody Focus focus)
     */
    @Test
    public void testAddFocus() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: RemoveFocus(@RequestBody Focus focus)
     */
    @Test
    public void testRemoveFocus() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: CountArticleLike(@RequestBody Article article)
     */
    @Test
    public void testCountArticleLike() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: RemoveArticleLike(@RequestBody Articlelike articlelike)
     */
    @Test
    public void testRemoveArticleLike() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: AddArticleLike(@RequestBody Articlelike articlelike)
     */
    @Test
    public void testAddArticleLike() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: CountArticleCollection(@RequestBody Article article)
     */
    @Test
    public void testCountArticleCollection() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: AddArticleCollection(@RequestBody Articlecollection articlecollection)
     */
    @Test
    public void testAddArticleCollection() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: RemoveArticleCollection(@RequestBody Articlecollection articlecollection)
     */
    @Test
    public void testRemoveArticleCollection() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: CountTipsLike(@RequestBody Tips tips)
     */
    @Test
    public void testCountTipsLike() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: AddTipsLike(@RequestBody Tipslike tipslike)
     */
    @Test
    public void testAddTipsLike() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: RemoveTipsLike(@RequestBody Tipslike tipslike)
     */
    @Test
    public void testRemoveTipsLike() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: CountTipsCollection(@RequestBody Tips tips)
     */
    @Test
    public void testCountTipsCollection() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: AddTipsCollection(@RequestBody Tipscollection tipscollection)
     */
    @Test
    public void testAddTipsCollection() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: RemoveTipsCollection(@RequestBody Tipscollection tipscollection)
     */
    @Test
    public void testRemoveTipsCollection() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: AllShoppingChart(@RequestBody Users users)
     */
    @Test
    public void testAllShoppingChart() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: AddShoppingChart(@RequestBody Shoppingchart shoppingchart)
     */
    @Test
    public void testAddShoppingChart() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: RemoveShoppingChart(@RequestBody Shoppingchart shoppingchart)
     */
    @Test
    public void testRemoveShoppingChart() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: CountArticleComments(@RequestBody Article article)
     */
    @Test
    public void testCountArticleComments() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: AllArticleComments(@RequestBody Article article)
     */
    @Test
    public void testAllArticleComments() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: AddArticleComments(@RequestBody Articlecomment articlecomment)
     */
    @Test
    public void testAddArticleComments() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: RemoveArticleComments(@RequestBody Articlecomment articlecomment)
     */
    @Test
    public void testRemoveArticleComments() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: AllFocus(@RequestBody Users users)
     */
    @Test
    public void testAllFocus() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: AllFocused(@RequestBody Users users)
     */
    @Test
    public void testAllFocused() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: CountFocus(Users users)
     */
    @Test
    public void testCountFocus() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: AllNotice(Users users)
     */
    @Test
    public void testAllNotice() throws Exception {
//TODO: Test goes here...
    }


} 
