package Collection.PatikaStore;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<Brand> brandList = new TreeSet<>(new OrderBrandNameComparator());
        TreeSet<Notebook> notebooks = new TreeSet<>(new OrderNotebookIdComparator());
        TreeSet<MobilePhone> mobilePhones = new TreeSet<>(new OrderMobilePhoneIdComparator());
        brandList.add(new Brand(1, "Samsung"));
        brandList.add(new Brand(2, "Lenovo"));
        brandList.add(new Brand(3, "Apple"));
        brandList.add(new Brand(4, "Huawei"));
        brandList.add(new Brand(5, "Casper"));
        brandList.add(new Brand(6, "Asus"));
        brandList.add(new Brand(7, "HP"));
        brandList.add(new Brand(8, "Xiaomi"));
        brandList.add(new Brand(9, "Monster"));

        notebooks.add(new Notebook("Huawei", 4,1, 7000.0, 0.0, 5, "HUAWEI Matebook 14", 16, 512, 14.0));
        notebooks.add(new Notebook("Lenova", 2,2, 3699.0, 0.0, 5, "LENOVO V14 IGL", 8, 1024, 14.0));
        notebooks.add(new Notebook("Asus", 6,3, 8199.0, 0.0, 5, "ASUS Tuf Gaming", 32, 2048, 15.6));

        mobilePhones.add(new MobilePhone("Samsung", 1, 1, 3199.0,0.0, 5, "SAMSUNG GALAXY A51", 128, 6.5, 32, 4000.0, 6, "Siyah"));
        mobilePhones.add(new MobilePhone("Apple", 3, 2, 7379.0,0.0, 5, "iPhone 11 64 GB", 64, 6.1, 5, 3046.0, 6, "Mavi"));
        mobilePhones.add(new MobilePhone("Xiaomi", 8, 3, 4012.0,0.0, 5, "Redmi Note 10 Pro 8GB", 128, 6.5, 35, 4000.0, 12, "Beyaz"));
        int select = 1;
        while (select != 0) {
            System.out.println("PatikaStore Ürün Yönetim Paneli !" +
                    "\n1 - Notebook İşlemleri" +
                    "\n2 - Cep Telefonu İşlemleri" +
                    "\n3 - Marka Listele" +
                    "\n0 - Çıkış Yap");
            System.out.print("Tercihiniz : ");
            select = scan.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Notebook İşlemleri" +
                            "\n1 - Notebook Listesi" +
                            "\n2 - Notebook Ekleme" +
                            "\n3 - Notebook Silme" +
                            "\n0 - Geri Dön");
                    System.out.print("Tercihiniz : ");
                    int notebookSelection = scan.nextInt();
                    switch (notebookSelection) {
                        case 1:
                            System.out.format(" %-6s %-24s %-13s %-17s %-13s %-13s %-13s\n", "|ID|", "|Ürün Adı|", "|Fiyat|", "|Marka|", "|Depolama|", "|Ekran|", "|RAM|");
                            System.out.println("________________________________________________________________________________________________________________________");

                            for (Notebook notebook : notebooks) {
                                System.out.format(" %-6s %-24s %-13s %-17s %-13s %-13s %-13s\n",
                                        notebook.getId(),
                                        notebook.getName(),
                                        notebook.getPrice() + " TL",
                                        notebook.getBrandName(),
                                        notebook.getStorage() + " GB",
                                        notebook.getScreen() + "`",
                                        notebook.getRam() + " GB");
                            }
                            break;
                        case 2:
                            int id = notebooks.size() + 1;
                            System.out.println("Ürünün adını giriniz: ");
                            String name = scan.next();
                            System.out.println("Ürünün fiyatını giriniz: ");
                            double price = scan.nextDouble();
                            System.out.println("Ürünün markasını giriniz: ");
                            String brand = scan.next();
                            boolean isBrand = false;
                            int brandID = 0;
                            for (Brand bList : brandList) {
                                if (bList.getBrandName().contains(brand)) {
                                    isBrand = true;
                                    brandID = bList.getBrandID();
                                    break;
                                }
                            }
                            if (isBrand) {
                                System.out.println("Ürünün depolamasını giriniz: ");
                                int storage = scan.nextInt();
                                System.out.println("Ürünün ekran boyutunu giriniz: ");
                                double screen = scan.nextDouble();
                                System.out.println("Ürünün RAM'ini giriniz: ");
                                int ram = scan.nextInt();
                                System.out.println("Ürünün indirim oranını giriniz: ");
                                double discount = scan.nextDouble();
                                System.out.println("Ürünün adedini giriniz: ");
                                int amount = scan.nextInt();

                                notebooks.add(new Notebook(brand, brandID, id, price, discount, amount, name, ram, storage, screen));
                            } else {
                                System.out.println("Geçersiz marka girdiniz!!!");
                            }
                            break;
                        case 3:
                            System.out.print("Silmek istediğiniz ürünün ID'sini giriniz: ");
                            int deleteID = scan.nextInt();
                            notebooks.removeIf(notebook -> notebook.getId() == deleteID);
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Hatalı tercih yaptınız.");
                    }
                    break;
                case 2:
                    System.out.println("Cep Telefonu İşlemleri" +
                            "\n1 - Cep Telefonu Listesi" +
                            "\n2 - Cep Telefonu Ekleme" +
                            "\n3 - Cep Telefonu Silme" +
                            "\n0 - Geri Dön");
                    System.out.print("Tercihiniz : ");
                    int mobilePhoneSelection = scan.nextInt();
                    switch (mobilePhoneSelection) {
                        case 1:
                            System.out.format("%-3s %-24s %-10s %-10s %-10s %-10s %-9s %-10s %-6s %-7s\n", "|ID|", "|Ürün Adı|", "|Fiyat|", "|Marka|", "|Depolama|", "|Ekran|", "|Kamera|", "|Pil|", "|Ram|", "|Renk|");
                            System.out.println("______________________________________________________________________________________________________________________________________________________________________");
                            for (MobilePhone mobilePhone : mobilePhones) {
                                System.out.format(" %-3s %-24s %-10s %-10s %-10s %-10s %-9s %-10s %-6s %-7s\n",
                                        mobilePhone.getId(),
                                        mobilePhone.getName(),
                                        mobilePhone.getPrice() + " TL",
                                        mobilePhone.getBrandName(),
                                        mobilePhone.getStorage() + " GB",
                                        mobilePhone.getScreen(),
                                        mobilePhone.getCamera(),
                                        mobilePhone.getBattery(),
                                        mobilePhone.getRam() + " GB",
                                        mobilePhone.getColor());
                            }
                            break;
                        case 2:
                            int id = mobilePhones.size() + 1;
                            System.out.println("Ürünün adını giriniz: ");
                            String name = scan.next();
                            System.out.println("Ürünün fiyatını giriniz: ");
                            double price = scan.nextDouble();
                            System.out.println("Ürünün markasını giriniz: ");
                            String brand = scan.next();
                            boolean isBrand = false;
                            int brandID = 0;
                            for (Brand bList : brandList) {
                                if (bList.getBrandName().contains(brand)) {
                                    isBrand = true;
                                    brandID = bList.getBrandID();
                                    break;
                                }
                            }
                            if (isBrand) {
                                System.out.println("Ürünün depolamasını giriniz: ");
                                int storage = scan.nextInt();
                                System.out.println("Ürünün ekran boyutunu giriniz: ");
                                double screen = scan.nextDouble();
                                System.out.println("Ürünün RAM'ini giriniz: ");
                                int ram = scan.nextInt();
                                System.out.println("Ürünün kamerasını giriniz: ");
                                int camera = scan.nextInt();
                                System.out.println("Ürünün bataryasını giriniz: ");
                                int battery = scan.nextInt();
                                System.out.println("Ürünün rengini giriniz: ");
                                String color = scan.next();
                                System.out.println("Ürünün indirim oranını giriniz: ");
                                double discount = scan.nextDouble();
                                System.out.println("Ürünün adedini giriniz: ");
                                int amount = scan.nextInt();

                                mobilePhones.add(new MobilePhone(brand, brandID, id, price, discount, amount, name, storage, screen, camera, battery, ram, color));
                                mobilePhones.add(new MobilePhone("Samsung", 1, 1, 3199.0,0.0, 5, "SAMSUNG GALAXY A51", 128, 6.5, 32, 4000.0, 6, "Siyah"));

                            } else {
                                System.out.println("Geçersiz marka girdiniz!!!");
                            }
                            break;
                        case 3:
                            System.out.println("Silmek istediğiniz ürünün ID'sini giriniz: ");
                            int deleteID = scan.nextInt();
                            mobilePhones.removeIf(mobilePhone -> mobilePhone.getId() == deleteID);
                            break;
                        case 4:
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Hatalı tercih yaptınız.");
                    }
                    break;
                case 3:
                    Iterator<Brand> itr = brandList.iterator();
                    System.out.println("Markalarımız");
                    System.out.println("--------------");
                    while (itr.hasNext()) {
                        System.out.println(itr.next().getBrandName());
                    }
                    break;
                case 0:
                    System.out.println("Yine bekleriz.");
                    break;
                default:
                    System.out.println("Hatalı tercih yaptınız.");
            }
            System.out.println("--------------");
        }
    }
}
