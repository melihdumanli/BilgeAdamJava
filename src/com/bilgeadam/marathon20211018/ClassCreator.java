package com.bilgeadam.marathon20211018;

import java.time.LocalDate;
import java.util.List;

public class ClassCreator {
    private String masterTrainer;
    private String assistantTrainer;
    private LecturingClasses lecturingClass;
    private int year;
    private List<Student> studentList;
    private int lecture;
    private String lectureDays;

    public ClassCreator(String masterTrainer, String assistantTrainer, LecturingClasses lecturingClass, int year, List<Student> studentList, int lecture, String lectureDays) {
        this.masterTrainer = masterTrainer;
        this.assistantTrainer = assistantTrainer;
        this.lecturingClass = lecturingClass;
        this.year = year;
        this.studentList = studentList;
        this.lecture = lecture;
        this.lectureDays = lectureDays;
    }

    @Override
    public String toString() {
        return "ClassCreator{" +
                "masterTrainer='" + masterTrainer + '\'' +
                ", assistantTrainer='" + assistantTrainer + '\'' +
                ", lecturingClass=" + lecturingClass +
                ", year=" + year +
                ", lecture=" + lecture +
                ", lectureDays='" + lectureDays + '\'' +
                ", studentList=" + studentList +
                '}';
    }

    public String getMasterTrainer() {
        return masterTrainer;
    }

    public String getAssistantTrainer() {
        return assistantTrainer;
    }

    public LecturingClasses getLecturingClass() {
        return lecturingClass;
    }

    public int getYear() {
        return year;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public int getLecture() {
        return lecture;
    }

    public String getLectureDays() {
        return lectureDays;
    }
}
