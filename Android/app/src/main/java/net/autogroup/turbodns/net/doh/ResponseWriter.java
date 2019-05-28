/*
Copyright 2018 Jigsaw Operations LLC

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package net.autogroup.turbodns.net.doh;

import net.autogroup.turbodns.net.dns.DnsUdpQuery;

/**
 * Interface representing the ability to receive DNS responses.
 */
public interface ResponseWriter {
  /**
   * @param query The query that was sent.
   * @param transaction The record of the transaction, including the response if any.
   */
  void sendResult(DnsUdpQuery query, Transaction transaction);
}
