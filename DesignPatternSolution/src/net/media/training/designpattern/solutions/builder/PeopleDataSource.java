package net.media.training.designpattern.solutions.builder;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 10:04:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class PeopleDataSource {
    public static String getPeopleXml(List<Person> persons) {
        StringBuilder finalXML = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        finalXML.append("<People number=\"").append(persons.size()).append("\">");
        for (Person person : persons) {
            finalXML.append("<Person id=\"").append(person.getId()).append("\" name=\"").append(person.getName()).append("\">")
                    .append("<Address><City>").append(person.getCity()).append("</City><Country>").append(person.getCountry()).append("</Country></Address>")
                    .append("</Person>");
        }
        finalXML.append("</People>");
        return finalXML.toString();
    }
}