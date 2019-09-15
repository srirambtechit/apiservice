package com.example.apiservice.util;

public class JsonStringBuilder {

  private static final String COLON = ":";
  private static final String DOUBLE_QUOTE = "\"";
  private static final String COMMA = ",";
  private static final String OPEN_CURLY_BRACE = "{";
  private static final String CLOSE_CURLY_BRACE = "}";

  private StringBuilder jsonString = new StringBuilder();

  private int count;

  public JsonStringBuilder start() {
    jsonString.append(OPEN_CURLY_BRACE);
    return this;
  }

  public JsonStringBuilder entry(String key, String value) {
    if (count != 0)
      jsonString.append(COMMA);
    jsonString.append(DOUBLE_QUOTE)
        .append(key)
        .append(DOUBLE_QUOTE)
        .append(COLON)
        .append(DOUBLE_QUOTE)
        .append(value)
        .append(DOUBLE_QUOTE);
    count++;
    return this;
  }

  public JsonStringBuilder end() {
    jsonString.append(CLOSE_CURLY_BRACE);
    return this;
  }

  public String jsonString() {
    return jsonString.toString();
  }

}
