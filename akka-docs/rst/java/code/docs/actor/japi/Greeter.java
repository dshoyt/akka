/**
 * Copyright (C) 2009-2013 Typesafe Inc. <http://www.typesafe.com>
 */

package docs.actor.japi;

import akka.actor.UntypedActor;

//#greeter
public class Greeter extends UntypedActor {
  
  static final Object greet = new Object();
  static final Object done = new Object();

  @Override
  public void onReceive(Object msg) {
    if (msg == greet) {
      System.out.println("Hello World!");
      getSender().tell(done, getSelf());
    }
  }
  
}
//#greeter
