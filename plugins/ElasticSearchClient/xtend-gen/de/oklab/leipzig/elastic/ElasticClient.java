package de.oklab.leipzig.elastic;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

@SuppressWarnings("all")
public class ElasticClient {
  public static void main(final String[] args) throws Exception {
    ElasticClient.executeQueryRequest();
  }
  
  public static String deleteMapping() {
    try {
      String _xblockexpression = null;
      {
        URL _uRL = new URL("http://localhost:9200/papers/_mapping/paper");
        URLConnection _openConnection = _uRL.openConnection();
        final Procedure1<HttpURLConnection> _function = new Procedure1<HttpURLConnection>() {
          public void apply(final HttpURLConnection it) {
            try {
              it.setRequestMethod("DELETE");
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        };
        final HttpURLConnection con = ObjectExtensions.<HttpURLConnection>operator_doubleArrow(((HttpURLConnection) _openConnection), _function);
        int _responseCode = con.getResponseCode();
        String _plus = ("Code: " + Integer.valueOf(_responseCode));
        InputOutput.<String>println(_plus);
        int _responseCode_1 = con.getResponseCode();
        String _plus_1 = ("Code: " + Integer.valueOf(_responseCode_1));
        InputOutput.<String>println(_plus_1);
        int _responseCode_2 = con.getResponseCode();
        boolean _notEquals = (_responseCode_2 != 200);
        if (_notEquals) {
          InputStream _errorStream = con.getErrorStream();
          InputStreamReader _inputStreamReader = new InputStreamReader(_errorStream);
          BufferedReader _bufferedReader = new BufferedReader(_inputStreamReader);
          Stream<String> _lines = _bufferedReader.lines();
          Collector<CharSequence, ?, String> _joining = Collectors.joining("\n");
          String _collect = _lines.collect(_joining);
          String _plus_2 = ("Errors: " + _collect);
          InputOutput.<String>println(_plus_2);
        }
        InputStream _inputStream = con.getInputStream();
        InputStreamReader _inputStreamReader_1 = new InputStreamReader(_inputStream);
        BufferedReader _bufferedReader_1 = new BufferedReader(_inputStreamReader_1);
        Stream<String> _lines_1 = _bufferedReader_1.lines();
        Collector<CharSequence, ?, String> _joining_1 = Collectors.joining("\n");
        String _collect_1 = _lines_1.collect(_joining_1);
        String _plus_3 = ("Output: " + _collect_1);
        _xblockexpression = InputOutput.<String>println(_plus_3);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String executeSettingsRequest() {
    try {
      String _xblockexpression = null;
      {
        URL _uRL = new URL("http://localhost:9200/papers/_settings");
        URLConnection _openConnection = _uRL.openConnection();
        final Procedure1<HttpURLConnection> _function = new Procedure1<HttpURLConnection>() {
          public void apply(final HttpURLConnection it) {
            try {
              it.setRequestMethod("PUT");
              it.addRequestProperty("Content-Type", "application/json");
              it.addRequestProperty("Accept", "application/json");
              it.addRequestProperty("ignore_conflicts", "true");
              it.setDoOutput(true);
              OutputStream _outputStream = it.getOutputStream();
              CharSequence _settings = ElasticClient.getSettings();
              String _string = _settings.toString();
              byte[] _bytes = _string.getBytes("UTF-8");
              _outputStream.write(_bytes);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        };
        final HttpURLConnection con = ObjectExtensions.<HttpURLConnection>operator_doubleArrow(((HttpURLConnection) _openConnection), _function);
        int _responseCode = con.getResponseCode();
        String _plus = ("Code: " + Integer.valueOf(_responseCode));
        InputOutput.<String>println(_plus);
        int _responseCode_1 = con.getResponseCode();
        String _plus_1 = ("Code: " + Integer.valueOf(_responseCode_1));
        InputOutput.<String>println(_plus_1);
        int _responseCode_2 = con.getResponseCode();
        boolean _notEquals = (_responseCode_2 != 200);
        if (_notEquals) {
          InputStream _errorStream = con.getErrorStream();
          InputStreamReader _inputStreamReader = new InputStreamReader(_errorStream);
          BufferedReader _bufferedReader = new BufferedReader(_inputStreamReader);
          Stream<String> _lines = _bufferedReader.lines();
          Collector<CharSequence, ?, String> _joining = Collectors.joining("\n");
          String _collect = _lines.collect(_joining);
          String _plus_2 = ("Errors: " + _collect);
          InputOutput.<String>println(_plus_2);
        }
        InputStream _inputStream = con.getInputStream();
        InputStreamReader _inputStreamReader_1 = new InputStreamReader(_inputStream);
        BufferedReader _bufferedReader_1 = new BufferedReader(_inputStreamReader_1);
        Stream<String> _lines_1 = _bufferedReader_1.lines();
        Collector<CharSequence, ?, String> _joining_1 = Collectors.joining("\n");
        String _collect_1 = _lines_1.collect(_joining_1);
        String _plus_3 = ("Output: " + _collect_1);
        _xblockexpression = InputOutput.<String>println(_plus_3);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String executeMappingRequest() {
    try {
      String _xblockexpression = null;
      {
        URL _uRL = new URL("http://localhost:9200/papers/_mapping/paper");
        URLConnection _openConnection = _uRL.openConnection();
        final Procedure1<HttpURLConnection> _function = new Procedure1<HttpURLConnection>() {
          public void apply(final HttpURLConnection it) {
            try {
              it.setRequestMethod("PUT");
              it.addRequestProperty("Content-Type", "application/json");
              it.addRequestProperty("Accept", "application/json");
              it.addRequestProperty("ignore_conflicts", "true");
              it.setDoOutput(true);
              OutputStream _outputStream = it.getOutputStream();
              CharSequence _mappings = ElasticClient.getMappings();
              String _string = _mappings.toString();
              byte[] _bytes = _string.getBytes("UTF-8");
              _outputStream.write(_bytes);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        };
        final HttpURLConnection con = ObjectExtensions.<HttpURLConnection>operator_doubleArrow(((HttpURLConnection) _openConnection), _function);
        int _responseCode = con.getResponseCode();
        String _plus = ("Code: " + Integer.valueOf(_responseCode));
        InputOutput.<String>println(_plus);
        int _responseCode_1 = con.getResponseCode();
        String _plus_1 = ("Code: " + Integer.valueOf(_responseCode_1));
        InputOutput.<String>println(_plus_1);
        int _responseCode_2 = con.getResponseCode();
        boolean _notEquals = (_responseCode_2 != 200);
        if (_notEquals) {
          InputStream _errorStream = con.getErrorStream();
          InputStreamReader _inputStreamReader = new InputStreamReader(_errorStream);
          BufferedReader _bufferedReader = new BufferedReader(_inputStreamReader);
          Stream<String> _lines = _bufferedReader.lines();
          Collector<CharSequence, ?, String> _joining = Collectors.joining("\n");
          String _collect = _lines.collect(_joining);
          String _plus_2 = ("Errors: " + _collect);
          InputOutput.<String>println(_plus_2);
        }
        InputStream _inputStream = con.getInputStream();
        InputStreamReader _inputStreamReader_1 = new InputStreamReader(_inputStream);
        BufferedReader _bufferedReader_1 = new BufferedReader(_inputStreamReader_1);
        Stream<String> _lines_1 = _bufferedReader_1.lines();
        Collector<CharSequence, ?, String> _joining_1 = Collectors.joining("\n");
        String _collect_1 = _lines_1.collect(_joining_1);
        String _plus_3 = ("Output: " + _collect_1);
        _xblockexpression = InputOutput.<String>println(_plus_3);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String executeIndexRequest() {
    try {
      String _xblockexpression = null;
      {
        URL _uRL = new URL("http://localhost:9200/papers");
        URLConnection _openConnection = _uRL.openConnection();
        final Procedure1<HttpURLConnection> _function = new Procedure1<HttpURLConnection>() {
          public void apply(final HttpURLConnection it) {
            try {
              it.setRequestMethod("PUT");
              it.addRequestProperty("Content-Type", "application/json");
              it.addRequestProperty("Accept", "application/json");
              it.setDoOutput(true);
              OutputStream _outputStream = it.getOutputStream();
              CharSequence _request = ElasticClient.getRequest();
              String _string = _request.toString();
              byte[] _bytes = _string.getBytes("UTF-8");
              _outputStream.write(_bytes);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        };
        final HttpURLConnection con = ObjectExtensions.<HttpURLConnection>operator_doubleArrow(((HttpURLConnection) _openConnection), _function);
        int _responseCode = con.getResponseCode();
        String _plus = ("Code: " + Integer.valueOf(_responseCode));
        InputOutput.<String>println(_plus);
        int _responseCode_1 = con.getResponseCode();
        String _plus_1 = ("Code: " + Integer.valueOf(_responseCode_1));
        InputOutput.<String>println(_plus_1);
        int _responseCode_2 = con.getResponseCode();
        boolean _notEquals = (_responseCode_2 != 200);
        if (_notEquals) {
          InputStream _errorStream = con.getErrorStream();
          InputStreamReader _inputStreamReader = new InputStreamReader(_errorStream);
          BufferedReader _bufferedReader = new BufferedReader(_inputStreamReader);
          Stream<String> _lines = _bufferedReader.lines();
          Collector<CharSequence, ?, String> _joining = Collectors.joining("\n");
          String _collect = _lines.collect(_joining);
          String _plus_2 = ("Errors: " + _collect);
          InputOutput.<String>println(_plus_2);
        }
        InputStream _inputStream = con.getInputStream();
        InputStreamReader _inputStreamReader_1 = new InputStreamReader(_inputStream);
        BufferedReader _bufferedReader_1 = new BufferedReader(_inputStreamReader_1);
        Stream<String> _lines_1 = _bufferedReader_1.lines();
        Collector<CharSequence, ?, String> _joining_1 = Collectors.joining("\n");
        String _collect_1 = _lines_1.collect(_joining_1);
        String _plus_3 = ("Output: " + _collect_1);
        _xblockexpression = InputOutput.<String>println(_plus_3);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String executeQueryRequest() {
    try {
      String _xblockexpression = null;
      {
        URL _uRL = new URL("http://localhost:9200/papers/paper/1/_termvector?pretty=true");
        URLConnection _openConnection = _uRL.openConnection();
        final Procedure1<HttpURLConnection> _function = new Procedure1<HttpURLConnection>() {
          public void apply(final HttpURLConnection it) {
            try {
              it.setRequestMethod("GET");
              it.addRequestProperty("Content-Type", "application/json");
              it.addRequestProperty("Accept", "application/json");
              it.setDoOutput(true);
              OutputStream _outputStream = it.getOutputStream();
              CharSequence _queryTerms = ElasticClient.getQueryTerms();
              String _string = _queryTerms.toString();
              byte[] _bytes = _string.getBytes("UTF-8");
              _outputStream.write(_bytes);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        };
        final HttpURLConnection con = ObjectExtensions.<HttpURLConnection>operator_doubleArrow(((HttpURLConnection) _openConnection), _function);
        int _responseCode = con.getResponseCode();
        String _plus = ("Code: " + Integer.valueOf(_responseCode));
        InputOutput.<String>println(_plus);
        int _responseCode_1 = con.getResponseCode();
        boolean _notEquals = (_responseCode_1 != 200);
        if (_notEquals) {
          InputStream _errorStream = con.getErrorStream();
          InputStreamReader _inputStreamReader = new InputStreamReader(_errorStream);
          BufferedReader _bufferedReader = new BufferedReader(_inputStreamReader);
          Stream<String> _lines = _bufferedReader.lines();
          Collector<CharSequence, ?, String> _joining = Collectors.joining("\n");
          String _collect = _lines.collect(_joining);
          String _plus_1 = ("Errors: " + _collect);
          InputOutput.<String>println(_plus_1);
        }
        InputStream _inputStream = con.getInputStream();
        InputStreamReader _inputStreamReader_1 = new InputStreamReader(_inputStream);
        BufferedReader _bufferedReader_1 = new BufferedReader(_inputStreamReader_1);
        Stream<String> _lines_1 = _bufferedReader_1.lines();
        Collector<CharSequence, ?, String> _joining_1 = Collectors.joining("\n");
        String _collect_1 = _lines_1.collect(_joining_1);
        String _plus_2 = ("Output: " + _collect_1);
        _xblockexpression = InputOutput.<String>println(_plus_2);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void useClient() {
    try {
      Settings.Builder _settingsBuilder = Settings.settingsBuilder();
      Settings.Builder _put = _settingsBuilder.put("cluster.name", "elasticsearch");
      final Settings settings = _put.build();
      TransportClient.Builder _builder = TransportClient.builder();
      TransportClient.Builder _settings = _builder.settings(settings);
      TransportClient _build = _settings.build();
      InetAddress _byName = InetAddress.getByName("localhost");
      InetSocketTransportAddress _inetSocketTransportAddress = new InetSocketTransportAddress(_byName, 9200);
      final TransportClient client = _build.addTransportAddress(_inetSocketTransportAddress);
      client.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static CharSequence getQueryTerms() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"fields\" : [\"name\"],");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"offsets\" : true,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"payloads\" : true,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"positions\" : true,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"term_statistics\" : true,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"field_statistics\" : true");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private static CharSequence getRequest() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"mappings\": {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"papers\": {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"mappings\": {");
    _builder.newLine();
    _builder.append("        \t\t\t");
    CharSequence _mappings = ElasticClient.getMappings();
    _builder.append(_mappings, "        \t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("},");
    _builder.newLine();
    _builder.append("\"settings\" : {");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _settings = ElasticClient.getSettings();
    _builder.append(_settings, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private static CharSequence getSettings() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"analysis\": {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"analyzer\": {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"fulltext_analyzer\": {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\"type\": \"custom\",");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\"tokenizer\": \"whitespace\",");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\"filter\": [");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\"lowercase\",");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\"type_as_payload\"");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private static CharSequence getMappings() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"paper\": {");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("\"properties\": {");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"body\": {");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"type\": \"string\"");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"content\": {");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"type\": \"string\",");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"term_vector\": \"with_positions_offsets_payloads\",");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"store\": true,");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"analyzer\": \"fulltext_analyzer\"");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"created_at\": {");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"type\": \"date\",");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"format\": \"dateOptionalTime\"");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"id\": {");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"type\": \"long\"");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"name\": {");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"type\": \"string\",");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"term_vector\": \"with_positions_offsets_payloads\",");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"store\": true,");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"analyzer\": \"fulltext_analyzer\"");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"originator\": {");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"type\": \"string\"");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"paper_type\": {");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"type\": \"string\"");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"published_at\": {");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"type\": \"date\",");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"format\": \"dateOptionalTime\"");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"reference\": {");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"type\": \"string\"");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"resolution\": {");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"type\": \"string\"");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"updated_at\": {");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"type\": \"date\",");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"format\": \"dateOptionalTime\"");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("\"url\": {");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("\"type\": \"string\"");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
