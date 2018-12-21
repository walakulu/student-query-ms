package com.hasitha.studentqueryms;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.annotation.ServiceActivator;

//get immediate connectivity to a message broker
@EnableBinding({StudentConsumerChannel.class})
public class StudentEventProcessor {

    //An interface declares input and output channel
    //@StreamListener to a method to cause it to receive events for stream processing.
    @StreamListener(StudentConsumerChannel.INPUT)
    public  void  processStudentRequest(Student student){
        System.out.println("Data Received   :" +student);
        if(student.getStudentId().equals("111")){
            throw  new RuntimeException("Testing Error :"+student);
        }
    }
//     destination=channelname+groupName
    @ServiceActivator(inputChannel = StudentConsumerChannel.INPUT+".students-query-ms-group.errors")
    public void error(){

    }
}
