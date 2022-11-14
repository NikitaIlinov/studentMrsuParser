package myRealization;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLHandler extends DefaultHandler {
    @Override
    public void startDocument() throws SAXException {
        // Тут будет логика реакции на начало документа
    }

    @Override
    public void endDocument() throws SAXException {
        // Тут будет логика реакции на конец документа
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        // Тут будет логика реакции на начало элемента
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        // Тут будет логика реакции на конец элемента
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        // Тут будет логика реакции на текст между элементами
    }

    @Override
    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        // Тут будет логика реакции на пустое пространство внутри элементов (пробелы, переносы строчек и так далее).
    }
}

