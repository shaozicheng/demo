/**
 * HospitalWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.webService;

public interface HospitalWS extends javax.xml.rpc.Service {
    public java.lang.String getHospitalWSSoap12Address();

    public com.example.demo.webService.HospitalWSSoap getHospitalWSSoap12() throws javax.xml.rpc.ServiceException;

    public com.example.demo.webService.HospitalWSSoap getHospitalWSSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getHospitalWSSoapAddress();

    public com.example.demo.webService.HospitalWSSoap getHospitalWSSoap() throws javax.xml.rpc.ServiceException;

    public com.example.demo.webService.HospitalWSSoap getHospitalWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
