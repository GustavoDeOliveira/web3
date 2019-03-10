//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.03.07 às 01:23:52 PM BRT 
//

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de containerType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="containerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responsavel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="produto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantidade" type="{https://www.w3schools.com}quantidadeType"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{https://www.w3schools.com}idType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "containerType", namespace = "https://www.w3schools.com", propOrder = {
    "responsavel",
    "produto",
    "quantidade",
    "valor"
})
@XmlSeeAlso({
    MainContainerType.class
})
public class ContainerType {

    @XmlElement(namespace = "https://www.w3schools.com", required = true)
    protected String responsavel;
    @XmlElement(namespace = "https://www.w3schools.com", required = true)
    protected String produto;
    @XmlElement(namespace = "https://www.w3schools.com", required = true)
    protected QuantidadeType quantidade;
    @XmlElement(namespace = "https://www.w3schools.com", required = true)
    protected BigDecimal valor;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Obtém o valor da propriedade responsavel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsavel() {
        return responsavel;
    }

    /**
     * Define o valor da propriedade responsavel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsavel(String value) {
        this.responsavel = value;
    }

    /**
     * Obtém o valor da propriedade produto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduto() {
        return produto;
    }

    /**
     * Define o valor da propriedade produto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduto(String value) {
        this.produto = value;
    }

    /**
     * Obtém o valor da propriedade quantidade.
     * 
     * @return
     *     possible object is
     *     {@link QuantidadeType }
     *     
     */
    public QuantidadeType getQuantidade() {
        return quantidade;
    }

    /**
     * Define o valor da propriedade quantidade.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantidadeType }
     *     
     */
    public void setQuantidade(QuantidadeType value) {
        this.quantidade = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
