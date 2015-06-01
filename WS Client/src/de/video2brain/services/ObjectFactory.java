
package de.video2brain.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.video2brain.services package. 
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

    private final static QName _DoSomethingVeryLongLast_QNAME = new QName("http://services.video2brain.de/", "doSomethingVeryLongLast");
    private final static QName _SayHelloResponse_QNAME = new QName("http://services.video2brain.de/", "sayHelloResponse");
    private final static QName _DoSomethingVeryLongLastResponse_QNAME = new QName("http://services.video2brain.de/", "doSomethingVeryLongLastResponse");
    private final static QName _SayHello_QNAME = new QName("http://services.video2brain.de/", "sayHello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.video2brain.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoSomethingVeryLongLastResponse }
     * 
     */
    public DoSomethingVeryLongLastResponse createDoSomethingVeryLongLastResponse() {
        return new DoSomethingVeryLongLastResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link DoSomethingVeryLongLast }
     * 
     */
    public DoSomethingVeryLongLast createDoSomethingVeryLongLast() {
        return new DoSomethingVeryLongLast();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSomethingVeryLongLast }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.video2brain.de/", name = "doSomethingVeryLongLast")
    public JAXBElement<DoSomethingVeryLongLast> createDoSomethingVeryLongLast(DoSomethingVeryLongLast value) {
        return new JAXBElement<DoSomethingVeryLongLast>(_DoSomethingVeryLongLast_QNAME, DoSomethingVeryLongLast.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.video2brain.de/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSomethingVeryLongLastResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.video2brain.de/", name = "doSomethingVeryLongLastResponse")
    public JAXBElement<DoSomethingVeryLongLastResponse> createDoSomethingVeryLongLastResponse(DoSomethingVeryLongLastResponse value) {
        return new JAXBElement<DoSomethingVeryLongLastResponse>(_DoSomethingVeryLongLastResponse_QNAME, DoSomethingVeryLongLastResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.video2brain.de/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

}
