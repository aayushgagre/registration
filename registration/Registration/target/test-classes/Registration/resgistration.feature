Feature: Registration

Scenario: Invalid username
Given user is on 'WorkingWithForms' page
When user enters invalid username
Then displays 'Please fill the username'

Scenario: Invalid password
Given user is on 'WorkingWithForms' page
When user enters invalid password
Then displays 'Please fill the password'


Scenario: Invalid confirm password
Given user is on 'WorkingWithForms' page
When user enters invalid confirm password
Then displays 'Please fill the password again'

Scenario: Invalid First Name
Given user is on 'WorkingWithForms' page
When user enters invalid First Name
Then display 'Please fill the First Name' 


Scenario: Invalid Last Name
Given user is on 'WorkingWithForms' page
When user enters invalid Last Name
Then display 'Please fill Last Name'

Scenario: Empty field
Given user is on 'WorkingWithForms' page
When user doen't select
Then display 'Please enter valid gender'


Scenario: Invalid DOB
Given user is on 'WorkingWithForms' page
When user enters invalid Date of Birth
Then display 'Correct DOB' 

Scenario: Invalid Email
Given user is on 'WorkingWithForms' page
When user does not enter valid Email
Then display 'Please Enter valid Email'

Scenario: Invalid City
Given user is on 'WorkingWithForms' page
When user enters invalid City
Then display 'Please fill City' 

Scenario: Invalid Address
Given user is on 'WorkingWithForms' page
When user enters invalid Address
Then display 'Please fill the Address' 

Scenario: Invalid Phone
Given user is on 'WorkingWithForms' page
When user enters invalid Phone number
Then displays 'Please fill the valid Phone Number'

Scenario: Invalid Hobbies
Given user is on 'WorkingWithForms' page
When user enters nothing
Then displays 'Please fill the hobbies'

Scenario: Valid Registration details

Given user is on 'WorkingWithForms' page
When user enters valid  registration details
Then displays 'Registration Completed!!!' 

