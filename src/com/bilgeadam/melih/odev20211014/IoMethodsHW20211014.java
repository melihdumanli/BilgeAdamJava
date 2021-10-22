package com.bilgeadam.melih.odev20211014;

import com.bilgeadam.BAUtils.BAUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class IoMethodsHW20211014 {
    // Seçenekli bir şekilde
// 0-Çıkış
// 1-dosyaCreate
// 2-dizinCreate
// 3-Add(Yazma)
// 4-Read(Okuma)
// 5-Delete(Silmek)
// 6-Dosya özellikleri
// 6.1 Dosya mı
// bu dizin mi ? dosya mı?
// yazılabilrinir mi ? okunabilinir mi çalışabilinir mi?

// URL URI araştırmak ödevi

    private static final String PATH() {
        return "C:\\bilgeadam\\newfile.txt";
    }

    private static void ExitRequest() {
        System.out.println("Programı Kullandığınız İçin Teşekkür Ederiz...");
        System.exit(0);
    }

    private static void ShowProperties() throws IOException {
        File showFile = new File(PATH());
        if (!showFile.exists())
            System.out.println("Dosya Bulunamadı.");
        else {
            System.out.println("Dosya Adı           : " + showFile.getName());
            System.out.println("Dosya Yolu          : " + showFile.getPath());
            System.out.println("Boş Alan            : " + showFile.getFreeSpace() + " Byte!");
            System.out.println("Toplam Alan         : " + showFile.getTotalSpace() + " Byte!");
            System.out.println("Kullanılabilir Alan : " + showFile.getUsableSpace() + " Byte!");
            if (showFile.isFile())
                System.out.println("Bu Bir Dosyadır.");
            else
                System.out.println("Bu Bir Dosya Değildir.");
            if (showFile.isDirectory())
                System.out.println("Bu Bir Klasördür.");
            else
                System.out.println("Bu Bir Klasör Değildir.");
            if (showFile.canWrite())
                System.out.println("Bu Dosya Yazılabilir.");
            else
                System.out.println("Bu Dosya Yazılamaz.");
            if (showFile.canRead())
                System.out.println("Bu Dosya Okunabilir.");
            else
                System.out.println("Bu Dosya Okunamaz.");
            if (showFile.canExecute())
                System.out.println("Bu Dosya Çalıştırılabilir.");
            else
                System.out.println("Bu Dosya Çalıştırılamaz.");
        }
        AllMethods();
    }

    private static void DeleteFile() throws IOException {
        File file = new File(PATH());
        if (!file.exists())
            System.out.println("Dosya Bulunamadı!");
        else {
        	file.delete();
            System.out.println("Dosya Silindi.");
        }
        AllMethods();
    }

    private static void ReadFile() throws IOException {
    	File file = new File(PATH());
    	try {
    		if (!file.exists())
                System.out.println("Dosya Bulunamadı!");
        	else {
            List<String> lines = Files.readAllLines(Paths.get(PATH()));
            lines.forEach(System.out::println);
            System.out.println("Dosya Okuma Tamamlandı...\n");
            }
		} catch (NoSuchFileException e) {
			System.out.println("Dosya Bulunamadı!");
		} finally {
			 AllMethods();
		}
    	
    	
       
        /*try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH()))) {
            String satir = "", toplamOkunan = "";
            while ((satir = bufferedReader.readLine()) != null) {
                toplamOkunan = toplamOkunan + satir + "\n";
            }
            System.out.println(toplamOkunan);
            System.out.println("Okuma İşlemi Tamamlandı...");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            AllMethods();
        }*/

    }

    private static void WriteToFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int number;
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH(), true))) {
            System.out.println("Lütfen Girmek İstediğiniz Metin Sayısını Belirtiniz:");
            number = scanner.nextInt();
            for (int i = 0; i < number; i++) {
                bufferedWriter.write(BAUtils.readString("Lütfen " + (i + 1) + ".  metni giriniz") + "\n");
                bufferedWriter.flush();
            }
            System.out.println("Yazma İşlemi Tamamlandı...\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            AllMethods();
            scanner.close();
        }
    }

    private static void CreateDirectory() throws IOException {
        
            File newDirectory = new File("C:\\bilgeadam\\newfolder");
            if (!newDirectory.exists()) {
                newDirectory.mkdirs();
                System.out.println("Klasör Oluşturuldu...\n");
            } else
                System.out.println("Klasör Zaten Mevcut!\n");
            //scanner.close();
		
	        AllMethods();
		
    
    }

    private static void CreateFile() throws IOException {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Lütfen Dosya Oluşturmak İstediğiniz Dosya Yolunu ve Adını Belirtiniz:");
        //final String FILE_PATH = scanner.nextLine();
        try {
            FileWriter fileWriter = new FileWriter(PATH(), true);
            System.out.println("Dosya oluşturuldu.");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            AllMethods();
        }
    }

    private static int UserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nLütfen Yapmak İstediğiniz İşlemi Seçiniz:\n");
        System.out.println("1. Dosya Oluştur\n2. Klasör Oluştur\n3. Dosyaya Yaz\n4. Dosyayı Oku\n5. Dosyayı Sil\n6. Dosya Özelliklerini Görüntüle\n0. Çıkış ");
        return scanner.nextInt();
    }

    public static void AllMethods() throws IOException {
        int choice = UserChoice();
        switch (choice) {
            case 1: {
                CreateFile();
                break;
            }
            case 2: {
                CreateDirectory();
                break;
            }
            case 3: {
                WriteToFile();
                break;
            }
            case 4: {
                ReadFile();
                break;
            }
            case 5: {
                DeleteFile();
                break;
            }
            case 6: {
                ShowProperties();
                break;
            }
            case 0: {
                ExitRequest();
                break;
            }
            default:
                System.out.println("Hatalı Giriş Yaptınız...");
        }
    }

}
