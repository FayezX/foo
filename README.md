# foo
foo assignment

BUG FIXES:
------------
1. first issue, changed item object to this.item and qunitity to this.quantity inside the OrderLine constructor to avoid null pointer exception
2. instantiated with new arraylist in Order class to avoid null pointer exception
3. changed r.size() into r.size()-1 to match number of orders in arraylist in order class calculateTotal function.

Refactoring changes:
---------------------
-All classes are now dependend on the first level
-encapsulation used for all classes
-changed variable named to appropriate names
-All classes are on seperate file instead on the original one.

Unit Test/ Code Coverage Results
---------------------------------
-Used Junit for unit testing individual classes
-ran a suite test to run at once
-code coverage result 78% without main method being covered
-90% with main method covered

