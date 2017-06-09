package ignite

import akka.actor.Actor

class Counterv3 extends Actor {
  def counter(n: Int): Receive = {
    case "incr" => context.become(counter(n + 1))
    case "get" => sender ! n
  }
  def receive:Receive = counter(0)
}