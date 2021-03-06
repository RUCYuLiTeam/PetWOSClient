
package com.thomsonreuters.wokmws.cxf.auth;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-17T11:04:19.523+08:00
 * Generated source version: 3.0.0
 */

@WebFault(name = "SessionException", targetNamespace = "http://auth.cxf.wokmws.thomsonreuters.com")
public class SessionException_Exception extends Exception {
    
    private com.thomsonreuters.wokmws.cxf.auth.SessionException sessionException;

    public SessionException_Exception() {
        super();
    }
    
    public SessionException_Exception(String message) {
        super(message);
    }
    
    public SessionException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public SessionException_Exception(String message, com.thomsonreuters.wokmws.cxf.auth.SessionException sessionException) {
        super(message);
        this.sessionException = sessionException;
    }

    public SessionException_Exception(String message, com.thomsonreuters.wokmws.cxf.auth.SessionException sessionException, Throwable cause) {
        super(message, cause);
        this.sessionException = sessionException;
    }

    public com.thomsonreuters.wokmws.cxf.auth.SessionException getFaultInfo() {
        return this.sessionException;
    }
}
