# soap_sample_client

This project is created using below steps.


1. Open project in Eclipse IDE

2. Right click on src folder and select new wizard to opt for webservice client

3. Select wsdl url and click next to generate stubs.

`
HelloWorld service=new HelloWorldProxy();
String s=service.getHelloWorldAsString();
`