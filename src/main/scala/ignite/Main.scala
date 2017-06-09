package ignite

import akka.actor.{Actor, Props}

class Main extends Actor {
  val counter = context.actorOf(Props[Counterv1], "counter")
  counter ! "incr"
  counter ! "incr"
  counter ! "incr"
  counter ! ("get", self)

  def receive = {
    case count: Int =>
      println(s"count was " + count)
      context.stop(self)
  }
}
