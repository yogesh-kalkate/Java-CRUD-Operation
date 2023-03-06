package com.Employe.demos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CRUDdemo {

	public static void main(String[] args) {
		
		//Collection<Employee> emp =new ArrayList<Employee>();                             //use collection here 
		
		List<Employee> emp =new ArrayList<Employee>();                                   //use list collection for list operator 
		
		
		//we provide menu here 
		Scanner sc =new Scanner(System.in);
		Scanner st =new Scanner(System.in);
		int choice;
		do {
			  System.out.println("1.Insert");
			  System.out.println("2.Display");
			  System.out.println("3.Search");
			  System.out.println("4.Delete");
			  System.out.println("5.Update");
			  System.out.println("Enter your choice : ");
			  choice= sc.nextInt();                           //we initialise here //loop working until user not define 0
			  
			  //now we need to perform operation like insert delete so we use swith case before that we create collection of employee using arraylist collection 
			switch(choice) 
			{
			case 1 : 
				System.out.println("Enter Empno : ");
				int empno = sc.nextInt();
				System.out.println("Enter Empname : ");                              //we get value from users 
				String ename = st.nextLine();                                       //we get error here if we use same scanner for int and string for that we need make seperate scanner for string to avoid error
				System.out.println("Enter EmpSalary : ");                             //we use st for string
				int Sal = sc.nextInt();
				
				emp.add(new Employee(empno,ename,Sal));                                //once value pass to the constructor object will be created and that object add into collection 
				
			break;
			
			case 2 :                                                                        //display the content //direct call collectiono 
			    //System.out.println(emp);
				//instead of calling collection we use iterator for print data one by one
				
				System.out.println("---------------------------------");
				Iterator<Employee> i = emp.iterator();                  //collection.iterator   //it used to retrive collection one by one //this eterator have object 
				
				while(i.hasNext()) {                          //if next data availble print it one by one 
					Employee e =i.next();
					System.out.println(e);
				}
				System.out.println("---------------------------------");
				break;
				
				//for search display and searching code almost same just small changes are there 
				
			case 3 :
				boolean found = false;
				System.out.println("enter Emp no  to search ");               //this for search  
				empno = sc.nextInt();      
				System.out.println("---------------------------------");
				  i = emp.iterator();                                       //iterator already declared
				  while(i.hasNext()) { 
					  Employee e =i.next();                                 //when employe name and user employe name match then it is true 
					  if(e.getEmployeno() == empno ) {
					  System.out.println(e);                                //and display the record
					  found = true;                   
				       }		 
		     	  }
				  if(!found) {                                                  //if record not found or match 
					  System.out.println("Record not found ");
				  }
				  System.out.println("---------------------------------");
					break;
					
					//for delete
			case 4 :
				found = false;
				System.out.println("enter Emp no  to delete ");    
				empno = sc.nextInt();      
				System.out.println("---------------------------------");
				i = emp.iterator();
				 while(i.hasNext()) { 
					 Employee e =i.next();   
					 if(e.getEmployeno() == empno ) {
						 // System.out.println(e);                                //and display the record
						 i.remove();                                           //instead display record we use iterator remove method for delete data 
						  found = true;                   
					       }		 
			     	  }
					  if(!found) 
					  {                                                  //if record not found or match 
						  System.out.println("Record not found ");
					  }
					  else
					  {
						  System.out.println("Record is Deleted succesfully ");
					  }
					  System.out.println("---------------------------------");
						break;
						
			//for update we need to use list iterator and this is availabel is list collaction   so we simply change the collection name  collection to list
						
			case 5 :
				found = false;
				System.out.println("enter Emp no for Update ");    
				empno = sc.nextInt();      
				System.out.println("---------------------------------");
				//we use list iterator 
				ListIterator<Employee>li = emp.listIterator();                  //list iterator of employe li is collection of emp  	
			
				 while(li.hasNext()) { 
					 Employee e =li.next();   
					 if(e.getEmployeno() == empno ) {
						 // System.out.println(e);                                //display 2 .and display the record
						// i.remove();                                           //delete 4 instead display record we use iterator remove method for delete data 
						
						 System.out.println("Enter new name : ");                  //ask user for name
						 ename = st.nextLine(); 
						
						 System.out.println("Enter new salary : ");                  //ask user for salary
						 Sal = sc.nextInt();
						 
						 li.set(new Employee(empno,ename,Sal));                  //here we call the function that is list iterator.set for change data 
						 found = true;                                           //we can set here obj of emp 
					       }		 
			     	  }
					  if(!found) 
					  {                                                  //if record not found or match 
						  System.out.println("Record not found ");
					  }
					  else
					  {
						  System.out.println("Record is updated succesfully ");
					  }
					  System.out.println("---------------------------------");
						break;
				 }
		
		}while(choice!=0);

	}

}
