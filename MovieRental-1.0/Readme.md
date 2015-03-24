MovieRental: Refactoring Kata
=============================

This is a Refactoring Kata, the code, before refactoring, is Martin Fowler code in his great book, see:
http://martinfowler.com/books/refactoring.html


TASKs:
-------

Imagine that the customer asked you to modify the supplied code to generate html instead of the current text
, or asked to change the logic by adding new movie types. You find that the code is hard to modify as the design is poor.


First Write Automated Tests
----------------------------
* First: create system tests that ensure the logic is OK
* Generate coverage report and analyse to ensure proper confidence of the coverage
* Refactoring: (After each step run tests)
* Extract methods of business logic
* Move methods into their own most suitable class
* You can separate the formatting into separate class and inject the formatter into the APIs

>> See the MovieRental-2.0 as tests are done and most refactorings are done.



