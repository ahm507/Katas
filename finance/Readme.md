Finance: TDD Kata
==================

It can include the whole system development under GUI.
Including the GUI is sinking into details of the GUI framework and test frameworks.

Th UserStore.java is used as an interface to datastore, later on you should implement a DB version to persist data.

USER STORIES:
-------------
### As a visitor I want to register new account using my email as id, so that I can store my transactions:

* Use email as the login id.
* Ensure the email is valid.
* Ensure password is entered twice and matched.
* Ensure email is not registered before.
* once submitted, send verification email with some URL.
* When the used click the URL, he will verify his account and ensure his email is OK.


### As a user, I want to login to start using the application benefits

### As a user, I want to logout to stop using the application benefits and use it later


### As a user I want to create new financial account in one of 4 categories, income, asset, expense, liability:
* Ensure user can create multiple accounts under one of the mentioned types
* Account name should be unique under the one type
* User can edit, or delete accounts
* User can not delete account if it has matched transactions


### As a user, I want to record financial transaction
* User can add, edit or delete
* Transaction details includes, amount, description, withdraw from account, deposit into account, and date

### As a user I want so review accounts chart balances

### As a user I want to see charts to see expenses trend over year, month by month.
* I want to see trend month by month
* Over a whole class, such as income, asset, expense, and liability


