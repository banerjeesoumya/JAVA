import java.util.*;
public class Restaurant
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int vstr, tvstr = 0, nvstr, tnvstr = 0, vfd, tvfd = 0, nvfd, tnvfd = 0, fd, tfd = 0, amt = 0, tamt = 0, totalamt = 0, d, totald = 0, damt = 0, ch;
        double vat = 0; 
        String str = " ", ans, choice = "Y", port;
        System.out.println("Welcome to Multi Cuisine Restaurant!!!");
        System.out.println("Starter Corner: 1");
        System.out.println("Main Course: 2");
        System.out.println("Deserts......: 3");
        System.out.println();
        System.out.println("Press 1 for Starter");
        System.out.println("Press 2 for Main Course");
        System.out.println("Press 3 for Cool with Deserts");
        System.out.println(" N.B. It is requested to all the customers to check the numbers or letters which they are entering for their desired main menu and the menus under each category. Once the numbers or the letters are entered they cannot be withdrawned and hence processing will be followed. Please remember to press 'ENTER' key on the keyboard after entering any number or letter");
        System.out.println();
        System.out.println("Enter your Choice");
        ch = in.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Welcome to the Starter Menu!!!!: ");
            System.out.println("Enter 'VS' for Veg Starter and 'NVS' for Non Veg Starter");
            str= in.next();
            if (str.equalsIgnoreCase("VS"))
            {
                System.out.println("Vegetarian Starter");
                System.out.println();
                System.out.println("Starters\t\t\tPrice in Rs.");
                System.out.println("1.Paneer Tikka\t\t\t\t110");
                System.out.println("2.Veg Seekh Kebab\t\t\t110");
                System.out.println("3.Hara Bhara Kebab\t\t\t110");
                System.out.println("4.Shanghai Spring Roll\t\t\t150");
                System.out.println("5.American Corn Ball\t\t\t150");
                System.out.println("6.Crispy American Corn\t\t\t140");
                System.out.println("7.Crispy Baby Corn\t\t\t140");
                System.out.println("8.Crispy Mushroom\t\t\t120");
                System.out.println("9.Crispy Chilli Potato\t\t\t120");
                System.out.println("10.Crispy Chilli Chana\t\t\t150");
                System.out.println();
                while(choice.equalsIgnoreCase("Y"))
                {
                    System.out.println("Choose your starter from the above list by entering number");
                    vstr = in.nextInt();
                    System.out.println("Enter the total number of starters you want:");
                    tvstr = in.nextInt();
                    if (vstr >= 1 && vstr <= 3)
                        amt = tvstr * 110;
                    if (vstr == 4 || vstr == 5)
                        amt = tvstr * 150;
                    if (vstr == 6 || vstr == 7)
                        amt = tvstr * 140;
                    if (vstr == 8 || vstr == 9)
                        amt = tvstr * 120;
                    if (vstr == 10)
                        amt = tvstr * 150;
                    tamt = amt + tamt;
                    System.out.println("Do you want to place more order? Enter Y/N");
                    choice = in.next();
                }
            }
            if (str.equalsIgnoreCase("NVS"))
            {
                System.out.println("Non-Vegetarian Starter:");
                System.out.println();
                System.out.println("Non-Veg Starters\t\t\tPrice in Rs");
                System.out.println("1.Chicken Tikka\t\t\t\t170");
                System.out.println("2.Murg Reshmi Kebab\t\t\t170");
                System.out.println("3.Murg Chilli Kebab\t\t\t160");
                System.out.println("4.Chicken Seekh Kebab\t\t\t180");
                System.out.println("5.Tangdi Kebab\t\t\t\t180");
                System.out.println("6.Murg Tandoori\t\t\t\t190");
                System.out.println("7.Fish Ajwani Tikka\t\t\t190");
                System.out.println("8.Chilli Chicken\t\t\t160");
                System.out.println("9.Drums of Heaven\t\t\t180");
                System.out.println("10.Shanghai Chicken\t\t\t180");
                while(choice.equalsIgnoreCase("Y"))
                {
                    System.out.println("Choose your starter from the above list by entering the number:");
                    nvstr = in.nextInt();
                    System.out.println("Enter the total number of starters you want:");
                    tnvstr = in.nextInt();
                    if (nvstr == 1 || nvstr == 2)
                        amt = tnvstr * 170;
                    if (nvstr == 3)
                        amt = tnvstr * 160;
                    if (nvstr == 4 || nvstr == 5)
                        amt = tnvstr * 180;
                    if (nvstr == 6 || nvstr == 7)
                        amt = tnvstr * 190;
                    if (tnvstr == 8)
                        amt = tnvstr * 160;
                    if (nvstr == 9 || nvstr == 10)
                        amt = tnvstr * 180;
                    tamt = amt + tamt;
                    System.out.println("Do you want to place any more order ? Enter Y/N");
                    choice = in.next();
                }
            }
            System.out.println("******** Multi Cuisine Restaurant ********");
            System.out.println("************* Bill *************");
            System.out.println("Total cost = Rs." + tamt);
            vat = Math.round(14.5 / 100.0 * tamt);
            System.out.println("VAT = 14.5 %");
            System.out.println("Total VAT = Rs. " + vat);
            System.out.println("Amount to be paid = Rs." + (tamt + vat));
            System.out.println();
            break;
            case 2:
            System.out.println("Main Course: Indian and Chinese Dishes!");
            System.out.println("Enter 'V' for Indian Veg Dishes, 'NV' for Indian Non-Veg Dishes and 'C' for Chinese Dishes");
            str= in.next();
            if(str.equalsIgnoreCase("V"))
            {
                System.out.println("Welcome to Indian Veg Dishes:");
                System.out.println("Indian Veg Dishes\t\t\t\t: Price in Rs.");
                System.out.println("1. Shahi Paneer\t\t\t\t\t\t180");
                System.out.println("2.Navratan Korma\t\t\t\t\t180");
                System.out.println("3.Kadahi Paneer\t\t\t\t\t\t150");
                System.out.println("4.Malai Kofta\t\t\t\t\t\t140");
                System.out.println("5.Kadahi Vegetable\t\t\t\t\t140");
                System.out.println("6.Vegetable Pakeeza\t\t\t\t\t140");
                System.out.println("7.Shabnam Curry\t\t\t\t\t\t150");
                System.out.println("8.Makai Corn Palak\t\t\t\t\t150");
                System.out.println("9.Veg Pulao\t\t\t\t\t\t110");
                System.out.println("10.Kashmiri Pulao\t\t\t\t\t140");
                System.out.println("11.Butter Naan\t\t\t\t\t\t140");
                System.out.println("12.Stuffed Kulcha\t\t\t\t\t160");
                while (choice.equalsIgnoreCase("Y"))
                {
                    System.out.println("Choose your Main Veg Course from the list by entering number: ");
                    vfd = in.nextInt();
                    System.out.println("How many plates do you want to place from the above list ? ");
                    tvfd = in.nextInt();
                    if (vfd == 1 || vfd == 2)
                        amt = tvfd * 180;
                    if (vfd == 3)
                        amt = tvfd * 150;
                    if (vfd == 4 || vfd == 5 || vfd == 6)
                        amt = tvfd * 140;
                    if (vfd == 7 || vfd == 8)
                        amt = tvfd * 150;
                    if (vfd == 9)
                        amt = tvfd * 110;
                    if (vfd == 10)
                        amt = tvfd * 140;
                    if (vfd == 11)
                        amt = tvfd * 40;
                    if (vfd == 12)
                        amt = tvfd * 60;
                    totalamt = totalamt + amt;
                    System.out.println("Do you want to plave more order ? Enter Y / N ");
                    choice = in.next();
                }
            }
            if(str.equalsIgnoreCase("NV"))
            {
                System.out.println("Welcome to Indian Non-Veg Dishes");
                System.out.println("Indian Non-Veg Dishes\t\t\t\t: Price in Rs.");
                System.out.println("1. Chicken Biriryani\t\t\t\t\t180");
                System.out.println("2. Mutton Biriryani\t\t\t\t\t190");
                System.out.println("3. Chicken Tikka Masala\t\t\t\t\t180");
                System.out.println("4. Chicken Tikka Labadar\t\t\t\t\t180");
                System.out.println("5. Chicken Bharta\t\t\t\t\t150");
                System.out.println("6. Kadahi Chicken\t\t\t\t\t160");
                System.out.println("7. Mughlai Chicken\t\t\t\t\t160");
                System.out.println("8. Murg Navratan Korma\t\t\t\t\t160");
                System.out.println("9. Chicken Do Pyaza\t\t\t\t\t170");
                System.out.println("10. Murg Masallam\t\t\t\t\t170");
                System.out.println("11. Mutton Rogan Josh\t\t\t\t\t190");
                System.out.println("12. Prawn Malai Curry\t\t\t\t\t190");
                System.out.println("11. Fish Sarsowala\t\t\t\t\t140");
                System.out.println("12. Fish Dhaniawala\t\t\t\t\t160");
                while(choice.equalsIgnoreCase("Y"))
                {
                    System.out.println("Choose your Main Non-Veg Couse from the list by entering the number: ");
                    vfd = in.nextInt();
                    System.out.println("How many plates do you want to place from the above list ? ");
                    tvfd = in.nextInt();
                    if (vfd == 1)
                        amt = tvfd * 180;
                    if (vfd == 2)
                        amt = tvfd * 190;
                    if (vfd == 3 || vfd == 4)
                        amt = tvfd * 180;
                    if (vfd == 5)
                        amt = tvfd * 150;
                    if (vfd == 6 || vfd == 7 || vfd == 8)
                        amt =  tvfd * 160;
                    if (vfd == 9 || vfd == 10)
                        amt = tvfd * 170;
                    if (vfd == 11 || vfd == 12)
                        amt = tvfd * 190;
                    if (vfd == 13)
                        amt = tvfd * 140;
                    if (vfd == 14)
                        amt = tvfd * 160;
                    totalamt = totalamt + amt;
                    System.out.println("Do you want to place more order ? Enter Y / N");
                    choice = in.next();
                }
            }
            if (str.equalsIgnoreCase("C"))
            {
                System.out.println("Welcome to Chinese Dishes");
                System.out.println("Chinese Dishes\t\t\t\t: Price in Rs.");
                System.out.println("1.Schezwan Fried Rice\t\t\t\t240");
                System.out.println("2.Schezwan Chicken\t\t\t\t280");
                System.out.println("3.Chilly Chicken\t\t\t\t280");
                System.out.println("4.Chicken Noodles\t\t\t\t210");
                System.out.println("5.Veg Hakka Noodle\t\t\t\t210");
                System.out.println("6.Chicken Manchurian\t\t\t\t190");
                System.out.println("7.Paneer Manchuria\t\t\t\t190");
                System.out.println("8.Chilly Paneer\t\t\t\t\t190");
                System.out.println("9.Sanghai Fried Rice\t\t\t\t240");
                System.out.println("10.Veg. Fried Rice\t\t\t\t210");
                System.out.println("11.Chicken Fried Rice\t\t\t\t210");
                System.out.println("12.Kimchi Rice Veg.\t\t\t\t210");
                while(choice.equalsIgnoreCase("Y"))
                {
                    System.out.println("Choose your Main Course from the above list by entering the number: ");
                    fd = in.nextInt();
                    System.out.println("How many plates do you want to place for it ? ");
                    tfd = in.nextInt();
                    if (fd == 1)
                        amt = tfd * 240;
                    if (fd == 2 || fd == 3)
                        amt = tfd * 280;
                    if (fd == 4 || fd == 5)
                        amt = tfd * 210;
                    if (fd == 6 || fd == 7 || fd == 8)
                        amt = tfd * 190;
                    if (fd == 9)
                        amt = tfd * 240;
                    if (fd == 10 || fd == 11 || fd == 12)
                        amt = tfd * 210;
                    totalamt = totalamt + amt;
                    System.out.println("Do you want to place more order ? Enter Y / N ");
                    choice = in.next();
                }
            }
            System.out.println();
            System.out.println("******** Multi Cuisine Restaurant ********");
            System.out.println("************* Bill *************");
            System.out.println("Total cost = Rs." + totalamt);
            vat = Math.round(14.5 / 100.0 * totalamt);
            System.out.println("VAT = 14.5 %");
            System.out.println("Total VAT = Rs. " + vat);
            System.out.println("Amount to be paid = Rs." + (totalamt + vat));
            System.out.println();
            break;
            case 3:
            System.out.println("Cool with Desrts !!!! ");
            System.out.println("Desrts\t\t\t\t\t: Price in Rs. ");
            System.out.println();
            System.out.println("1. Softy Pineapple\t\t\t\t110");
            System.out.println("2. Softy Crunchy Chocolate\t\t\t110");
            System.out.println("3. Chocolate Walnut Brownie\t\t\t90");
            System.out.println("4. Chocolate Doughnut\t\t\t\t90");
            System.out.println("5. Marble Cake\t\t\t\t\t70");
            System.out.println("6. Mocha Magic\t\t\t\t\t90");
            System.out.println("7. Black Forest Gateux\t\t\t\t90");
            System.out.println("8. Mango Shake\t\t\t\t\t80");
            System.out.println("9. Pineapple Shake\t\t\t\t80");
            System.out.println("10.Tooty Fruity\t\t\t\t\t120");
            while(choice.equalsIgnoreCase("Y"))
            {
                System.out.println("Choose the desert by entering the number !! ");
                d = in.nextInt();
                System.out.println("Enter the total number of items you want to buy : !!");
                totald = in.nextInt();
                if (d == 1 || d == 2)
                    damt = totald * 110;
                if (d == 3 || d == 4)
                    damt = totald * 90;
                if (d == 5)
                    damt = totald * 70;
                if (d == 6 || d == 7)
                    damt = totald * 90;
                if (d == 8 || d == 9)
                    damt = totald * 80;
                if (d == 10)
                    damt = totald * 120;
                totalamt = totalamt + damt;
                System.out.println("Do you want to place more order ?  Enter Y / N");
                choice = in.next();
            }
            System.out.println();
            System.out.println("******** Multi Cuisine Restaurant ********");
            System.out.println("************* Bill *************");
            System.out.println("Total cost = Rs." + totalamt);
            vat = Math.round(14.5 / 100.0 * totalamt);
            System.out.println("VAT = 14.5 %");
            System.out.println("Total VAT = Rs. " + vat);
            System.out.println("Amount to be paid = Rs." + (totalamt + vat));
            System.out.println();
            break;
            default:
            System.out.println("You have entered a wrong choice !!");
            System.out.println("You can enter in the Multi Cuisine Restaurant by executing the program again with the correct choice !!");
            System.out.println("Now, 'Quit' the program");
        }
        System.out.println("To exit Multi Cuisine Restaurant World, enter the word 'Quit' !!");
        ans = in.next();
        if(ans.equals("quit") || ans.equals("QUIT") || ans.equals("Quit"))
        {
            System.out.println("Thanks for coming to Multi Cuisine Restaurant !!");
            System.out.println("Your Pleasure is Our Comfort");
            System.out.println("Visit Again !!!! ");
        }
        while(true)
        {
            System.out.println("Do you want to order more ?? ");
            port = in.next();
            if(port.equals("Yes"))
            {
                System.out.println("Starter Corner: 1");
                System.out.println("Main Course: 2");
                System.out.println("Deserts......: 3");
                System.out.println();
                System.out.println("Press 1 for Starter");
                System.out.println("Press 2 for Main Course");
                System.out.println("Press 3 for Cool with Deserts");
                System.out.println(" N.B. It is requested to all the customers to check the numbers or letters which they are entering for their desired main menu and the menus under each category. Once the numbers or the letters are entered they cannot be withdrawned and hence processing will be followed. Please remember to press 'ENTER' key on the keyboard after entering any number or letter");
                System.out.println();
                System.out.println("Enter your Choice");
                ch = in.nextInt();
                switch(ch)
                {
                    case 1:
                    System.out.println("Welcome to the Starter Menu!!!!: ");
                    System.out.println("Enter 'VS' for Veg Starter and 'NVS' for Non Veg Starter");
                    str= in.next();
                    if (str.equalsIgnoreCase("VS"))
                    {
                        System.out.println("Vegetarian Starter");
                        System.out.println();
                        System.out.println("Starters\t\t\tPrice in Rs.");
                        System.out.println("1.Paneer Tikka\t\t\t\t110");
                        System.out.println("2.Veg Seekh Kebab\t\t\t110");
                        System.out.println("3.Hara Bhara Kebab\t\t\t110");
                        System.out.println("4.Shanghai Spring Roll\t\t\t150");
                        System.out.println("5.American Corn Ball\t\t\t150");
                        System.out.println("6.Crispy American Corn\t\t\t140");
                        System.out.println("7.Crispy Baby Corn\t\t\t140");
                        System.out.println("8.Crispy Mushroom\t\t\t120");
                        System.out.println("9.Crispy Chilli Potato\t\t\t120");
                        System.out.println("10.Crispy Chilli Chana\t\t\t150");
                        System.out.println();
                        while(choice.equalsIgnoreCase("Y"))
                        {
                            System.out.println("Choose your starter from the above list by entering number");
                            vstr = in.nextInt();
                            System.out.println("Enter the total number of starters you want:");
                            tvstr = in.nextInt();
                            if (vstr >= 1 && vstr <= 3)
                                amt = tvstr * 110;
                            if (vstr == 4 || vstr == 5)
                                amt = tvstr * 150;
                            if (vstr == 6 || vstr == 7)
                                amt = tvstr * 140;
                            if (vstr == 8 || vstr == 9)
                                amt = tvstr * 120;
                            if (vstr == 10)
                                amt = tvstr * 150;
                            tamt = amt + tamt;
                            System.out.println("Do you want to place more order? Enter Y/N");
                            choice = in.next();
                        }
                    }
                    if (str.equalsIgnoreCase("NVS"))
                    {
                        System.out.println("Non-Vegetarian Starter:");
                        System.out.println();
                        System.out.println("Non-Veg Starters\t\t\tPrice in Rs");
                        System.out.println("1.Chicken Tikka\t\t\t\t170");
                        System.out.println("2.Murg Reshmi Kebab\t\t\t170");
                        System.out.println("3.Murg Chilli Kebab\t\t\t160");
                        System.out.println("4.Chicken Seekh Kebab\t\t\t180");
                        System.out.println("5.Tangdi Kebab\t\t\t\t180");
                        System.out.println("6.Murg Tandoori\t\t\t\t190");
                        System.out.println("7.Fish Ajwani Tikka\t\t\t190");
                        System.out.println("8.Chilli Chicken\t\t\t160");
                        System.out.println("9.Drums of Heaven\t\t\t180");
                        System.out.println("10.Shanghai Chicken\t\t\t180");
                        while(choice.equalsIgnoreCase("Y"))
                        {
                            System.out.println("Choose your starter from the above list by entering the number:");
                            nvstr = in.nextInt();
                            System.out.println("Enter the total number of starters you want:");
                            tnvstr = in.nextInt();
                            if (nvstr == 1 || nvstr == 2)
                                amt = tnvstr * 170;
                            if (nvstr == 3)
                                amt = tnvstr * 160;
                            if (nvstr == 4 || nvstr == 5)
                                amt = tnvstr * 180;
                            if (nvstr == 6 || nvstr == 7)
                                amt = tnvstr * 190;
                            if (tnvstr == 8)
                                amt = tnvstr * 160;
                            if (nvstr == 9 || nvstr == 10)
                                amt = tnvstr * 180;
                            tamt = amt + tamt;
                            System.out.println("Do you want to place any more order ? Enter Y/N");
                            choice = in.next();
                        }
                    }
                    System.out.println("******** Multi Cuisine Restaurant ********");
                    System.out.println("************* Bill *************");
                    System.out.println("Total cost = Rs." + tamt);
                    vat = Math.round(14.5 / 100.0 * tamt);
                    System.out.println("VAT = 14.5 %");
                    System.out.println("Total VAT = Rs. " + vat);
                    System.out.println("Amount to be paid = Rs." + (tamt + vat));
                    System.out.println();
                    break;
                    case 2:
                    System.out.println("Main Course: Indian and Chinese Dishes!");
                    System.out.println("Enter 'V' for Indian Veg Dishes, 'NV' for Indian Non-Veg Dishes and 'C' for Chinese Dishes");
                    str= in.next();
                    if(str.equalsIgnoreCase("V"))
                    {
                        System.out.println("Welcome to Indian Veg Dishes:");
                        System.out.println("Indian Veg Dishes\t\t\t\t: Price in Rs.");
                        System.out.println("1. Shahi Paneer\t\t\t\t\t\t180");
                        System.out.println("2.Navratan Korma\t\t\t\t\t180");
                        System.out.println("3.Kadahi Paneer\t\t\t\t\t\t150");
                        System.out.println("4.Malai Kofta\t\t\t\t\t\t140");
                        System.out.println("5.Kadahi Vegetable\t\t\t\t\t140");
                        System.out.println("6.Vegetable Pakeeza\t\t\t\t\t140");
                        System.out.println("7.Shabnam Curry\t\t\t\t\t\t150");
                        System.out.println("8.Makai Corn Palak\t\t\t\t\t150");
                        System.out.println("9.Veg Pulao\t\t\t\t\t\t110");
                        System.out.println("10.Kashmiri Pulao\t\t\t\t\t140");
                        System.out.println("11.Butter Naan\t\t\t\t\t\t140");
                        System.out.println("12.Stuffed Kulcha\t\t\t\t\t160");
                        while (choice.equalsIgnoreCase("Y"))
                        {
                            System.out.println("Choose your Main Veg Course from the list by entering number: ");
                            vfd = in.nextInt();
                            System.out.println("How many plates do you want to place from the above list ? ");
                            tvfd = in.nextInt();
                            if (vfd == 1 || vfd == 2)
                                amt = tvfd * 180;
                            if (vfd == 3)
                                amt = tvfd * 150;
                            if (vfd == 4 || vfd == 5 || vfd == 6)
                                amt = tvfd * 140;
                            if (vfd == 7 || vfd == 8)
                                amt = tvfd * 150;
                            if (vfd == 9)
                                amt = tvfd * 110;
                            if (vfd == 10)
                                amt = tvfd * 140;
                            if (vfd == 11)
                                amt = tvfd * 40;
                            if (vfd == 12)
                                amt = tvfd * 60;
                            totalamt = totalamt + amt;
                            System.out.println("Do you want to plave more order ? Enter Y / N ");
                            choice = in.next();
                        }
                    }
                    if(str.equalsIgnoreCase("NV"))
                    {
                        System.out.println("Welcome to Indian Non-Veg Dishes");
                        System.out.println("Indian Non-Veg Dishes\t\t\t\t: Price in Rs.");
                        System.out.println("1. Chicken Biriryani\t\t\t\t\t180");
                        System.out.println("2. Mutton Biriryani\t\t\t\t\t190");
                        System.out.println("3. Chicken Tikka Masala\t\t\t\t\t180");
                        System.out.println("4. Chicken Tikka Labadar\t\t\t\t\t180");
                        System.out.println("5. Chicken Bharta\t\t\t\t\t150");
                        System.out.println("6. Kadahi Chicken\t\t\t\t\t160");
                        System.out.println("7. Mughlai Chicken\t\t\t\t\t160");
                        System.out.println("8. Murg Navratan Korma\t\t\t\t\t160");
                        System.out.println("9. Chicken Do Pyaza\t\t\t\t\t170");
                        System.out.println("10. Murg Masallam\t\t\t\t\t170");
                        System.out.println("11. Mutton Rogan Josh\t\t\t\t\t190");
                        System.out.println("12. Prawn Malai Curry\t\t\t\t\t190");
                        System.out.println("11. Fish Sarsowala\t\t\t\t\t140");
                        System.out.println("12. Fish Dhaniawala\t\t\t\t\t160");
                        while(choice.equalsIgnoreCase("Y"))
                        {
                            System.out.println("Choose your Main Non-Veg Couse from the list by entering the number: ");
                            vfd = in.nextInt();
                            System.out.println("How many plates do you want to place from the above list ? ");
                            tvfd = in.nextInt();
                            if (vfd == 1)
                                amt = tvfd * 180;
                            if (vfd == 2)
                                amt = tvfd * 190;
                            if (vfd == 3 || vfd == 4)
                                amt = tvfd * 180;
                            if (vfd == 5)
                                amt = tvfd * 150;
                            if (vfd == 6 || vfd == 7 || vfd == 8)
                                amt =  tvfd * 160;
                            if (vfd == 9 || vfd == 10)
                                amt = tvfd * 170;
                            if (vfd == 11 || vfd == 12)
                                amt = tvfd * 190;
                            if (vfd == 13)
                                amt = tvfd * 140;
                            if (vfd == 14)
                                amt = tvfd * 160;
                            totalamt = totalamt + amt;
                            System.out.println("Do you want to place more order ? Enter Y / N");
                            choice = in.next();
                        }
                    }   
                    if (str.equalsIgnoreCase("C"))
                    {
                        System.out.println("Welcome to Chinese Dishes");
                        System.out.println("Chinese Dishes\t\t\t\t: Price in Rs.");
                        System.out.println("1.Schezwan Fried Rice\t\t\t\t240");
                        System.out.println("2.Schezwan Chicken\t\t\t\t280");
                        System.out.println("3.Chilly Chicken\t\t\t\t280");
                        System.out.println("4.Chicken Noodles\t\t\t\t210");
                        System.out.println("5.Veg Hakka Noodle\t\t\t\t210");
                        System.out.println("6.Chicken Manchurian\t\t\t\t190");
                        System.out.println("7.Paneer Manchuria\t\t\t\t190");
                        System.out.println("8.Chilly Paneer\t\t\t\t\t190");
                        System.out.println("9.Sanghai Fried Rice\t\t\t\t240");
                        System.out.println("10.Veg. Fried Rice\t\t\t\t210");
                        System.out.println("11.Chicken Fried Rice\t\t\t\t210");
                        System.out.println("12.Kimchi Rice Veg.\t\t\t\t210");
                        while(choice.equalsIgnoreCase("Y"))
                        {
                            System.out.println("Choose your Main Course from the above list by entering the number: ");
                            fd = in.nextInt();
                            System.out.println("How many plates do you want to place for it ? ");
                            tfd = in.nextInt();
                            if (fd == 1)
                                amt = tfd * 240;
                            if (fd == 2 || fd == 3)
                                amt = tfd * 280;
                            if (fd == 4 || fd == 5)
                                amt = tfd * 210;
                            if (fd == 6 || fd == 7 || fd == 8)
                                amt = tfd * 190;
                            if (fd == 9)
                                amt = tfd * 240;
                            if (fd == 10 || fd == 11 || fd == 12)
                                amt = tfd * 210;
                            totalamt = totalamt + amt;
                            System.out.println("Do you want to place more order ? Enter Y / N ");
                            choice = in.next();
                        }
                    }
                    System.out.println();
                    System.out.println("******** Multi Cuisine Restaurant ********");
                    System.out.println("************* Bill *************");
                    System.out.println("Total cost = Rs." + totalamt);
                    vat = Math.round(14.5 / 100.0 * totalamt);
                    System.out.println("VAT = 14.5 %");
                    System.out.println("Total VAT = Rs. " + vat);
                    System.out.println("Amount to be paid = Rs." + (totalamt + vat));
                    System.out.println();
                    break;
                    case 3:
                    System.out.println("Cool with Desrts !!!! ");
                    System.out.println("Desrts\t\t\t\t\t: Price in Rs. ");
                    System.out.println();
                    System.out.println("1. Softy Pineapple\t\t\t\t110");
                    System.out.println("2. Softy Crunchy Chocolate\t\t\t110");
                    System.out.println("3. Chocolate Walnut Brownie\t\t\t90");
                    System.out.println("4. Chocolate Doughnut\t\t\t\t90");
                    System.out.println("5. Marble Cake\t\t\t\t\t70");
                    System.out.println("6. Mocha Magic\t\t\t\t\t90");
                    System.out.println("7. Black Forest Gateux\t\t\t\t90");
                    System.out.println("8. Mango Shake\t\t\t\t\t80");
                    System.out.println("9. Pineapple Shake\t\t\t\t80");
                    System.out.println("10.Tooty Fruity\t\t\t\t\t120");
                    while(choice.equalsIgnoreCase("Y"))
                    {
                        System.out.println("Choose the desert by entering the number !! ");
                        d = in.nextInt();
                        System.out.println("Enter the total number of items you want to buy : !!");
                        totald = in.nextInt();
                        if (d == 1 || d == 2)
                            damt = totald * 110;
                        if (d == 3 || d == 4)
                            damt = totald * 90;
                        if (d == 5)
                            damt = totald * 70;
                        if (d == 6 || d == 7)
                            damt = totald * 90;
                        if (d == 8 || d == 9)
                            damt = totald * 80;
                        if (d == 10)
                            damt = totald * 120;
                        totalamt = totalamt + damt;
                        System.out.println("Do you want to place more order ?  Enter Y / N");
                        choice = in.next();
                    }
                    System.out.println();
                    System.out.println("******** Multi Cuisine Restaurant ********");
                    System.out.println("************* Bill *************");
                    System.out.println("Total cost = Rs." + totalamt);
                    vat = Math.round(14.5 / 100.0 * totalamt);
                    System.out.println("VAT = 14.5 %");
                    System.out.println("Total VAT = Rs. " + vat);
                    System.out.println("Amount to be paid = Rs." + (totalamt + vat));
                    System.out.println();
                    break;
                    default:
                    System.out.println("You have entered a wrong choice !!");
                    System.out.println("You can enter in the Multi Cuisine Restaurant by executing the program again with the correct choice !!");
                    System.out.println("Now, 'Quit' the program");
                }
                System.out.println("To exit Multi Cuisine Restaurant World, enter the word 'Quit' !!");
                ans = in.next();
                if(ans.equals("quit") || ans.equals("QUIT") || ans.equals("Quit"))
                {
                    System.out.println("Thanks for coming to Multi Cuisine Restaurant !!");
                    System.out.println("Your Pleasure is Our Comfort");
                    System.out.println("Visit Again !!!! ");
                }
            }
            else
            {
                System.exit(0);
            }
        }
    }
}

                                                
                                            