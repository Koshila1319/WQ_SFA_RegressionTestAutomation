package com.totalamber.qa.WQTest;

import com.totalamber.qa.automation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by t.piyananda on 21/09/2017.
 */
public class WQClientFirstLoginTest extends TestBase{

    @BeforeClass
    public void NavigateToPage() throws InterruptedException, IOException {
        initDomainObjects(DRIVER);
        String siteUrl = data.getValueByName("ClientFirstLogin_link");
        setSiteURL(siteUrl);
    }

    @AfterClass
    public void endTestMethod() throws Throwable{
        //quitDriver();
    }

    @Test
    public void verify_The_Login_Page_Browser_Title(){
        String title="Sign In";
        Assert.assertEquals(title,wqLoginPage.check_Login_Page_Browser_Title());

    }

    @Test
    public void verify_The_WQ_LogoIs_Available(){
        wqLoginPage.check_WQ_Logo_Is_Available();

    }

    @Test
    public void verify_The_Login_Page_Live_Assistance_Option_Is_Available(){
        wqLoginPage.check_Login_Page_Live_Assitane_Option_Available();
    }

    //Username

    @Test
    public void verify_The_Username_Field_Is_Available(){
        wqLoginPage.check_Username_Feild_Is_Available();
    }

    @Test
    public void verify_The_Username_Field_Enter_Text_Types(){
        String name= data.getValueByName("UserName");
        wqLoginPage.check_Username_Feild_Text_Types(name);
        wqLoginPage.step_Clear_Username_Field();
    }

    @Test
    public void verify_The_Username_PlaceHold_Text(){

        Assert.assertEquals(wqLoginPage.check_Username_PlaceHold_Text(),"Username");
    }

    //Password

    @Test
    public void verify_The_Password_Field_Is_Available(){
        wqLoginPage.check_Password_Feild_Is_Available();
    }

    @Test
    public void verify_The_Password_Is_Display_Set_Secured(){
        wqLoginPage.check_Password_Feild_Is_Secured();
        Assert.assertEquals(wqLoginPage.check_Password_Feild_Is_Secured(),"password");

    }

    @Test
    public  void verify_The_Password_Place_Hold_Text(){
        Assert.assertEquals(wqLoginPage.check_Password_PlaceHold_Text(),"Password");
    }

    //Login Button
    @Test
    public void verify_The_Login_Button_Is_Available(){
        wqLoginPage.check_Login_Button_Available();
    }

    @Test
    public void verify_The_Login_Button_Text(){
        Assert.assertEquals(wqLoginPage.check_Login_Button_Text(),"Log me in!");
    }

    @Test
    public void verify_The_Login_Button_With_Given_UN_PW() throws Exception {
        String Uname = data.getValueByName("ClientFirstLogin_UName");
        String Password = data.getValueByName("ClientFirstLogin_PW");
        wqLoginPage.
                step_User_Enter_Given_Credentials(Uname,Password).
                step_User_Click_Login_Button();
    }

    @Test
    public void verify_ChangePassword_Page_views_after_successful_Login(){
        String expectedTitle = data.getValueByName("ClientFirstLogin_ChangePWPageTitle");
        Assert.assertEquals(wqLoginPage.check_Login_Page_Browser_Title(),expectedTitle);
    }

    @Test
    public void verify_Browser_Title(){
        String expectedTitle = data.getValueByName("ClientFirstLogin_ChangePWPageTitle");
        Assert.assertEquals(wqLoginPage.check_Login_Page_Browser_Title(),expectedTitle);
    }


    //Depends with the registered Client (ClientEmail)
    @Test
    public void verify_Page_Title(){
        String expetedTitle1 = data.getValueByName("ChangePW_Title1");
        String expetedTitle2 = data.getValueByName("ClientDetails_Email");
        String expetedTitle3 = data.getValueByName("ChangePW_Title3");
        Assert.assertEquals(wqChangePWPage.validate_the_PageTitle(),expetedTitle1+expetedTitle2+expetedTitle3);
    }

    @Test
    public void verify_PageContent_Text(){
        String expectedContent1 = data.getValueByName("ChangePW_Content1");
        String expectedContent2 = data.getValueByName("ChangePW_Content2");
        Assert.assertEquals(wqChangePWPage.validate_PageContent1(),expectedContent1);
        Assert.assertEquals(wqChangePWPage.validate_PageContent2(),expectedContent2);
    }

    @Test
    public void verify_FieldWrapper_Near_Password_TextBox_IsAvailable(){
        Assert.assertNotNull(wqChangePWPage.validate_FieldWrapper_Is_Available());
    }

    @Test
    public void verify_MouseHover_The_FieldWrapper(){
        wqChangePWPage.step_User_MoouseHover_the_FieldWrapper();
    }

    @Test
    public void verify_The_Lable_Content_Of_FieldWrapper(){
        String fieldwrapperContent = data.getValueByName("ChangePW_FieldWrapper");
        Assert.assertEquals(wqChangePWPage.validate_FieldWrapper_LabelContent(),fieldwrapperContent);
    }

}
