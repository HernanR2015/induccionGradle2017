package co.ceiba.service;


import org.junit.Before;
import org.junit.Test;

import co.ceiba.domain.Person;
import co.ceiba.testDataBuilder.PersonTestDataBuilder;
import jdk.net.NetworkPermission;
import junit.framework.Assert;


public class NotifyPersonServiceTest {
	
	private NotifyPersonService  notifyPersonService;
	private EmailService emailService;
	
	@Before
	public void setup() {
		emailService = new EmailService();
		notifyPersonService = new NotifyPersonService(emailService);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void notifyTest() {
		//Arrange
		Person person = new PersonTestDataBuilder().build();
		//Act
		String message = notifyPersonService.notify(person);
		//Asserts
		Assert.assertNotNull(message); //  deprecated
	}

}
