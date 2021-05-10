Feature:  Interview Testing Feature

Scenario: 032 Submit Your Proposal - Select Activity
Given Applicant Navigates to website "https://public:Let$BeC001@bgp-qa.gds-gov.tech/", Test_case "032"
When He logs into BGP with CorpPass NRIC "S1234567A", Name "Tan Ah Kow", UEN "BGPQEDEMO", Role "Acceptor"
And He selects 'Get New Grant' on the 'My Grants' dashboard to enter the Grant Picker
And He clicks on a sector for your business "IT" 
#And He clicks on Development Area "Bring my business overseas or establish a stronger international presence" button
#And He clicks on Functional Area "Market Readiness Assistance" button
#And He clicks on 'Proceed' button to enter the form
#And He clicks on "Yes" in all Option in CHECK YOUR ELIGIBILITY form
#And He inputs Name "030", Job Title "Manager" , Contact No "91234565", Email "hello@yahoo.com"
#And He inputs Postal Code "400032"
#And He inputs Level "14", Unit "226", BuildingName "Eunos Court"
#And He inputs Addressee Name "Peter", Job Title "Manager", Email="asdasdasd"
#And He clicks on ContactDetailsSave
#And He clicks on ContactDetailsNext
#And He clicks on Activity
And Close Browser
