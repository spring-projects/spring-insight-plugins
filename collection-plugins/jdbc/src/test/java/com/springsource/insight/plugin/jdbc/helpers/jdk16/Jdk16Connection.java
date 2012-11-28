/**
 * Copyright (c) 2009-2011 VMware, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.springsource.insight.plugin.jdbc.helpers.jdk16;

import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.NClob;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Struct;
import java.util.Properties;

import com.springsource.insight.plugin.jdbc.helpers.AbstractConnection;

/**
 * 
 */
public class Jdk16Connection extends AbstractConnection {
	public Jdk16Connection () {
		super();
	}

	public <T> T unwrap(Class<T> iface) throws SQLException {
		return null;
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return false;
	}

	public Clob createClob() throws SQLException {
		return null;
	}

	public Blob createBlob() throws SQLException {
		return null;
	}

	public NClob createNClob() throws SQLException {
		return null;
	}

	public SQLXML createSQLXML() throws SQLException {
		return null;
	}

	public boolean isValid(int timeout) throws SQLException {
		return false;
	}

	public void setClientInfo(String name, String value) throws SQLClientInfoException {
		// do nothing
	}

	public void setClientInfo(Properties properties) throws SQLClientInfoException {
		// do nothing
	}

	public String getClientInfo(String name) throws SQLException {
		return null;
	}

	public Properties getClientInfo() throws SQLException {
		return null;
	}

	public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
		return null;
	}

	public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
		return null;
	}
}