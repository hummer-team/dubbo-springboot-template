package com.dubbo.template.service.domain.event;

import org.springframework.context.ApplicationEvent;

public class BaseEvent extends ApplicationEvent {
    public BaseEvent(Object source) {
        super(source);
    }
}