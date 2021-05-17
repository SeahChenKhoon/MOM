package StepDefinitions;




import Classes.CheckEligibility;
import Classes.ContactDetails;
import Classes.CorpPassLogin;
import Classes.SubmitYourProposal;
import Classes.Web_Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactory.CheckEligibility_PF;
import pageFactory.ContactDetails_PF;
import pageFactory.CorpPassPage_PF;
import pageFactory.GrantAction_PF;
import pageFactory.LoginPage_PF;
import pageFactory.MyGrant_PF;
import pageFactory.NewGrant_PF;

public class StepDefinition extends Web_Driver{

	@Given("^Applicant Navigates to website \"([^\"]*)\", Test_case \"([^\"]*)\"$")
	public void applicant_Navigates_to_website_Test_case(String url, String testCase) throws Throwable {
		LoginPage_PF loginPage_PF= new LoginPage_PF(url,testCase);
		loginPage_PF.pageWait();
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
		NewGrant_PF newGrant_PF = new NewGrant_PF();		
		newGrant_PF.pageWait();
		newGrant_PF.SelectSector(sector);
		newGrant_PF = null;
	}

	@When("^He clicks on a sector for your business Sector \"([^\"]*)\", SubSector \"([^\"]*)\"$")
	public void he_clicks_on_a_sector_for_your_business_Sector_SubSector(String sector, String subSector) throws Throwable {
		NewGrant_PF newGrant_PF = new NewGrant_PF();		
		// Wait for Sector Page to Appear
		newGrant_PF.pageWait();
		// He Clicks on the Sector
		newGrant_PF.SelectSector(sector, subSector);
		newGrant_PF =null; 
	}


	@Given("^He clicks on Development Area \"([^\"]*)\" button$")
	public void he_clicks_on_Development_Area_button(String grantUse) throws Throwable {
		NewGrant_PF newGrant_PF = new NewGrant_PF();
		// Wait for Development Area to Appear
		newGrant_PF.pageWait();
		// He Clicks on the Development Area
		newGrant_PF.SelectDevelopmentArea(grantUse);
		newGrant_PF =null;
	}

	@Given("^He clicks on Functional Area \"([^\"]*)\" button$")
	public void he_clicks_on_Functional_Area_button(String grantPurpose) throws Throwable {
		NewGrant_PF newGrant_PF = new NewGrant_PF();
		// Wait for Functional Page to Appear
		newGrant_PF.pageWait();		
		// He Clicks on the Functional Area
		newGrant_PF.SelectFunctionalArea(grantPurpose);
		newGrant_PF =null;
	}

	@Given("^He clicks on 'Proceed' button to enter the form$")
	public void he_clicks_on_Proceed_button_to_enter_the_form() throws Throwable {
		// He Clicks on Proceed
		GrantAction_PF grantAction_PF = new GrantAction_PF();
		grantAction_PF.pageWait();
		grantAction_PF.Proceed_Clicked();
		grantAction_PF = null;
	}

	@Given("^He clicks on \"([^\"]*)\" in all Option in CHECK YOUR ELIGIBILITY form$")
	public void he_clicks_on_in_all_Option_in_CHECK_YOUR_ELIGIBILITY_form(String option) throws Throwable {
		CheckEligibility_PF checkEligibility_PF = new CheckEligibility_PF();
		// Wait for Check For CheckEligibility Page to Appear	
		checkEligibility_PF.pageWait();
		//Set Radio Button to Yes/No
		if (option.toUpperCase().equals("NO") )
			checkEligibility_PF.ClickNoForAllOptions();
		else
			checkEligibility_PF.ClickYesForAllOptions();
		checkEligibility_PF.Save_Click();
		checkEligibility_PF.Next_Click();
		checkEligibility_PF = null;
	}

	@When("^He inputs Name \"([^\"]*)\", Job Title \"([^\"]*)\" , Contact No \"([^\"]*)\", Email \"([^\"]*)\"$")
	public void he_inputs_Name_Job_Title_Contact_No_Email(String name, String jobTitle, String phone,String email) throws Throwable {
		ContactDetails_PF contactDetails_PF = new ContactDetails_PF();
		// Wait for Contact Details Page to appear
		contactDetails_PF.pageWait();		
		contactDetails_PF.InputDetails(name, jobTitle, phone, email);

		contactDetails_PF = null;
	}

	@When("^He sets AddressesSameAsPerson$")
	public void he_sets_AddressesSameAsPerson() throws Throwable {
		// Click on he_sets_AddressesSameAsPerson checkbox
		ContactDetails_PF contactDetails_PF = new ContactDetails_PF();
		contactDetails_PF.SameContactPerson_Click();
		contactDetails_PF =null;
	}

	@When("^He sets Mailing Address Same As CompanyProfile$")
	public void he_sets_Mailing_Address_Same_As_CompanyProfile() throws Throwable {
		ContactDetails_PF contactDetails_PF = new ContactDetails_PF();
		//He clicks on "Same as registered address in Company Profile"
		contactDetails_PF.SameMailingAddress_Click();
		contactDetails_PF = null;	
	}


	@When("^He sets Addresses Same As Person$")
	public void he_sets_Addresses_Same_As_Person() throws Throwable {
		ContactDetails_PF contactDetails_PF = new ContactDetails_PF();
		//He clicks on "Same as main contact person"
		contactDetails_PF.SameContactPerson_Click();
		contactDetails_PF = null;
	}



	@When("^He inputs Postal Code \"([^\"]*)\"$")
	public void he_inputs_Postal_Code(String postalCode) throws Throwable {
		//User input Postal Code
		ContactDetails_PF contactDetails_PF = new ContactDetails_PF();
		contactDetails_PF.InputPostalCode(postalCode);
		contactDetails_PF = null;	
	}

	@Then("^Verify Blk \"([^\"]*)\" Street \"([^\"]*)\"$")
	public void verify_Blk_Street(String block, String unitNumber) throws Throwable {
		// System Verifies Postal Code
		ContactDetails_PF contactDetails_PF = new ContactDetails_PF();
		contactDetails_PF.VerifyPostalCode(block, unitNumber);
		contactDetails_PF = null;	
	}

	@When("^He inputs Level \"([^\"]*)\", Unit \"([^\"]*)\", BuildingName \"([^\"]*)\"$")
	public void he_inputs_Level_Unit_BuildingName(String level, String unit, String buildingName) throws Throwable {
		// User input level, unit, buildingName into Mailing Address
		ContactDetails_PF contactDetails_PF = new ContactDetails_PF();
		contactDetails_PF.InputUnitLevelDetails(level, unit,buildingName);
		contactDetails_PF = null;	
	}

	@When("^He inputs Addressee Name \"([^\"]*)\", Job Title \"([^\"]*)\", Email=\"([^\"]*)\"$")
	public void he_inputs_Addressee_Name_Job_Title_Email(String name, String jobTitle, String email) throws Throwable {
		// User input Name, Job Title, Email in Letter Of Offer Addressee
		ContactDetails_PF contactDetails_PF = new ContactDetails_PF();
		contactDetails_PF.InputAddresseeInfo(name, jobTitle,email);
		contactDetails_PF = null;	
	}

	@When("^He clicks on ContactDetailsSave$")
	public void he_clicks_on_ContactDetailsSave() throws Throwable {
		//He clicks on Save in Contact Details Page
		ContactDetails_PF contactDetails_PF = new ContactDetails_PF();
		contactDetails_PF.Save_Click();
		contactDetails_PF = null;	
	}

	@When("^He clicks on ContactDetailsNext$")
	public void he_clicks_on_ContactDetailsNext() throws Throwable {
		//He clicks on Next in Contact Details Page
		ContactDetails_PF contactDetails_PF = new ContactDetails_PF();
		contactDetails_PF.Next_Click();
		contactDetails_PF = null;	
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
		CorpPassPage_PF corpPassPage_PF = new CorpPassPage_PF();
		corpPassPage_PF.ValidateNRIC();
		corpPassPage_PF= null;
	}

	@Then("^System verifies Name validity$")
	public void system_verifies_Name_validity() throws Throwable {
		// Validate Name		
		CorpPassPage_PF corpPassPage_PF = new CorpPassPage_PF();
		corpPassPage_PF.ValidateName();
		corpPassPage_PF= null;
	}
	@Then("^System verifies Environment validity$")
	public void system_verifies_Environment_validity() throws Throwable {
		// Validate Environment
		CorpPassPage_PF corpPassPage_PF = new CorpPassPage_PF();
		corpPassPage_PF.ValidateEnv();
		corpPassPage_PF= null;
	}

	@Then("^System verifies Role validity$")
	public void system_verifies_Role_validity() throws Throwable {
		// Validate Role
		CorpPassPage_PF corpPassPage_PF = new CorpPCorpPassPage_PFassLogin();
		corpPassPage_PF.ValidateRole();
		corpPassPage_PF= null;
	}

	@When("^Close Browser$")
	public void close_Browser() throws Throwable {
		LoginPage_PF LoginPage_PF = new LoginPage_PF();
		LoginPage_PF.closeBrowser();
		LoginPage_PF = null;
	}

}
