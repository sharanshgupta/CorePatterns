package com.sharansh.patterns.abstractfactory;

public abstract class DAOAbstractFactory {

  public abstract Dao createDao(String type);
}