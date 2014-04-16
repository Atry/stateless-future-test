/*
 * Copyright (C) 2012-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package com.qifun.immutableFuture
package test
package run
package noawait

import com.qifun.immutableFuture.test.internal.AsyncId
import AsyncId._
import org.junit.Test

class NoAwaitSpec {
  @Test
  def `async block without await`() {
    def foo = 1
    async {
      foo
      foo
    } mustBe (foo)
  }

  @Test
  def `async block without await 2`() {
    async {
      def x = 0
      if (x > 0) 0 else 1
    } mustBe (1)
  }

  @Test
  def `async expr without await`() {
    def foo = 1
    async(foo) mustBe (foo)
  }
}
