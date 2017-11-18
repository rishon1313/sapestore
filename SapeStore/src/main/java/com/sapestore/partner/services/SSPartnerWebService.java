
package com.sapestore.partner.services;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "SSPartnerWebService", targetNamespace = "http://services.partner.sapestore.com", wsdlLocation = "http://localhost:8080/SapeStorePartnerServices/services/SSPartnerWebService?wsdl")
public class SSPartnerWebService
    extends Service
{

    private final static URL SSPARTNERWEBSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.sapestore.partner.services.SSPartnerWebService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.sapestore.partner.services.SSPartnerWebService.class.getResource(".");
            url = new URL(baseUrl, "http://10.150.16.224:8081/SapeStorePartnerServices/services/SSPartnerWebService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/SapeStorePartnerServices/services/SSPartnerWebService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SSPARTNERWEBSERVICE_WSDL_LOCATION = url;
    }

    public SSPartnerWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SSPartnerWebService() {
        super(SSPARTNERWEBSERVICE_WSDL_LOCATION, new QName("http://services.partner.sapestore.com", "SSPartnerWebService"));
    }

    /**
     * 
     * @return
     *     returns SSPartnerWebServicePortType
     */
    @WebEndpoint(name = "SSPartnerWebServiceHttpSoap11Endpoint")
    public SSPartnerWebServicePortType getSSPartnerWebServiceHttpSoap11Endpoint() {
        return super.getPort(new QName("http://services.partner.sapestore.com", "SSPartnerWebServiceHttpSoap11Endpoint"), SSPartnerWebServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SSPartnerWebServicePortType
     */
    @WebEndpoint(name = "SSPartnerWebServiceHttpSoap11Endpoint")
    public SSPartnerWebServicePortType getSSPartnerWebServiceHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.partner.sapestore.com", "SSPartnerWebServiceHttpSoap11Endpoint"), SSPartnerWebServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns SSPartnerWebServicePortType
     */
    @WebEndpoint(name = "SSPartnerWebServiceHttpSoap12Endpoint")
    public SSPartnerWebServicePortType getSSPartnerWebServiceHttpSoap12Endpoint() {
        return super.getPort(new QName("http://services.partner.sapestore.com", "SSPartnerWebServiceHttpSoap12Endpoint"), SSPartnerWebServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SSPartnerWebServicePortType
     */
    @WebEndpoint(name = "SSPartnerWebServiceHttpSoap12Endpoint")
    public SSPartnerWebServicePortType getSSPartnerWebServiceHttpSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.partner.sapestore.com", "SSPartnerWebServiceHttpSoap12Endpoint"), SSPartnerWebServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns SSPartnerWebServicePortType
     */
    @WebEndpoint(name = "SSPartnerWebServiceHttpEndpoint")
    public SSPartnerWebServicePortType getSSPartnerWebServiceHttpEndpoint() {
        return super.getPort(new QName("http://services.partner.sapestore.com", "SSPartnerWebServiceHttpEndpoint"), SSPartnerWebServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SSPartnerWebServicePortType
     */
    @WebEndpoint(name = "SSPartnerWebServiceHttpEndpoint")
    public SSPartnerWebServicePortType getSSPartnerWebServiceHttpEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.partner.sapestore.com", "SSPartnerWebServiceHttpEndpoint"), SSPartnerWebServicePortType.class, features);
    }

}
