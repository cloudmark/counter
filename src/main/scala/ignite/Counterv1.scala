package ignite

import akka.actor.{Actor, ActorRef}

class Counterv1 extends Actor {
  var count = 0

  def receive = {
    case "incr" => count += 1
    case ("get", client: ActorRef) => client ! count
  }
}