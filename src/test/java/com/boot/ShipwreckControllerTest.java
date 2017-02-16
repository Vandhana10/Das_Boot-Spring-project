package com.boot;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipweckRepository;

public class ShipwreckControllerTest {
	@InjectMocks
	private ShipwreckController sc;
	@Mock
	private ShipweckRepository shipwreckRepository;
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
	}
@Test
public void testShipwreckGet(){
	Shipwreck sw=new Shipwreck();
	sw.setId(1L);
	when(shipwreckRepository.findOne(1L)).thenReturn(sw);
	
	
	Shipwreck wreck=sc.get(1L);
	verify(shipwreckRepository).findOne(1L);
	//assertEquals(1L,wreck.getId().longValue());
	assertThat(wreck.getId(),is(1L));
}
}
