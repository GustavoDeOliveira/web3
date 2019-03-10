//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.03.07 às 01:23:52 PM BRT 
//

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the  package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Carga_QNAME = new QName("https://www.w3schools.com", "carga");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: 
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CargaType }
     * 
     */
    public CargaType createCargaType() {
        return new CargaType();
    }

    /**
     * Create an instance of {@link MainContainerType }
     * 
     */
    public MainContainerType createMainContainerType() {
        return new MainContainerType();
    }

    /**
     * Create an instance of {@link ContainerType }
     * 
     */
    public ContainerType createContainerType() {
        return new ContainerType();
    }

    /**
     * Create an instance of {@link QuantidadeType }
     * 
     */
    public QuantidadeType createQuantidadeType() {
        return new QuantidadeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.w3schools.com", name = "carga")
    public JAXBElement<CargaType> createCarga(CargaType value) {
        return new JAXBElement<CargaType>(_Carga_QNAME, CargaType.class, null, value);
    }

}
