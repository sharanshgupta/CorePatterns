package com.sharansh.patterns.abstractfactory;

import com.sharansh.patterns.factory.ChickenPizza;
import com.sharansh.patterns.factory.PlaneCheese;
import com.sharansh.patterns.factory.VegPizza;

public class XMLDaoFactory extends DAOAbstractFactory{

  @Override
  public Dao createDao(String type) {
    Dao dao = null;

    if (type.equalsIgnoreCase("emp")) {
      dao = new XMLEmpDao();
    } else if (type.equalsIgnoreCase("dept")) {
      dao = new XMLDeptDao();
    }

    return dao;
  }
}
