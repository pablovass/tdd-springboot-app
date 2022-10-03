package com.natural.service;

import com.natural.pojo.Alarm;
import org.springframework.stereotype.Service;

import java.util.List;
;

@Service
public interface AlarmService {
    public List<Alarm> listAllAlarm();


    public Alarm createAlarm(Alarm alarm);


    Alarm getAlarm(String id);

    Alarm getAlarmByName(String name);

    Alarm getAlarmBySiteName(String name);
}

