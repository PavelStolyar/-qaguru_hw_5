package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class FindIssueTest_LambdaSteps {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void findIssueTest() {
        //test data
        String repositoryUrl = "https://github.com/PavelStolyar/-qaguru_hw_5/";
        String tabName = "Issues";
        String issueName = "TestIssue";

        step("Open repositoty in githab", () -> open(repositoryUrl));
        step("Open needed tab", () -> $(byText(tabName)).click());
        step("Search issue by name", () -> $(byText(issueName)).click());
        step("Checked that needed issue is opened", () ->
                $(".js-issue-title.markdown-title").shouldHave(text(issueName)));

    }
}
