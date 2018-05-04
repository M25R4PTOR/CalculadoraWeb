
/**
 * CalculadoraMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */
        package es.aytos.main.server;

        /**
        *  CalculadoraMessageReceiverInOut message receiver
        */

        public class CalculadoraMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        CalculadoraSkeleton skel = (CalculadoraSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){

        

            if("dividir".equals(methodName)){
                
                es.aytos.main.DividirResponse dividirResponse17 = null;
	                        es.aytos.main.Dividir wrappedParam =
                                                             (es.aytos.main.Dividir)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.aytos.main.Dividir.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               dividirResponse17 =
                                                   
                                                   
                                                         skel.dividir(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), dividirResponse17, false);
                                    } else 

            if("restar".equals(methodName)){
                
                es.aytos.main.RestarResponse restarResponse19 = null;
	                        es.aytos.main.Restar wrappedParam =
                                                             (es.aytos.main.Restar)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.aytos.main.Restar.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               restarResponse19 =
                                                   
                                                   
                                                         skel.restar(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), restarResponse19, false);
                                    } else 

            if("multiplicar".equals(methodName)){
                
                es.aytos.main.MultiplicarResponse multiplicarResponse21 = null;
	                        es.aytos.main.Multiplicar wrappedParam =
                                                             (es.aytos.main.Multiplicar)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.aytos.main.Multiplicar.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               multiplicarResponse21 =
                                                   
                                                   
                                                         skel.multiplicar(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), multiplicarResponse21, false);
                                    } else 

            if("sumar".equals(methodName)){
                
                es.aytos.main.SumarResponse sumarResponse23 = null;
	                        es.aytos.main.Sumar wrappedParam =
                                                             (es.aytos.main.Sumar)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.aytos.main.Sumar.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               sumarResponse23 =
                                                   
                                                   
                                                         skel.sumar(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), sumarResponse23, false);
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(es.aytos.main.Dividir param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.aytos.main.Dividir.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.aytos.main.DividirResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.aytos.main.DividirResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.aytos.main.Restar param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.aytos.main.Restar.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.aytos.main.RestarResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.aytos.main.RestarResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.aytos.main.Multiplicar param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.aytos.main.Multiplicar.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.aytos.main.MultiplicarResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.aytos.main.MultiplicarResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.aytos.main.Sumar param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.aytos.main.Sumar.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.aytos.main.SumarResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.aytos.main.SumarResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.aytos.main.DividirResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.aytos.main.DividirResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.aytos.main.DividirResponse wrapdividir(){
                                es.aytos.main.DividirResponse wrappedElement = new es.aytos.main.DividirResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.aytos.main.RestarResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.aytos.main.RestarResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.aytos.main.RestarResponse wraprestar(){
                                es.aytos.main.RestarResponse wrappedElement = new es.aytos.main.RestarResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.aytos.main.MultiplicarResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.aytos.main.MultiplicarResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.aytos.main.MultiplicarResponse wrapmultiplicar(){
                                es.aytos.main.MultiplicarResponse wrappedElement = new es.aytos.main.MultiplicarResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.aytos.main.SumarResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.aytos.main.SumarResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.aytos.main.SumarResponse wrapsumar(){
                                es.aytos.main.SumarResponse wrappedElement = new es.aytos.main.SumarResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (es.aytos.main.Dividir.class.equals(type)){
                
                           return es.aytos.main.Dividir.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.aytos.main.DividirResponse.class.equals(type)){
                
                           return es.aytos.main.DividirResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.aytos.main.Restar.class.equals(type)){
                
                           return es.aytos.main.Restar.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.aytos.main.RestarResponse.class.equals(type)){
                
                           return es.aytos.main.RestarResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.aytos.main.Multiplicar.class.equals(type)){
                
                           return es.aytos.main.Multiplicar.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.aytos.main.MultiplicarResponse.class.equals(type)){
                
                           return es.aytos.main.MultiplicarResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.aytos.main.Sumar.class.equals(type)){
                
                           return es.aytos.main.Sumar.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.aytos.main.SumarResponse.class.equals(type)){
                
                           return es.aytos.main.SumarResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    