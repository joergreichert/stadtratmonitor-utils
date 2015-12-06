package de.oklab.leipzig.elastic

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.InetAddress
import java.net.URL
import java.util.stream.Collectors
import org.elasticsearch.client.transport.TransportClient
import org.elasticsearch.common.settings.Settings
import org.elasticsearch.common.transport.InetSocketTransportAddress

class ElasticClient {
	def static void main(String[] args) throws Exception {
		// useClient()
		//executeIndexRequest
//		executeSettingsRequest
//		deleteMapping
//		executeMappingRequest
		executeQueryRequest
	}
	
	def static deleteMapping() {
		val con = new URL("http://localhost:9200/papers/_mapping/paper").openConnection() as HttpURLConnection => [
			requestMethod = "DELETE"
		]
		println("Code: " + con.responseCode)
		println("Code: " + con.responseCode)
		if(con.responseCode != 200) {
			println("Errors: " +
				new BufferedReader(new InputStreamReader(con.errorStream)).lines.collect(Collectors.joining("\n")))
		}
		println("Output: " +
			new BufferedReader(new InputStreamReader(con.inputStream)).lines.collect(Collectors.joining("\n")))
	}
	
	def static executeSettingsRequest() {
		val con = new URL("http://localhost:9200/papers/_settings").openConnection() as HttpURLConnection => [
			requestMethod = "PUT"
			addRequestProperty("Content-Type", "application/json")
			addRequestProperty("Accept", "application/json")
			addRequestProperty("ignore_conflicts", "true")
			doOutput = true
			outputStream.write(getSettings.toString.getBytes("UTF-8"));
		]
		println("Code: " + con.responseCode)
		println("Code: " + con.responseCode)
		if(con.responseCode != 200) {
			println("Errors: " +
				new BufferedReader(new InputStreamReader(con.errorStream)).lines.collect(Collectors.joining("\n")))
		}
		println("Output: " +
			new BufferedReader(new InputStreamReader(con.inputStream)).lines.collect(Collectors.joining("\n")))
	}	

	def static executeMappingRequest() {
		val con = new URL("http://localhost:9200/papers/_mapping/paper").openConnection() as HttpURLConnection => [
			requestMethod = "PUT"
			addRequestProperty("Content-Type", "application/json")
			addRequestProperty("Accept", "application/json")
			addRequestProperty("ignore_conflicts", "true")
			doOutput = true
			outputStream.write(getMappings.toString.getBytes("UTF-8"));
		]
		println("Code: " + con.responseCode)
		println("Code: " + con.responseCode)
		if(con.responseCode != 200) {
			println("Errors: " +
				new BufferedReader(new InputStreamReader(con.errorStream)).lines.collect(Collectors.joining("\n")))
		}
		println("Output: " +
			new BufferedReader(new InputStreamReader(con.inputStream)).lines.collect(Collectors.joining("\n")))
	}	
	
	def static executeIndexRequest() {
		val con = new URL("http://localhost:9200/papers").openConnection() as HttpURLConnection => [
			requestMethod = "PUT"
			addRequestProperty("Content-Type", "application/json")
			addRequestProperty("Accept", "application/json")
			doOutput = true
			outputStream.write(getRequest.toString.getBytes("UTF-8"));
		]
		println("Code: " + con.responseCode)
		println("Code: " + con.responseCode)
		if(con.responseCode != 200) {
			println("Errors: " +
				new BufferedReader(new InputStreamReader(con.errorStream)).lines.collect(Collectors.joining("\n")))
		}
		println("Output: " +
			new BufferedReader(new InputStreamReader(con.inputStream)).lines.collect(Collectors.joining("\n")))
	}

	def static executeQueryRequest() {
		val con = new URL("http://localhost:9200/papers/paper/1/_termvector?pretty=true").openConnection() as HttpURLConnection => [
			requestMethod = "GET"
			addRequestProperty("Content-Type", "application/json")
			addRequestProperty("Accept", "application/json")
			doOutput = true
			outputStream.write(getQueryTerms.toString.getBytes("UTF-8"));
		]
		println("Code: " + con.responseCode)
		if(con.responseCode != 200) {
			println("Errors: " +
				new BufferedReader(new InputStreamReader(con.errorStream)).lines.collect(Collectors.joining("\n")))
		}
		println("Output: " +
			new BufferedReader(new InputStreamReader(con.inputStream)).lines.collect(Collectors.joining("\n")))
	}

	def static useClient() {
		val settings = Settings.settingsBuilder.put("cluster.name", "elasticsearch").build
		val client = TransportClient.builder.settings(settings).build.addTransportAddress(
			new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9200))
		// val XContentBuilder builder = jsonBuilder.startObject.field("user", "kimchy").field("postDate", new Date).
		// field("message", "trying out Elasticsearch").endObject
		// on shutdown
		client.close()
	}
	
	def static getQueryTerms() '''
		{
			"fields" : ["name"],
			"offsets" : true,
			"payloads" : true,
			"positions" : true,
			"term_statistics" : true,
			"field_statistics" : true
		}
	'''

	private def static getRequest() '''
		"mappings": {
			"papers": {
				"mappings": {
        			«getMappings»
				}
			}
		},
		"settings" : {
			«getSettings»
		}
	'''
	
	private static def getSettings() '''
	{
		"analysis": {
			"analyzer": {
				"fulltext_analyzer": {
					"type": "custom",
					"tokenizer": "whitespace",
					"filter": [
						"lowercase",
						"type_as_payload"
					]
				}
			}
		}
	}
	'''

	private static def getMappings() '''
	{
		"paper": {
		  "properties": {
		    "body": {
		      "type": "string"
		    },
		    "content": {
		      "type": "string",
		      "term_vector": "with_positions_offsets_payloads",
		      "store": true,
		      "analyzer": "fulltext_analyzer"
		    },
		    "created_at": {
		      "type": "date",
		      "format": "dateOptionalTime"
		    },
		    "id": {
		      "type": "long"
		    },
		    "name": {
		      "type": "string",
		      "term_vector": "with_positions_offsets_payloads",
		      "store": true,
		      "analyzer": "fulltext_analyzer"
		    },
		    "originator": {
		      "type": "string"
		    },
		    "paper_type": {
		      "type": "string"
		    },
		    "published_at": {
		      "type": "date",
		      "format": "dateOptionalTime"
		    },
		    "reference": {
		      "type": "string"
		    },
		    "resolution": {
		      "type": "string"
		    },
		    "updated_at": {
		      "type": "date",
		      "format": "dateOptionalTime"
		    },
		    "url": {
		      "type": "string"
		    }
		  }
		}
	}
	'''
}
