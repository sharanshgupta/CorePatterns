package com.sharansh.patterns.abstractfactory;

public class DaoFactoryProducer {

  public static DAOAbstractFactory produce(String factoryType) {
    DAOAbstractFactory daf = null;

    if (factoryType.equalsIgnoreCase("xml")) {
      daf = new XMLDaoFactory();
    } else if (factoryType.equalsIgnoreCase("db")) {
      daf = new DBDaoFactory();
    }
    return daf;
  }
}
