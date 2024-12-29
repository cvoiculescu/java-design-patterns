package org.voiculescu.depinv;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        Message msg = new Message("This is a message again");
        MessagePrinter printer = new MessagePrinter();
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("test_msg.json"))) {
            printer.writeMessage(msg, new JSONFormatter(), printWriter);
        }

        try (PrintWriter printWriter = new PrintWriter(System.out)) {
            printer.writeMessage(msg, new JSONFormatter(), printWriter);
        }
    }

}
