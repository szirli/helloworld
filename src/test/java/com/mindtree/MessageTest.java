package com.mindtree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mindtreeco.mindtree.app.MessageClass;

public class MessageTest {

	@Test
	public void testMessage() {
		MessageClass message = new MessageClass();
		assertEquals("Hello World!!", message.getMessage());
	}
}
