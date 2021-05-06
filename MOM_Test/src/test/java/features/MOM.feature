Feature:  Interview Testing Feature

Scenario: 025 Contact Details - Validate Email Format
Given Applicant Navigates to website "https://public:Let$BeC001@bgp-qa.gds-gov.tech/", Test_case "025"
When He logs into BGP with CorpPass NRIC "S1234567A", Name "Tan Ah Kow", UEN "BGPQEDEMO", Role "Acceptor"
And He selects 'Get New Grant' on the 'My Grants' dashboard to enter the Grant Picker
And He clicks on a sector for your business Sector "Education", SubSector "Early Childhood" 
And He clicks on Development Area "Upgrade key business areas, such as adopt technology, improve business processes or raise service standards" button
And He clicks on Functional Area "Innovation & Productivity" button
And He clicks on 'Proceed' button to enter the form
And He clicks on "Yes" in all Option in CHECK YOUR ELIGIBILITY form
And He inputs Name "025", Job Title "Manager" , Contact No "91234565", Email "hello@yahoo.com"
And He inputs Postal Code "400032"
Then Verify Blk "32" Street "EUNOS CRESCENT"
And Close Browser
