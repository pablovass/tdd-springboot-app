package com.natural.service;

import com.natural.pojo.Alarm;
import com.natural.repository.AlarmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlarmServiceImpl implements AlarmService {
    @Autowired
    private AlarmRepository alarmRepository;


    @Override
    public List<Alarm> listAllAlarm() {
        return alarmRepository.findAll();
    }


    @Override
    public Alarm createAlarm(Alarm alarm) {
        return alarmRepository.save(alarm);
    }

    @Override
    public Alarm getAlarm(String id) {

        return alarmRepository.findById(id).orElse(null);
    }

    @Override
    public Alarm getAlarmByName(String name) {
        return alarmRepository.findItemByName(name);

    }

    @Override
    public Alarm getAlarmBySiteName(String siteName) {
        return alarmRepository.findBySiteName(siteName);
    }


}
