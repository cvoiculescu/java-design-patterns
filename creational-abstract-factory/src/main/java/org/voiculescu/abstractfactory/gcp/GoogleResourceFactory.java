package org.voiculescu.abstractfactory.gcp;

import org.voiculescu.abstractfactory.Instance;
import org.voiculescu.abstractfactory.ResourceFactory;
import org.voiculescu.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacityMib) {
        return new GoogleCloudStorage(capacityMib);
    }
}
