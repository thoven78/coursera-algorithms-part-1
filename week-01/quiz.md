# Week 01 - Union Find quiz

Score: 3/3
Attempts: 2


## Question 1 (seed = 210021)
Give the id[] array that results from the following sequence of 6 union
operations on a set of 10 items using the quick-find algorithm.

    0-5 3-0 6-0 9-0 8-4 7-9

Recall: our quick-find convention for the union operation p-q is to change id[p]
(and perhaps some other entries) but not id[q].


### Answer
	QuickFindUF x = new QuickFindUF(10);
	x.union(0, 5);
	x.union(3, 0);
	x.union(6, 0);
	x.union(9, 0);
	x.union(8, 4);
	x.union(7, 9);
	x.print();
	5 1 2 5 4 5 5 5 4 5


## Question 2 (seed = 544295)
Give the id[] array that results from the following sequence of 9 union
operations on a set of 10 items using the weighted quick-union algorithm from lecture.

    1-0 6-2 9-8 0-2 8-3 3-4 4-5 7-6 9-2

Recall: when joining two trees of equal size, our weighted quick union convention is to
make the root of the second tree point to the root of the first tree. Also, our weighted
quick union algorithm uses union by size (number of nodes), not union by height.


### Answer
	QuickUnionWeightedUF x = new QuickUnionWeightedUF(10);
	x.union(1, 0);
	x.union(6, 2);
	x.union(9, 8);
	x.union(0, 2);
	x.union(8,3);
	x.union(3, 4);
	x.union(4, 5);
	x.union(7, 6);
	x.union(9, 2);
	1 9 6 9 9 9 1 1 9 9


## Question 3 (seed = 414395)

Which of the following id[] array(s) could be the result of running the weighted quick union
algorithm on a set of 10 items? Check all that apply.

8 9 8 5 8 8 5 8 8 5 	(9-1, 5-6, 8-0, 4-8, 7-8, 0-2, 5-3, 1-5, 8-6)

0 1 2 3 4 5 6 3 3 3 	(3-7, 8-3, 8-9)

Reasons why arrays could fail:

1. Height of forest = 4 > lg N = lg(10)
2. Size of tree rooted at parent of 7
3. The id[] array contains a cycle: 4->8->6->2->4
