package Collection.InsuranceManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        AccountManager manager = new AccountManager();

        do {
            System.out.println("#################################################");
            System.out.println("Policy Management Panel!");
            System.out.println("1. Add user (Individual or Enterprise)");
            System.out.println("2. Login");
            System.out.println("3. Show List Accounts");
            System.out.println("0. Exit");
            System.out.println("#################################################");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Hesap tipi (I/E): ");
                    scan.nextLine();
                    String type = scan.nextLine();
                    System.out.print("Ad: ");
                    String name = scan.nextLine();
                    System.out.print("Soyad: ");
                    String surname = scan.nextLine();
                    System.out.print("Email: ");
                    String email = scan.nextLine();
                    System.out.print("Password: ");
                    String password = scan.nextLine();
                    System.out.print("Meslek: ");
                    String job = scan.nextLine();
                    System.out.print("Yaş: ");
                    int age = scan.nextInt();
                    User user = new User(name, surname, email, password, job, age);
                    if (type.toLowerCase().equals("i")) {
                        Individual individual = new Individual(user);
                        individual.showUserInfo();
                        manager.addAccount(individual);
                    } else if (type.toLowerCase().equals("e")) {
                        System.out.print("Şirket adını giriniz: ");
                        scan.nextLine();
                        String companyName = scan.nextLine();
                        Enterprise enterprise = new Enterprise(user, companyName);
                        enterprise.showUserInfo();
                        manager.addAccount(enterprise);
                    } else {
                        System.out.println("Olmayan bir type girdiniz");
                    }
                    System.out.println(manager.getAccountList().size());
                    break;
                case 2:
                    System.out.print("Email: ");
                    scan.nextLine();
                    email = scan.nextLine();
                    System.out.print("Password: ");
                    password = scan.nextLine();
                    Account account = manager.login(email, password);
                    if (account != null) {
                        System.out.println("Hoşgeldiniz");

                        System.out.println("#################################################");
                        System.out.println("1. Add address");
                        System.out.println("2. Add insurance");
                        System.out.println("3. Show user info");
                        System.out.println("0. Logout");
                        System.out.println("#################################################");
                        System.out.print("Enter your choice: ");
                        int option = scan.nextInt();

                        switch (option) {
                            case 1:
                                AddressManager addressManager = new AddressManager();
                                System.out.print("1. Home Address" +
                                        "\n2. Business Address" +
                                        "\nEnter your choice: ");
                                int addressChoice = scan.nextInt();
                                scan.nextLine(); // Clear the buffer
                                System.out.print("Enter your street address: ");
                                String streetAddress = scan.nextLine();
                                System.out.print("Enter your city: ");
                                String city = scan.nextLine();
                                System.out.print("Enter your state: ");
                                String state = scan.nextLine();
                                System.out.print("Enter your zip code: ");
                                String zipCode = scan.nextLine();
                                if (addressChoice == 1) {
                                    Address homeAddress = new HomeAddress(streetAddress, city, state, zipCode);
                                    addressManager.addAddress(account.getUser(), homeAddress);
                                    System.out.println("Adres başarıyla eklendi.");
                                } else if (addressChoice == 2) {
                                    System.out.print("Şirket adını giriniz:");
                                    scan.nextLine();
                                    String companyName = scan.nextLine();
                                    Address businessAddress = new BusinessAddress(streetAddress,city,state,zipCode,companyName);
                                    AddressManager.addAddress(account.getUser(), businessAddress);
                                    System.out.println("Adres başarıyla eklendi.");
                                } else {
                                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyiniz!!!");
                                }
                                break;
                            case 2:
                                System.out.print("1. Car Insurance" +
                                        "\n2. Health Insurance" +
                                        "\n3. Residence Insurance" +
                                        "\n4. Travel Insurance" +
                                        "\nEnter your choice: ");
                                int insuranceChoice = scan.nextInt();
                                scan.nextLine(); // Clear the buffer
                                if (insuranceChoice == 1) {
                                    System.out.print("Marka: ");
                                    String carMake = scan.nextLine();
                                    System.out.print("Model: ");
                                    String carModel = scan.nextLine();
                                    System.out.print("Yaş: ");
                                    int carAge = scan.nextInt();
                                    System.out.print("Sürücüler için kapsam varsa doğru veya yanlış girin (T/F): ");
                                    scan.nextLine(); // Clear the buffer
                                    String answer = scan.nextLine();
                                    boolean coverageForDrivers;
                                    if (answer.equalsIgnoreCase("t")) {
                                        coverageForDrivers = true;
                                    } else if (answer.equalsIgnoreCase("f")) {
                                        coverageForDrivers = false;
                                    } else {
                                        System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                                        break;
                                    }
                                    System.out.print("Yolcular için kapsam varsa doğru veya yanlış girin (T/F): ");
                                    scan.nextLine(); // Clear the buffer
                                    answer = scan.nextLine();
                                    boolean coverageForPassengers;
                                    if (answer.equalsIgnoreCase("t")) {
                                        coverageForPassengers = true;
                                    } else if (answer.equalsIgnoreCase("f")) {
                                        coverageForPassengers = false;
                                    } else {
                                        System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                                        break;
                                    }
                                    account.addInsurance(new CarInsurance(carMake, carModel, carAge, coverageForDrivers, coverageForPassengers));
                                } else if (insuranceChoice == 2) {
                                    System.out.print("Sağlık: ");
                                    String healthCondition = scan.nextLine();
                                    System.out.print("Kapsam Limiti: ");
                                    double coverageLimit = scan.nextDouble();
                                    System.out.print("Önceden var olan durum için kapsam varsa doğru veya yanlış girin (T/F): ");
                                    scan.nextLine(); // Clear the buffer
                                    String answer = scan.nextLine();
                                    boolean coverageForPreExistingCondition;
                                    if (answer.equalsIgnoreCase("t")) {
                                        coverageForPreExistingCondition = true;
                                    } else if (answer.equalsIgnoreCase("f")) {
                                        coverageForPreExistingCondition = false;
                                    } else {
                                        System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                                        break;
                                    }
                                    account.addInsurance(new HealthInsurance(healthCondition, coverageForPreExistingCondition, coverageLimit));
                                } else if (insuranceChoice == 3) {
                                    System.out.print("Bina Değeri: ");
                                    double buildingValue = scan.nextDouble();
                                    System.out.print("İçerik Değeri: ");
                                    double contentValue = scan.nextDouble();
                                    account.addInsurance(new ResidenceInsurance(buildingValue, contentValue));
                                } else if (insuranceChoice == 4) {
                                    List<String> coveredCountries = new ArrayList<>();
                                    System.out.println("Ülkeler:");
                                    while (scan.hasNextLine()) {
                                        String item = scan.nextLine();
                                        if (item.isEmpty()) {
                                            break;
                                        }
                                        coveredCountries.add(item);
                                    }
                                    System.out.print("Süre: ");
                                    int duration = scan.nextInt();
                                    account.addInsurance(new TravelInsurance(coveredCountries, duration));
                                } else {
                                    System.out.println();
                                }
                                break;
                            case 3:
                                account.showUserInfo();
                                break;
                            case 0:
                                account = null;
                                System.out.println("Çıkış yaptınız.");
                                break;
                        }

                    } else {
                        System.out.println("Geçersiz mail veya şifre");
                    }
                    break;
                case 3:
                    TreeSet<Account> accountList = manager.getAccountList();
                    if (accountList.isEmpty()) {
                        System.out.println("Sisteme kayıtlı hesap bulunamadı");
                        return;
                    }
                    System.out.println(accountList.size());
                    for (Account acc : accountList) {
                        acc.showUserInfo();
                    }
                    break;

            }
        } while(choice != 0);
    }
}
