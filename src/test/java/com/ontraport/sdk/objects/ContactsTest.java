package com.ontraport.sdk.objects;

import com.ontraport.sdk.Ontraport;
import com.ontraport.sdk.exceptions.RequiredParamsException;
import com.ontraport.sdk.http.RequestParams;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContactsTest {

    private Ontraport ontraport;

    @Before
    public void setUp() {
        ontraport = new Ontraport("12", "123");
    }

    @Test
    public void testRetrieveOne() throws RequiredParamsException {
        Contacts obj = ontraport.contacts();
        RequestParams map = new RequestParams();
        map.put("id", "970");
        assertEquals(
                "{\"code\": 0, \"data\": {\"id\": \"970\", \"owner\": \"1\", \"firstname\": \"first\", \"lastname\": \"last\", \"email\": \"email@email.com\",}, \"account_id\": \"123\"}",
                obj.retrieveSingle(map).toString());
    }
}
