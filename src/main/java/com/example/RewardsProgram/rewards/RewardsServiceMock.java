package com.example.RewardsProgram.rewards;

import java.util.*;
import com.example.RewardsProgram.model.Customer;
import com.example.RewardsProgram.model.CustomerTransaction;

public class RewardsServiceMock {
    private static List<CustomerTransaction> transactions = new ArrayList<CustomerTransaction>();
    private static long index;

    static {
        transactions.add( new CustomerTransaction(index++, new Customer(1, "Customer 1"), 170.0, "Purchase 1", new Date()) );
        transactions.add( new CustomerTransaction(index++, new Customer(2, "Customer 2"), 55.0, "Purchase 2", new Date()) );
        transactions.add( new CustomerTransaction(index++, new Customer(3, "Customer 3"), 200.0, "Purchase 3", new Date()) );
    }


    public List<CustomerTransaction> getAll() {
        return transactions;
    }
}
