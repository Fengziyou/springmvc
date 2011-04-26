package com.esen.service;

import org.springframework.stereotype.Service;

import com.esen.entity.Schedule;

@Service
public class ScheduleService {
	public Schedule createSchedule() {
		Schedule s = new Schedule();
		s.setCreator("sam");
		return s;
	}
	public void addSchedule(Schedule schedule) {
		System.err.println(schedule);
	}
}
