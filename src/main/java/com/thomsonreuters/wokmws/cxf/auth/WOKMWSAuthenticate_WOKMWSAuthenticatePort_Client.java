
package com.thomsonreuters.wokmws.cxf.auth;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.Cookie;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-17T11:04:19.436+08:00
 * Generated source version: 3.0.0
 * 
 */
public final class WOKMWSAuthenticate_WOKMWSAuthenticatePort_Client {
	//Singleton
	private static class SingletonHolder {
	    private static final WOKMWSAuthenticate_WOKMWSAuthenticatePort_Client INSTANCE = new WOKMWSAuthenticate_WOKMWSAuthenticatePort_Client();
    }
	private WOKMWSAuthenticate_WOKMWSAuthenticatePort_Client() {
    }
    public static final WOKMWSAuthenticate_WOKMWSAuthenticatePort_Client getInstance() {
	    return SingletonHolder.INSTANCE;
    }
    //WOKMWSAuthenticatePort of WOKMWSAuthenticateService
    private WOKMWSAuthenticate port = (new WOKMWSAuthenticateService()).getWOKMWSAuthenticatePort();
    /**
     * authenticate
     * @return null
     * @return _authenticate_result
     * @author Joshua
     * 
     */
    public String authenticate(){
    	System.out.println("Invoking authenticate...");
    	java.lang.String _authenticate_result = null;
        try {
        	_authenticate_result = port.authenticate();
            System.out.println("authenticate.result=" + _authenticate_result);
        } catch (SessionException_Exception e) { 
            System.out.println("Expected exception: SessionException has occurred.");
            System.out.println(e.toString());
        } catch (QueryException_Exception e) { 
            System.out.println("Expected exception: QueryException has occurred.");
            System.out.println(e.toString());
        } catch (AuthenticationException_Exception e) { 
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        } catch (ESTIWSException_Exception e) { 
            System.out.println("Expected exception: ESTIWSException has occurred.");
            System.out.println(e.toString());
        } catch (InternalServerException_Exception e) { 
            System.out.println("Expected exception: InternalServerException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidInputException_Exception e) { 
            System.out.println("Expected exception: InvalidInputException has occurred.");
            System.out.println(e.toString());
        }
		return _authenticate_result;
    }
    /**
     * setSIDForPort
     * @param _session_identifier
     * @author Joshua
     * 
     */
    public WOKMWSAuthenticate_WOKMWSAuthenticatePort_Client setSIDForPort(String _session_identifier){
    	//httpClient Policy : _session_identifier in cookie
    	Cookie cookie = new Cookie("SID", _session_identifier);
    	HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy(); 
    	httpClientPolicy.setCookie( cookie.getName() + "=" + cookie.getValue() );
    	//set httpClient Policy
    	Client client = ClientProxy.getClient(port);
    	HTTPConduit http = (HTTPConduit) client.getConduit();
    	http.setClient(httpClientPolicy);
		return getInstance();
    }
    /**
     * closeSession
     * @param _session_identifier
     * @author Joshua
     * 
     */
    public void closeSession(String _session_identifier){
    	System.out.println("Invoking closeSession...");
        try {
            port.closeSession();
            System.out.println("authenticate.closed.session=" + _session_identifier);
        } catch (SessionException_Exception e) { 
            System.out.println("Expected exception: SessionException has occurred.");
            System.out.println(e.toString());
        } catch (QueryException_Exception e) { 
            System.out.println("Expected exception: QueryException has occurred.");
            System.out.println(e.toString());
        } catch (AuthenticationException_Exception e) { 
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        } catch (ESTIWSException_Exception e) { 
            System.out.println("Expected exception: ESTIWSException has occurred.");
            System.out.println(e.toString());
        } catch (InternalServerException_Exception e) { 
            System.out.println("Expected exception: InternalServerException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidInputException_Exception e) { 
            System.out.println("Expected exception: InvalidInputException has occurred.");
            System.out.println(e.toString());
        }
    }
}