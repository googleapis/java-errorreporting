/*
 * Copyright 2020 Google LLC
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
package com.google.cloud.errorreporting.v1beta1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup;
import com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest;
import com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Stackdriver Error Reporting API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcErrorGroupServiceStub extends ErrorGroupServiceStub {

  private static final MethodDescriptor<UpdateGroupRequest, ErrorGroup>
      updateGroupMethodDescriptor =
          MethodDescriptor.<UpdateGroupRequest, ErrorGroup>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.devtools.clouderrorreporting.v1beta1.ErrorGroupService/UpdateGroup")
              .setRequestMarshaller(ProtoUtils.marshaller(UpdateGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(ErrorGroup.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetGroupRequest, ErrorGroup> getGroupMethodDescriptor =
      MethodDescriptor.<GetGroupRequest, ErrorGroup>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(
              "google.devtools.clouderrorreporting.v1beta1.ErrorGroupService/GetGroup")
          .setRequestMarshaller(ProtoUtils.marshaller(GetGroupRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(ErrorGroup.getDefaultInstance()))
          .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<UpdateGroupRequest, ErrorGroup> updateGroupCallable;
  private final UnaryCallable<GetGroupRequest, ErrorGroup> getGroupCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcErrorGroupServiceStub create(ErrorGroupServiceStubSettings settings)
      throws IOException {
    return new GrpcErrorGroupServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcErrorGroupServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcErrorGroupServiceStub(
        ErrorGroupServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcErrorGroupServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcErrorGroupServiceStub(
        ErrorGroupServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcErrorGroupServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcErrorGroupServiceStub(
      ErrorGroupServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcErrorGroupServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcErrorGroupServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcErrorGroupServiceStub(
      ErrorGroupServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<UpdateGroupRequest, ErrorGroup> updateGroupTransportSettings =
        GrpcCallSettings.<UpdateGroupRequest, ErrorGroup>newBuilder()
            .setMethodDescriptor(updateGroupMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpdateGroupRequest>() {
                  @Override
                  public Map<String, String> extract(UpdateGroupRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("group.name", String.valueOf(request.getGroup().getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<GetGroupRequest, ErrorGroup> getGroupTransportSettings =
        GrpcCallSettings.<GetGroupRequest, ErrorGroup>newBuilder()
            .setMethodDescriptor(getGroupMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetGroupRequest>() {
                  @Override
                  public Map<String, String> extract(GetGroupRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("group_name", String.valueOf(request.getGroupName()));
                    return params.build();
                  }
                })
            .build();

    this.updateGroupCallable =
        callableFactory.createUnaryCallable(
            updateGroupTransportSettings, settings.updateGroupSettings(), clientContext);
    this.getGroupCallable =
        callableFactory.createUnaryCallable(
            getGroupTransportSettings, settings.getGroupSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<UpdateGroupRequest, ErrorGroup> updateGroupCallable() {
    return updateGroupCallable;
  }

  public UnaryCallable<GetGroupRequest, ErrorGroup> getGroupCallable() {
    return getGroupCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
