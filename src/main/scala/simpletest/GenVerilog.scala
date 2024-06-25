package simpletest
 
import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

object GenVerilog extends App{
    emitVerilog(new DeviceUnderTest(), Array("--target-dir", "generated"))
}