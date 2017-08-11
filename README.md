# foo
foo assignment

BUG FIXES:
------------
1. first issue, changed item object to this.item and qunitity to this.quantity inside the OrderLine constructor to avoid null pointer exception <br>
2. instantiated with new arraylist in Order class to avoid null pointer exception <br>
3. changed r.size() into r.size()-1 to match number of orders in arraylist in order class calculateTotal function. <br>

Refactoring changes:<br>
---------------------<br>
-All classes are now dependend on the first level<br>
-encapsulation used for all classes<br>
-changed variable named to appropriate names<br>
-All classes are on seperate file instead on the original one.<br>

Unit Test/ Code Coverage Results<br>
---------------------------------<br>
-Used Junit for unit testing individual classes<br>
-ran a suite test to run at once<br>
-code coverage result 78% without main method being covered<br>
-90% with main method covered<br>

