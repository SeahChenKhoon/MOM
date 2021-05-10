package StepDefinitions;




import Classes.CheckEligibility;
import Classes.ContactDetails;
import Classes.CorpPassLogin;
import Classes.GrantAction;
import Classes.Login;
import Classes.MyGrant;
import Classes.NewGrant;
import Classes.SubmitYourProposal;
import Classes.Web_Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jdk.internal.org.jline.utils.Log;
import pageFactory.CorpPassPage_PF;
import pageFactory.LoginPage_PF;
import pageFactory.MyGrant_PF;
import pageFactory.NewGrant_PF;

public class StepDefinition extends Web_Driver{

	@Given("^Applicant Navigates to website \"([^\"]*)\", Test_case \"([^\"]*)\"$")
	public void applicant_Navigates_to_website_Test_case(String url, String testCase) throws Throwable {
		LoginPage_PF loginPage_PF= new LoginPage_PF(url);
		loginPage_PF.writeCaseID(testCase);
		loginPage_PF.waitPage();
		loginPage_PF.clickLogin();
		loginPage_PF =null;

	}
	@When("^He logs into BGP with CorpPass NRIC \"([^\"]*)\", Name \"([^\"]*)\", UEN \"([^\"]*)\", Role \"([^\"]*)\"$")
	public void he_logs_into_BGP_with_CorpPass_NRIC_Name_Env_Role(String nric, String name, String uen, String role) throws Throwable {
		
		CorpPassPage_PF corpPassPage_PF = new CorpPassPage_PF(); 		
		corpPassPage_PF.pageWait();
		corpPassPage_PF.clearNric();
		corpPassPage_PF.inputNric(nric);
		corpPassPage_PF.clearName();
		corpPassPage_PF.inputName(name);
		corpPassPage_PF.clearUen();
		corpPassPage_PF.inputUen(uen);
		corpPassPage_PF.selectRole(role);
		corpPassPage_PF.clickLogin();
		corpPassPage_PF = null;
	}

	@When("^He selects 'Get New Grant' on the 'My Grants' dashboard to enter the Grant Picker$")
	public void he_selects_Get_New_Grant_on_the_My_Grants_dashboard_to_enter_the_Grant_Picker() throws Throwable {
		// Wait for My Grant Page to appear
		MyGrant_PF myGrant_PF = new MyGrant_PF();
		myGrant_PF.pageWait();
		myGrant_PF.clickGetNewGrant();	    
		myGrant_PF = null;
	}

	@When("^He clicks on a sector for your business \"([^\"]*)\"$")
	public void he_clicks_on_a_sector_for_your_business(String sector) throws Throwable {
		NewGrant newGrant = new NewGrant();		
		newGrant.pageWait();
		newGrant.SelectSector(sector);
		newGrant = null;
	}

	@When("^He clicks on a sector for your business Sector \"([^\"]*)\", SubSector \"([^\"]*)\"$")
	public void he_clicks_on_a_sector_for_your_business_Sector_SubSector(String sector, String subSector) throws Throwable {
		NewGrant newGrant = new NewGrant();		
		// Wait for Sector Page to Appear
		newGrant.pageWait();
		// He Clicks on the Sector
		newGrant.SelectSector(sector, subSector);
		newGrant =null; 
	}


	@Given("^He clicks on Development Area \"([^\"]*)\" button$")
	public void he_clicks_on_Development_Area_button(String grantUse) throws Throwable {
		NewGrant newGrant = new NewGrant();
		// Wait for Development Area to Appear
		newGrant.pageWait();
		// He Clicks on the Development Area
		newGrant.SelectDevelopmentArea(grantUse);
		newGrant =null;
	}

	@Given("^He clicks on Functional Area \"([^\"]*)\" button$")
	public void he_clicks_on_Functional_Area_button(String grantPurpose) throws Throwable {
		NewGrant newGrant = new NewGrant();
		// Wait for Functional Page to Appear
		newGrant.pageWait();		
		// He Clicks on the Functional Area
		newGrant.SelectFunctionalArea(grantPurpose);
		newGrant =null;
	}

	@Given("^He clicks on 'Proceed' button to enter the form$")
	public void he_clicks_on_Proceed_button_to_enter_the_form() throws Throwable {
		// He Clicks on Proceed
		GrantAction grantAction = new GrantAction();
		log.debug("Before Wait");
		grantAction.pageWait();
		log.debug("After Wait");		
		grantAction.Proceed_Clicked();
		log.debug("After Proceed");		
		grantAction = null;
	}

	@Given("^He clicks on \"([^\"]*)\" in all Option in CHECK YOUR ELIGIBILITY form$")
	public void he_clicks_on_in_all_Option_in_CHECK_YOUR_ELIGIBILITY_form(String option) throws Throwable {
		CheckEligibility checkEligibility = new CheckEligibility();
		// Wait for Check For CheckEligibility Page to Appear	
		checkEligibility.pageWait();
		//Set Radio Button to Yes/No
		if (option.toUpperCase().equals("NO") )
			checkEligibility.ClickNoForAllOptions();
		else
			checkEligibility.ClickYesForAllOptions();
		checkEligibility.Save_Click();
		checkEligibility.Next_Click();
		checkEligibility = null;
	}

	@When("^He inputs Name \"([^\"]*)\", Job Title \"([^\"]*)\" , Contact No \"([^\"]*)\", Email \"([^\"]*)\"$")
	public void he_inputs_Name_Job_Title_Contact_No_Email(String name, String jobTitle, String phone,String email) throws Throwable {
		ContactDetails contactDetails = new ContactDetails();
		// Wait for Contact Details Page to appear
		contactDetails.pageWait();		
		contactDetails.InputDetails(name, jobTitle, phone, email);

		contactDetails = null;
	}

	@When("^He sets AddressesSameAsPerson$")
	public void he_sets_AddressesSameAsPerson() throws Throwable {
		// Click on he_sets_AddressesSameAsPerson checkbox
		ContactDetails contactDetails = new ContactDetails();
		contactDetails =null;
	}

	@When("^He sets Mailing Address Same As CompanyProfile$")
	public void he_sets_Mailing_Address_Same_As_CompanyProfile() throws Throwable {
		ContactDetails contactDetails = new ContactDetails();
		//He clicks on "Same as registered address in Company Profile"
		contactDetails.SameMailingAddress_Click();
		contactDetails = null;	
	}


	@When("^He sets Addresses Same As Person$")
	public void he_sets_Addresses_Same_As_Person() throws Throwable {
		ContactDetails contactDetails = new ContactDetails();
		//He clicks on "Same as main contact person"
		contactDetails.SameContactPerson_Click();
		contactDetails = null;
	}



	@When("^He inputs Postal Code \"([^\"]*)\"$")
	public void he_inputs_Postal_Code(String postalCode) throws Throwable {
		//User input Postal Code
		ContactDetails contactDetails = new ContactDetails();
		contactDetails.InputPostalCode(postalCode);
		contactDetails = null;	
	}

	@Then("^Verify Blk \"([^\"]*)\" Street \"([^\"]*)\"$")
	public void verify_Blk_Street(String block, String unitNumber) throws Throwable {
		// System Verifies Postal Code
		ContactDetails contactDetails = new ContactDetails();
		contactDetails.VerifyPostalCode(block, unitNumber);
		contactDetails = null;	
	}

	@When("^He inputs Level \"([^\"]*)\", Unit \"([^\"]*)\", BuildingName \"([^\"]*)\"$")
	public void he_inputs_Level_Unit_BuildingName(String level, String unit, String buildingName) throws Throwable {
		// User input level, unit, buildingName into Mailing Address
		ContactDetails contactDetails = new ContactDetails();
		contactDetails.InputUnitLevelDetails(level, unit,buildingName);
		contactDetails = null;	
	}

	@When("^He inputs Addressee Name \"([^\"]*)\", Job Title \"([^\"]*)\", Email=\"([^\"]*)\"$")
	public void he_inputs_Addressee_Name_Job_Title_Email(String name, String jobTitle, String email) throws Throwable {
		// User input Name, Job Title, Email in Letter Of Offer Addressee
		ContactDetails contactDetails = new ContactDetails();
		contactDetails.InputAddresseeInfo(name, jobTitle,email);
		contactDetails = null;	
	}

	@When("^He clicks on ContactDetailsSave$")
	public void he_clicks_on_ContactDetailsSave() throws Throwable {
		//He clicks on Save in Contact Details Page
		ContactDetails contactDetails = new ContactDetails();
		contactDetails.Save_Click();
		contactDetails = null;	
	}

	@When("^He clicks on ContactDetailsNext$")
	public void he_clicks_on_ContactDetailsNext() throws Throwable {
		//He clicks on Next in Contact Details Page
		ContactDetails contactDetails = new ContactDetails();
		contactDetails.Next_Click();
		contactDetails = null;	
	}

	@When("^He clicks on Activity$")
	public void he_clicks_on_Activity() throws Throwable {
	    // He clicks on Activity
	    SubmitYourProposal submitYourProposal = new SubmitYourProposal();
	    submitYourProposal.SelectActivity();
	    submitYourProposal = null;
	}
	
	@Then("^System verifies validity NRIC$")
	public void system_verifies_validity_NRIC() throws Throwable {	
		CorpPassLogin corpPassLogin = new CorpPassLogin();
		corpPassLogin.ValidateNRIC();
		corpPassLogin= null;
	}

	@Then("^System verifies Name validity$")
	public void system_verifies_Name_validity() throws Throwable {
		// Validate Name		
		CorpPassLogin corpPassLogin = new CorpPassLogin();
		corpPassLogin.ValidateName();
		corpPassLogin= null;
	}
	@Then("^System verifies Environment validity$")
	public void system_verifies_Environment_validity() throws Throwable {
		// Validate Environment
		CorpPassLogin corpPassLogin = new CorpPassLogin();
		corpPassLogin.ValidateEnv();
		corpPassLogin= null;
	}

	@Then("^System verifies Role validity$")
	public void system_verifies_Role_validity() throws Throwable {
		// Validate Role
		CorpPassLogin corpPassLogin = new CorpPassLogin();
		corpPassLogin.ValidateRole();
		corpPassLogin= null;
	}

	@When("^Close Browser$")
	public void close_Browser() throws Throwable {
		LoginPage_PF LoginPage_PF = new LoginPage_PF();
		LoginPage_PF.closeBrowser();
		LoginPage_PF = null;
	}

}
