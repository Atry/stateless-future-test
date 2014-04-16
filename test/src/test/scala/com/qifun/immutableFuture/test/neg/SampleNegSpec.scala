/*
 * Copyright (C) 2012-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package com.qifun.immutableFuture
package test
package neg

import org.junit.Test

class SampleNegSpec {
  @Test
  def `missing symbol`() {
    expectError("not found: value kaboom") {
      """
        | kaboom
      """.stripMargin
    }
  }
}
