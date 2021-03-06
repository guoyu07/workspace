package com.ctrip.ws.flights;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2016-03-29T10:21:44.803+08:00
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "RefundFeeWaitConfirmList", 
                  wsdlLocation = "http://flights.ws.ctrip.com/Flight.Order.SupplierOpenAPI/RefundFeeWaitConfirmList.asmx?WSDL",
                  targetNamespace = "http://tempuri.org/") 
public class RefundFeeWaitConfirmList extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "RefundFeeWaitConfirmList");
    public final static QName RefundFeeWaitConfirmListSoap12 = new QName("http://tempuri.org/", "RefundFeeWaitConfirmListSoap12");
    public final static QName RefundFeeWaitConfirmListSoap = new QName("http://tempuri.org/", "RefundFeeWaitConfirmListSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://flights.ws.ctrip.com/Flight.Order.SupplierOpenAPI/RefundFeeWaitConfirmList.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RefundFeeWaitConfirmList.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://flights.ws.ctrip.com/Flight.Order.SupplierOpenAPI/RefundFeeWaitConfirmList.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public RefundFeeWaitConfirmList(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RefundFeeWaitConfirmList(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RefundFeeWaitConfirmList() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns RefundFeeWaitConfirmListSoap
     */
    @WebEndpoint(name = "RefundFeeWaitConfirmListSoap12")
    public RefundFeeWaitConfirmListSoap getRefundFeeWaitConfirmListSoap12() {
        return super.getPort(RefundFeeWaitConfirmListSoap12, RefundFeeWaitConfirmListSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RefundFeeWaitConfirmListSoap
     */
    @WebEndpoint(name = "RefundFeeWaitConfirmListSoap12")
    public RefundFeeWaitConfirmListSoap getRefundFeeWaitConfirmListSoap12(WebServiceFeature... features) {
        return super.getPort(RefundFeeWaitConfirmListSoap12, RefundFeeWaitConfirmListSoap.class, features);
    }
    /**
     *
     * @return
     *     returns RefundFeeWaitConfirmListSoap
     */
    @WebEndpoint(name = "RefundFeeWaitConfirmListSoap")
    public RefundFeeWaitConfirmListSoap getRefundFeeWaitConfirmListSoap() {
        return super.getPort(RefundFeeWaitConfirmListSoap, RefundFeeWaitConfirmListSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RefundFeeWaitConfirmListSoap
     */
    @WebEndpoint(name = "RefundFeeWaitConfirmListSoap")
    public RefundFeeWaitConfirmListSoap getRefundFeeWaitConfirmListSoap(WebServiceFeature... features) {
        return super.getPort(RefundFeeWaitConfirmListSoap, RefundFeeWaitConfirmListSoap.class, features);
    }

}
