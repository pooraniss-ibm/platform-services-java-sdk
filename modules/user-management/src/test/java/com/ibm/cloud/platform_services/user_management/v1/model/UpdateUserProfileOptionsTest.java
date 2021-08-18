/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.platform_services.user_management.v1.model;

import com.ibm.cloud.platform_services.user_management.v1.model.UpdateUserProfileOptions;
import com.ibm.cloud.platform_services.user_management.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateUserProfileOptions model.
 */
public class UpdateUserProfileOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateUserProfileOptions() throws Throwable {
    UpdateUserProfileOptions updateUserProfileOptionsModel = new UpdateUserProfileOptions.Builder()
      .accountId("testString")
      .iamId("testString")
      .firstname("testString")
      .lastname("testString")
      .state("testString")
      .email("testString")
      .phonenumber("testString")
      .altphonenumber("testString")
      .photo("testString")
      .build();
    assertEquals(updateUserProfileOptionsModel.accountId(), "testString");
    assertEquals(updateUserProfileOptionsModel.iamId(), "testString");
    assertEquals(updateUserProfileOptionsModel.firstname(), "testString");
    assertEquals(updateUserProfileOptionsModel.lastname(), "testString");
    assertEquals(updateUserProfileOptionsModel.state(), "testString");
    assertEquals(updateUserProfileOptionsModel.email(), "testString");
    assertEquals(updateUserProfileOptionsModel.phonenumber(), "testString");
    assertEquals(updateUserProfileOptionsModel.altphonenumber(), "testString");
    assertEquals(updateUserProfileOptionsModel.photo(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateUserProfileOptionsError() throws Throwable {
    new UpdateUserProfileOptions.Builder().build();
  }

}