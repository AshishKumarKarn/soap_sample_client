/**
 * HelloWorld.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.karn.ws;

public interface HelloWorld extends java.rmi.Remote {
    public java.lang.String getHelloWorldCustom(com.karn.ws.CustomRequest arg0) throws java.rmi.RemoteException;
    public java.lang.String getHelloWorldAsString() throws java.rmi.RemoteException;
}
