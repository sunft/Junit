package com.sunft.junit4.test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import com.sunft.junit4.User;

/**
 * ���User�Ĳ���
 * @author sunft
 */
public class UserTest {

	@Test
	public void testGetName() {
		assertThat(new User().getName(), is("����ʦ"));
	}

}
