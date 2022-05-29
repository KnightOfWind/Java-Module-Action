/**
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.knight.app

import com.knight.App
import com.knight.app.UserAppService
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import spock.lang.Specification

import javax.annotation.Resource


/**
 *
 * @author wss
 * @date 2022/5/28 7:32 PM
 */
@SpringBootTest(classes = [App.class])
@RunWith(SpringRunner.class)
class UserAppServiceTest extends Specification {

    @Resource
    UserAppService userAppService

    def "test_query_user"() {
        given:
        def userId = 1

        when:
        def user = userAppService.queryUser(userId)

        then:
        user != null
    }
}