package com.natural.controller;

import com.natural.pojo.Alarm;
import com.natural.service.AlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v2")
public class MongoRestController {

    @Autowired
    private AlarmService alarmService;
    Alarm alarm;

    @GetMapping("/{id}")
    public ResponseEntity<Alarm> getAlarmUri(@PathVariable("id") String id) {
        alarm = alarmService.getAlarm(String.valueOf(id));
        if (null == alarm) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(alarm);
    }

    @GetMapping("/alarm")
    public ResponseEntity<List<Alarm>> listAlarm() {
        List<Alarm> alarms = new ArrayList<>();

        alarms = alarmService.listAllAlarm();

        if (alarms.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(alarms);
    }

    @RequestMapping("/alarm")
    ResponseEntity<Alarm> giveAlarm(@RequestBody Alarm alarm) {
        String bodySiteName = alarm.siteName;
        alarm = alarmService.getAlarmBySiteName(bodySiteName);
        if (null == alarm) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(alarm);
    }

    @PostMapping("/save")
    public ResponseEntity<Alarm> createAlarm(@Validated @RequestBody Alarm alarm) {
        Alarm AlarmCreated = alarmService.createAlarm(alarm);
        return ResponseEntity.status(HttpStatus.CREATED).body(AlarmCreated);
    }


}



