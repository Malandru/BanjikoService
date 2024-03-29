/*
 * XML Type:  credito
 * Namespace: http://banjiko.com/creditos
 * Java type: com.banjiko.creditos.Credito
 *
 * Automatically generated - do not modify.
 */
package com.banjiko.creditos.impl;
/**
 * An XML credito(@http://banjiko.com/creditos).
 *
 * This is a complex type.
 */
public class CreditoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.banjiko.creditos.Credito
{
    
    public CreditoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUENTA$0 = 
        new javax.xml.namespace.QName("http://banjiko.com/creditos", "cuenta");
    private static final javax.xml.namespace.QName MONTO$2 = 
        new javax.xml.namespace.QName("http://banjiko.com/creditos", "monto");
    private static final javax.xml.namespace.QName INTERES$4 = 
        new javax.xml.namespace.QName("http://banjiko.com/creditos", "interes");
    private static final javax.xml.namespace.QName PLAZOMESES$6 = 
        new javax.xml.namespace.QName("http://banjiko.com/creditos", "plazo_meses");
    
    
    /**
     * Gets the "cuenta" element
     */
    public com.banjiko.creditos.Cuenta getCuenta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.banjiko.creditos.Cuenta target = null;
            target = (com.banjiko.creditos.Cuenta)get_store().find_element_user(CUENTA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cuenta" element
     */
    public void setCuenta(com.banjiko.creditos.Cuenta cuenta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.banjiko.creditos.Cuenta target = null;
            target = (com.banjiko.creditos.Cuenta)get_store().find_element_user(CUENTA$0, 0);
            if (target == null)
            {
                target = (com.banjiko.creditos.Cuenta)get_store().add_element_user(CUENTA$0);
            }
            target.set(cuenta);
        }
    }
    
    /**
     * Appends and returns a new empty "cuenta" element
     */
    public com.banjiko.creditos.Cuenta addNewCuenta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.banjiko.creditos.Cuenta target = null;
            target = (com.banjiko.creditos.Cuenta)get_store().add_element_user(CUENTA$0);
            return target;
        }
    }
    
    /**
     * Gets the "monto" element
     */
    public double getMonto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTO$2, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "monto" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMonto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTO$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "monto" element
     */
    public void setMonto(double monto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTO$2);
            }
            target.setDoubleValue(monto);
        }
    }
    
    /**
     * Sets (as xml) the "monto" element
     */
    public void xsetMonto(org.apache.xmlbeans.XmlDouble monto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MONTO$2);
            }
            target.set(monto);
        }
    }
    
    /**
     * Gets the "interes" element
     */
    public float getInteres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERES$4, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "interes" element
     */
    public org.apache.xmlbeans.XmlFloat xgetInteres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(INTERES$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "interes" element
     */
    public void setInteres(float interes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERES$4);
            }
            target.setFloatValue(interes);
        }
    }
    
    /**
     * Sets (as xml) the "interes" element
     */
    public void xsetInteres(org.apache.xmlbeans.XmlFloat interes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(INTERES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(INTERES$4);
            }
            target.set(interes);
        }
    }
    
    /**
     * Gets the "plazo_meses" element
     */
    public int getPlazoMeses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLAZOMESES$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "plazo_meses" element
     */
    public org.apache.xmlbeans.XmlInt xgetPlazoMeses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PLAZOMESES$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "plazo_meses" element
     */
    public void setPlazoMeses(int plazoMeses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLAZOMESES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLAZOMESES$6);
            }
            target.setIntValue(plazoMeses);
        }
    }
    
    /**
     * Sets (as xml) the "plazo_meses" element
     */
    public void xsetPlazoMeses(org.apache.xmlbeans.XmlInt plazoMeses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PLAZOMESES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PLAZOMESES$6);
            }
            target.set(plazoMeses);
        }
    }
}
