package com.sql.contact;
import org.springframework.stereotype.Component;

/**
 * @author trungnguyen
 */
@Component
public class ContactService {
    public String ping() {
        return "pong";
    }
}