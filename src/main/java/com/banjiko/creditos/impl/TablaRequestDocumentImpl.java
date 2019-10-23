/*
 * An XML document type.
 * Localname: tablaRequest
 * Namespace: http://banjiko.com/creditos
 * Java type: com.banjiko.creditos.TablaRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.banjiko.creditos.impl;
/**
 * A document containing one tablaRequest(@http://banjiko.com/creditos) element.
 *
 * This is a complex type.
 */
public class TablaRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.banjiko.creditos.TablaRequestDocument
{
    
    public TablaRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLAREQUEST$0 = 
        new javax.xml.namespace.QName("http://banjiko.com/creditos", "tablaRequest");
    
    
    /**
     * Gets the "tablaRequest" element
     */
    public com.banjiko.creditos.TablaRequestDocument.TablaRequest getTablaRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.banjiko.creditos.TablaRequestDocument.TablaRequest target = null;
            target = (com.banjiko.creditos.TablaRequestDocument.TablaRequest)get_store().find_element_user(TABLAREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tablaRequest" element
     */
    public void setTablaRequest(com.banjiko.creditos.TablaRequestDocument.TablaRequest tablaRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.banjiko.creditos.TablaRequestDocument.TablaRequest target = null;
            target = (com.banjiko.creditos.TablaRequestDocument.TablaRequest)get_store().find_element_user(TABLAREQUEST$0, 0);
            if (target == null)
            {
                target = (com.banjiko.creditos.TablaRequestDocument.TablaRequest)get_store().add_element_user(TABLAREQUEST$0);
            }
            target.set(tablaRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "tablaRequest" element
     */
    public com.banjiko.creditos.TablaRequestDocument.TablaRequest addNewTablaRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.banjiko.creditos.TablaRequestDocument.TablaRequest target = null;
            target = (com.banjiko.creditos.TablaRequestDocument.TablaRequest)get_store().add_element_user(TABLAREQUEST$0);
            return target;
        }
    }
    /**
     * An XML tablaRequest(@http://banjiko.com/creditos).
     *
     * This is a complex type.
     */
    public static class TablaRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.banjiko.creditos.TablaRequestDocument.TablaRequest
    {
        
        public TablaRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACK$0 = 
            new javax.xml.namespace.QName("http://banjiko.com/creditos", "ack");
        private static final javax.xml.namespace.QName PRESTAMO$2 = 
            new javax.xml.namespace.QName("http://banjiko.com/creditos", "prestamo");
        
        
        /**
         * Gets the "ack" element
         */
        public com.banjiko.creditos.Acknowledge getAck()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.banjiko.creditos.Acknowledge target = null;
                target = (com.banjiko.creditos.Acknowledge)get_store().find_element_user(ACK$0, 0);
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
        public void setAck(com.banjiko.creditos.Acknowledge ack)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.banjiko.creditos.Acknowledge target = null;
                target = (com.banjiko.creditos.Acknowledge)get_store().find_element_user(ACK$0, 0);
                if (target == null)
                {
                    target = (com.banjiko.creditos.Acknowledge)get_store().add_element_user(ACK$0);
                }
                target.set(ack);
            }
        }
        
        /**
         * Appends and returns a new empty "ack" element
         */
        public com.banjiko.creditos.Acknowledge addNewAck()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.banjiko.creditos.Acknowledge target = null;
                target = (com.banjiko.creditos.Acknowledge)get_store().add_element_user(ACK$0);
                return target;
            }
        }
        
        /**
         * Gets the "prestamo" element
         */
        public com.banjiko.creditos.Credito getPrestamo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.banjiko.creditos.Credito target = null;
                target = (com.banjiko.creditos.Credito)get_store().find_element_user(PRESTAMO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "prestamo" element
         */
        public void setPrestamo(com.banjiko.creditos.Credito prestamo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.banjiko.creditos.Credito target = null;
                target = (com.banjiko.creditos.Credito)get_store().find_element_user(PRESTAMO$2, 0);
                if (target == null)
                {
                    target = (com.banjiko.creditos.Credito)get_store().add_element_user(PRESTAMO$2);
                }
                target.set(prestamo);
            }
        }
        
        /**
         * Appends and returns a new empty "prestamo" element
         */
        public com.banjiko.creditos.Credito addNewPrestamo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.banjiko.creditos.Credito target = null;
                target = (com.banjiko.creditos.Credito)get_store().add_element_user(PRESTAMO$2);
                return target;
            }
        }
    }
}
