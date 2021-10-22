package com.bilgeadam.marathon20211018;

import com.bilgeadam.BAUtils.BAUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MarathonMethods {
    private static int UserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nLütfen Yapmak İstediğiniz İşlemi Seçiniz:\n");
        System.out.println("1.) ..... Yeni Çalışan\n2.) ..... Çalışan Listesi\n3.) ..... Eski Çalışanlar\n4.) ..... Yeni Sınıf\n5.) ..... Öğrenci Atama\n6.) ..... Sınıf Listesi\n7.) ..... Öğrencinin Sınıfları\n8.) ..... Hediye Listesi\n9.) ..... Maaş Listesi\n10.) .... Uygulamadan Çıkış");
        return scanner.nextInt();
    }

    public static final String CURRENT_PATH() {
        return "C:\\bilgeadam\\currentemployeelist.txt";
    }

    public static final String FORMER_PATH() {
        return "C:\\bilgeadam\\formeremployeelist.txt";
    }

    public static final String STUDENTS_PATH() {
        return "C:\\bilgeadam\\studentslist.txt";
    }

    public static final String CLASSES_PATH() {
        return "C:\\bilgeadam\\classeslist.txt";
    }

    public static void AllMethods() throws IOException {
        int choice = UserChoice();
        switch (choice) {
            case 1: {
                NewEmployee.NewEmployee();
                break;
            }
            case 2: {
                ShowEmployeeList();
                break;
            }
            case 3: {
                FormerEmployeeList();
                ReadFormerEmployeeList();
                break;
            }
            case 4: {
                NewClass();
                break;
            }
            case 5: {
                AssignStudent();
                break;
            }
            case 6: {
                ClassesList();
                break;
            }
            case 7: {
                ShowStudentClasses();
                break;
            }
            case 8: {
                GiftList();
                break;
            }
            case 9: {
                SalaryList();
                break;
            }
            case 10: {
                ExitRequest.ExitRequest();
                break;
            }
            default:
                System.out.println("Hatalı Giriş Yaptınız...");
        }
    }


    private static void SalaryList() throws IOException {
        for (int i = 0; i < NewEmployee.TeachersList().size(); i++)
            System.out.println(NewEmployee.TeachersList().get(i).getName() + " " + NewEmployee.TeachersList().get(i).getMiddleName() + " " + NewEmployee.TeachersList().get(i).getSurname() + " " + NewEmployee.TeachersList().get(i).getSalary());
        for (int i = 0; i < NewEmployee.StaffList().size(); i++)
            System.out.println(NewEmployee.StaffList().get(i).getName() + " " + NewEmployee.StaffList().get(i).getMiddleName() + " " + NewEmployee.StaffList().get(i).getSurname() + " " + NewEmployee.StaffList().get(i).getSalary());
        for (int i = 0; i < NewEmployee.OfficersList().size(); i++)
            System.out.println(NewEmployee.OfficersList().get(i).getName() + " " + NewEmployee.OfficersList().get(i).getMiddleName() + " " + NewEmployee.OfficersList().get(i).getSurname() + " " + NewEmployee.OfficersList().get(i).getSalary());

        AllMethods();
    }

    private static void GiftList() throws IOException {
        for (int i = 0; i < NewEmployee.TeachersList().size(); i++) {
            if (NewEmployee.TeachersList().get(i).getBirthDate().getMonth().equals(LocalDate.now().getMonth()))
                System.out.println(NewEmployee.TeachersList().get(i).getName() + " " + NewEmployee.TeachersList().get(i).getMiddleName() + " " + NewEmployee.TeachersList().get(i).getSurname() + " " + NewEmployee.TeachersList().get(i).getBirthDate());
        }
        for (int i = 0; i < NewEmployee.StaffList().size(); i++) {
            if (NewEmployee.StaffList().get(i).getBirthDate().getMonth().equals(LocalDate.now().getMonth()))
                System.out.println(NewEmployee.StaffList().get(i).getName() + " " + NewEmployee.StaffList().get(i).getMiddleName() + " " + NewEmployee.StaffList().get(i).getSurname() + " " + NewEmployee.StaffList().get(i).getBirthDate());
        }
        for (int i = 0; i < NewEmployee.OfficersList().size(); i++) {
            if (NewEmployee.OfficersList().get(i).getBirthDate().getMonth().equals(LocalDate.now().getMonth()))
                System.out.println(NewEmployee.OfficersList().get(i).getName() + " " + NewEmployee.OfficersList().get(i).getMiddleName() + " " + NewEmployee.OfficersList().get(i).getSurname() + " " + NewEmployee.OfficersList().get(i).getBirthDate());
        }
        AllMethods();
    }

    private static void ShowStudentClasses() {

    }

    private static void ClassesList() {

    }

    private static void AssignStudent() {


    }

    private static void NewClass() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Sicil Numaranızı Giriniz: ");
        String regNum = scanner.nextLine();
        if (!regNum.contains("M"))
            System.out.println("Yalnızca Memurlar Sınıf Açabilir.");
        else
            ClassGenerator();
        AllMethods();
    }


    private static void ReadFormerEmployeeList() throws IOException {
        //ReadFormers();
        File file = new File(FORMER_PATH());
        try {
            if (!file.exists())
                System.out.println("Dosya Bulunamadı!");
            else {
                List<String> lines = Files.readAllLines(Paths.get(FORMER_PATH()));
                lines.forEach(System.out::println);
                System.out.println("Personel Listesi Yukarıda Gösterilmiştir...\n");
            }
        } catch (NoSuchFileException e) {
            System.out.println("Dosya Bulunamadı!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            AllMethods();
        }

    }

    private static void ShowEmployeeList() throws IOException {
        File file = new File(CURRENT_PATH());
        try {
            if (!file.exists())
                System.out.println("Dosya Bulunamadı!");
            else {
                List<String> lines = Files.readAllLines(Paths.get(CURRENT_PATH()));
                lines.forEach(System.out::println);
                System.out.println("Personel Listesi Yukarıda Gösterilmiştir...\n");
            }
        } catch (NoSuchFileException e) {
            System.out.println("Dosya Bulunamadı!");
        } finally {
            AllMethods();
        }
    }


    public static List<Student> StudentsList() {
        List<Student> studentList = new ArrayList<Student>();
        Student student1 = new Student(null, StudentRegNumCreator(), "Hakan", "", "ÇOLAK", "Erkek", false, LocalDate.of(1998, 5, 21), LocalDate.of(2005, 9, 15), null, "5331234567", "5333216549", "2122528521");
        studentList.add(student1);
        Student student2 = new Student(null, StudentRegNumCreator(), "Bade", "Gül", "NAZ", "Kadın", false, LocalDate.of(1997, 12, 30), LocalDate.of(2005, 9, 14), null, "5335469874", "5335642135", "2167854123");
        studentList.add(student2);
        Student student3 = new Student(null, StudentRegNumCreator(), "Semih", "", "ŞAHİN", "Erkek", false, LocalDate.of(1998, 5, 21), LocalDate.of(2005, 9, 15), null, "5331234567", "5333216549", "2122528521");
        studentList.add(student3);
        Student student4 = new Student(null, StudentRegNumCreator(), "Metin", "", "GÖÇER", "Erkek", false, LocalDate.of(1998, 5, 21), LocalDate.of(2005, 9, 15), null, "5331234567", "5333216549", "2122528521");
        studentList.add(student4);
        Student student5 = new Student(null, StudentRegNumCreator(), "Mehmet", "Emin", "KARAMEHMET", "Erkek", false, LocalDate.of(1999, 1, 1), LocalDate.of(2005, 9, 15), null, "5331234567", "5333216549", "2122528521");
        studentList.add(student5);
        Student student6 = new Student(null, StudentRegNumCreator(), "Hasan", "Ali", "YALÇIN", "Erkek", false, LocalDate.of(1997, 12, 11), LocalDate.of(2005, 9, 15), null, "5331234567", "5333216549", "2122528521");
        studentList.add(student6);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(STUDENTS_PATH(), true))) {
            for (int i = 0; i < studentList.size(); i++) {
                bufferedWriter.write(studentList.get(i).toString());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    private static String StudentRegNumCreator() {
        return "---";
    }


    public static List<Person> FormerEmployeeList() throws IOException {
        List<Person> personList = new ArrayList<Person>();
        Teacher teacher1 = new Teacher("Ö-" + RegNumCreator(), "Hasan", "Hüseyin", "ERSÖZ", "Erkek", false, LocalDate.of(1964, 9, 21), LocalDate.of(1989, 8, 15), LocalDate.of(2019, 6, 15), "5055558585", "2122223344", 2500.0);
        personList.add(teacher1);
        Teacher teacher2 = new Teacher("Ö-" + RegNumCreator(), "Kutkan", "", "KARAOĞLAN", "Erkek", false, LocalDate.of(1984, 2, 14), LocalDate.of(2004, 9, 1), LocalDate.of(2009, 6, 12), "5355456789", "2123456789", 2200.0);
        personList.add(teacher2);
        Teacher teacher3 = new Teacher("Ö-" + RegNumCreator(), "Ebrar", "", "KARAKURT", "Kadın", false, LocalDate.of(1992, 4, 7), LocalDate.of(2018, 1, 1), LocalDate.of(2020, 3, 28), "5439876543", "2129876543", 3500.0);
        personList.add(teacher3);
        Staff staff1 = new Staff("H-" + RegNumCreator(), "Volkan", "", "KONAK", "Erkek", true, LocalDate.of(1963, 8, 17), LocalDate.of(1994, 12, 15), LocalDate.of(2020, 3, 25), "5559876543", "2169876543", 3750.0);
        personList.add(staff1);
        Staff staff2 = new Staff("H-" + RegNumCreator(), "Yasemin", "", "YALÇIN", "Kadın", true, LocalDate.of(1985, 5, 12), LocalDate.of(2009, 9, 10), LocalDate.of(2019, 11, 13), "5321234567", "2161234567", 2800.0);
        personList.add(staff2);
        Officer officer1 = new Officer("M-" + RegNumCreator(), "Merve", "Nur", "EROĞLU", "Kadın", true, LocalDate.of(1988, 6, 15), LocalDate.of(2019, 12, 20), LocalDate.of(2021, 1, 1), "5325678945", "2164567890", 2200.0);
        personList.add(officer1);
        Officer officer2 = new Officer("M-" + RegNumCreator(), "Alper", "Yağız", "ALP", "Erkek", true, LocalDate.of(1988, 7, 23), LocalDate.of(2018, 8, 10), LocalDate.of(2019, 12, 30), "5325432165", "2127894561", 2350.0);
        personList.add(officer2);
        File file = new File(FORMER_PATH());

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FORMER_PATH(), true))) {
            if (!file.exists()) {
                for (int i = 0; i < personList.size(); i++) {
                    bufferedWriter.write(personList.get(i).toString());
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                }
            } else {
                List<String> formerPersonList = Files.readAllLines(Paths.get(CURRENT_PATH()));
                formerPersonList.forEach(System.out::println);
                System.out.println("Personel Listesi Yukarıda Gösterilmiştir...\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            AllMethods();
        }
        return personList;
    }

    /*private static void ReadFormers() {
        List<Person> formerList = FormerEmployeeList();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FORMER_PATH(), true))) {
            for (int i = 0; i < formerList.size(); i++) {
                bufferedWriter.write(formerList.get(i).toString());
                bufferedWriter.flush();
            }
            *//*bufferedWriter.write(teacher1.toString());
            bufferedWriter.write(teacher2.toString());
            bufferedWriter.write(teacher3.toString());
            bufferedWriter.write(staff1.toString());
            bufferedWriter.write(staff2.toString());
            bufferedWriter.write(officer1.toString());
            bufferedWriter.write(officer2.toString());
            bufferedWriter.flush();*//*
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }*/

    private static void ClassGenerator() {
        File file = new File(CLASSES_PATH());
        List<ClassCreator> classesList = new ArrayList<>();
        ClassCreator classCreator = new ClassCreator(MasterTrainerAssignment().getName() + " " + MasterTrainerAssignment().getMiddleName() + " " + MasterTrainerAssignment().getSurname(), AssistantTrainerAssignment().getName() + " " + AssistantTrainerAssignment().getMiddleName() + " " + AssistantTrainerAssignment().getSurname(), LecturingClassAssignment(), LectureDate(), null, BAUtils.readInt("Lütfen Haftalık Ders Saatini Giriniz"), Days());
        classesList.add(classCreator);
        try {
            if (!file.exists()) {
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(CLASSES_PATH(), true))) {
                    for (int i = 0; i < classesList.size(); i++) {
                        bufferedWriter.write(classesList.get(i).toString());
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                List<String> classList = Files.readAllLines(Paths.get(CLASSES_PATH()));
                classList.add(classCreator.toString());
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(CLASSES_PATH(), true))) {
                    for (int i = 0; i < classesList.size(); i++) {
                        bufferedWriter.write(classesList.get(i).toString());
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Student> StudentAssignment() {
        Scanner scanner = new Scanner(System.in);
        List<Student> assignmentList = new ArrayList<>();
        System.out.println("Lütfen Derse Eklemek İstediğiniz Öğrenci Sayısını Belirtiniz: ");
        int studentNumber = scanner.nextInt();
        for (int i = 0; i < studentNumber; i++) {
            System.out.println("Lütfen Aşağıdaki Listeden Derse Kayıt Etmek İstediğiniz Öğrenciyi Seçiniz: ");
            for (int j = 0; j < StudentsList().size(); j++) {
                System.out.println((j + 1) + ". " + StudentsList().get(j));
            }
            int choice = scanner.nextInt();
            assignmentList.add(StudentsList().get(choice));
        }
        return assignmentList;
    }

    private static Teacher MasterTrainerAssignment() {
        Scanner scanner = new Scanner(System.in);
        Teacher masterTrainer;
        System.out.println("Lütfen Aşağıdaki Listeden Derse Atamak İstediğiniz Asıl Öğretmeni Seçiniz: ");
        for (int i = 0; i < NewEmployee.TeachersList().size(); i++) {
            System.out.println((i + 1) + ". " + NewEmployee.TeachersList().get(i));
        }
        int choice = scanner.nextInt();
        masterTrainer = NewEmployee.TeachersList().get(choice);

        return masterTrainer;
    }

    private static Teacher AssistantTrainerAssignment() {
        Scanner scanner = new Scanner(System.in);
        Teacher assistantTrainer;
        System.out.println("Lütfen Aşağıdaki Listeden Derse Atamak İstediğiniz Yedek Öğretmeni Seçiniz: ");
        for (int i = 0; i < NewEmployee.TeachersList().size(); i++) {
            System.out.println((i + 1) + ". " + NewEmployee.TeachersList().get(i));
        }
        int choice = scanner.nextInt();
        assistantTrainer = NewEmployee.TeachersList().get(choice);

        return assistantTrainer;
    }

    private static LecturingClasses LecturingClassAssignment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Aşağıdaki Listeden Atamak İstediğiniz Dersi Seçiniz: ");
        for (int i = 0; i < LecturingClasses.values().length; i++) {
            System.out.println((i + 1) + ". " + Arrays.asList(LecturingClasses.values()).get(i));
        }
        int choice = scanner.nextInt();
        return Arrays.asList(LecturingClasses.values()).get(choice - 1);
    }

    private static int LectureDate() {
        LocalDate startDate = LocalDate.of(BAUtils.readInt("Ders Başlangıç Yılını Giriniz"), 1, 1);
        return startDate.getYear();
    }

    private static String Days() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat();
        String[] days = sdf.getDateFormatSymbols().getWeekdays();
        System.out.println("Lütfen Ders Gününü Giriniz");
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + ". " + days[i]);
        }
        String day = scanner.next();
        return day;

    }

    public static String RegNumCreator() {
        List<String> regNumbersList = new ArrayList<String>();
        int counter = 1;
        String regNum = String.format("%03d", counter);
        regNumbersList.add(regNum);
        return regNumbersList.get(regNumbersList.size() - 1);
    }

}
