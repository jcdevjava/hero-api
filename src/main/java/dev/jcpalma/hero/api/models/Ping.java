/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.jcpalma.hero.api.models;

/**
 *
 * @author jcpalma
 */
public class Ping {
    
    private String ping;
    
    public Ping(){
        this.ping = "OK";
    }
    
    public Ping(String ping){
        this.ping = ping;
    }

    /**
     * @return the ping
     */
    public String getPing() {
        return ping;
    }

    /**
     * @param ping the ping to set
     */
    public void setPing(String ping) {
        this.ping = ping;
    }
}
