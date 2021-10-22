package com.bilgeadam.marathon20211018;

import com.bilgeadam.BAUtils.BAUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewEmployee {


    public static void NewEmployee() throws IOException {
        Scanner scanner = new Scanner(System.in);
        //int regnum =
        System.out.println("\nLütfen Çalışan Türünü Seçiniz:\n");
        System.out.println("1.) ..... Öğretmen\n2.) ..... Memur\n3.) ..... Hizmetli");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                NewTeacher();
                break;
            }
            case 2: {
                NewOfficer();
                break;
            }
            case 3: {
                NewStaff();
                break;
            }
        }
        MarathonMethods.AllMethods();
    }

    private static void NewStaff() throws IOException {

        Staff staff = new Staff("H-" + MarathonMethods.RegNumCreator(), BAUtils.readString("Adı"), BAUtils.readString("Göbek Adı"), BAUtils.readString("Soyadı"), BAUtils.readString("Cinsiteyi "), IsMarried("Evlilik Durumu (Evli/Bekar)"), BirthDate(), StartDate(), QuitDate(), PhoneNumbers("Lütfen Cep Telefonu Numarasını Başında Sıfır Olmadan Tuşlayınız :"), PhoneNumbers("Lütfen Ev Telefonu Numarasını Başında Sıfır Olmadan Tuşlayınız :"), BAUtils.readDouble("Lütfen Maaş Tutarını Giriniz"));

        Scanner scanner = new Scanner(System.in);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MarathonMethods.CURRENT_PATH(), true))) {
            bufferedWriter.write(staff.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
            System.out.println("Yeni Hizmetli Eklendi...\n");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            scanner.close();
            MarathonMethods.AllMethods();
        }
    }

    private static void NewOfficer() throws IOException {
        Officer officer = new Officer("M-" + MarathonMethods.RegNumCreator(), BAUtils.readString("Adı"), BAUtils.readString("Göbek Adı"), BAUtils.readString("Soyadı"), BAUtils.readString("Cinsiteyi "), IsMarried("Evlilik Durumu (Evli/Bekar)"), BirthDate(), StartDate(), QuitDate(), PhoneNumbers("Lütfen Cep Telefonu Numarasını Başında Sıfır Olmadan Tuşlayınız :"), PhoneNumbers("Lütfen Ev Telefonu Numarasını Başında Sıfır Olmadan Tuşlayınız :"), BAUtils.readDouble("Lütfen Maaş Tutarını Giriniz"));
        Scanner scanner = new Scanner(System.in);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MarathonMethods.CURRENT_PATH(), true))) {
            bufferedWriter.write(officer.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
            System.out.println("Yeni Memur Eklendi...\n");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            scanner.close();
            MarathonMethods.AllMethods();
        }
    }

    private static void NewTeacher() throws IOException {
        Teacher teacher = new Teacher("Ö-" + MarathonMethods.RegNumCreator(), BAUtils.readString("Adı"), BAUtils.readString("Göbek Adı"), BAUtils.readString("Soyadı"), BAUtils.readString("Cinsiteyi "), IsMarried("Evlilik Durumu (Evli/Bekar)"), BirthDate(), StartDate(), QuitDate(), PhoneNumbers("Lütfen Cep Telefonu Numarasını Başında Sıfır Olmadan Tuşlayınız :"), PhoneNumbers("Lütfen Ev Telefonu Numarasını Başında Sıfır Olmadan Tuşlayınız :"), BAUtils.readDouble("Lütfen Maaş Tutarını Giriniz"));
        TeachersList().add(teacher);
        Scanner scanner = new Scanner(System.in);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MarathonMethods.CURRENT_PATH(), true))) {
            bufferedWriter.write(teacher.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
            System.out.println("Yeni Öğretmen Eklendi...\n");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            scanner.close();
            MarathonMethods.AllMethods();
        }
    }

    public static List<Teacher> TeachersList() {
        List<Teacher> teachersList = new ArrayList<Teacher>();
        Teacher teacher1 = new Teacher("Ö-" + MarathonMethods.RegNumCreator(), "Hasan", "Hüseyin", "ERSÖZ", "Erkek", false, LocalDate.of(1964, 9, 21), LocalDate.of(1989, 8, 15), LocalDate.of(2019, 6, 15), "5055558585", "2122223344", 2500.0);
        teachersList.add(teacher1);
        Teacher teacher2 = new Teacher("Ö-" + MarathonMethods.RegNumCreator(), "Kutkan", "", "KARAOĞLAN", "Erkek", false, LocalDate.of(1984, 2, 14), LocalDate.of(2004, 9, 1), LocalDate.of(2009, 6, 12), "5355456789", "2123456789", 2200.0);
        teachersList.add(teacher2);
        Teacher teacher3 = new Teacher("Ö-" + MarathonMethods.RegNumCreator(), "Ebrar", "", "KARAKURT", "Kadın", false, LocalDate.of(1992, 4, 7), LocalDate.of(2018, 1, 1), LocalDate.of(2020, 3, 28), "5439876543", "2129876543", 3500.0);
        teachersList.add(teacher3);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MarathonMethods.CURRENT_PATH(), true))) {
            bufferedWriter.write(teacher1.toString());
            bufferedWriter.newLine();
            bufferedWriter.write(teacher2.toString());
            bufferedWriter.newLine();
            bufferedWriter.write(teacher3.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return teachersList;

    }

    public static List<Staff> StaffList() {
        List<Staff> staffList = new ArrayList<Staff>();
        Staff staff1 = new Staff("H-" + MarathonMethods.RegNumCreator(), "Volkan", "", "KONAK", "Erkek", true, LocalDate.of(1963, 8, 17), LocalDate.of(1994, 12, 15), LocalDate.of(2020, 3, 25), "5559876543", "2169876543", 3750.0);
        staffList.add(staff1);
        Staff staff2 = new Staff("H-" + MarathonMethods.RegNumCreator(), "Yasemin", "", "YALÇIN", "Kadın", true, LocalDate.of(1985, 10, 12), LocalDate.of(2009, 9, 10), LocalDate.of(2019, 11, 13), "5321234567", "2161234567", 2800.0);
        staffList.add(staff2);

        return staffList;
    }

    public static List<Officer> OfficersList() {
        List<Officer> officersList = new ArrayList<Officer>();
        Officer officer1 = new Officer("M-" + MarathonMethods.RegNumCreator(), "Merve", "Nur", "EROĞLU", "Kadın", true, LocalDate.of(1988, 10, 15), LocalDate.of(2019, 12, 20), LocalDate.of(2021, 1, 1), "5325678945", "2164567890", 2200.0);
        officersList.add(officer1);
        Officer officer2 = new Officer("M-" + MarathonMethods.RegNumCreator(), "Alper", "Yağız", "ALP", "Erkek", true, LocalDate.of(1988, 7, 23), LocalDate.of(2018, 8, 10), LocalDate.of(2019, 12, 30), "5325432165", "2127894561", 2350.0);
        officersList.add(officer2);
        return officersList;
    }


    public static boolean IsMarried(String query) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t" + query + ": ");
        String answer = scanner.next();
        boolean retVal;
        if (answer.equalsIgnoreCase("Evli"))
            retVal = true;
        else
            retVal = false;
        return retVal;
    }

    public static LocalDate BirthDate() {
        Scanner scanner = new Scanner(System.in);
        int birthYear, birthMonth, birthDay;
        System.out.println("Lütfen Doğum Yılını Giriniz:");
        birthYear = scanner.nextInt();
        System.out.println("Lütfen Doğum Ayını Giriniz:");
        birthMonth = scanner.nextInt();
        System.out.println("Lütfen Doğum Gününü Giriniz:");
        birthDay = scanner.nextInt();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        return birthDate;
    }

    public static LocalDate StartDate() {
        LocalDate startDate = LocalDate.of(BAUtils.readInt("İşe Başlama Yılını Giriniz."), BAUtils.readInt("İşe Başladığı Ayı Giriniz"), BAUtils.readInt("İşe Başladığı Günü Giriniz"));
        return startDate;
    }

    public static LocalDate QuitDate() {
        LocalDate quitDate;
        boolean isWorking = BAUtils.proceeding("Halen Çalışıyor Mu? (Evet/Hayır?", "Hayır");
        if (isWorking == true) {
            quitDate = LocalDate.of(BAUtils.readInt("İşten Ayrıldığı Yılı Giriniz."), BAUtils.readInt("İşten Ayrıldığı Ayı Giriniz"), BAUtils.readInt("İşten Ayrıldığı Günü Giriniz"));
        } else {
            quitDate = null;
        }
        return quitDate;
    }


    private static String PhoneNumbers(String query) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(query);
        String phoneNumber = scanner.next();
        return phoneNumber;
    }
}
