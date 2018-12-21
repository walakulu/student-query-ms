package com.hasitha.studentqueryms;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface StudentConsumerChannel {
    String INPUT ="student-consumer-channel";

    //this is a single value annotation.we can define any string value
    //annotation identifies an input channel, through which received messages enter the application
    //The @Input and @Output annotations can take a channel name as a parameter. If a name is not provided, the name of the annotated method is used.
    @Input(StudentConsumerChannel.INPUT)
    SubscribableChannel student();

    /*
    MessageChannel (for outbound) and its extension, SubscribableChannel, (for inbound).
     */


}