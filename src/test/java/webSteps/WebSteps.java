package webSteps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step ("Open {repositoryUrl}")
    public void openRepository(String repositoryUrl)
    {
        open(repositoryUrl);
    }

    @Step ("Open {tabName} tab")
    public void openTab(String tabName) {
        $(byText(tabName)).click();
    }

    @Step ("Open {issueName} issue")
    public void openIssueByName(String issueName) {
        $(byText(issueName)).click();
    }

    @Step ("Check that {issueName} is opened")
    public void checkIssueByName(String issueName) {
        $(".js-issue-title.markdown-title").shouldHave(text(issueName));
    }

}
