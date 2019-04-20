import Main.{foo, divide}
import org.scalatest.FunSpec

class FuncsSuite extends FunSpec {

  describe("Stepic homework") {
    describe("Part 5 (Operators)") {

      describe("5.5 (Option)") {
        it("should return 6") {
          assert(foo(List(1, 2, 3, 4, 5, 6)) == 6)
        }
      }
      describe("5.6 (Ether)") {
        it("devide return arguments") {
          assertResult(Right(1,1)){
            divide(1,1)(1,1)
          }
        }
      }
    }
  }
}
