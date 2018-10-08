package CreateUserAndSetLanguageAsFrench;

import org.junit.Test;

import com.ptc.sca.sco.swaf.localization.OtherSolvent;
import com.ptc.sca.sco.swaf.localization.Screenshots;
import com.ptc.sca.sco.swaf.pages.AdministrationAndConfigPageSolvent;
import com.ptc.sca.sco.swaf.pages.UsersAndAccessControlPageSolvent;
import com.ptc.sca.sco.swaf.popups.EditUserSolvent;
import com.ptc.sca.sco.swaf.testdata.cslm.Users;
import com.ptc.sca.sco.swaf.util.ScoTestCase;

public class CreateUserAndSetLanguageAsFrench extends ScoTestCase {
  OtherSolvent os = new OtherSolvent();
  static String lang = "French";

  @Test
  public void test() {

    start(Users.ADMIN);
    AdministrationAndConfigPageSolvent admin = homePage.openAdministrationAndConfigPageSolvent();

    UsersAndAccessControlPageSolvent user = os.clickOnUsersTab();

    EditUserSolvent editUser = user.clickEditUserButton("Admin", "Controls Engineer");
    editUser.selectLanguage(lang);

    Screenshots.lang = lang;


  }

}
