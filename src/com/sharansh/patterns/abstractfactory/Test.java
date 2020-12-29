package com.sharansh.patterns.abstractfactory;

public class Test {

  public static void main(String[] args) {
    DAOAbstractFactory dao = DaoFactoryProducer.produce("db");
    Dao emp = dao.createDao("emp");
    emp.save();
  }
}
