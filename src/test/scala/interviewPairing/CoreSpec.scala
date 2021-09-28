package interviewPairing

import org.scalatest._
import wordspec._
import matchers._

class CoreSpec extends AnyWordSpec with must.Matchers {

  "myFunction" must {
    "return a value" when {
      "given a value" in {
        Core.aFunction(1) mustBe 1
      }
    }
  }
}
