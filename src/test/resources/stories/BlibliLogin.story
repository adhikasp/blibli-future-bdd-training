Narrative:
As a user
I want to login to Blibli website
So that I can buy things

Scenario: Login as a user
Given Blibli home page
When I login with 'CHANGE_TO_TESTER_EMAIL' as email and 'CHANGE_TO_TESTER_PASSWORD' as password
Then I can see my name 'Adhika Setya' in the site

Scenario: Search and put item to cart
Given Blibli home page
When I search for 'Mi Band 2'
And choose item no '1' in catalog list
And add item to my cart
Then I can see the product 'Mi Band 2' in my cart

Scenario: Pay cart with KlikBCA
Given Blibli cart page
When I checkout and choose default address
And choose KlikBCA as payment method with 'randomNasabah' as user ID
And finish payment process
Then I can see thank you page