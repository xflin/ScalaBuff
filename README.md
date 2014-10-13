This is a fork from the [original ScalaBuff project](https://github.com/SandroGrzicic/ScalaBuff) with some changes.

Excerpt from the original README.md,

"ScalaBuff is a Scala [Protocol Buffers](https://developers.google.com/protocol-buffers/docs/overview) (protobuf) compiler. It takes .proto files and outputs valid Scala classes that can be used by your code to receive or send protobuf messages."

For details, please check the original ScalaBuff site.

There are three main changes in the master branch of this fork:
  - Fixed issue#85 When importing a proto with a package statement ScalaBuff generates incorrect Scala code.
  - Fixed issue#92 Missing support for "import public" notion in ScalaBuff.
  - Changed to use scala 2.11.x version.

