package nika.goduadze.nika_goduadze_3.mock;

import nika.goduadze.nika_goduadze_3.model.Currency;

import java.util.Hashtable;

public class CurrencyMockData {
    private Hashtable<String, Currency> data = new Hashtable<String, Currency>();

    public CurrencyMockData(){
        this.data.put("USD", new Currency("USD", 3.2f, "1 აშშ დოლარი"));
        this.data.put("GEL", new Currency("GEL", 1.0f, "1 ლარი"));
        this.data.put("EUR", new Currency("EUR", 4.213f, "1 ევრო"));
        this.data.put("GBP", new Currency("USD", 5.123f, "1 გირვანქა სტერლინგი"));
    }

    public Currency getByCode(String code){
        return this.data.get(code);
    }
}
