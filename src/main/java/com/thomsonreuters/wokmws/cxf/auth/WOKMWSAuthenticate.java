package com.thomsonreuters.wokmws.cxf.auth;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-17T11:04:19.581+08:00
 * Generated source version: 3.0.0
 * 
 */
@WebService(targetNamespace = "http://auth.cxf.wokmws.thomsonreuters.com", name = "WOKMWSAuthenticate")
@XmlSeeAlso({ObjectFactory.class})
public interface WOKMWSAuthenticate {

    @RequestWrapper(localName = "closeSession", targetNamespace = "http://auth.cxf.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.cxf.auth.CloseSession")
    @WebMethod
    @ResponseWrapper(localName = "closeSessionResponse", targetNamespace = "http://auth.cxf.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.cxf.auth.CloseSessionResponse")
    public void closeSession() throws SessionException_Exception, QueryException_Exception, AuthenticationException_Exception, ESTIWSException_Exception, InternalServerException_Exception, InvalidInputException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "authenticate", targetNamespace = "http://auth.cxf.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.cxf.auth.Authenticate")
    @WebMethod
    @ResponseWrapper(localName = "authenticateResponse", targetNamespace = "http://auth.cxf.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.cxf.auth.AuthenticateResponse")
    public java.lang.String authenticate() throws SessionException_Exception, QueryException_Exception, AuthenticationException_Exception, ESTIWSException_Exception, InternalServerException_Exception, InvalidInputException_Exception;
}
