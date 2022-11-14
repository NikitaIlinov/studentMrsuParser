package myRealization;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class SAXExample {
    private static ArrayList<Client> clients = new ArrayList<>();
    private static HashMap<Integer, Address> address = new HashMap();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {


        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File("client.xml"), handler);
        parser.parse(new File("address.xml"),handler);

        for (Client client : clients)
            System.out.println(String.format("Идентификатор: %s, ФИО: %s, персональный номер: %s, адрес проживания: %s", client.getId(), client.getName(), client.getPersonnelNumber(), address.get(Integer.parseInt(client.getAddress()))));
    }


    private static class XMLHandler extends DefaultHandler {
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equals("client")) {
                String id = attributes.getValue("id");
                String name = attributes.getValue("name");
                String personnelNumber = attributes.getValue("personnelNumber");
                String address = attributes.getValue("addressId");

                clients.add(new Client(id, name, personnelNumber, address));
            }
            if (qName.equals("address")){
                int id = Integer.parseInt(attributes.getValue("id"));
                String city = attributes.getValue("city");
                String street = attributes.getValue("street");
                String house = attributes.getValue("house");
                String floor = attributes.getValue("floor");
                String flatNumber = attributes.getValue("flatNumber");

                address.put(id, new Address(city, street, house, floor, flatNumber));
            }
        }
    }
}


