/**
 * OneKeyServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package oneKeyService;

public class OneKeyServiceServiceLocator extends org.apache.axis.client.Service implements oneKeyService.OneKeyServiceService {

    public OneKeyServiceServiceLocator() {
    }


    public OneKeyServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OneKeyServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OneKeyService
    private java.lang.String OneKeyService_address = "http://59.175.139.227:9008/oneKeyService/services/OneKeyService";

    public java.lang.String getOneKeyServiceAddress() {
        return OneKeyService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OneKeyServiceWSDDServiceName = "OneKeyService";

    public java.lang.String getOneKeyServiceWSDDServiceName() {
        return OneKeyServiceWSDDServiceName;
    }

    public void setOneKeyServiceWSDDServiceName(java.lang.String name) {
        OneKeyServiceWSDDServiceName = name;
    }

    public oneKeyService.OneKeyService getOneKeyService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OneKeyService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOneKeyService(endpoint);
    }

    public oneKeyService.OneKeyService getOneKeyService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            oneKeyService.OneKeyServiceSoapBindingStub _stub = new oneKeyService.OneKeyServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getOneKeyServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOneKeyServiceEndpointAddress(java.lang.String address) {
        OneKeyService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (oneKeyService.OneKeyService.class.isAssignableFrom(serviceEndpointInterface)) {
                oneKeyService.OneKeyServiceSoapBindingStub _stub = new oneKeyService.OneKeyServiceSoapBindingStub(new java.net.URL(OneKeyService_address), this);
                _stub.setPortName(getOneKeyServiceWSDDServiceName());
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
        if ("OneKeyService".equals(inputPortName)) {
            return getOneKeyService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://oneKeyService", "OneKeyServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://oneKeyService", "OneKeyService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OneKeyService".equals(portName)) {
            setOneKeyServiceEndpointAddress(address);
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
