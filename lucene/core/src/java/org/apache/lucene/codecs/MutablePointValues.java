/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.lucene.codecs;

import org.apache.lucene.index.PointValues;
import org.apache.lucene.util.BytesRef;

/**
 * {@link PointValues} whose order of points can be changed. This class is useful for codecs to
 * optimize flush.
 *
 * @lucene.internal
 */
public abstract class MutablePointValues extends PointValues {

  /** Sole constructor. */
  protected MutablePointValues() {}

  /** Set {@code packedValue} with a reference to the packed bytes of the i-th value. */
  public abstract void getValue(int i, BytesRef packedValue);

  /** Get the k-th byte of the i-th value. */
  public abstract byte getByteAt(int i, int k);

  /** Return the doc ID of the i-th value. */
  public abstract int getDocID(int i);

  /** Swap the i-th and j-th values. */
  public abstract void swap(int i, int j);

  /** Save the i-th value into the j-th position in temporary storage. */
  public abstract void save(int i, int j);

  /** Restore values between i-th and j-th(excluding) in temporary storage into original storage. */
  public abstract void restore(int i, int j);
}
