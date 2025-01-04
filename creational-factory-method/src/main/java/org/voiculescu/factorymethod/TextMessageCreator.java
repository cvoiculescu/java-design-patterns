package org.voiculescu.factorymethod;

import org.voiculescu.factorymethod.message.Message;
import org.voiculescu.factorymethod.message.TextMessage;

public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
