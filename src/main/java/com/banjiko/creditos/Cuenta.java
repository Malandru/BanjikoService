/*
 * XML Type:  cuenta
 * Namespace: http://banjiko.com/creditos
 * Java type: com.banjiko.creditos.Cuenta
 *
 * Automatically generated - do not modify.
 */
package com.banjiko.creditos;


/**
 * An XML cuenta(@http://banjiko.com/creditos).
 *
 * This is a complex type.
 */
public interface Cuenta extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Cuenta.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C152683714F7B99C44842EF24EA444A").resolveHandle("cuenta61aatype");
    
    /**
     * Gets the "no_cuenta" element
     */
    long getNoCuenta();
    
    /**
     * Gets (as xml) the "no_cuenta" element
     */
    org.apache.xmlbeans.XmlLong xgetNoCuenta();
    
    /**
     * Sets the "no_cuenta" element
     */
    void setNoCuenta(long noCuenta);
    
    /**
     * Sets (as xml) the "no_cuenta" element
     */
    void xsetNoCuenta(org.apache.xmlbeans.XmlLong noCuenta);
    
    /**
     * Gets the "limite" element
     */
    double getLimite();
    
    /**
     * Gets (as xml) the "limite" element
     */
    org.apache.xmlbeans.XmlDouble xgetLimite();
    
    /**
     * Sets the "limite" element
     */
    void setLimite(double limite);
    
    /**
     * Sets (as xml) the "limite" element
     */
    void xsetLimite(org.apache.xmlbeans.XmlDouble limite);
    
    /**
     * Gets the "vencimiento" element
     */
    java.util.Calendar getVencimiento();
    
    /**
     * Gets (as xml) the "vencimiento" element
     */
    org.apache.xmlbeans.XmlDate xgetVencimiento();
    
    /**
     * Sets the "vencimiento" element
     */
    void setVencimiento(java.util.Calendar vencimiento);
    
    /**
     * Sets (as xml) the "vencimiento" element
     */
    void xsetVencimiento(org.apache.xmlbeans.XmlDate vencimiento);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.banjiko.creditos.Cuenta newInstance() {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.banjiko.creditos.Cuenta newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.banjiko.creditos.Cuenta parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.banjiko.creditos.Cuenta parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.banjiko.creditos.Cuenta parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.banjiko.creditos.Cuenta parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.banjiko.creditos.Cuenta parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.banjiko.creditos.Cuenta parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.banjiko.creditos.Cuenta parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.banjiko.creditos.Cuenta parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.banjiko.creditos.Cuenta parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.banjiko.creditos.Cuenta parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.banjiko.creditos.Cuenta parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.banjiko.creditos.Cuenta parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.banjiko.creditos.Cuenta parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.banjiko.creditos.Cuenta parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.banjiko.creditos.Cuenta parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.banjiko.creditos.Cuenta parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.banjiko.creditos.Cuenta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
