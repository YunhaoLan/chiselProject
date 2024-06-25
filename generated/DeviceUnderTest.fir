circuit DeviceUnderTest :
  module DeviceUnderTest :
    input clock : Clock
    input reset : UInt<1>
    output io : { flip a : UInt<2>, flip b : UInt<2>, out : UInt<2>, equ : UInt<1>}

    node _io_out_T = and(io.a, io.b) @[DeviceUnderTest.scala 15:20]
    io.out <= _io_out_T @[DeviceUnderTest.scala 15:12]
    node _io_equ_T = eq(io.a, io.b) @[DeviceUnderTest.scala 16:20]
    io.equ <= _io_equ_T @[DeviceUnderTest.scala 16:12]

