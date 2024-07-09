package com.hiber.First1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc= new Scanner (System.in);
    	while(true)
    	{
    		System.out.println("enter the no 1 to add");
    		System.out.println("enter the no 2 to delete");
    		System.out.println("enter the no 3 to search");
    		System.out.println("enter the no 4 to all");
    		System.out.println("enter the no 5 to update");
    		System.out.println("enter the no 6 to exit");
    		
    		int num = sc.nextInt();
    		switch(num)
    		{
    		case 1:
    		{
    			sc.nextLine();
    			System.out.println("ente the name ");
    			String name = sc.next();
    		
        		System.out.println("enter the sal");
        		int sal = sc.nextInt();
        		
        		Emp emp = new Emp();
        		emp.setName(name);
        		emp.setSal(sal);
        		operation1.create(emp);
        		break;
      			}
    		case 2:
    		{
    			System.out.println("enter the id");
    			int i = sc.nextInt();
    			
    			operation1.delete(i);
    			break;
    			
    		}
    		case 3:
    		{
    			System.out.println("enter the id and  ");
    			int i=sc.nextInt();
    			
    			operation1.Search(i);
    			break;
    			
    		}
    		case 4:
    		{
    			operation1.DisplayAll();
    			break;
    			
    		}
    		case 5:{
    			 System.out.println("enter the  id of employee ");
    			 int i=sc.nextInt();
    			 
    			 sc.nextLine();
    			 System.out.println("update name");
    			 String na = sc.nextLine();
    			 
    			 System.out.println("updta sal ");
    			 int sa = sc.nextInt();
    			 
    			 Emp emp = new Emp();
    			 
    			 emp.setName(na);
    			 emp.setSal(sa);
    			 operation1.Update(i, emp);
    			 break;
    			 
    		}
    		case 6:
    		{
    			 System.exit(0);
    		}
    		default:{
    			System.out.println("entert the correct input");
    		}
    		}
    	}
    	 
    }
}
