
package com.ctrip.ws.flights;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2016-03-22T18:36:54.850+08:00
 * Generated source version: 2.7.11
 * 
 */
 
public class IssueBillModifySoap_IssueBillModifySoap12_Server{

    protected IssueBillModifySoap_IssueBillModifySoap12_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new IssueBillModifySoapImpl1();
        String address = "http://flights.ws.ctrip.com/Flight.Order.SupplierOpenAPI/IssueBillModify.asmx";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new IssueBillModifySoap_IssueBillModifySoap12_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}