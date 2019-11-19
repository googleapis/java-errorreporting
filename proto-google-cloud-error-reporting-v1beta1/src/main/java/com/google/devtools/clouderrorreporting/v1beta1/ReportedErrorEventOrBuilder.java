/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouderrorreporting/v1beta1/report_errors_service.proto

package com.google.devtools.clouderrorreporting.v1beta1;

public interface ReportedErrorEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Time when the event occurred.
   * If not provided, the time when the event was received by the
   * Error Reporting system will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean hasEventTime();
  /**
   *
   *
   * <pre>
   * Optional. Time when the event occurred.
   * If not provided, the time when the event was received by the
   * Error Reporting system will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.Timestamp getEventTime();
  /**
   *
   *
   * <pre>
   * Optional. Time when the event occurred.
   * If not provided, the time when the event was received by the
   * Error Reporting system will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The service context in which this error has occurred.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ServiceContext service_context = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean hasServiceContext();
  /**
   *
   *
   * <pre>
   * Required. The service context in which this error has occurred.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ServiceContext service_context = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ServiceContext getServiceContext();
  /**
   *
   *
   * <pre>
   * Required. The service context in which this error has occurred.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ServiceContext service_context = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ServiceContextOrBuilder
      getServiceContextOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The error message.
   * If no `context.reportLocation` is provided, the message must contain a
   * header (typically consisting of the exception type name and an error
   * message) and an exception stack trace in one of the supported programming
   * languages and formats.
   * Supported languages are Java, Python, JavaScript, Ruby, C#, PHP, and Go.
   * Supported stack trace formats are:
   * * **Java**: Must be the return value of
   * [`Throwable.printStackTrace()`](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#printStackTrace%28%29).
   * * **Python**: Must be the return value of
   * [`traceback.format_exc()`](https://docs.python.org/2/library/traceback.html#traceback.format_exc).
   * * **JavaScript**: Must be the value of
   * [`error.stack`](https://github.com/v8/v8/wiki/Stack-Trace-API) as returned
   * by V8.
   * * **Ruby**: Must contain frames returned by
   * [`Exception.backtrace`](https://ruby-doc.org/core-2.2.0/Exception.html#method-i-backtrace).
   * * **C#**: Must be the return value of
   * [`Exception.ToString()`](https://msdn.microsoft.com/en-us/library/system.exception.tostring.aspx).
   * * **PHP**: Must start with `PHP (Notice|Parse error|Fatal error|Warning)`
   * and contain the result of
   * [`(string)$exception`](http://php.net/manual/en/exception.tostring.php).
   * * **Go**: Must be the return value of
   * [`runtime.Stack()`](https://golang.org/pkg/runtime/debug/#Stack).
   * </pre>
   *
   * <code>string message = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getMessage();
  /**
   *
   *
   * <pre>
   * Required. The error message.
   * If no `context.reportLocation` is provided, the message must contain a
   * header (typically consisting of the exception type name and an error
   * message) and an exception stack trace in one of the supported programming
   * languages and formats.
   * Supported languages are Java, Python, JavaScript, Ruby, C#, PHP, and Go.
   * Supported stack trace formats are:
   * * **Java**: Must be the return value of
   * [`Throwable.printStackTrace()`](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#printStackTrace%28%29).
   * * **Python**: Must be the return value of
   * [`traceback.format_exc()`](https://docs.python.org/2/library/traceback.html#traceback.format_exc).
   * * **JavaScript**: Must be the value of
   * [`error.stack`](https://github.com/v8/v8/wiki/Stack-Trace-API) as returned
   * by V8.
   * * **Ruby**: Must contain frames returned by
   * [`Exception.backtrace`](https://ruby-doc.org/core-2.2.0/Exception.html#method-i-backtrace).
   * * **C#**: Must be the return value of
   * [`Exception.ToString()`](https://msdn.microsoft.com/en-us/library/system.exception.tostring.aspx).
   * * **PHP**: Must start with `PHP (Notice|Parse error|Fatal error|Warning)`
   * and contain the result of
   * [`(string)$exception`](http://php.net/manual/en/exception.tostring.php).
   * * **Go**: Must be the return value of
   * [`runtime.Stack()`](https://golang.org/pkg/runtime/debug/#Stack).
   * </pre>
   *
   * <code>string message = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getMessageBytes();

  /**
   *
   *
   * <pre>
   * Optional. A description of the context in which the error occurred.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ErrorContext context = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean hasContext();
  /**
   *
   *
   * <pre>
   * Optional. A description of the context in which the error occurred.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ErrorContext context = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ErrorContext getContext();
  /**
   *
   *
   * <pre>
   * Optional. A description of the context in which the error occurred.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ErrorContext context = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ErrorContextOrBuilder getContextOrBuilder();
}
