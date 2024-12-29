package org.voiculescu.intersegrega.service;

import org.voiculescu.intersegrega.entity.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderPersistenceService implements PersistenceService<Order> {

    private static final Map<Long, Order> ORDERS = new HashMap<>();

    @Override
    public Map<Long, Order> getCache() {
        return ORDERS;
    }
}
