module DeviceUnderTest(
  input        clock,
  input        reset,
  input  [1:0] io_a,
  input  [1:0] io_b,
  output [1:0] io_out,
  output       io_equ
);
  assign io_out = io_a & io_b; // @[DeviceUnderTest.scala 15:20]
  assign io_equ = io_a == io_b; // @[DeviceUnderTest.scala 16:20]
endmodule
