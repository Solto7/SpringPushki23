package waits;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.helper.models.UserWebTablesForm;
import selenium.pages.BasePage;

public class DraftDemoQaTable2 extends BasePage {

    @FindBy(id = "addNewRecordButton")
    WebElement addButton;

    @FindBy(id = "firstname")
    WebElement firstNameInput;

    @FindBy(id = "lastName")
    WebElement lastNameInput;

    @FindBy(id = "userEmail")
    WebElement userEmailInput;

    @FindBy(id = "age")
    WebElement ageInput;

    @FindBy(id = "salary")
    WebElement salaryInput;

    @FindBy(id = "department")
    WebElement departmentInput;

    @FindBy(id = "submit")
    WebElement submitBtn;

    public DraftDemoQaTable2 fillUpRegistrationForm(UserWebTablesForm userWebTablesForm){

        elementActions.clickTheButton(addButton)
                .writeText(firstNameInput,userWebTablesForm.getFirstName())
                .writeText(lastNameInput,userWebTablesForm.getLastName())
                .writeText(userEmailInput,userWebTablesForm.getEmail())
                .writeText(ageInput,userWebTablesForm.getAge())
                .writeText(salaryInput,userWebTablesForm.getSalary())
                .writeText(departmentInput,userWebTablesForm.getDepartment())
                .clickTheButton(submitBtn);
        return this;
    }

}
