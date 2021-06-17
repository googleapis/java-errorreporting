/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.devtools.clouderrorreporting.v1beta1;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class ErrorGroupServiceClientTest {
  private static MockErrorGroupService mockErrorGroupService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private ErrorGroupServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockErrorGroupService = new MockErrorGroupService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockErrorGroupService));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    ErrorGroupServiceSettings settings =
        ErrorGroupServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ErrorGroupServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getGroupTest() throws Exception {
    ErrorGroup expectedResponse =
        ErrorGroup.newBuilder()
            .setName(ErrorGroupName.of("[PROJECT]", "[GROUP]").toString())
            .setGroupId("groupId293428218")
            .addAllTrackingIssues(new ArrayList<TrackingIssue>())
            .setResolutionStatus(ResolutionStatus.forNumber(0))
            .build();
    mockErrorGroupService.addResponse(expectedResponse);

    ErrorGroupName groupName = ErrorGroupName.of("[PROJECT]", "[GROUP]");

    ErrorGroup actualResponse = client.getGroup(groupName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockErrorGroupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetGroupRequest actualRequest = ((GetGroupRequest) actualRequests.get(0));

    Assert.assertEquals(groupName.toString(), actualRequest.getGroupName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockErrorGroupService.addException(exception);

    try {
      ErrorGroupName groupName = ErrorGroupName.of("[PROJECT]", "[GROUP]");
      client.getGroup(groupName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getGroupTest2() throws Exception {
    ErrorGroup expectedResponse =
        ErrorGroup.newBuilder()
            .setName(ErrorGroupName.of("[PROJECT]", "[GROUP]").toString())
            .setGroupId("groupId293428218")
            .addAllTrackingIssues(new ArrayList<TrackingIssue>())
            .setResolutionStatus(ResolutionStatus.forNumber(0))
            .build();
    mockErrorGroupService.addResponse(expectedResponse);

    String groupName = "groupName-1483174486";

    ErrorGroup actualResponse = client.getGroup(groupName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockErrorGroupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetGroupRequest actualRequest = ((GetGroupRequest) actualRequests.get(0));

    Assert.assertEquals(groupName, actualRequest.getGroupName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getGroupExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockErrorGroupService.addException(exception);

    try {
      String groupName = "groupName-1483174486";
      client.getGroup(groupName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateGroupTest() throws Exception {
    ErrorGroup expectedResponse =
        ErrorGroup.newBuilder()
            .setName(ErrorGroupName.of("[PROJECT]", "[GROUP]").toString())
            .setGroupId("groupId293428218")
            .addAllTrackingIssues(new ArrayList<TrackingIssue>())
            .setResolutionStatus(ResolutionStatus.forNumber(0))
            .build();
    mockErrorGroupService.addResponse(expectedResponse);

    ErrorGroup group = ErrorGroup.newBuilder().build();

    ErrorGroup actualResponse = client.updateGroup(group);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockErrorGroupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateGroupRequest actualRequest = ((UpdateGroupRequest) actualRequests.get(0));

    Assert.assertEquals(group, actualRequest.getGroup());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockErrorGroupService.addException(exception);

    try {
      ErrorGroup group = ErrorGroup.newBuilder().build();
      client.updateGroup(group);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
