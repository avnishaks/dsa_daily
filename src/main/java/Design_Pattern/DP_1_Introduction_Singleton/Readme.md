
# Singleton Design Pattern

1. Allow to create a class for which only 1 object 
can be created.
2. E.g : Logger and Database 

[ Creation of object is Expensive in creating Database 
 object. ]

=> Few Examples :- 

Class DBC{
    String url;
    String username;
    String password;
}

DBC db1=new DBC();
DBC db2=new DBC();

Here , we can create multiple object instances for the class , so the property 
of the Singleton is not maintained here.

Static method makes the object belong to the class not the object any-more.


# Eager Loading 
private static EagerLoading dbInstance=new EagerLoading();
Issues with the Eager Loading :-
1. App Start up time increased
2. Create an object when not needed
3. Can not pass variable argument

# Synchronization

# Thread Safe- Double Check Solution

After all , summming up all the apporach :- 

1. Version : 1

- Make the constructor private
- Create a static method to create an instance
- If obj == null => create | else return existing instance

2. Version : 2

- Eager Loading Approach 

3. Version : 3

- Synchronized Method 

4. Version : 4

- Thread safe : double-checking back solution




