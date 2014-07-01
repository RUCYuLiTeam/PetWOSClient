
package com.thomsonreuters.wokmws.v3.woksearch;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.Cookie;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-17T11:07:28.888+08:00
 * Generated source version: 3.0.0
 * 
 */
public final class WokSearch_WokSearchPort_Client {
	//Singleton
	private static class SingletonHolder {
	    private static final WokSearch_WokSearchPort_Client INSTANCE = new WokSearch_WokSearchPort_Client();
    }
    private WokSearch_WokSearchPort_Client() {
    }
    public static final WokSearch_WokSearchPort_Client getInstance() {
	    return SingletonHolder.INSTANCE;
    }
    //WOKMWSAuthenticatePort of WOKMWSAuthenticateService
    private WokSearch port = (new WokSearchService()).getWokSearchPort();
    /**
     * setSIDForPort
     * @param _session_identifier
     * @author Joshua
     * 
     */
    public void setSIDForPort(String _session_identifier){
    	//httpClient Policy : _session_identifier in cookie
    	Cookie cookie = new Cookie("SID", _session_identifier);
    	HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy(); 
    	httpClientPolicy.setCookie( cookie.getName() + "=" + cookie.getValue() );
    	//set httpClient Policy
    	Client client = ClientProxy.getClient(port);
    	HTTPConduit http = (HTTPConduit) client.getConduit();
    	http.setClient(httpClientPolicy);
    }
    /**
     * citedReferencesRetrieve
     * @param _citedReferencesRetrieve_queryId
     * @param _citedReferencesRetrieve_retrieveParameters
     * @return List<CitedReference>
     * @author Joshua
     * 
     */
    public List<CitedReference> citedReferencesRetrieve(String _citedReferencesRetrieve_queryId,RetrieveParameters _citedReferencesRetrieve_retrieveParameters){
    	System.out.println("Invoking citedReferencesRetrieve...");
        java.util.List<CitedReference> _citedReferencesRetrieve__return = null;
        try {
            _citedReferencesRetrieve__return = port.citedReferencesRetrieve(_citedReferencesRetrieve_queryId, _citedReferencesRetrieve_retrieveParameters);
            System.out.println("citedReferencesRetrieve.result=" + _citedReferencesRetrieve__return);
        } catch (InternalServerException_Exception e) { 
            System.out.println("Expected exception: InternalServerException has occurred.");
            System.out.println(e.toString());
        } catch (QueryException_Exception e) { 
            System.out.println("Expected exception: QueryException has occurred.");
            System.out.println(e.toString());
        } catch (SessionException_Exception e) { 
            System.out.println("Expected exception: SessionException has occurred.");
            System.out.println(e.toString());
        } catch (AuthenticationException_Exception e) { 
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidInputException_Exception e) { 
            System.out.println("Expected exception: InvalidInputException has occurred.");
            System.out.println(e.toString());
        } catch (ESTIWSException_Exception e) { 
            System.out.println("Expected exception: ESTIWSException has occurred.");
            System.out.println(e.toString());
        }
		return _citedReferencesRetrieve__return;
    }
    /**
     * relatedRecords
     * @deprecated
     * @param _relatedRecords_databaseId
     * @param _relatedRecords_uid
     * @param _relatedRecords_editions
     * @param _relatedRecords_timeSpan
     * @param _relatedRecords_queryLanguage
     * @param _relatedRecords_retrieveParameters
     * @return FullRecordSearchResults
     * @author Joshua
     * 
     */
    public FullRecordSearchResults relatedRecords(String _relatedRecords_databaseId,String _relatedRecords_uid,List<EditionDesc> _relatedRecords_editions,TimeSpan _relatedRecords_timeSpan,String _relatedRecords_queryLanguage,RetrieveParameters _relatedRecords_retrieveParameters){
    	System.out.println("Invoking relatedRecords...");
    	FullRecordSearchResults _relatedRecords__return = null;
        try {
            _relatedRecords__return = port.relatedRecords(_relatedRecords_databaseId, _relatedRecords_uid, _relatedRecords_editions, _relatedRecords_timeSpan, _relatedRecords_queryLanguage, _relatedRecords_retrieveParameters);
            System.out.println("relatedRecords.result=" + _relatedRecords__return);
        } catch (InternalServerException_Exception e) { 
            System.out.println("Expected exception: InternalServerException has occurred.");
            System.out.println(e.toString());
        } catch (QueryException_Exception e) { 
            System.out.println("Expected exception: QueryException has occurred.");
            System.out.println(e.toString());
        } catch (SessionException_Exception e) { 
            System.out.println("Expected exception: SessionException has occurred.");
            System.out.println(e.toString());
        } catch (AuthenticationException_Exception e) { 
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidInputException_Exception e) { 
            System.out.println("Expected exception: InvalidInputException has occurred.");
            System.out.println(e.toString());
        } catch (ESTIWSException_Exception e) { 
            System.out.println("Expected exception: ESTIWSException has occurred.");
            System.out.println(e.toString());
        }
		return _relatedRecords__return;
    }  
    /**
     * citingArticles
     * @deprecated
     * @param _citingArticles_databaseId
     * @param _citingArticles_uid
     * @param _citingArticles_editions
     * @param _citingArticles_timeSpan
     * @param _citingArticles_queryLanguage
     * @param _citingArticles_retrieveParameters
     * @return FullRecordSearchResults
     * @author Joshua
     * 
     */
    public FullRecordSearchResults citingArticles(String _citingArticles_databaseId,String _citingArticles_uid,List<EditionDesc> _citingArticles_editions,TimeSpan _citingArticles_timeSpan,String _citingArticles_queryLanguage,RetrieveParameters _citingArticles_retrieveParameters){
    	System.out.println("Invoking citingArticles...");
    	FullRecordSearchResults _citingArticles__return = null;
        try {
            _citingArticles__return = port.citingArticles(_citingArticles_databaseId, _citingArticles_uid, _citingArticles_editions, _citingArticles_timeSpan, _citingArticles_queryLanguage, _citingArticles_retrieveParameters);
            System.out.println("citingArticles.result=" + _citingArticles__return);

        } catch (InternalServerException_Exception e) { 
            System.out.println("Expected exception: InternalServerException has occurred.");
            System.out.println(e.toString());
        } catch (QueryException_Exception e) { 
            System.out.println("Expected exception: QueryException has occurred.");
            System.out.println(e.toString());
        } catch (SessionException_Exception e) { 
            System.out.println("Expected exception: SessionException has occurred.");
            System.out.println(e.toString());
        } catch (AuthenticationException_Exception e) { 
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidInputException_Exception e) { 
            System.out.println("Expected exception: InvalidInputException has occurred.");
            System.out.println(e.toString());
        } catch (ESTIWSException_Exception e) { 
            System.out.println("Expected exception: ESTIWSException has occurred.");
            System.out.println(e.toString());
        }
		return _citingArticles__return;
    }
    /**
     * citedReferences
     * @param _citedReferences_databaseId
     * @param _citedReferences_uid
     * @param _citedReferences_queryLanguage
     * @param _citedReferences_retrieveParameters
     * @return CitedReferencesSearchResults
     * @author Joshua
     * 
     */
    public CitedReferencesSearchResults citedReferences(String _citedReferences_databaseId,String _citedReferences_uid,String _citedReferences_queryLanguage,RetrieveParameters _citedReferences_retrieveParameters){
    	System.out.println("Invoking citedReferences...");
    	CitedReferencesSearchResults _citedReferences__return = null;
        try {
            _citedReferences__return = port.citedReferences(_citedReferences_databaseId, _citedReferences_uid, _citedReferences_queryLanguage, _citedReferences_retrieveParameters);
            System.out.println("citedReferences.result=" + _citedReferences__return);

        } catch (InternalServerException_Exception e) { 
            System.out.println("Expected exception: InternalServerException has occurred.");
            System.out.println(e.toString());
        } catch (QueryException_Exception e) { 
            System.out.println("Expected exception: QueryException has occurred.");
            System.out.println(e.toString());
        } catch (SessionException_Exception e) { 
            System.out.println("Expected exception: SessionException has occurred.");
            System.out.println(e.toString());
        } catch (AuthenticationException_Exception e) { 
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidInputException_Exception e) { 
            System.out.println("Expected exception: InvalidInputException has occurred.");
            System.out.println(e.toString());
        } catch (ESTIWSException_Exception e) { 
            System.out.println("Expected exception: ESTIWSException has occurred.");
            System.out.println(e.toString());
        }
		return _citedReferences__return;
    }
    /**
     * retrieve
     * @param _retrieve_queryId
     * @param _retrieve_retrieveParameters
     * @return FullRecordData
     * @author Joshua
     * 
     */
    public FullRecordData retrieve(String _retrieve_queryId,RetrieveParameters _retrieve_retrieveParameters){
    	System.out.println("Invoking retrieve...");
    	FullRecordData _retrieve__return = null;
        try {
            _retrieve__return = port.retrieve(_retrieve_queryId, _retrieve_retrieveParameters);
            System.out.println("retrieve.result=" + _retrieve__return);

        } catch (InternalServerException_Exception e) { 
            System.out.println("Expected exception: InternalServerException has occurred.");
            System.out.println(e.toString());
        } catch (QueryException_Exception e) { 
            System.out.println("Expected exception: QueryException has occurred.");
            System.out.println(e.toString());
        } catch (SessionException_Exception e) { 
            System.out.println("Expected exception: SessionException has occurred.");
            System.out.println(e.toString());
        } catch (AuthenticationException_Exception e) { 
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidInputException_Exception e) { 
            System.out.println("Expected exception: InvalidInputException has occurred.");
            System.out.println(e.toString());
        } catch (ESTIWSException_Exception e) { 
            System.out.println("Expected exception: ESTIWSException has occurred.");
            System.out.println(e.toString());
        }
		return _retrieve__return;
    }
    /**
     * retrieveById
     * @param _retrieveById_databaseId
     * @param _retrieveById_uid
     * @param _retrieveById_queryLanguage
     * @param _retrieveById_retrieveParameters
     * @return FullRecordSearchResults
     * @author Joshua
     * 
     */
    public FullRecordSearchResults retrieveById(String _retrieveById_databaseId,List<String> _retrieveById_uid,String _retrieveById_queryLanguage,RetrieveParameters _retrieveById_retrieveParameters){
    	System.out.println("Invoking retrieveById...");
    	FullRecordSearchResults _retrieveById__return = null;
        try {
            _retrieveById__return = port.retrieveById(_retrieveById_databaseId, _retrieveById_uid, _retrieveById_queryLanguage, _retrieveById_retrieveParameters);
            System.out.println("retrieveById.result=" + _retrieveById__return);

        } catch (InternalServerException_Exception e) { 
            System.out.println("Expected exception: InternalServerException has occurred.");
            System.out.println(e.toString());
        } catch (QueryException_Exception e) { 
            System.out.println("Expected exception: QueryException has occurred.");
            System.out.println(e.toString());
        } catch (SessionException_Exception e) { 
            System.out.println("Expected exception: SessionException has occurred.");
            System.out.println(e.toString());
        } catch (AuthenticationException_Exception e) { 
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidInputException_Exception e) { 
            System.out.println("Expected exception: InvalidInputException has occurred.");
            System.out.println(e.toString());
        } catch (ESTIWSException_Exception e) { 
            System.out.println("Expected exception: ESTIWSException has occurred.");
            System.out.println(e.toString());
        }
		return _retrieveById__return;
    }
    /**
     * search
     * @param _search_queryParameters
     * @param _search_retrieveParameters
     * @return FullRecordSearchResults
     * @author Joshua
     * 
     */
    public FullRecordSearchResults search(QueryParameters _search_queryParameters,RetrieveParameters _search_retrieveParameters){
    	System.out.println("Invoking search...");
    	FullRecordSearchResults _search__return = null;
        try {
            _search__return = port.search(_search_queryParameters, _search_retrieveParameters);
            System.out.println("search.result=" + _search__return);

        } catch (InternalServerException_Exception e) { 
            System.out.println("Expected exception: InternalServerException has occurred.");
            System.out.println(e.toString());
        } catch (QueryException_Exception e) { 
            System.out.println("Expected exception: QueryException has occurred.");
            System.out.println(e.toString());
        } catch (SessionException_Exception e) { 
            System.out.println("Expected exception: SessionException has occurred.");
            System.out.println(e.toString());
        } catch (AuthenticationException_Exception e) { 
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        } catch (InvalidInputException_Exception e) { 
            System.out.println("Expected exception: InvalidInputException has occurred.");
            System.out.println(e.toString());
        } catch (ESTIWSException_Exception e) { 
            System.out.println("Expected exception: ESTIWSException has occurred.");
            System.out.println(e.toString());
        }
		return _search__return;
    }
}