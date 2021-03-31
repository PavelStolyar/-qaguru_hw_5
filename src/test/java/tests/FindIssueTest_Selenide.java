package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FindIssueTest_Selenide {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void findIssueTest() {
        //test data
        String baseUrl = "https://github.com/PavelStolyar/-qaguru_hw_5/";
        String tabName = "Issues";
        String issueName = "TestIssue";

        // open repository in github
        open(baseUrl);
        // open needed tab
        $(byText(tabName)).click();
        //search issue by name
        $(byText(issueName)).click();
        $(".js-issue-title.markdown-title").shouldHave(text(issueName));

    }


}
