/*
 * XML Type:  cliente
 * Namespace: http://fintech.org/data
 * Java type: org.fintech.data.Cliente
 *
 * Automatically generated - do not modify.
 */
package org.fintech.data.impl;
/**
 * An XML cliente(@http://fintech.org/data).
 *
 * This is a complex type.
 */
public class ClienteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.fintech.data.Cliente
{
    
    public ClienteImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RFC$0 = 
        new javax.xml.namespace.QName("http://fintech.org/data", "RFC");
    private static final javax.xml.namespace.QName NOMBRE$2 = 
        new javax.xml.namespace.QName("http://fintech.org/data", "nombre");
    private static final javax.xml.namespace.QName APELLIDO$4 = 
        new javax.xml.namespace.QName("http://fintech.org/data", "apellido");
    private static final javax.xml.namespace.QName DOMICILIO$6 = 
        new javax.xml.namespace.QName("http://fintech.org/data", "domicilio");
    
    
    /**
     * Gets the "RFC" element
     */
    public java.lang.String getRFC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RFC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RFC" element
     */
    public org.apache.xmlbeans.XmlString xgetRFC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RFC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RFC" element
     */
    public void setRFC(java.lang.String rfc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RFC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RFC$0);
            }
            target.setStringValue(rfc);
        }
    }
    
    /**
     * Sets (as xml) the "RFC" element
     */
    public void xsetRFC(org.apache.xmlbeans.XmlString rfc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RFC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RFC$0);
            }
            target.set(rfc);
        }
    }
    
    /**
     * Gets the "nombre" element
     */
    public java.lang.String getNombre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nombre" element
     */
    public org.apache.xmlbeans.XmlString xgetNombre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "nombre" element
     */
    public void setNombre(java.lang.String nombre)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRE$2);
            }
            target.setStringValue(nombre);
        }
    }
    
    /**
     * Sets (as xml) the "nombre" element
     */
    public void xsetNombre(org.apache.xmlbeans.XmlString nombre)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRE$2);
            }
            target.set(nombre);
        }
    }
    
    /**
     * Gets the "apellido" element
     */
    public java.lang.String getApellido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "apellido" element
     */
    public org.apache.xmlbeans.XmlString xgetApellido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDO$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "apellido" element
     */
    public void setApellido(java.lang.String apellido)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APELLIDO$4);
            }
            target.setStringValue(apellido);
        }
    }
    
    /**
     * Sets (as xml) the "apellido" element
     */
    public void xsetApellido(org.apache.xmlbeans.XmlString apellido)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDO$4);
            }
            target.set(apellido);
        }
    }
    
    /**
     * Gets the "domicilio" element
     */
    public java.lang.String getDomicilio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILIO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "domicilio" element
     */
    public org.apache.xmlbeans.XmlString xgetDomicilio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILIO$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "domicilio" element
     */
    public void setDomicilio(java.lang.String domicilio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILIO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMICILIO$6);
            }
            target.setStringValue(domicilio);
        }
    }
    
    /**
     * Sets (as xml) the "domicilio" element
     */
    public void xsetDomicilio(org.apache.xmlbeans.XmlString domicilio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILIO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMICILIO$6);
            }
            target.set(domicilio);
        }
    }
}
