package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.Map;

public class Phonebook {
    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException("Invalid argument");
        }
        Path path = Path.of(output);
        try(BufferedWriter bw = Files.newBufferedWriter(path)) {
            if (contacts.size() == 1) {
                for (Map.Entry<String, String> actualContact : contacts.entrySet()) {
                    bw.write(actualContact.getKey() + ": " + actualContact.getValue());
                }
            } else {
                getLinesWithStringBuilder(contacts, bw);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file", ioe);
        }
    }

    private void getLinesWithStringBuilder(Map<String, String> contacts, BufferedWriter bw) throws IOException {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, String> actualContact : contacts.entrySet()) {
            sb.append(actualContact.getKey() + ": " + actualContact.getValue() + "\n");
        }
        bw.write(sb.toString());
    }
}
