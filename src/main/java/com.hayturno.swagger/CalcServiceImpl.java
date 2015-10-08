package com.hayturno.swagger;


public class CalcServiceImpl implements CalcService {

    @Override
    public int addOperation(int addNum1, int addNum2) {
        return (addNum1 + addNum2);
    }

    @Override
    public int subOperation(int subNum1, int subNum2) {
        return (subNum1 - subNum2);
    }
}
