package com.flowers.flower;

import org.hibernate.Session;


public class App 
{
    public static void main( String[] args )
    	    {
    	    	
    	    	Flower flower1 = new Flower();
    	    	flower1.setFlowerId("488");
    	    	flower1.setFlowerType("Orange");
    	    	flower1.setWeeklySales("10000");
    	    	
    	    	Flower flower2 = new Flower();
    	    	flower2.setFlowerId("476");
    	    	flower2.setFlowerType("Red");
    	    	flower2.setWeeklySales("10000");
    	    		
    	    	Manager manager1 = new Manager();
    	    	manager1.setManagerId("489");
    	    	manager1.setManagerName("LR");
    	    	
    	    	Manager manager2 = new Manager();
    	    	manager2.setManagerId("491");
    	    	manager2.setManagerName("koppada");
    	    	
    	    	Flowershop shop = new Flowershop();
    	    	shop.setFlowerShopId("100");
    	    	shop.setFlowerShopName("flowers");
    	    	
    	    	shop.getFlowers().add(flower1);
    	    	shop.getFlowers().add(flower2);
    	    	shop.getManagers().add(manager1);
    	    	shop.getManagers().add(manager2);
    	    	
    	    	Session session = ServiceProvider.getSession();
    	    			
    	    	session.beginTransaction();
    	    //-----------------------------------

    	    	
    	    	session.save(shop);
    	    	session.save(manager1);
    	    	session.save(flower1);
    	    	session.save(flower2);
    	    	session.save(manager2);
    	    					
    	    		
    	    //------------------------------------	
    	    	session.getTransaction().commit();
    	    			
    	    	session.close();
    	    }
}
