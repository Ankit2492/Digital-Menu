package Dijital_Menu;

//.....................CODE AUTHOR IS ANKIT KUMAR SHRIVASTAVA...........................\\

import java.util.InputMismatchException;
import java.util.Scanner;
// @@
//  @ yah Exception throw karne ka class hai jiska name hai getException @@@@@@
class getException extends RuntimeException {
    getException() {
        super();
    }
}
/*---------------

-------------- yah class me add order list vala statement hai or palat_count me input leta hai issi class
 me or order cancel wala bhi issi class me statment likha hua hai
 */
class RepeatMethod{
    int plat_count,confirm_order,listchecking;
    int MashalaDhosha,ChholeBatore,ShahiPaneer,Applejuce,ChokletyIcecream,PaneerPizza;
  // increase the value of watch the order list
    int watch_M,watch_chb,watch_shp,watch_apj,watch_chtic,watch_ppz;
  /// plate count variabale kitna palate chahiye vah sara isi sab variabale me store rahata hai
    int plat_count1,plat_count2,plat_count3,plat_count4,plat_count5,plat_count6;
    //  yahi se sara item select hota hai is class me ek hi method hai
   void repeat( int selectitem, int orderprice){
  // -------
       // ------object create classes -----------
       Menu select=new Menu();
       SelectItemThisMEnu sectitm= new SelectItemThisMEnu();
       Scanner secltIm = new Scanner (System.in);
       ValueStore st=new ValueStore();
        /* @@@ how many plats order in store the variable plat_count and throw exception
                 input mismatch exception */
       try {
           plat_count = secltIm.nextInt();
       }catch(InputMismatchException inpm) {
  // Exception aane par yah block chalega  ------------
           System.out.println("\n\n\t\twroung input please try again letter");
           if (selectitem == 1) {
               sectitm.selectItem(selectitem);
           } else if (selectitem == 2) {
               sectitm.selectItem(selectitem);
           } else if (selectitem == 3) {
               sectitm.selectItem(selectitem);
           } else if (selectitem == 4) {
               sectitm.selectItem(selectitem);
           } else if (selectitem == 5) {
               sectitm.selectItem(selectitem);
           } // @@@@@@@@@@@ 1 se 6 tak ka koi bhi condition true hona hai
           else {
               sectitm.selectItem(selectitem);
           }
       }
     // @@@@@@@@@@@@@   order cencel the condition excute @@@@@@@@@@@@@@@@@@@@
       if(plat_count==0) {
           System.out.println("\n\t\t\tORDER CANCEL....");
           System.out.println("\nsir or kuch order karna hai then press the button(1 to 6)this menu" );
           if(ValueStore.confirm_order1>0) {
               System.out.print("Order List Ko Dekhane Ke Liye Then Press The button (8) = ");

       // @@@@@@@@@  call menuDisplay method in MEnu class and  select item

               select.menuDisplay();
           }else{
               System.out.print("Or Press A Number Greter Than 6 Or 0 TO Close The Menu = ");

     // @@@@@@@@@  call menuDisplay method in MEnu class and  select item
               select.menuDisplay();
           }
       }else {
      // @@@@@  value increase one time order cancel and no order cancel out put display different
          confirm_order = 2;
          if( ValueStore.confirm_order1==0){
             st.storeValue3(confirm_order);
          }
 // @@@@@@@@@@@ 1 se 6 tak ka koi bhi condition true hona hai
           if (selectitem == 1) {
               MashalaDhosha = plat_count * orderprice;
                  st.TotalCalculetValue(MashalaDhosha);
                  System.out.println("\n\t\t\t\t\tMashala Dhosha " + plat_count + " Plate Add Order List..." +
                          "\t\t--\t\t\t"+ MashalaDhosha+" Rupees ka Order");
               plat_count1 = plat_count+ValueStore.plat_count1;
                  watch_M=1;
               st.storeValueDisplayMenuList1( watch_M,plat_count1);
       ///// 2 second condition
           } else if (selectitem == 2) {
               ChholeBatore = plat_count * orderprice;
                   st.TotalCalculetValue( ChholeBatore);
               System.out.println("\n\t\t\t\tChhole Batore " + plat_count + " Plate Add Order List..." +
                       "\t\t\t--\t\t\t\t"+ ChholeBatore+" Rupees ka Order");
               plat_count2 = plat_count+ValueStore.plat_count2;
               watch_chb=1;
               st.storeValueDisplayMenuList2( watch_chb,plat_count2);
           }
      ////////// 3rd condition
           else if (selectitem == 3) {
               ShahiPaneer = plat_count * orderprice;
               st.TotalCalculetValue(ShahiPaneer);
               System.out.println("\n\t\t\t\t\tShahi Paneer " + plat_count + " Plate Add Order List..." +
                       "\t\t\t--\t\t\t"+ ShahiPaneer+" Rupees ka Order");
               plat_count3 = plat_count+ValueStore.plat_count3;
               watch_shp=1;
               st.storeValueDisplayMenuList3( watch_shp,plat_count3);
           }
      ////////// 4rd condition
           else if (selectitem == 4){
               Applejuce = plat_count * orderprice;
               st.TotalCalculetValue(Applejuce);
               System.out.println("\n\t\t\t\t\tApple juce " + plat_count + " Glass Add Order List..." +
                       "\t\t\t--\t\t\t"+ Applejuce+" Rupees ka Order");
               plat_count4 = plat_count+ValueStore.plat_count4;
               watch_apj=1;
               st.storeValueDisplayMenuList4( watch_apj,plat_count4);
           }
     ////////// 5rd condition
           else if (selectitem == 5) {
               ChokletyIcecream = plat_count * orderprice;
               st.TotalCalculetValue(ChokletyIcecream);
               System.out.println("\n\t\t\t\t\tChocolaty ice-cream " + plat_count + " Piece Add Order List..." +
                       "\t\t--\t\t\t"+ ChokletyIcecream+" Rupees ka Order");
               plat_count5 = plat_count+ValueStore.plat_count5;
               watch_chtic=1;
               st.storeValueDisplayMenuList5( watch_chtic,plat_count5);
           }
     ////////// not conditions apply  6 no. by default excute 6 no.
           else{
               PaneerPizza = plat_count * orderprice;
               st.TotalCalculetValue( PaneerPizza);
               System.out.println("\n\t\t\t\t\tPaneer Pizza " + plat_count + " Plate Add Order List..." +
                       "\t\t\t--\t\t\t"+ PaneerPizza+" Rupees ka Order");
               plat_count6 = plat_count+ValueStore.plat_count6;
               watch_ppz=1;
                  st.storeValueDisplayMenuList6( watch_ppz,plat_count6);
           }
           System.out.print("\nsir or kuch order karna hai then pess the button (1 to 6) " +
                   "this menu ");
           System.out.print("\nOrder List Ko Dekhane Ke Liye Then Press The button (8) = ");
           ValueStore.button18=0;
      // @@@@@@@@@  call menuDisplay method in MEnu class and  select item
           // ek bar bhio order hone par yah listcheking ki value 2 ho
           // jayegi or yah jaka ke kisi value me data store karva degi
         listchecking = 2;
           if(ValueStore.listchecking1 == 0){
               st.storeValue1(listchecking);
           }
           select.menuDisplay();
       }
    }
}
class ValueStore{
 static   int notDisplaymenu1 , listchecking1,confirm_order1,Totalcalculet1,currection;
 // watch Display menu list data type store
  static  int watch_M1,watch_chb1,watch_shp1,watch_apj1,watch_chtic1,watch_ppz1;
    ///// count plate number data type in store variable
     static int plat_count1,plat_count2,plat_count3,plat_count4,plat_count5,plat_count6;
     //// order list menu me plats kam ya jada karna hai
    static int platCountValue1,platCountValue2,platCountValue3,platCountValue4,platCountValue5,platCountValue6;
    // button set 7 , 8, 9 response th user
    static int button7,button9,button91,button78,button79,button810,button18,button8101;
    //////////////////////// button set Edit order menu list button set 10 To 15 ,1 to 6, 8 , 9
    static int Default78,button9D,button97,button10To15close,buttton10To15se7,button8102,Exceptionhandal10To15,button8,botton4,button9D1;
    void storeValue( int notDisplaymenu){
      notDisplaymenu1 = notDisplaymenu;
    }
    void storeValue1(int listchecking){
        listchecking1 = listchecking;
    }
    void storeValue3(int confirm_order ){
        confirm_order1 = confirm_order;
    }
    void TotalCalculetValue(int calculate){
        Totalcalculet1=+Totalcalculet1+calculate;
    }
    void storeValueDisplayMenuList1(int watch_M,int plat_count){
        watch_M1=watch_M;
        plat_count1 = plat_count;
    }
    void storeValueDisplayMenuList2(int watch_chb,int plat_count){
        watch_chb1=watch_chb;
        plat_count2=plat_count;
    }
    void storeValueDisplayMenuList3(int watch_shp,int plat_count){
        watch_shp1=watch_shp;
        plat_count3=plat_count;
    }
    void storeValueDisplayMenuList4(int watch_apj,int plat_count){
        watch_apj1=watch_apj;
        plat_count4=plat_count;
    }
    void storeValueDisplayMenuList5(int watch_chtic,int plat_count){
        watch_chtic1=watch_chtic;
        plat_count5=plat_count;
    }
    void storeValueDisplayMenuList6(int watch_ppz,int plat_count){
        watch_ppz1=watch_ppz;
        plat_count6=plat_count;
    }
}
// ------------
 ////   yah WatchMenuDisplay class ka upyog keval menu ko display karvane ke liye kiya ja raha hai
class WatchMenuDisplay{
    void Display(){
        System.out.println("\n\n\t\t\t\t1) Masala Dosha = 89 Rupees/plate\t\t\t\t2) " +
                "Chhole Batore = 92 Rupees/plate\n\t\t\t\t3) Sha" +
                "hi Paneer = 150 Rupees/plate\t\t\t\t4) Apple juse = 55 Rupees/Glass\n\t\t\t\t5) Choklety " +
                "icecream = 25 Rupees/piece\t\t\t6) Paneer Pizza = 208 Rupees/plate");
        System.out.print("\nClick On The Number Given In Front Of Whatever Food You Want To Order" +
                " \nOr Press A Number Greter Than 6 Or 0 TO Close The Menu =  ");
    }
}
// jab bhi main method se call aayegi vah pahli bar isi class ko call karegi
//====== matlab proigram yahi se start hoga or yah particular koi bhi item ko
// select karne ke liye yahi se input diya ja raha hai phir programe hamara yahi se dusare class me call ho raha hai
// particular ek item ko select karne ke liye
//############# pahli bar programe yahi se start hoga ##############
class Menu{
    static {
        System.out.println("\n\t\t\t\t\t\t\t   CODE AUTHOR IS ANKIT KUMAR SHRIVASTAVA\n\t\t\t" +
                "$.................. WELCOME TO THE ANKIT FOOD RESTAURANT....................$");
    }
    int selectItem,notDisplaymenu,Open_menu;
   void menuDisplay(){
  // @@@@@@@@@@@@@  object create SelectItemThisMEnu class in call the method
       Scanner sc = new Scanner (System.in);
        SelectItemThisMEnu menu = new SelectItemThisMEnu();
        tc789 c789 = new tc789();
       if(ValueStore.notDisplaymenu1==0) {
           if (notDisplaymenu <= 0) {
               System.out.print("\n\n\t\t\t\t\t\t\t  open Digital menu then press button 1 = ");
               // @@@@@@@@@@@  open menu correct input but programe starting
               try {
                   Open_menu = sc.nextInt();
               } catch (InputMismatchException inpm) {
                   System.out.println("\n\t\twrong input please try again letter");
             //  @@@@ call my class method in menuDisplay
                   menuDisplay();
               }
               if (Open_menu == 1) {
   ////////// @@@@@@ call WatchMenuDisplay class in method call Display and watch full menu
                   WatchMenuDisplay D = new WatchMenuDisplay();
                   D.Display();
               } else {
                   System.out.println("\n\n\t\twrong input pleas try again letter.......");
             //  @@@@ call my class method in menuDisplay
                   menuDisplay();
               }
           }//@@@@@@@@@ not display menu just 2 time in increase value notDisplaymenu
           notDisplaymenu = 1;
       }
           // @@@@@@@@@@@@@@@@@     break the program in condition and throw exceptions
        try {
            selectItem = sc.nextInt();
     // @@@@@@@@@@@@@  SelectItemThisMEnu class in call the method and store the value SendlistNo call method
            if (ValueStore.listchecking1 == 2 && selectItem==8){
                selectItem=8;
                menu.selectItem(selectItem);
            }else {
               if(ValueStore.listchecking1==2) {
                       menu.selectItem(selectItem);
               }else if (selectItem == 0 || selectItem >= 7) {
                    try {
                 //@@@ thow coustom exception in close the menu
                        throw new getException();
                 //@@@@ thow coustom exception
                    } catch (getException ge) {
                        System.out.println("\n\t\tClose the Digital menu......");
    ///// @@@@@@@@   call Digital menu class and terminated the programe ////////////
                        Digital_Menu dm = new Digital_Menu();
                            dm.ReturnMainMethod();
                    }
               }
           }
        }catch(InputMismatchException inp){
            if(ValueStore.listchecking1 == 2){
                if (ValueStore.Exceptionhandal10To15==1){
                    System.out.println("\n\t\twrong input please try again letter.......");
                    c789.editordermenulistStstement4();
                }
                else if( ValueStore.button9==5) {
                    c789.button7();
                }else if (ValueStore.button18==0) {
                    c789.button8();
                }
                else if(ValueStore.button8101==0){
                    c789.button9();
                }

                    menuDisplay();
            }
            else {
                System.out.println("\n\t\twrong input please try again letter.......");
                if (ValueStore.currection>0){
                   c789.button9();
                }else {
                    System.out.print("\nClick On The Number(1 to 6) Given In Front Of Whatever Food You Want To Order" +
                            " \nOr Press A Number Greater Than 6 Or 0 TO Close The Menu =  ");
                }
      //  @@@@ call my class method in menuDisplay
                menuDisplay();
            }
        }
   /* @@@@@@@@@  call menu selectitem method in SelectItemThisMEnu class -
              and pass select item reference  */
       ValueStore st=new ValueStore();

       /// rat ko cament kiya gauya hai agar jarurat padi to isko releaj kar diya jayega
       if(ValueStore.notDisplaymenu1==0) {
           st.storeValue(notDisplaymenu);
       }
        menu.selectItem(selectItem);
   }
}
////////////////// repeat try catch block and case 7 , 8 , 9 ,10 to 15
// /////and repeat EditingOrderListMenu class in the class tc789
class tc789{
    void Trycatch(){
        try {
            Thread.sleep(500);
        }catch(Exception ex){}
    }
    void button7(){
        System.out.println("\n\t\twrong input please try again letter.......");
        System.out.print("\nsir or kuchh order karna hai then press the button(1 to 6) " +
                "this menu \nya Total amount display then pess the button (7) = ");
    }
    void button8(){
        System.out.println("\n\t\twrong input please try again letter.......");
        System.out.print("\nsir or kuchh order karna hai then press the button " +
                "this menu ");
        System.out.print("\nOrder List Ko Dekhane Ke Liye Then Press The button (8) = ");
    }
    void button9(){
        System.out.println("\n\t\twrong input please try again letter.......");
        System.out.print("\nitem quantity change the order list menu any particular item select front number" +
                "\nsir or kuchh order karna hai then press the button(1 to 6) that's menu\n" +
                "or order list ko confirm karne ke liye press the button (9) = ");
    }
    void editordermenulistStstement4(){

        System.out.print("\nselect the front number and change the quantity in any particular item in order list");
        System.out.print("\nsir or kuchh order karna hai then press the button(1 to 6) that's menu");
        System.out.print("\nor order list ko confirm karne ke liye press the button (9)");
        System.out.print("\nOrder List Ko Dekhane Ke Liye Then Press The button (8) = ");
    }
}
/*
yah class me jo bhi order list me order add hua hai us order me item ki quantity ko
pluse or minuce karne ke liye kiya gaya hai is class me 6 condition hai
*/
class EditingOrderListMenu{
    int increseDecrease,store1,plat_count1,count1,printing;
    void editOrderLIst( int selectitem){
            Scanner sc = new Scanner(System.in);
            Menu call=new Menu();
            tc789 statementlist = new tc789();
            if ( (selectitem==10 && ValueStore.watch_M1==1) ||
                    (selectitem==11 && ValueStore.watch_chb1==1) || (selectitem==12 && ValueStore.watch_shp1==1)
                    || (selectitem==13 && ValueStore.watch_apj1==1) || (selectitem==14 && ValueStore.watch_chtic1==1)
                    || (selectitem==15 && ValueStore.watch_ppz1==1)) {
                //printing=1;
                System.out.println("\n\t\t$______________ OPEN EDIT QUANTITY PARTICULAR ANY ITEM _______________$");
            }
        //1=10
        //////////////// selectitem or watch_m1 isliye condition -
        // me kiya gaya hai ki taki jo menu order list me add hua hai usi ko edit kar sake
            if(selectitem==10 && ValueStore.watch_M1==1) {
                System.out.print("\n\tselected\t-\t\t\tMashala Dhosha " + ValueStore.platCountValue1 + " Rs. For " + ValueStore.plat_count1 + " piece = ");
                try{
                    increseDecrease = sc.nextInt();
                }catch(InputMismatchException inp){
                    System.out.println("\n\t\twrong input please try again letter.......");
                    editOrderLIst(selectitem);
                }
                plat_count1 = ValueStore.plat_count1;
                count1 = -(ValueStore.plat_count1);
                ValueStore.plat_count1 = ValueStore.plat_count1 + increseDecrease;
     /// yah condition isliye lagaya gaya hai ki koi bhi user minuce value enter nahi kar paye
                /// agar minuce inter kare to invalid number aaye.
                    if (increseDecrease <= 0 && increseDecrease >= count1) {
                    store1 = ValueStore.Totalcalculet1 - ValueStore.platCountValue1;
                        ValueStore.Totalcalculet1 = store1 + ValueStore.plat_count1 * 89;
                        ValueStore.platCountValue1 = ValueStore.plat_count1 * 89;
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t10) Mashala Dhosha " + ValueStore.platCountValue1 + " Rs. For " + ValueStore.plat_count1 + " piece\t update\n");
                }else if (increseDecrease > 0 ){
                        ValueStore.Totalcalculet1 = ValueStore.Totalcalculet1 + increseDecrease * 89;
                        ValueStore.platCountValue1 = ValueStore.platCountValue1 + increseDecrease* 89;
                        System.out.print("\n\t\t\t\t\t\t\t\t\t10) Mashala Dhosha " + ValueStore.platCountValue1 + " Rs. For " + ValueStore.plat_count1 + " piece\t update\n");
                }else{
                        System.out.println("\n\t\twrong input please try again letter.......");
                        ValueStore.plat_count1 = plat_count1;
                    editOrderLIst(selectitem);
                }
           // agar kisi bhi order ki quantyty zero hoti hai tab yah item order list me se hat jaye ga -
               /// isliye yah condition laga hai
                if(ValueStore.plat_count1 == 0){
                    ValueStore.watch_M1 = 0;
                }
                statementlist.editordermenulistStstement4();
                call.menuDisplay();
            }
            //2=11
            else if(selectitem==11 && ValueStore.watch_chb1==1) {
                System.out.print("\n\tselected\t-\t\t\t11) Chhole Batore " + ValueStore.platCountValue2 + " Rs. For "+ ValueStore.plat_count2 + " piece = ");
                try{
                    increseDecrease = sc.nextInt();
                }catch(InputMismatchException inp){
                    System.out.println("\n\t\twrong input please try again letter.......");
                    editOrderLIst(selectitem);
                }
                plat_count1 = ValueStore.plat_count2;
                count1 = -(ValueStore.plat_count2);
                ValueStore.plat_count2 = ValueStore.plat_count2 + increseDecrease;
                if (increseDecrease <= 0 && increseDecrease >= count1) {
                    store1 = ValueStore.Totalcalculet1 - ValueStore.platCountValue2;
                    ValueStore.Totalcalculet1 = store1 + ValueStore.plat_count2 * 92;
                    ValueStore.platCountValue2 = ValueStore.plat_count2 * 92;
                    System.out.print("\n\t\t\t\t\t\t\t\t\t11) Chhole Batore " + ValueStore.platCountValue2 + " Rs. For "+ ValueStore.plat_count2 + " piece\t update\n");
                }else if (increseDecrease > 0){
                    ValueStore.Totalcalculet1 = ValueStore.Totalcalculet1 + increseDecrease * 92;
                    ValueStore.platCountValue2 = ValueStore.platCountValue2 + increseDecrease * 92;
                    System.out.print("\n\t\t\t\t\t\t\t\t\t11) Chhole Batore " + ValueStore.platCountValue2 + " Rs. For "+ ValueStore.plat_count2 + " piece\t update\n");
                }
                else{
                    System.out.println("\n\t\twrong input please try again letter.......");
                    ValueStore.plat_count2 = plat_count1;
                    editOrderLIst(selectitem);
                }
                if(ValueStore.plat_count2 == 0) {
                    ValueStore.watch_chb1 = 0;
                }
                statementlist.editordermenulistStstement4();
                call.menuDisplay();
            }
            // 3=12
            else if(selectitem==12 && ValueStore.watch_shp1==1) {
                System.out.print("\n\tselected\t-\t\t\t12) Shahi Paneer " +  ValueStore.platCountValue3 + " Rs. For "+ ValueStore.plat_count3 + " piece = ");
                try{
                    increseDecrease = sc.nextInt();
                }catch(InputMismatchException inp){
                    System.out.println("\n\t\twrong input please try again letter.......");
                    editOrderLIst(selectitem);
                }
                plat_count1 = ValueStore.plat_count3;
                count1 = -(ValueStore.plat_count3);
                ValueStore.plat_count3 = ValueStore.plat_count3 + increseDecrease;
                if (increseDecrease <= 0 && increseDecrease >= count1) {
                    store1 = ValueStore.Totalcalculet1 - ValueStore.platCountValue3;
                    ValueStore.Totalcalculet1 = store1 + ValueStore.plat_count3 * 150;
                    ValueStore.platCountValue3 = ValueStore.plat_count3 * 150;
                    System.out.print("\n\t\t\t\t\t\t\t\t\t12) Shahi Panner " + ValueStore.platCountValue3 + " Rs. For "+ ValueStore.plat_count3 + " piece\t update\n");
                }else if (increseDecrease > 0){
                    ValueStore.Totalcalculet1 = ValueStore.Totalcalculet1 + increseDecrease * 150;
                    ValueStore.platCountValue3 = ValueStore.platCountValue3 + increseDecrease * 150;
                    System.out.print("\n\t\t\t\t\t\t\t\t\t12) Shahi Panner " + ValueStore.platCountValue3 + " Rs. For "+ ValueStore.plat_count3 + " piece\t update\n");
                }
                else{
                    System.out.println("\n\t\twrong input please try again letter.......");
                    ValueStore.plat_count3 =  plat_count1;
                    editOrderLIst(selectitem);
                }
                if(ValueStore.plat_count3 == 0){
                    ValueStore.watch_shp1=0;
                }
                statementlist.editordermenulistStstement4();
                call.menuDisplay();
            }
          //4=13
            else if(selectitem==13 && ValueStore.watch_apj1==1) {
                System.out.print("\n\tselected\t-\t\t\t13) Apple juice " + ValueStore.platCountValue4 + " Rs. For "+ ValueStore.plat_count4 + " piece = ");
                try{
                    increseDecrease = sc.nextInt();
                }catch(InputMismatchException inp){
                    System.out.println("\n\t\twrong input please try again letter.......");
                    editOrderLIst(selectitem);
                }
                plat_count1 =  ValueStore.plat_count4;
                count1 = -(ValueStore.plat_count4);
                ValueStore.plat_count4 = ValueStore.plat_count4 + increseDecrease;
                if (increseDecrease <= 0 && increseDecrease >= count1) {
                    store1 = ValueStore.Totalcalculet1 - ValueStore.platCountValue4;
                    ValueStore.Totalcalculet1 = store1 + ValueStore.plat_count4 * 55;
                    ValueStore.platCountValue4 = ValueStore.plat_count4 * 55;
                    System.out.print("\n\t\t\t\t\t\t\t\t\t13) Apple juice " + ValueStore.platCountValue4 + " Rs. For "+ ValueStore.plat_count4 + " piece\t update\n");
                }else if (increseDecrease > 0){
                    ValueStore.Totalcalculet1 = ValueStore.Totalcalculet1 + increseDecrease * 55;
                    ValueStore.platCountValue4 = ValueStore.platCountValue4 + increseDecrease * 55;
                    System.out.print("\n\t\t\t\t\t\t\t\t\t13) Apple juice " + ValueStore.platCountValue4 + " Rs. For "+ ValueStore.plat_count4 + " piece\t update\n");
                }else{
                    System.out.println("\n\t\twrong input please try again letter.......");
                    ValueStore.plat_count4 = plat_count1;
                    editOrderLIst(selectitem);
                }
                if(ValueStore.plat_count4 == 0){
                    ValueStore.watch_apj1 = 0;
                }
                statementlist.editordermenulistStstement4();
                call.menuDisplay();
            }
            //5=14
            else if(selectitem==14 && ValueStore.watch_chtic1==1) {
                System.out.print("\n\tselected\t-\t\t\t14) Chocolaty ice-cream " +  ValueStore.platCountValue5 + " Rs. For "+ ValueStore.plat_count5 + " piece = ");
                try{
                    increseDecrease = sc.nextInt();
                }catch(InputMismatchException inp){
                    System.out.println("\n\t\twrong input please try again letter.......");
                    editOrderLIst(selectitem);
                }
                plat_count1 =  ValueStore.plat_count5;
                count1 = -(ValueStore.plat_count5);
                ValueStore.plat_count5 = ValueStore.plat_count5 + increseDecrease;
                if (increseDecrease <= 0 && increseDecrease >= count1) {
                    store1 = ValueStore.Totalcalculet1 - ValueStore.platCountValue5;
                    ValueStore.Totalcalculet1 = store1 + ValueStore.plat_count5 * 25;
                    ValueStore.platCountValue5 = ValueStore.plat_count5 * 25;
                    System.out.print("\n\t\t\t\t\t\t\t\t14) Chocolaty ice-cream " + ValueStore.platCountValue5 + " Rs. For "+ ValueStore.plat_count5 + " piece\t update\n");
                }else if (increseDecrease>0){
                    ValueStore.Totalcalculet1 = ValueStore.Totalcalculet1 + increseDecrease * 25;
                    ValueStore.platCountValue5 = ValueStore.platCountValue5 + increseDecrease * 25;
                    System.out.print("\n\t\t\t\t\t\t\t\t14) Chocolaty ice-cream " + ValueStore.platCountValue5 + " Rs. For "+ ValueStore.plat_count5 + " piece\t update\n");
                }else{
                    System.out.println("\n\t\twrong input please try again letter.......");
                    ValueStore.plat_count5 = plat_count1;
                    editOrderLIst(selectitem);
                }
                if(ValueStore.plat_count5 == 0){
                    ValueStore.watch_chtic1 = 0;
                }
                statementlist.editordermenulistStstement4();
                call.menuDisplay();
            }
           //6=15
            else if(selectitem==15 && ValueStore.watch_ppz1==1) {
                System.out.print("\n\t\tselected\t-\t\t15) Paneer Pizza " + ValueStore.platCountValue6 + " Rs. For "+ ValueStore.plat_count6 + " piece = ");
                try{
                    increseDecrease = sc.nextInt();
                }catch(InputMismatchException inp){
                    System.out.println("wrong input please try again letter.......");
                    editOrderLIst(selectitem);
                }
                plat_count1 = ValueStore.plat_count6;
                count1 = -(ValueStore.plat_count6);
                ValueStore.plat_count6 = ValueStore.plat_count6 + increseDecrease;
                if (increseDecrease <= 0 && increseDecrease >= count1) {
                    store1 = ValueStore.Totalcalculet1 - ValueStore.platCountValue6;
                    ValueStore.Totalcalculet1 = store1 + ValueStore.plat_count6 * 208;
                    ValueStore.platCountValue6 = ValueStore.plat_count6 * 208;
                    System.out.print("\n\t\t\t\t\t\t\t\t\t15) Paneer Pizza " + ValueStore.platCountValue6 + " Rs. For "+ ValueStore.plat_count6 + " piece\t update\n");
                }else if (increseDecrease>=0){
                    ValueStore.Totalcalculet1 = ValueStore.Totalcalculet1 + increseDecrease * 208;
                    ValueStore.platCountValue6 = ValueStore.platCountValue6 + increseDecrease * 208;
                    System.out.print("\n\t\t\t\t\t\t\t\t\t15) Paneer Pizza " + ValueStore.platCountValue6 + " Rs. For "+ ValueStore.plat_count6 + " piece\t update\n");
                }
                else{
                    System.out.println("\n\t\twrong input please try again letter.......");
                    ValueStore.plat_count6 =  plat_count1;
                    editOrderLIst(selectitem);
                }
                if(ValueStore.plat_count6 == 0) {
                    ValueStore.watch_ppz1 = 0;
                }
                statementlist.editordermenulistStstement4();
                call.menuDisplay();
            }
    }
}
/*
jo bhi item Menu class se aata hai select me input lekar kar vah yaha sabhi condition ko match
klarta hai vah us condition ke ander chala jata hai is class me 1 se 15 tak condition switch case ke jariye istemal kiya gaya hai
 */
class SelectItemThisMEnu {
    int MashalaDosha=89,ChholeBatore=92,ShahiPaneer=150,Applejuce=55,ChokletyIcecream=25,PannerPizza=208;
void OrderCencelStatement(){
    System.out.print("\t\t\t\tTo cancel the order then button 0 = ");
}
    void selectItem(int selectitem) {
   // create  RepeatMethod class object
        RepeatMethod rept = new RepeatMethod();
        ItemAdingMenuLIstDisplay ListDisplay = new ItemAdingMenuLIstDisplay();
        SelectItemThisMEnu ordercencelzero = new SelectItemThisMEnu();
        EditingOrderListMenu edtolm = new EditingOrderListMenu();
        ValueStore st=new ValueStore();
        tc789 c789 = new tc789();
        Menu call=new Menu();
        conditiontrue DataFatch = new conditiontrue();
        int  notDisplaymenu=1;
        if(ValueStore.notDisplaymenu1==0) {
            st.storeValue(notDisplaymenu);
        }
        // agar koi bhi item ko 1 se 6 tak kharidta hai tab
        // yah condition true ho jayega or value ko set kar dega
        if(selectitem<=6 && selectitem>=1){
           ValueStore.button9=0;ValueStore.button8101=0;ValueStore.button18=0;ValueStore.button91=0;
           ValueStore.button78=0;ValueStore.button10To15close=1;ValueStore.buttton10To15se7=0;
           ValueStore.Default78=0;ValueStore.button8102=1;ValueStore.button9D=0;ValueStore.button97=0;
           ValueStore.Exceptionhandal10To15=0;ValueStore.button8=1;ValueStore.botton4=0;ValueStore.button9D1 =0;
        }
        switch (selectitem) {
            case 1:
                System.out.println("\n\t\tsir How Many plates Mashala Dosha\t\t\t\t--\t\t\t\t\t"+MashalaDosha+" rupees/plate");
                ordercencelzero.OrderCencelStatement();
                rept.repeat(selectitem,MashalaDosha);
            case 2:
                System.out.println("\n\t\tsir How Many plates Chhole Batore\t\t\t\t--\t\t\t\t\t"+ChholeBatore+" rupees/plate");
                ordercencelzero.OrderCencelStatement();
                rept.repeat(selectitem,ChholeBatore);
            case 3:
                System.out.println("\n\t\tsir How Many plates Shahi Paneer\t\t\t--\t\t\t\t\t\t"+ShahiPaneer+" rupees/plate");
                ordercencelzero.OrderCencelStatement();
                rept.repeat(selectitem,ShahiPaneer);
            case 4:
                System.out.println("\n\t\tsir How Many Glass Apple juice\t\t\t\t\t--\t\t\t\t\t\t"+Applejuce+" rupees/Glass");
                ordercencelzero.OrderCencelStatement();
                rept.repeat(selectitem,Applejuce);
            case 5:
                System.out.println("\n\t\tsir How Many Piece Chocolaty ice-icream\t\t\t\t--\t\t\t\t\t"+ChokletyIcecream+" rupees/Piece");
                ordercencelzero.OrderCencelStatement();
                rept.repeat(selectitem,ChokletyIcecream);
            case 6:
                System.out.println("\n\t\tsir How Many plates Panner Pizza\t\t\t\t\t--\t\t\t\t\t"+PannerPizza+" rupees/plate");
                ordercencelzero.OrderCencelStatement();
                rept.repeat(selectitem,PannerPizza);
            case 7:
                if(ValueStore.button7==1 && ValueStore.button9==5 && ValueStore.button9D==1) {
                    ValueStore.Default78=0;
                    System.out.print("\n\n\t processing.....");
                    try {
                        Thread.sleep(2500);
                    }catch(Exception ex){}
                    System.out.println("\n\n\tTotal Amount is = " + ValueStore.Totalcalculet1+" Rupees");
                    Digital_Menu dm = new Digital_Menu();
                    dm.ReturnMainMethod();
                }else if (ValueStore.buttton10To15se7==1){
                    System.out.println("\n\t\twrong input please try again letter.......");
                    c789.editordermenulistStstement4();
                }
                else if( ValueStore.button91==1) {
                    c789.button9();
                    ValueStore.Default78 = 5;
                }
                else{
                    c789.button8();
                }
               call.menuDisplay();
            case 8:
                if(ValueStore.button9D==0 || ValueStore.button9D1 == 1){
                    ValueStore.button9=1;ValueStore.button91=1;ValueStore.button18=1;
                    ValueStore.Default78=5;ValueStore.button10To15close=0;ValueStore.buttton10To15se7=0;
                    ValueStore.button810=1;ValueStore.button9D=1;ValueStore.button8102=0;ValueStore.Exceptionhandal10To15=0;
                    ValueStore.button8=0;ValueStore.botton4=0;ValueStore.button9D1=0;
                    ListDisplay.menuListDisplay();
                }else if ( ValueStore.button78==1){
                    c789.button7();
                }
                else{
                    c789.button9();
                }
                call.menuDisplay();
            case 9:
                if(ValueStore.button9==1) {
                    ValueStore.button7=1;ValueStore.button9=5;ValueStore.Default78=0;
                    ValueStore.button10To15close=0;ValueStore.button97=1;ValueStore.button9D1=0;
                    System.out.print("\n\tOrder Success Full Confirm.....");
                    try {
                        Thread.sleep(3000);
                        System.out.print("\n\t\tsir order is ready..");
                        Thread.sleep(1500);
                        System.out.println("\n\t\t\t\tsir tacke this order...\n");
                        Thread.sleep(1500);
                    }catch(Exception ex){}
                    try {
                        Thread.sleep(1000);
                    }catch(Exception e){}
                    System.out.print("\nsir or kuch order karna hai then press the button(1 to 6) " +
                            "that's menu \nya Total amount display then pess the button (7) = ");
                    ValueStore.button78=1;
                    ValueStore.button79=1;
                }else if(ValueStore.button79==1) {
                    c789.button7();
                }else{
                    c789.button8();
                }
                call.menuDisplay();
            case 10,11,12,13,14,15:
                if(ValueStore.button10To15close==1) {
                    ValueStore.button9D = 0;
                    c789.button8();
                    call.menuDisplay();
                }else if (ValueStore.button97==1){
                    c789.button7();
                    call.menuDisplay();
                }else if(selectitem == 10 && ValueStore.watch_M1==1){
                    ValueStore.botton4=1;
                    DataFatch.conditiontru10To15();
                    edtolm.editOrderLIst(selectitem);
                }else if(selectitem == 11 && ValueStore.watch_chb1==1){
                    ValueStore.botton4=1;
                    DataFatch.conditiontru10To15();
                    edtolm.editOrderLIst(selectitem);
                }else if(selectitem == 14 && ValueStore.watch_chtic1==1){
                    ValueStore.botton4=1;
                    DataFatch.conditiontru10To15();
                    edtolm.editOrderLIst(selectitem);
                }else if(selectitem == 12 && ValueStore.watch_shp1==1){
                    ValueStore.botton4=1;
                    DataFatch.conditiontru10To15();
                    edtolm.editOrderLIst(selectitem);
                }else if(selectitem == 15 && ValueStore.watch_ppz1==1){
                    ValueStore.botton4=1;
                    DataFatch.conditiontru10To15();
                    edtolm.editOrderLIst(selectitem);
                }else if(selectitem == 13 && ValueStore.watch_apj1==1){
                    ValueStore.botton4=1;
                    DataFatch.conditiontru10To15();
                    edtolm.editOrderLIst(selectitem);
                } else if (ValueStore.button8==1){
                    c789.button8();
                    call.menuDisplay();
                }else if (ValueStore.botton4==1){
                    edtolm.editOrderLIst(selectitem);
                }else {
                    c789.button9();
                    call.menuDisplay();
                }
            default:
               if (ValueStore.buttton10To15se7==1){
                System.out.println("\n\t\twrong input please try again letter.......");
                c789.editordermenulistStstement4();
               } else if (ValueStore.Default78 == 5){
                   c789.button9();
               }else if(ValueStore.button9D==0 || ValueStore.button8102==1){
                   c789.button8();
              }else if( ValueStore.button810==0){
                   c789.button9();
              }else if(ValueStore.button79==1) {
                   c789.button7();
              }
                call.menuDisplay();
        }
    }
}
class conditiontrue{
    void conditiontru10To15(){
        ValueStore.button9D1=1;
        ValueStore.buttton10To15se7=1;
        ValueStore.Exceptionhandal10To15=1;
    }
}
////// yah class ItemAdingMenuLIstDisplay ka use jo bhi item order hua hai
// ya us order me kuch edit kiya gaya hai vah sara yahi se display hoga
class ItemAdingMenuLIstDisplay {
    void menuListDisplay() {
        Menu select=new Menu();
        tc789 c789 = new tc789();
        System.out.println("\n\t\t~~~~~~~~~~~~~~~~~~~~~~~~ OPEN ADDING ORDER MENU LIST ~~~~~~~~~~~~~~~~~~~~~~~~~~");
            // 1.
            if(ValueStore.watch_M1 > 0){
                try {
                    Thread.sleep(1000);
                }catch(Exception ex){}
                    ValueStore.platCountValue1 = ValueStore.plat_count1 * 89;
                System.out.println("\n\t\t\t 10) Mashala Dhosha = " + ValueStore.plat_count1+ " Plate Order.." +
                        "\t\t--\t\t\t\t"+ValueStore.platCountValue1+" Rupees/-");
            }
           // 2.
            if(ValueStore.watch_chb1>0){
                c789.Trycatch();
                ValueStore.platCountValue2 = ValueStore.plat_count2*92;
                System.out.println("\n\t\t\t 11) Chhole Batore = " + ValueStore.plat_count2 + " Plate Order.." +
                        "\t\t--\t\t\t\t"+ValueStore.platCountValue2+" Rupees/-");
            }
            // 3.
            if(ValueStore.watch_shp1>0){
                c789.Trycatch();
                ValueStore.platCountValue3 = ValueStore.plat_count3*150;
                System.out.println("\n\t\t\t 12) Shahi Paneer = " + ValueStore.plat_count3 + " Plate Order.." +
                        "\t\t\t--\t\t\t\t"+ ValueStore.platCountValue3+" Rupees/-");
            }
           // 4.
            if(ValueStore.watch_apj1>0) {
                c789.Trycatch();
               ValueStore.platCountValue4 = ValueStore.plat_count4*55;
                System.out.println("\n\t\t\t 13) Apple juce = " + ValueStore.plat_count4 + " Glass Order.." +
                        "\t\t\t--\t\t\t\t"+ValueStore.platCountValue4+" Rupees/-");
            }
            // 5.
            if(ValueStore.watch_chtic1>0){
                c789.Trycatch();
               ValueStore.platCountValue5 = ValueStore.plat_count5*25;
                System.out.println("\n\t\t\t 14) Choklety icecream = " + ValueStore.plat_count5 + " pice Order.." +
                        "\t\t--\t\t\t\t"+ValueStore.platCountValue5+" Rupees/-");
            }
            // 6.
            if(ValueStore.watch_ppz1>0){
                c789.Trycatch();
                ValueStore.platCountValue6 = ValueStore.plat_count6*208;
                System.out.println("\n\t\t\t 15) Paneer Pizza = " + ValueStore.plat_count6 + " Plate Order.." +
                        "\t\t\t--\t\t\t\t"+ValueStore.platCountValue6+" Rupees/-");
            }
        c789.Trycatch();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  ---------------\n" +
                "\t\t\t\t\tTotal Amount is \t\t\t\t\t--\t\t\t    "+ValueStore.Totalcalculet1+" Rupees/-");
        System.out.print("\nitem quantity change the order list menu any particular item select front number" +
                "\nsir or kuchh order karna hai then press the button(1 to 6) thats menu\n" +
                "or order list ko confirm karne ke liye press the button (9) = ");
        ValueStore.currection=1;
        select.menuDisplay();
    }
}
// yah sabse main class hai jab bhi jvm hamare program ko start karega yahi se isi class ke
// main method se call karega kisi other class
public class Digital_Menu{
    int  notDisplaymenu;
    void ReturnMainMethod(){
        ValueStore st=new ValueStore();
        Menu dm = new Menu();
        while (true) {
            ValueStore.notDisplaymenu1=0;  ValueStore.listchecking1=0;ValueStore.confirm_order1=0;ValueStore.Totalcalculet1=0;ValueStore.currection=0;
            // watch Display menu list data type store
            ValueStore.watch_M1=0;ValueStore.watch_chb1=0;ValueStore.watch_shp1=0;ValueStore.watch_apj1=0;ValueStore.watch_chtic1=0;ValueStore.watch_ppz1=0;
            ///// count plate number data type in store variable
            ValueStore.plat_count1=0;ValueStore.plat_count2=0;ValueStore.plat_count3=0;ValueStore.plat_count4=0;ValueStore.plat_count5=0;ValueStore.plat_count6=0;
            //// order list menu me plats kam ya jada karna hai
            ValueStore.platCountValue1=0;ValueStore.platCountValue2=0;ValueStore.platCountValue3=0;ValueStore.platCountValue4=0;ValueStore.platCountValue5=0;ValueStore.platCountValue6=0;
            // button se 7 , 8, 9 response th user
            ValueStore.button7=0;ValueStore.button9=0;ValueStore.button91=0;ValueStore.button78=0;ValueStore.button79=0;ValueStore.button810=0;ValueStore.button18=0;
            st.storeValue(notDisplaymenu);
            dm.menuDisplay();
        }
    }
    public static void main(String[] args) {
        Menu dm = new Menu();
        dm.menuDisplay();
    }
}