/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.jim.wx.gradle.digest;

import java.nio.charset.Charset;

/**
 * Converts String to and from bytes using the encodings required by the Java specification. These encodings are
 * specified in <a href="http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">
 * Standard charsets</a>.
 * <p>
 * <p>This class is immutable and thread-safe.</p>
 *
 * @version $Id: StringUtils.java 1634456 2014-10-27 05:26:56Z ggregory $
 * @see <a href="http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
 * @since 1.4
 */
class StringUtils {

    /**
     * Calls {@link String#getBytes(Charset)}
     *
     * @param string  The string to encode (if null, return null).
     * @param charset The {@link Charset} to encode the <code>String</code>
     * @return the encoded bytes
     */
    private static byte[] getBytes(final String string, final Charset charset) {
        if (string == null) {
            return null;
        }
        return string.getBytes(charset);
    }

    /**
     * Encodes the given string into a sequence of bytes using the UTF-8 charset, storing the result into a new byte
     * array.
     *
     * @param string the String to encode, may be <code>null</code>
     * @return encoded bytes, or <code>null</code> if the input string was <code>null</code>
     * @throws NullPointerException Thrown if {@link Charsets#UTF_8} is not initialized, which should never happen since it is
     *                              required by the Java platform specification.
     * @see <a href="http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @since As of 1.7, throws {@link NullPointerException} instead of UnsupportedEncodingException
     */
    public static byte[] getBytesUtf8(final String string) {
        return getBytes(string, Charsets.UTF_8);
    }

}