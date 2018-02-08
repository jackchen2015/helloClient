package oneKeyService;

public class OneKeyServiceProxy implements oneKeyService.OneKeyService {
  private String _endpoint = null;
  private oneKeyService.OneKeyService oneKeyService = null;
  
  public OneKeyServiceProxy() {
    _initOneKeyServiceProxy();
  }
  
  public OneKeyServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initOneKeyServiceProxy();
  }
  
  private void _initOneKeyServiceProxy() {
    try {
      oneKeyService = (new oneKeyService.OneKeyServiceServiceLocator()).getOneKeyService();
      if (oneKeyService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)oneKeyService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)oneKeyService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (oneKeyService != null)
      ((javax.xml.rpc.Stub)oneKeyService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public oneKeyService.OneKeyService getOneKeyService() {
    if (oneKeyService == null)
      _initOneKeyServiceProxy();
    return oneKeyService;
  }
  
  public oneKeyService.UserInfo getUserByMacAddr(java.lang.String macAddr) throws java.rmi.RemoteException{
    if (oneKeyService == null)
      _initOneKeyServiceProxy();
    return oneKeyService.getUserByMacAddr(macAddr);
  }
  
  
}