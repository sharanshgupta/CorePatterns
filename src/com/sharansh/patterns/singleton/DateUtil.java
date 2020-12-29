package com.sharansh.patterns.singleton;

public class DateUtil implements Cloneable {

  //  private static DateUtil instance = new DateUtil();  -> Eager Initialization
  private static volatile DateUtil instance;

//  Eager Initialization
//  static {
//    instance = new DateUtil();
//  }

  private DateUtil() {
  }

  public static DateUtil getInstance() {
//    Lazy Instantiation - preferred
    if (instance == null)
    {
//      Make thread safe using synchronized
      synchronized (DateUtil.class) {
        instance = new DateUtil();
      }
    }
    return instance;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
  }
}
