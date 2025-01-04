package org.voiculescu.factorymethod;

import org.voiculescu.factorymethod.message.JSONMessage;
import org.voiculescu.factorymethod.message.Message;

public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
