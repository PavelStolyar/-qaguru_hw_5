package tests;

import org.junit.jupiter.api.Test;
import webSteps.WebSteps;

public class FindIssueTestAnnotatedSteps {

    private WebSteps steps = new WebSteps();

    @Test
    public void findIssueTest(){
        //test data
        String repositoryUrl = "https://github.com/PavelStolyar/-qaguru_hw_5/";
        String tabName = "Issues";
        String issueName = "TestIssue";

        steps.openRepository(repositoryUrl);
        steps.openTab(tabName);
        steps.openIssueByName(issueName);
        steps.checkIssueByName(issueName);
    }
}
