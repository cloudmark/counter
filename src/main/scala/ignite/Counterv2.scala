package ignite

import akka.actor.Actor

class Counterv2 extends Actor {
  var count = 0

  def receive = {
    case "incr" => count += 1
    case "get" => sender ! count
  }
}