
/**
 * CalculadoraCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

    package es.aytos.main.client;

    /**
     *  CalculadoraCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class CalculadoraCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public CalculadoraCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public CalculadoraCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for dividir method
            * override this method for handling normal response from dividir operation
            */
           public void receiveResultdividir(
                    es.aytos.main.client.CalculadoraStub.DividirResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from dividir operation
           */
            public void receiveErrordividir(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for restar method
            * override this method for handling normal response from restar operation
            */
           public void receiveResultrestar(
                    es.aytos.main.client.CalculadoraStub.RestarResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from restar operation
           */
            public void receiveErrorrestar(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for multiplicar method
            * override this method for handling normal response from multiplicar operation
            */
           public void receiveResultmultiplicar(
                    es.aytos.main.client.CalculadoraStub.MultiplicarResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from multiplicar operation
           */
            public void receiveErrormultiplicar(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for sumar method
            * override this method for handling normal response from sumar operation
            */
           public void receiveResultsumar(
                    es.aytos.main.client.CalculadoraStub.SumarResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sumar operation
           */
            public void receiveErrorsumar(java.lang.Exception e) {
            }
                


    }
    