/**
 * HospitalWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.webService;

public class HospitalWSLocator extends org.apache.axis.client.Service implements com.example.demo.webService.HospitalWS {

    public HospitalWSLocator() {
    }


    public HospitalWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HospitalWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HospitalWSSoap12
    private java.lang.String HospitalWSSoap12_address = "http://dpwsagent07.linkingcloud.cn:9001/linkingif.asmx";

    public java.lang.String getHospitalWSSoap12Address() {
        return HospitalWSSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HospitalWSSoap12WSDDServiceName = "HospitalWSSoap12";

    public java.lang.String getHospitalWSSoap12WSDDServiceName() {
        return HospitalWSSoap12WSDDServiceName;
    }

    public void setHospitalWSSoap12WSDDServiceName(java.lang.String name) {
        HospitalWSSoap12WSDDServiceName = name;
    }

    public com.example.demo.webService.HospitalWSSoap getHospitalWSSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HospitalWSSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHospitalWSSoap12(endpoint);
    }

    public com.example.demo.webService.HospitalWSSoap getHospitalWSSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.demo.webService.HospitalWSSoap12Stub _stub = new com.example.demo.webService.HospitalWSSoap12Stub(portAddress, this);
            _stub.setPortName(getHospitalWSSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHospitalWSSoap12EndpointAddress(java.lang.String address) {
        HospitalWSSoap12_address = address;
    }


    // Use to get a proxy class for HospitalWSSoap
    private java.lang.String HospitalWSSoap_address = "http://dpwsagent07.linkingcloud.cn:9001/linkingif.asmx";

    public java.lang.String getHospitalWSSoapAddress() {
        return HospitalWSSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HospitalWSSoapWSDDServiceName = "HospitalWSSoap";

    public java.lang.String getHospitalWSSoapWSDDServiceName() {
        return HospitalWSSoapWSDDServiceName;
    }

    public void setHospitalWSSoapWSDDServiceName(java.lang.String name) {
        HospitalWSSoapWSDDServiceName = name;
    }

    public com.example.demo.webService.HospitalWSSoap getHospitalWSSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HospitalWSSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHospitalWSSoap(endpoint);
    }

    public com.example.demo.webService.HospitalWSSoap getHospitalWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.demo.webService.HospitalWSSoapStub _stub = new com.example.demo.webService.HospitalWSSoapStub(portAddress, this);
            _stub.setPortName(getHospitalWSSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHospitalWSSoapEndpointAddress(java.lang.String address) {
        HospitalWSSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.demo.webService.HospitalWSSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.demo.webService.HospitalWSSoap12Stub _stub = new com.example.demo.webService.HospitalWSSoap12Stub(new java.net.URL(HospitalWSSoap12_address), this);
                _stub.setPortName(getHospitalWSSoap12WSDDServiceName());
                return _stub;
            }
            if (com.example.demo.webService.HospitalWSSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.demo.webService.HospitalWSSoapStub _stub = new com.example.demo.webService.HospitalWSSoapStub(new java.net.URL(HospitalWSSoap_address), this);
                _stub.setPortName(getHospitalWSSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HospitalWSSoap12".equals(inputPortName)) {
            return getHospitalWSSoap12();
        }
        else if ("HospitalWSSoap".equals(inputPortName)) {
            return getHospitalWSSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "HospitalWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "HospitalWSSoap12"));
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "HospitalWSSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HospitalWSSoap12".equals(portName)) {
            setHospitalWSSoap12EndpointAddress(address);
        }
        else 
if ("HospitalWSSoap".equals(portName)) {
            setHospitalWSSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
