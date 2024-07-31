package com.example.web_socket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Entity
//@Table(name = "ws_message")
//@Data
@Getter
@Setter
public class WSMessage {
    private String sender;

    private String message;
}
