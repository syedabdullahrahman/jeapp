/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeapp.ejb;

import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Viruss
 */
@Named
@RequestScoped
public class HelloBean {
private String helloMessage;
@EJB
private HelloBeanCDI hbcdi;
    /**
     * Creates a new instance of HelloBean
     */
    public HelloBean() {
        this.helloMessage = "Hello from HelloBean!";
    }

    /**
     * @return the helloMessage
     */
    public String getHelloMessage() {
        return helloMessage;
    }

    /**
     * @param helloMessage the helloMessage to set
     */
    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }
    
    public String getHelloMessageFromHelloBeanCDI(){
        return hbcdi.getCDIMessage();
    }
}
