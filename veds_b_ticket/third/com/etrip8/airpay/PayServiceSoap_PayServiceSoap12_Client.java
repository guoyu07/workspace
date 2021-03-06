
package com.etrip8.airpay;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2016-07-08T21:11:44.212+08:00
 * Generated source version: 2.7.11
 * 
 */
public final class PayServiceSoap_PayServiceSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "PayService");

    private PayServiceSoap_PayServiceSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = PayService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        PayService ss = new PayService(wsdlURL, SERVICE_NAME);
        PayServiceSoap port = ss.getPayServiceSoap12();  
        
        {
        System.out.println("Invoking setOperatorContract...");
        java.lang.String _setOperatorContract_sAccountNo = "";
        java.lang.String _setOperatorContract_sOperatorName = "";
        java.lang.String _setOperatorContract_sPwd = "";
        int _setOperatorContract_iDayNum = 0;
        java.lang.String _setOperatorContract_sMaCode = "";
        boolean _setOperatorContract_bMaCode = false;
        java.lang.String _setOperatorContract_sSign = "";
        java.lang.String _setOperatorContract__return = port.setOperatorContract(_setOperatorContract_sAccountNo, _setOperatorContract_sOperatorName, _setOperatorContract_sPwd, _setOperatorContract_iDayNum, _setOperatorContract_sMaCode, _setOperatorContract_bMaCode, _setOperatorContract_sSign);
        System.out.println("setOperatorContract.result=" + _setOperatorContract__return);


        }
        {
        System.out.println("Invoking setTicketOrderToOrderXML...");
        java.lang.String _setTicketOrderToOrderXML_ticketorderByxml = "";
        java.lang.String _setTicketOrderToOrderXML_sign = "";
        java.lang.String _setTicketOrderToOrderXML__return = port.setTicketOrderToOrderXML(_setTicketOrderToOrderXML_ticketorderByxml, _setTicketOrderToOrderXML_sign);
        System.out.println("setTicketOrderToOrderXML.result=" + _setTicketOrderToOrderXML__return);


        }
        {
        System.out.println("Invoking setPay...");
        java.lang.String _setPay_version = "";
        java.lang.String _setPay_merId = "";
        java.lang.String _setPay_ordId = "";
        java.lang.String _setPay_gateId = "";
        java.lang.String _setPay_priv1 = "";
        java.lang.String _setPay_transAmt = "";
        java.lang.String _setPay_curyId = "";
        java.lang.String _setPay_transDate = "";
        java.lang.String _setPay_transType = "";
        java.lang.String _setPay_bgRetUrl = "";
        java.lang.String _setPay_pageRetUrl = "";
        java.lang.String _setPay_chkValue = "";
        java.lang.String _setPay_chinaPayUrl = "";
        java.lang.String _setPay_sign = "";
        java.lang.String _setPay_certSerial = "";
        com.etrip8.airpay.SetPay.Ticketorder _setPay_ticketorder = null;
        java.lang.String _setPay__return = port.setPay(_setPay_version, _setPay_merId, _setPay_ordId, _setPay_gateId, _setPay_priv1, _setPay_transAmt, _setPay_curyId, _setPay_transDate, _setPay_transType, _setPay_bgRetUrl, _setPay_pageRetUrl, _setPay_chkValue, _setPay_chinaPayUrl, _setPay_sign, _setPay_certSerial, _setPay_ticketorder);
        System.out.println("setPay.result=" + _setPay__return);


        }
        {
        System.out.println("Invoking helloWorld...");
        java.lang.String _helloWorld__return = port.helloWorld();
        System.out.println("helloWorld.result=" + _helloWorld__return);


        }
        {
        System.out.println("Invoking setEPTEasyPayToOrderXML...");
        java.lang.String _setEPTEasyPayToOrderXML_airCode = "";
        java.lang.String _setEPTEasyPayToOrderXML_b2BUser = "";
        java.lang.String _setEPTEasyPayToOrderXML_b2BPwd = "";
        java.lang.String _setEPTEasyPayToOrderXML_pnr = "";
        java.lang.String _setEPTEasyPayToOrderXML_orderID = "";
        java.lang.String _setEPTEasyPayToOrderXML_orderAmount = "";
        java.lang.String _setEPTEasyPayToOrderXML_sign = "";
        java.lang.String _setEPTEasyPayToOrderXML_certSerial = "";
        java.lang.String _setEPTEasyPayToOrderXML_ticketorderByxml = "";
        java.lang.String _setEPTEasyPayToOrderXML__return = port.setEPTEasyPayToOrderXML(_setEPTEasyPayToOrderXML_airCode, _setEPTEasyPayToOrderXML_b2BUser, _setEPTEasyPayToOrderXML_b2BPwd, _setEPTEasyPayToOrderXML_pnr, _setEPTEasyPayToOrderXML_orderID, _setEPTEasyPayToOrderXML_orderAmount, _setEPTEasyPayToOrderXML_sign, _setEPTEasyPayToOrderXML_certSerial, _setEPTEasyPayToOrderXML_ticketorderByxml);
        System.out.println("setEPTEasyPayToOrderXML.result=" + _setEPTEasyPayToOrderXML__return);


        }
        {
        System.out.println("Invoking setPayToOrderXMLForCZ...");
        java.lang.String _setPayToOrderXMLForCZ_merid = "";
        java.lang.String _setPayToOrderXMLForCZ_orderno = "";
        java.lang.String _setPayToOrderXMLForCZ_pnr = "";
        java.lang.String _setPayToOrderXMLForCZ_billno = "";
        java.lang.String _setPayToOrderXMLForCZ_bankcode = "";
        java.lang.String _setPayToOrderXMLForCZ_currcode = "";
        java.lang.String _setPayToOrderXMLForCZ_orderamount = "";
        java.lang.String _setPayToOrderXMLForCZ_ordertype = "";
        java.lang.String _setPayToOrderXMLForCZ_langtype = "";
        java.lang.String _setPayToOrderXMLForCZ_bgreturl = "";
        java.lang.String _setPayToOrderXMLForCZ_encodemsg = "";
        java.lang.String _setPayToOrderXMLForCZ_signmsg = "";
        java.lang.String _setPayToOrderXMLForCZ_sign = "";
        java.lang.String _setPayToOrderXMLForCZ_certSerial = "";
        java.lang.String _setPayToOrderXMLForCZ_ticketorderByxml = "";
        java.lang.String _setPayToOrderXMLForCZ__return = port.setPayToOrderXMLForCZ(_setPayToOrderXMLForCZ_merid, _setPayToOrderXMLForCZ_orderno, _setPayToOrderXMLForCZ_pnr, _setPayToOrderXMLForCZ_billno, _setPayToOrderXMLForCZ_bankcode, _setPayToOrderXMLForCZ_currcode, _setPayToOrderXMLForCZ_orderamount, _setPayToOrderXMLForCZ_ordertype, _setPayToOrderXMLForCZ_langtype, _setPayToOrderXMLForCZ_bgreturl, _setPayToOrderXMLForCZ_encodemsg, _setPayToOrderXMLForCZ_signmsg, _setPayToOrderXMLForCZ_sign, _setPayToOrderXMLForCZ_certSerial, _setPayToOrderXMLForCZ_ticketorderByxml);
        System.out.println("setPayToOrderXMLForCZ.result=" + _setPayToOrderXMLForCZ__return);


        }
        {
        System.out.println("Invoking setTicketOrder...");
        com.etrip8.airpay.SetTicketOrder.Ticketorder _setTicketOrder_ticketorder = null;
        java.lang.String _setTicketOrder_sign = "";
        java.lang.String _setTicketOrder__return = port.setTicketOrder(_setTicketOrder_ticketorder, _setTicketOrder_sign);
        System.out.println("setTicketOrder.result=" + _setTicketOrder__return);


        }
        {
        System.out.println("Invoking setPayToOrderXML...");
        java.lang.String _setPayToOrderXML_version = "";
        java.lang.String _setPayToOrderXML_merId = "";
        java.lang.String _setPayToOrderXML_ordId = "";
        java.lang.String _setPayToOrderXML_gateId = "";
        java.lang.String _setPayToOrderXML_priv1 = "";
        java.lang.String _setPayToOrderXML_transAmt = "";
        java.lang.String _setPayToOrderXML_curyId = "";
        java.lang.String _setPayToOrderXML_transDate = "";
        java.lang.String _setPayToOrderXML_transType = "";
        java.lang.String _setPayToOrderXML_bgRetUrl = "";
        java.lang.String _setPayToOrderXML_pageRetUrl = "";
        java.lang.String _setPayToOrderXML_chkValue = "";
        java.lang.String _setPayToOrderXML_chinaPayUrl = "";
        java.lang.String _setPayToOrderXML_sign = "";
        java.lang.String _setPayToOrderXML_certSerial = "";
        java.lang.String _setPayToOrderXML_ticketorderByxml = "";
        java.lang.String _setPayToOrderXML__return = port.setPayToOrderXML(_setPayToOrderXML_version, _setPayToOrderXML_merId, _setPayToOrderXML_ordId, _setPayToOrderXML_gateId, _setPayToOrderXML_priv1, _setPayToOrderXML_transAmt, _setPayToOrderXML_curyId, _setPayToOrderXML_transDate, _setPayToOrderXML_transType, _setPayToOrderXML_bgRetUrl, _setPayToOrderXML_pageRetUrl, _setPayToOrderXML_chkValue, _setPayToOrderXML_chinaPayUrl, _setPayToOrderXML_sign, _setPayToOrderXML_certSerial, _setPayToOrderXML_ticketorderByxml);
        System.out.println("setPayToOrderXML.result=" + _setPayToOrderXML__return);


        }
        {
        System.out.println("Invoking setAccountNoContract...");
        java.lang.String _setAccountNoContract_sAccountNo = "";
        java.lang.String _setAccountNoContract_sPwd = "";
        int _setAccountNoContract_iDayNum = 0;
        java.lang.String _setAccountNoContract_sMaCode = "";
        boolean _setAccountNoContract_bMaCode = false;
        java.lang.String _setAccountNoContract_sSign = "";
        java.lang.String _setAccountNoContract__return = port.setAccountNoContract(_setAccountNoContract_sAccountNo, _setAccountNoContract_sPwd, _setAccountNoContract_iDayNum, _setAccountNoContract_sMaCode, _setAccountNoContract_bMaCode, _setAccountNoContract_sSign);
        System.out.println("setAccountNoContract.result=" + _setAccountNoContract__return);


        }
        {
        System.out.println("Invoking setEPTEasyPay...");
        java.lang.String _setEPTEasyPay_airCode = "";
        java.lang.String _setEPTEasyPay_b2BUser = "";
        java.lang.String _setEPTEasyPay_b2BPwd = "";
        java.lang.String _setEPTEasyPay_pnr = "";
        java.lang.String _setEPTEasyPay_orderID = "";
        java.lang.String _setEPTEasyPay_orderAmount = "";
        java.lang.String _setEPTEasyPay_sign = "";
        java.lang.String _setEPTEasyPay_certSerial = "";
        com.etrip8.airpay.SetEPTEasyPay.Ticketorder _setEPTEasyPay_ticketorder = null;
        java.lang.String _setEPTEasyPay__return = port.setEPTEasyPay(_setEPTEasyPay_airCode, _setEPTEasyPay_b2BUser, _setEPTEasyPay_b2BPwd, _setEPTEasyPay_pnr, _setEPTEasyPay_orderID, _setEPTEasyPay_orderAmount, _setEPTEasyPay_sign, _setEPTEasyPay_certSerial, _setEPTEasyPay_ticketorder);
        System.out.println("setEPTEasyPay.result=" + _setEPTEasyPay__return);


        }
        {
        System.out.println("Invoking setPayForCZ...");
        java.lang.String _setPayForCZ_merid = "";
        java.lang.String _setPayForCZ_orderno = "";
        java.lang.String _setPayForCZ_pnr = "";
        java.lang.String _setPayForCZ_billno = "";
        java.lang.String _setPayForCZ_bankcode = "";
        java.lang.String _setPayForCZ_currcode = "";
        java.lang.String _setPayForCZ_orderamount = "";
        java.lang.String _setPayForCZ_ordertype = "";
        java.lang.String _setPayForCZ_langtype = "";
        java.lang.String _setPayForCZ_bgreturl = "";
        java.lang.String _setPayForCZ_encodemsg = "";
        java.lang.String _setPayForCZ_signmsg = "";
        java.lang.String _setPayForCZ_sign = "";
        java.lang.String _setPayForCZ_certSerial = "";
        com.etrip8.airpay.SetPayForCZ.Ticketorder _setPayForCZ_ticketorder = null;
        java.lang.String _setPayForCZ__return = port.setPayForCZ(_setPayForCZ_merid, _setPayForCZ_orderno, _setPayForCZ_pnr, _setPayForCZ_billno, _setPayForCZ_bankcode, _setPayForCZ_currcode, _setPayForCZ_orderamount, _setPayForCZ_ordertype, _setPayForCZ_langtype, _setPayForCZ_bgreturl, _setPayForCZ_encodemsg, _setPayForCZ_signmsg, _setPayForCZ_sign, _setPayForCZ_certSerial, _setPayForCZ_ticketorder);
        System.out.println("setPayForCZ.result=" + _setPayForCZ__return);


        }

        System.exit(0);
    }

}
