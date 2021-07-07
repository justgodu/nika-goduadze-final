package nika.goduadze.nika_goduadze_3.service;

import nika.goduadze.nika_goduadze_3.mock.CurrencyMockData;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.LocalDate;

@WebService
public class CurrencyService {
    @WebMethod
    public float GetCurrency(String code) {
        CurrencyMockData data = new CurrencyMockData();

        return data.getByCode(code).getCurr();
    }

    @WebMethod
    public String GetCurrencyDescription(String code) {
        CurrencyMockData data = new CurrencyMockData();
        return data.getByCode(code).getDescription();
    }

    @WebMethod
    public String GetDate()
    {
        return LocalDate.now().toString();
    }



}
