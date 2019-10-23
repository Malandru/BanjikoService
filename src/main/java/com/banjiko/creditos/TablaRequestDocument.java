/*
 * An XML document type.
 * Localname: tablaRequest
 * Namespace: http://banjiko.com/creditos
 * Java type: com.banjiko.creditos.TablaRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.banjiko.creditos;


/**
 * A document containing one tablaRequest(@http://banjiko.com/creditos) element.
 *
 * This is a complex type.
 */
public interface TablaRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TablaRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C152683714F7B99C44842EF24EA444A").resolveHandle("tablarequest2e97doctype");
    
    /**
     * Gets the "tablaRequest" element
     */
    com.banjiko.creditos.TablaRequestDocument.TablaRequest getTablaRequest();
    
    /**
     * Sets the "tablaRequest" element
     */
    void setTablaRequest(com.banjiko.creditos.TablaRequestDocument.TablaRequest tablaRequest);
    
    /**
     * Appends and returns a new empty "tablaRequest" element
     */
    com.banjiko.creditos.TablaRequestDocument.TablaRequest addNewTablaRequest();
    
    /**
     * An XML tablaRequest(@http://banjiko.com/creditos).
     *
     * This is a complex type.
     */
    public interface TablaRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TablaRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C152683714F7B99C44842EF24EA444A").resolveHandle("tablarequestdbf6elemtype");
        
        /**
         * Gets the "ack" element
         */
        com.banjiko.creditos.Acknowledge getAck();
        
        /**
         * Sets the "ack" element
         */
        void setAck(com.banjiko.creditos.Acknowledge ack);
        
        /**
         * Appends and returns a new empty "ack" element
         */
        com.banjiko.creditos.Acknowledge addNewAck();
        
        /**
         * Gets the "prestamo" element
         */
        com.banjiko.creditos.Credito getPrestamo();
        
        /**
         * Sets the "prestamo" element
         */
        void setPrestamo(com.banjiko.creditos.Credito prestamo);
        
        /**
         * Appends and returns a new empty "prestamo" element
         */
        com.banjiko.creditos.Credito addNewPrestamo();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.banjiko.creditos.TablaRequestDocument.TablaRequest newInstance() {
              return (com.banjiko.creditos.TablaRequestDocument.TablaRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.banjiko.creditos.TablaRequestDocument.TablaRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.banjiko.creditos.TablaRequestDocument.TablaRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.banjiko.creditos.TablaRequestDocument newInstance() {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.banjiko.creditos.TablaRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.banjiko.creditos.TablaRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.banjiko.creditos.TablaRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.banjiko.creditos.TablaRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.banjiko.creditos.TablaRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.banjiko.creditos.TablaRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.banjiko.creditos.TablaRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.banjiko.creditos.TablaRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.banjiko.creditos.TablaRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.banjiko.creditos.TablaRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.banjiko.creditos.TablaRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.banjiko.creditos.TablaRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.banjiko.creditos.TablaRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.banjiko.creditos.TablaRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.banjiko.creditos.TablaRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.banjiko.creditos.TablaRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.banjiko.creditos.TablaRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.banjiko.creditos.TablaRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
