// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: import_public_top.proto

package resources.generated

//import "import_public_second.proto"

final case class ImportPublicTopLevel (
	`packageTestTop`: resources.generated.nested.PackageTest = resources.generated.nested.PackageTest.defaultInstance
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[ImportPublicTopLevel]
	with net.sandrogrzicic.scalabuff.Parser[ImportPublicTopLevel] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeMessage(1, `packageTestTop`)
	}

	def getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeMessageSize(1, `packageTestTop`)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): ImportPublicTopLevel = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __packageTestTop: resources.generated.nested.PackageTest = resources.generated.nested.PackageTest.defaultInstance

		def __newMerged = ImportPublicTopLevel(
			__packageTestTop
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __packageTestTop = readMessage[resources.generated.nested.PackageTest](in, __packageTestTop, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: ImportPublicTopLevel) = {
		ImportPublicTopLevel(
			m.`packageTestTop`
		)
	}

	def getDefaultInstanceForType = ImportPublicTopLevel.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
	def toJson(indent: Int = 0): String = "ScalaBuff JSON generation not enabled. Use --generate_json_method to enable."
}

object ImportPublicTopLevel {
	@beans.BeanProperty val defaultInstance = new ImportPublicTopLevel()

	def parseFrom(data: Array[Byte]): ImportPublicTopLevel = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): ImportPublicTopLevel = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): ImportPublicTopLevel = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): ImportPublicTopLevel = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[ImportPublicTopLevel] = defaultInstance.mergeDelimitedFromStream(stream)

	val PACKAGE_TEST_TOP_FIELD_NUMBER = 1

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: ImportPublicTopLevel) = defaultInstance.mergeFrom(prototype)

}

object ImportPublicTop {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

	private val fromBinaryHintMap = collection.immutable.HashMap[String, Array[Byte] ⇒ com.google.protobuf.GeneratedMessageLite](
		 "ImportPublicTopLevel" -> (bytes ⇒ ImportPublicTopLevel.parseFrom(bytes))
	)

	def deserializePayload(payload: Array[Byte], payloadType: String): com.google.protobuf.GeneratedMessageLite = {
		fromBinaryHintMap.get(payloadType) match {
			case Some(f) ⇒ f(payload)
			case None    ⇒ throw new IllegalArgumentException(s"unimplemented deserialization of message payload of type [${payloadType}]")
		}
	}
}