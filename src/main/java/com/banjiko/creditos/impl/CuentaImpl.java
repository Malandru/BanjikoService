/*
 * XML Type:  cuenta
 * Namespace: http://banjiko.com/creditos
 * Java type: com.banjiko.creditos.Cuenta
 *
 * Automatically generated - do not modify.
 */
package com.banjiko.creditos.impl;
/**
 * An XML cuenta(@http://banjiko.com/creditos).
 *
 * This is a complex type.
 */
public class CuentaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.banjiko.creditos.Cuenta
{
    
    public CuentaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOCUENTA$0 = 
        new javax.xml.namespace.QName("http://banjiko.com/creditos", "no_cuenta");
    private static final javax.xml.namespace.QName LIMITE$2 = 
        new javax.xml.namespace.QName("http://banjiko.com/creditos", "limite");
    private static final javax.xml.namespace.QName VENCIMIENTO$4 = 
        new javax.xml.namespace.QName("http://banjiko.com/creditos", "vencimiento");
    
    
    /**
     * Gets the "no_cuenta" element
     */
    public long getNoCuenta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOCUENTA$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "no_cuenta" element
     */
    public org.apache.xmlbeans.XmlLong xgetNoCuenta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NOCUENTA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "no_cuenta" element
     */
    public void setNoCuenta(long noCuenta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOCUENTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOCUENTA$0);
            }
            target.setLongValue(noCuenta);
        }
    }
    
    /**
     * Sets (as xml) the "no_cuenta" element
     */
    public void xsetNoCuenta(org.apache.xmlbeans.XmlLong noCuenta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NOCUENTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(NOCUENTA$0);
            }
            target.set(noCuenta);
        }
    }
    
    /**
     * Gets the "limite" element
     */
    public double getLimite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIMITE$2, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "limite" element
     */
    public org.apache.xmlbeans.XmlDouble xgetLimite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LIMITE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "limite" element
     */
    public void setLimite(double limite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIMITE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIMITE$2);
            }
            target.setDoubleValue(limite);
        }
    }
    
    /**
     * Sets (as xml) the "limite" element
     */
    public void xsetLimite(org.apache.xmlbeans.XmlDouble limite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LIMITE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(LIMITE$2);
            }
            target.set(limite);
        }
    }
    
    /**
     * Gets the "vencimiento" element
     */
    public java.util.Calendar getVencimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VENCIMIENTO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "vencimiento" element
     */
    public org.apache.xmlbeans.XmlDate xgetVencimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(VENCIMIENTO$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "vencimiento" element
     */
    public void setVencimiento(java.util.Calendar vencimiento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VENCIMIENTO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VENCIMIENTO$4);
            }
            target.setCalendarValue(vencimiento);
        }
    }
    
    /**
     * Sets (as xml) the "vencimiento" element
     */
    public void xsetVencimiento(org.apache.xmlbeans.XmlDate vencimiento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(VENCIMIENTO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(VENCIMIENTO$4);
            }
            target.set(vencimiento);
        }
    }
}
