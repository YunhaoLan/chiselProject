package simpletest
 
import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class WaveformTest extends AnyFlatSpec with ChiselScalatestTester {
   "Waveform" should "pass" in {
        test (new DeviceUnderTest).withAnnotations(Seq(WriteVcdAnnotation)){ dut =>
            for (a <- 0 until 4){
                for (b <- 0 until 4){
                    dut.io.a.poke(a.U)
                    dut.io.b.poke(b.U)
                    dut.clock.step()
                }
            }
        }
    }
}