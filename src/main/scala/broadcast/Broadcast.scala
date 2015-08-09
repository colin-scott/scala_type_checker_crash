package broadcast;

import scala.collection.mutable.HashMap
import akka.actor.Actor

class BroadcastNode extends Actor {
  val h = new HashMap[String, Int]

  // Causes type checker to crash:
  h.synchronized {
    h(this.path.name) += 1
  }

  // Doesn't cause type checker to crash:
  // val t = this.path.name

  def receive = {
    case _ =>
  }
}
