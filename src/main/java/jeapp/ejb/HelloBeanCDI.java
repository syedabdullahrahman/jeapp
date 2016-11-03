/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeapp.ejb;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

/**
 *
 * @author Viruss
 */
@Stateless
public class HelloBeanCDI {

    private String CDIMessage;
    
    public HelloBeanCDI() {
    }
    
    @PostConstruct
    public void createCDIMessage(){
        this.setCDIMessage("Hello from HelloBeanCDI Stateless Bean");
    }

    /**
     * @return the CDIMessage
     */
    public String getCDIMessage() {
        return CDIMessage;
    }

    /**
     * @param CDIMessage the CDIMessage to set
     */
    public void setCDIMessage(String CDIMessage) {
        this.CDIMessage = CDIMessage;
    }

    
    
}
