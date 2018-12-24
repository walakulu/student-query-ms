package com.hasitha.studentqueryms;

import lombok.Data;

@Data
public class StudentEvent {
    private Student student;
    private EventType eventType;

}
