package ru.stoliarenko.gb.lesson7.client.events;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class ClientParseMessagesEvent {
    private String textMessage;
}
