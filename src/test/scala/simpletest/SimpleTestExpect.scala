package simpletest
 
import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class SimpleTestExpect extends AnyFlatSpec with ChiselScalatestTester {
    "DUT" should "pass" in {
        test(new DeviceUnderTest) { dut =>
            dut.io.a.poke(0.U)
            dut.io.b.poke(1.U)
            dut.clock.step()
            dut.io.out.expect(0.U)
            dut.io.a.poke(3.U)
            dut.io.b.poke(2.U)
            dut.clock.step()
            dut.io.out.expect(2.U)
        }
    }
}