/*
 * An XML document type.
 * Localname: tablaResponse
 * Namespace: http://banjiko.com/creditos
 * Java type: com.banjiko.creditos.TablaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.banjiko.creditos.impl;
/**
 * A document containing one tablaResponse(@http://banjiko.com/creditos) element.
 *
 * This is a complex type.
 */
public class TablaResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.banjiko.creditos.TablaResponseDocument
{
    
    public TablaResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLARESPONSE$0 = 
        new javax.xml.namespace.QName("http://banjiko.com/creditos", "tablaResponse");
    
    
    /**
     * Gets the "tablaResponse" element
     */
    public com.banjiko.creditos.TablaResponseDocument.TablaResponse getTablaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.banjiko.creditos.TablaResponseDocument.TablaResponse target = null;
            target = (com.banjiko.creditos.TablaResponseDocument.TablaResponse)get_store().find_element_user(TABLARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tablaResponse" element
     */
    public void setTablaResponse(com.banjiko.creditos.TablaResponseDocument.TablaResponse tablaResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.banjiko.creditos.TablaResponseDocument.TablaResponse target = null;
            target = (com.banjiko.creditos.TablaResponseDocument.TablaResponse)get_store().find_element_user(TABLARESPONSE$0, 0);
            if (target == null)
            {
                target = (com.banjiko.creditos.TablaResponseDocument.TablaResponse)get_store().add_element_user(TABLARESPONSE$0);
            }
            target.set(tablaResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "tablaResponse" element
     */
    public com.banjiko.creditos.TablaResponseDocument.TablaResponse addNewTablaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.banjiko.creditos.TablaResponseDocument.TablaResponse target = null;
            target = (com.banjiko.creditos.TablaResponseDocument.TablaResponse)get_store().add_element_user(TABLARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML tablaResponse(@http://banjiko.com/creditos).
     *
     * This is a complex type.
     */
    public static class TablaResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.banjiko.creditos.TablaResponseDocument.TablaResponse
    {
        
        public TablaResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACK$0 = 
            new javax.xml.namespace.QName("http://banjiko.com/creditos", "ack");
        private static final javax.xml.namespace.QName TABLA$2 = 
            new javax.xml.namespace.QName("http://banjiko.com/creditos", "tabla");
        
        
        /**
         * Gets the "ack" element
         */
        public org.fintech.data.Acknowledge getAck()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.fintech.data.Acknowledge target = null;
                target = (org.fintech.data.Acknowledge)get_store().find_element_user(ACK$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ack" element
         */
        public void setAck(org.fintech.data.Acknowledge ack)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.fintech.data.Acknowledge target = null;
                target = (org.fintech.data.Acknowledge)get_store().find_element_user(ACK$0, 0);
                if (target == null)
                {
                    target = (org.fintech.data.Acknowledge)get_store().add_element_user(ACK$0);
                }
                target.set(ack);
            }
        }
        
        /**
         * Appends and returns a new empty "ack" element
         */
        public org.fintech.data.Acknowledge addNewAck()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.fintech.data.Acknowledge target = null;
                target = (org.fintech.data.Acknowledge)get_store().add_element_user(ACK$0);
                return target;
            }
        }
        
        /**
         * Gets the "tabla" element
         */
        public org.fintech.data.Table getTabla()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.fintech.data.Table target = null;
                target = (org.fintech.data.Table)get_store().find_element_user(TABLA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "tabla" element
         */
        public void setTabla(org.fintech.data.Table tabla)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.fintech.data.Table target = null;
                target = (org.fintech.data.Table)get_store().find_element_user(TABLA$2, 0);
                if (target == null)
                {
                    target = (org.fintech.data.Table)get_store().add_element_user(TABLA$2);
                }
                target.set(tabla);
            }
        }
        
        /**
         * Appends and returns a new empty "tabla" element
         */
        public org.fintech.data.Table addNewTabla()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.fintech.data.Table target = null;
                target = (org.fintech.data.Table)get_store().add_element_user(TABLA$2);
                return target;
            }
        }
    }
}
