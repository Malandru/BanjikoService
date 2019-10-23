/*
 * XML Type:  table
 * Namespace: http://banjiko.com/creditos
 * Java type: com.banjiko.creditos.Table
 *
 * Automatically generated - do not modify.
 */
package com.banjiko.creditos.impl;
/**
 * An XML table(@http://banjiko.com/creditos).
 *
 * This is a complex type.
 */
public class TableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.banjiko.creditos.Table
{
    
    public TableImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOAMORTIZACION$0 = 
        new javax.xml.namespace.QName("http://banjiko.com/creditos", "no_amortizacion");
    private static final javax.xml.namespace.QName FECHALIMITEPAGO$2 = 
        new javax.xml.namespace.QName("http://banjiko.com/creditos", "fecha_limite_pago");
    private static final javax.xml.namespace.QName CAPITAL$4 = 
        new javax.xml.namespace.QName("http://banjiko.com/creditos", "capital");
    private static final javax.xml.namespace.QName INTERES$6 = 
        new javax.xml.namespace.QName("http://banjiko.com/creditos", "interes");
    private static final javax.xml.namespace.QName TOTAL$8 = 
        new javax.xml.namespace.QName("http://banjiko.com/creditos", "total");
    private static final javax.xml.namespace.QName SALDO$10 = 
        new javax.xml.namespace.QName("http://banjiko.com/creditos", "saldo");
    
    
    /**
     * Gets array of all "no_amortizacion" elements
     */
    public int[] getNoAmortizacionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NOAMORTIZACION$0, targetList);
            int[] result = new int[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
            return result;
        }
    }
    
    /**
     * Gets ith "no_amortizacion" element
     */
    public int getNoAmortizacionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOAMORTIZACION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "no_amortizacion" elements
     */
    public org.apache.xmlbeans.XmlInt[] xgetNoAmortizacionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NOAMORTIZACION$0, targetList);
            org.apache.xmlbeans.XmlInt[] result = new org.apache.xmlbeans.XmlInt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "no_amortizacion" element
     */
    public org.apache.xmlbeans.XmlInt xgetNoAmortizacionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NOAMORTIZACION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlInt)target;
        }
    }
    
    /**
     * Returns number of "no_amortizacion" element
     */
    public int sizeOfNoAmortizacionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOAMORTIZACION$0);
        }
    }
    
    /**
     * Sets array of all "no_amortizacion" element
     */
    public void setNoAmortizacionArray(int[] noAmortizacionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(noAmortizacionArray, NOAMORTIZACION$0);
        }
    }
    
    /**
     * Sets ith "no_amortizacion" element
     */
    public void setNoAmortizacionArray(int i, int noAmortizacion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOAMORTIZACION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(noAmortizacion);
        }
    }
    
    /**
     * Sets (as xml) array of all "no_amortizacion" element
     */
    public void xsetNoAmortizacionArray(org.apache.xmlbeans.XmlInt[]noAmortizacionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(noAmortizacionArray, NOAMORTIZACION$0);
        }
    }
    
    /**
     * Sets (as xml) ith "no_amortizacion" element
     */
    public void xsetNoAmortizacionArray(int i, org.apache.xmlbeans.XmlInt noAmortizacion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NOAMORTIZACION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(noAmortizacion);
        }
    }
    
    /**
     * Inserts the value as the ith "no_amortizacion" element
     */
    public void insertNoAmortizacion(int i, int noAmortizacion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NOAMORTIZACION$0, i);
            target.setIntValue(noAmortizacion);
        }
    }
    
    /**
     * Appends the value as the last "no_amortizacion" element
     */
    public void addNoAmortizacion(int noAmortizacion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOAMORTIZACION$0);
            target.setIntValue(noAmortizacion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "no_amortizacion" element
     */
    public org.apache.xmlbeans.XmlInt insertNewNoAmortizacion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().insert_element_user(NOAMORTIZACION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "no_amortizacion" element
     */
    public org.apache.xmlbeans.XmlInt addNewNoAmortizacion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NOAMORTIZACION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "no_amortizacion" element
     */
    public void removeNoAmortizacion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOAMORTIZACION$0, i);
        }
    }
    
    /**
     * Gets array of all "fecha_limite_pago" elements
     */
    public java.util.Calendar[] getFechaLimitePagoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FECHALIMITEPAGO$2, targetList);
            java.util.Calendar[] result = new java.util.Calendar[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getCalendarValue();
            return result;
        }
    }
    
    /**
     * Gets ith "fecha_limite_pago" element
     */
    public java.util.Calendar getFechaLimitePagoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHALIMITEPAGO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "fecha_limite_pago" elements
     */
    public org.apache.xmlbeans.XmlDate[] xgetFechaLimitePagoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FECHALIMITEPAGO$2, targetList);
            org.apache.xmlbeans.XmlDate[] result = new org.apache.xmlbeans.XmlDate[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "fecha_limite_pago" element
     */
    public org.apache.xmlbeans.XmlDate xgetFechaLimitePagoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FECHALIMITEPAGO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDate)target;
        }
    }
    
    /**
     * Returns number of "fecha_limite_pago" element
     */
    public int sizeOfFechaLimitePagoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FECHALIMITEPAGO$2);
        }
    }
    
    /**
     * Sets array of all "fecha_limite_pago" element
     */
    public void setFechaLimitePagoArray(java.util.Calendar[] fechaLimitePagoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fechaLimitePagoArray, FECHALIMITEPAGO$2);
        }
    }
    
    /**
     * Sets ith "fecha_limite_pago" element
     */
    public void setFechaLimitePagoArray(int i, java.util.Calendar fechaLimitePago)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHALIMITEPAGO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setCalendarValue(fechaLimitePago);
        }
    }
    
    /**
     * Sets (as xml) array of all "fecha_limite_pago" element
     */
    public void xsetFechaLimitePagoArray(org.apache.xmlbeans.XmlDate[]fechaLimitePagoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fechaLimitePagoArray, FECHALIMITEPAGO$2);
        }
    }
    
    /**
     * Sets (as xml) ith "fecha_limite_pago" element
     */
    public void xsetFechaLimitePagoArray(int i, org.apache.xmlbeans.XmlDate fechaLimitePago)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FECHALIMITEPAGO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fechaLimitePago);
        }
    }
    
    /**
     * Inserts the value as the ith "fecha_limite_pago" element
     */
    public void insertFechaLimitePago(int i, java.util.Calendar fechaLimitePago)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FECHALIMITEPAGO$2, i);
            target.setCalendarValue(fechaLimitePago);
        }
    }
    
    /**
     * Appends the value as the last "fecha_limite_pago" element
     */
    public void addFechaLimitePago(java.util.Calendar fechaLimitePago)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FECHALIMITEPAGO$2);
            target.setCalendarValue(fechaLimitePago);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fecha_limite_pago" element
     */
    public org.apache.xmlbeans.XmlDate insertNewFechaLimitePago(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().insert_element_user(FECHALIMITEPAGO$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fecha_limite_pago" element
     */
    public org.apache.xmlbeans.XmlDate addNewFechaLimitePago()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FECHALIMITEPAGO$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "fecha_limite_pago" element
     */
    public void removeFechaLimitePago(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FECHALIMITEPAGO$2, i);
        }
    }
    
    /**
     * Gets array of all "capital" elements
     */
    public double[] getCapitalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAPITAL$4, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "capital" element
     */
    public double getCapitalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPITAL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "capital" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetCapitalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAPITAL$4, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "capital" element
     */
    public org.apache.xmlbeans.XmlDouble xgetCapitalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(CAPITAL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Returns number of "capital" element
     */
    public int sizeOfCapitalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPITAL$4);
        }
    }
    
    /**
     * Sets array of all "capital" element
     */
    public void setCapitalArray(double[] capitalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(capitalArray, CAPITAL$4);
        }
    }
    
    /**
     * Sets ith "capital" element
     */
    public void setCapitalArray(int i, double capital)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPITAL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(capital);
        }
    }
    
    /**
     * Sets (as xml) array of all "capital" element
     */
    public void xsetCapitalArray(org.apache.xmlbeans.XmlDouble[]capitalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(capitalArray, CAPITAL$4);
        }
    }
    
    /**
     * Sets (as xml) ith "capital" element
     */
    public void xsetCapitalArray(int i, org.apache.xmlbeans.XmlDouble capital)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(CAPITAL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(capital);
        }
    }
    
    /**
     * Inserts the value as the ith "capital" element
     */
    public void insertCapital(int i, double capital)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CAPITAL$4, i);
            target.setDoubleValue(capital);
        }
    }
    
    /**
     * Appends the value as the last "capital" element
     */
    public void addCapital(double capital)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAPITAL$4);
            target.setDoubleValue(capital);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "capital" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewCapital(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(CAPITAL$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "capital" element
     */
    public org.apache.xmlbeans.XmlDouble addNewCapital()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(CAPITAL$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "capital" element
     */
    public void removeCapital(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPITAL$4, i);
        }
    }
    
    /**
     * Gets array of all "interes" elements
     */
    public double[] getInteresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTERES$6, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "interes" element
     */
    public double getInteresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "interes" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetInteresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTERES$6, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "interes" element
     */
    public org.apache.xmlbeans.XmlDouble xgetInteresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(INTERES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Returns number of "interes" element
     */
    public int sizeOfInteresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERES$6);
        }
    }
    
    /**
     * Sets array of all "interes" element
     */
    public void setInteresArray(double[] interesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(interesArray, INTERES$6);
        }
    }
    
    /**
     * Sets ith "interes" element
     */
    public void setInteresArray(int i, double interes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(interes);
        }
    }
    
    /**
     * Sets (as xml) array of all "interes" element
     */
    public void xsetInteresArray(org.apache.xmlbeans.XmlDouble[]interesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(interesArray, INTERES$6);
        }
    }
    
    /**
     * Sets (as xml) ith "interes" element
     */
    public void xsetInteresArray(int i, org.apache.xmlbeans.XmlDouble interes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(INTERES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(interes);
        }
    }
    
    /**
     * Inserts the value as the ith "interes" element
     */
    public void insertInteres(int i, double interes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INTERES$6, i);
            target.setDoubleValue(interes);
        }
    }
    
    /**
     * Appends the value as the last "interes" element
     */
    public void addInteres(double interes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERES$6);
            target.setDoubleValue(interes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interes" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewInteres(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(INTERES$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interes" element
     */
    public org.apache.xmlbeans.XmlDouble addNewInteres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(INTERES$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "interes" element
     */
    public void removeInteres(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERES$6, i);
        }
    }
    
    /**
     * Gets array of all "total" elements
     */
    public double[] getTotalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TOTAL$8, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "total" element
     */
    public double getTotalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTAL$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "total" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetTotalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TOTAL$8, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "total" element
     */
    public org.apache.xmlbeans.XmlDouble xgetTotalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TOTAL$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Returns number of "total" element
     */
    public int sizeOfTotalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTAL$8);
        }
    }
    
    /**
     * Sets array of all "total" element
     */
    public void setTotalArray(double[] totalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(totalArray, TOTAL$8);
        }
    }
    
    /**
     * Sets ith "total" element
     */
    public void setTotalArray(int i, double total)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTAL$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(total);
        }
    }
    
    /**
     * Sets (as xml) array of all "total" element
     */
    public void xsetTotalArray(org.apache.xmlbeans.XmlDouble[]totalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(totalArray, TOTAL$8);
        }
    }
    
    /**
     * Sets (as xml) ith "total" element
     */
    public void xsetTotalArray(int i, org.apache.xmlbeans.XmlDouble total)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TOTAL$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(total);
        }
    }
    
    /**
     * Inserts the value as the ith "total" element
     */
    public void insertTotal(int i, double total)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TOTAL$8, i);
            target.setDoubleValue(total);
        }
    }
    
    /**
     * Appends the value as the last "total" element
     */
    public void addTotal(double total)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTAL$8);
            target.setDoubleValue(total);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "total" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewTotal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(TOTAL$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "total" element
     */
    public org.apache.xmlbeans.XmlDouble addNewTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(TOTAL$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "total" element
     */
    public void removeTotal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTAL$8, i);
        }
    }
    
    /**
     * Gets array of all "saldo" elements
     */
    public double[] getSaldoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SALDO$10, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "saldo" element
     */
    public double getSaldoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDO$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "saldo" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetSaldoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SALDO$10, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "saldo" element
     */
    public org.apache.xmlbeans.XmlDouble xgetSaldoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SALDO$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Returns number of "saldo" element
     */
    public int sizeOfSaldoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALDO$10);
        }
    }
    
    /**
     * Sets array of all "saldo" element
     */
    public void setSaldoArray(double[] saldoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(saldoArray, SALDO$10);
        }
    }
    
    /**
     * Sets ith "saldo" element
     */
    public void setSaldoArray(int i, double saldo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALDO$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(saldo);
        }
    }
    
    /**
     * Sets (as xml) array of all "saldo" element
     */
    public void xsetSaldoArray(org.apache.xmlbeans.XmlDouble[]saldoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(saldoArray, SALDO$10);
        }
    }
    
    /**
     * Sets (as xml) ith "saldo" element
     */
    public void xsetSaldoArray(int i, org.apache.xmlbeans.XmlDouble saldo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SALDO$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(saldo);
        }
    }
    
    /**
     * Inserts the value as the ith "saldo" element
     */
    public void insertSaldo(int i, double saldo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SALDO$10, i);
            target.setDoubleValue(saldo);
        }
    }
    
    /**
     * Appends the value as the last "saldo" element
     */
    public void addSaldo(double saldo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALDO$10);
            target.setDoubleValue(saldo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "saldo" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewSaldo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(SALDO$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "saldo" element
     */
    public org.apache.xmlbeans.XmlDouble addNewSaldo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(SALDO$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "saldo" element
     */
    public void removeSaldo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALDO$10, i);
        }
    }
}
