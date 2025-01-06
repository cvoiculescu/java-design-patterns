package org.voiculescu.abstractfactory.aws;

import org.voiculescu.abstractfactory.Instance;
import org.voiculescu.abstractfactory.ResourceFactory;
import org.voiculescu.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capacityMib) {
        return new S3Storage(capacityMib);
    }
}
