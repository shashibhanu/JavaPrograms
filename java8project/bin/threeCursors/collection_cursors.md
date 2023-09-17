# Enumeration

introduced in 1.0 version
legacy cursor
only used in vector, stack and hash-table
only move forward - unidirectional
only read access, no remove operation

Ex:
Enumeration e = v.elements();

two methods:
hasMoreElements();
nextElement();

# Iterator
introduced in 1.2 version
Universal cursor
used in all collection framework
only move forward - unidirectional
only read and remove operation, no replace operation and addition of new object not permitted

Ex: Iterator lt = l.Iterator();

three methods:
public boolean hasNext()
public void next()
public void remove()

# ListIterator()
We can move either in forward or backward direction - Bidirectional
Ex: ListIterator lt = l.listIterator();

methods:

* Forward Direction
public boolean hasNext()
public void next()
public int nextIndex()

* Backward Direction
public boolean hasPrevious()
public void previous()
public int previousIndex()

* Other Capability Methods
public void remove()
public void set(Object new)
public void add(Object new)

# Spliterator

Introduced in Java 1.8
Iterator only iterates elements individually, Spliterator traverse elements individually as well as in bulk
It is an iterator for both Collection and Stream API, except Map implementation classes 
It uses internal iteration. 
It is Not a Universal iterator 
It supports parallel programming by splitting the given element set so that each set can be processed individually.

# HashMap Iteration
there are 5 ways to iterate hashmap mentioned on page https://www.geeksforgeeks.org/iterate-map-java/
