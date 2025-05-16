package com.example.bjprea.backend_java_prea.entity.propertytypes;

import com.example.bjprea.backend_java_prea.entity.PropertyPrimaryClass;

public class HouseClass extends PropertyPrimaryClass {

    // using User: Steady Income rate, Debt amount (Debt-to-Income, Monthly Debt/Gross Income = should be <30%),
    // Credit Utilization/Credit score

    // Affordability: < 30% of Net Income, 30% of total: Principal, Interest, Taxes, Insurance
    //                  Down Payment and CC: 3%-20% (Typically)
    //                  Avoid PMI if you put down <20% could be a PMI (Private Mortgage Insurance) flag
    //                  if home = $100,000.00 x 20% DP = 20,000 adequate down payment
    //                  pre-approval? helps with budget

    HouseClass() {
        System.out.println("You have selected House property.");
    }

    @Override
    public void setRequirements() { // Polymorphism
        System.out.println("Loading House property attributes and statistics");

    }


}
