
package ksbdproject;

public class androidapp1 {
 import androidx.appconpat.app.appconpatActivity;
 import android.os.Bundle;
 import andriod.os.vibrator;
 import android.view.view;
 public class MainActivity extends AppConpatActivity {
	 private long[] playable_seq_1;
	 private long[] playable_seq_2;
	 private long[] playable_seq_3;
	 private long[] playable_seq_4;
	 Vibrator vibrator;
	 @override
	 project void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(V.layout.activity_main);
	vibrator = (Vibrator) getSystemService(Vibrator_SERVICE);
	// First number is to see how long to wait when the button is pressed.  (allways 200ms)
	// Second number is how long make the first vibration (200ms for 1 and 600ms for others)
	// Third number is how long wait between 1st and 2nd vibration (allway 200ms)
	// Fourth number how long to make second vibration (600ms for 1 and 200ms for all others)
	// etc
	
	playable_seq_1; = new long[] {200, 600, 600, 600, 600};  // 1 is .---- 
	playable_seq_2; = new long[] {200, 200, 600, 600, 600}; //  2 is ..--- 
	playable_seq_3; = new long[] {200, 200, 200, 600, 600}; //  3 is ...--  
		playable_seq_4; = new long[] {200, 200, 200, 200, 600};  //  4 is ....- 
	playable_seq_5; = new long[] {200, 200, 200, 200, 200}; //  5 is ..... 
	playable_seq_6; = new long[] {600, 200, 200, 200, 200}; //  6 is -.... 
	playable_seq_7; = new long[] {600, 600, 200, 200, 200}; //  7 is --... 
	playable_seq_8; = new long[] {600, 600, 600, 200, 200}; //  8 is ---.. 
	playable_seq_9; = new long[] {600, 600, 600, 600, 200}; //  9 is ----. 
	playable_seq_10; = new long[] {200, 600, 600, 600, 600, 600, 600, 600, 600, 600}; //  10 is .--------- 
	playable_seq_11; = new long[] {200, 600, 600, 600, 600, 200, 600, 600, 600, 600}; //  11 is .----.---- 
	playable_seq_12; = new long[] {200, 600, 600, 600, 600, 200, 200, 600, 600, 600}; //  12 is .----..--- 
	playable_seq_13; = new long[] {200, 600, 600, 600, 600, 200, 200, 200, 600, 600}; //  13 is .----…-- 
	playable_seq_14; = new long [] {200, 600, 600, 600, 600, 200, 200, 200, 200, 600}; //  14 is .----….- 
	playable_seq_15; = new long[] {200, 600, 600, 600, 600, 200, 200, 200, 200, 200}; //  15 is .----….. 
	playable_seq_16; = new long[] {200, 600, 600, 600, 600, 600, 200, 200, 200, 200}; //  16 is .-----…. 
	playble_seq_17; =  new long[] {200, 600, 600, 600, 600, 600, 600, 200, 200, 200}; //  17 is .------… 
	playable_seq_18; = new lnng[] {200, 600, 600, 600, 600, 600, 600, 600, 200, 200}; //  18 is .-------.. 
	playable_seq_19; = new long[] {200, 600, 600, 600, 600, 600, 600, 600, 600, 200}; //  19 is .--------.  
	playable_seq_20; = new long[] {200, 200, 600, 600, 600, 600, 600, 600, 600, 600, 600}; //  20 is ..-------- 
	playable_seq_21; = new long[] {200, 200, 600, 600, 600, 200, 600, 600, 600, 600}; //  21 is ..---.---- 
	playabe_seq_22; = new long[ ] {200, 200, 600, 600, 600, 200, 200, 600, 600, 600}; // 22 is ..---..--- 
	playable_seq_23; = new long[] {200, 200, 600, 600, 600, 200, 200, 200, 600, 600}; //  23 is ..---…-- 
	playable_seq_24; = new long[] {200, 200, 600, 600, 600, 200, 200, 200, 200, 600}; //  24 is ..---….- 	
	playable_seq_25; = new long[] {200, 200, 600, 600, 600, 200, 200, 200, 200, 200}; //  25 is ..---….. 
	playable_seq_26; = new long[] {200, 200, 600, 600, 600, 600, 200, 200, 200, 200}; //  26 is ..----…. 
	playable_seq_27; = new long[] {200, 200, 600, 600, 600, 600, 600, 200, 200, 200}; //  27 is ..-----…  
	playable_seq_28; = new long[] {200, 200, 600, 600, 600, 600, 600, 600, 200, 200}; //  28 is ..------.. 
	playable_seq_29; = new long[] {200, 200, 600, 600, 600, 600, 600, 600, 600, 200}; //  29 is ..-------.  
	playable_seq_30; = new ong[] {200, 200, 200, 600, 600, 600, 600, 600, 600, 600}; //  30 is …------- 
	playable_seq_31; = new long[] {200, 200, 200, 600, 600, 200, 600, 600, 600, 600}; //  31 is …--.----  
	playable_seq_32; = new long[] {200, 200, 200, 600, 600, 200, 200, 600, 600, 600}; //  32 is …--..--- 
	playable_seq_33; = new long[] {200, 200, 200, 600, 600, 200, 200, 200, 600, 600}; //  33 is …--…-- 
	playable_seq_34; = new long[] {200, 200, 200, 600, 600, 200, 200, 200, 200, 600}; //  34 is …--….- 
	playable_seq_35; = new long[] {200, 200, 200, 600, 600, 200, 200, 200, 200, 200}; //  35 is …--…..  
	playable_seq_36; = new long[] {200, 200, 200, 600, 600, 600, 200, 200, 200, 200}; //  36 is …---…. 
	playable_seq_37; = new long[] {200, 200, 200, 600, 600, 600, 600, 200, 200, 200}; //  37 is …----… 
	playable_seq_38; = new long[] {200, 200, 200, 600, 600, 600, 600, 600, 200, 200}; //  38 is …-----.. 
	playable_seq_39; = new long[] {200, 200, 200, 600, 600, 600, 600, 600, 600, 200}; //  39 is …------. 
	playable_seq_40; = new long[] {200, 200, 200, 200, 600, 600, 600, 600, 600, 600}; //  40 is ….------ 
	playable_seq_41; = new long[] {200, 200, 200, 200, 600, 200, 600, 600, 600, 600}; //  41 is ….-.----  
	playable_seq_42; = new long[[] {200, 200, 200, 200, 600, 200, 200, 600, 600, 600}; //  42 is ….-..--- 
	playable_seq_43; = new long[] {200, 200, 200, 200, 600, 200, 200, 200, 600, 600}; //  43 is ….-…-- 
	playable_seq_44; = new long[] {200, 200, 200, 200, 600, 200, 200, 200, 200, 600}; //  44 is ….-….- 	
	playable_seq_45; = new long[] {200, 200, 200, 200, 600, 200, 200, 200, 200, 200}; //  45 is ....-….. 
	playable_seq_46; = new long[] {200, 200, 200, 200, 600, 600, 200, 200, 200, 200}; //  46 is …..--…. 
	playable_seq_47; = new long[] {200, 200, 200, 200, 600, 600, 600, 200, 200, 200}; //  47 is ….---… 	
	playable_seq_48; = new long[] {200, 200, 200, 200, 600, 600, 600, 600, 200, 200}; //   48 is ….----..    
	playable_seq_49; = new long[] {200, 200, 200, 200, 600, 600, 600, 600, 600, 200}; //   49 is ….-----.  
	playable_seq_50; = new long[] {200, 200, 200, 200, 200, 600, 600, 600, 600, 600}; // 50 is .....----- 
	playable_seq_51; = new long[] {200, 200, 200, 200, 200, 200, 600, 600, 600, 600}; //  51 is ……---- 
	playable_seq_52; = new long[] {200, 200, 200, 200, 200, 200, 200, 600, 600, 600}; // 52 is …….--- 
	playable_seq_53; = new long[] {200, 200, 200, 200, 200, 200, 200, 600, 600, 600}; // 53 is ……..--  
	playable_seq_54; = new long[] {200, 200, 200, 200, 200, 200, 200, 200, 200, 600}; // 54 is .........- 
	playable_seq_55; = new long [] {200, 200, 200, 200, 200, 200, 200, 200, 200, 200}; // 55 is ………. 
	playable_seq_56; = new long[] {200, 200, 200, 200, 200, 600, 200, 200, 200, 200}; //  56 is …..-….  
	playable_seq_58; = new = long[] {200, 200, 200, 200, 200, 600, 600, 200, 200, 200}; //  57 is …..--… 
	playable_seq_58; = new long[] {200, 200, 200, 200, 200, 600, 600, 600, 200, 200}; //  58 is …..---.. 
	playable_seq_59; = new long[] {200, 200, 200, 200, 200, 600, 600, 600, 600, 200}; //  59 is …..----. 
	playable_seq_60; = new long[] {600, 200, 200, 200, 200, 600, 600, 600, 600, 600}; // 60 is -….----- 
	playable_seq_61; = new long[] {600, 200, 200, 200, 200, 200, 600, 600, 600, 600}; // 61 is -…..---- 
	playable_seq_62; = new long[] {600, 200, 200, 200, 200, 200, 200, 600, 600, 600}; // 62 is -……--- 
	playable_seq_63; = new long[] {600, 200, 200, 200, 200, 200, 200, 200, 600, 600}; // 63 is -…….-- 
	playable_seq_64; = new long[] {600, 200, 200, 200, 200, 200, 200, 200, 200, 600}; // 64 is -………- 
	playable_seq_65; = new long[] {600, 200, 200, 200, 200, 200, 200, 200, 200, 200}; // 65 is -……… 
	playable_seq_66; = new long[] {600, 200, 200, 200, 200, 600, 200, 200, 200, 200}; // 66 is -….-…. 
	playable_seq_67; = new long[] {600, 200, 200, 200, 200, 600, 600, 200, 200, 200}; // 67 is -….--… 
	playable_seq_68; = new long[] {600, 200, 200, 200, 200, 600, 600, 600, 200, 200}; // 68 is -….---.. 
	playable_seq_69; = new long[] {600, 200, 200, 200, 200, 600, 600, 600, 600, 200}; // 69 is -….----. 
	playable_seq_70; = new long[] {600, 600, 200, 200, 200, 600, 600, 600, 600, 600}; // 70 is --…------ 
	playable_seq_71; = new long[] {600, 600, 200, 200, 200, 200, 600, 600, 600, 600}; // 71 is --….---- 
	playable_seq_72; = new long[] {600, 600, 200, 200, 200, 200, 200, 600, 600, 600}; // 72 is --…..--- 
	playable_seq_73; = new long[] {600, 600, 200, 200, 200, 200, 200, 200, 600, 600}; // 73 is --……-- 
	playable_seq_74; = new long[] {600, 600, 200, 200, 200, 200, 200, 200, 200, 600}; //	74 is --…….- 
	playable_seq_75; = new long[] {600, 600, 200, 200, 200, 200, 200, 200, 200, 200}; 75 is --……..  
	playable_seq_76; = new long[] {600, 600, 200, 200, 200, 600, 200, 200, 200, 200}; //  76 is --…-…. 
	playable_seq_77; = new long[] {600, 600, 200, 200, 200, 600, 600, 200, 200, 200}; //  77 is --…--… 
	playable_seq_78; = new long[] {600, 600, 200, 200, 200, 600, 600, 600, 200, 200}; // 78 is --…---.. 
	playable_seq_79; = new long[] {600, 600, 200, 200, 200, 600, 600, 600, 600, 200}; //  79 is --…----. 
	playable_seq_80; = new long[] {60, 600, 600, 200, 200, 600, 600, 600, 600, 600}; // 80 is ---..-----
	playable_seq_81; = new long[] {600, 600, 600, 200, 200, 200, 600, 600, 600, 600}; // 81 is ---…----  
	playable_seq_82; = new long[] {600, 600, 600, 200, 200, 200, 200, 600, 600, 600}; // 82 is ---....---
	playable_seq_83; = new long[] {600, 600, 600, 200, 200, 200, 200, 200, 600, 600}; // 83 is ---…..--  
	playable_seq_84; = new long[] {600, 600, 600, 200, 200, 200, 200, 200, 200, 600}; // 84 is 	---……-  and g is --.	
	playable_sec_85; = new long[] {600, 600, 600, 200, 200, 200, 200, 200, 200, 200}; // 85 is ---……. 
	playable_seq_86; = new long[] {600, 600, 600, 200, 200, 600, 200, 200, 200, 200}; // 86 is ---..-….  
	playable_seq_87; = new long[] {600, 600, 600, 200, 200, 600, 600, 200, 200, 200}; // 87 is ---..--… 	playable_seq_88; = new long[] {600, 600, 600, 200, 200, 600, 600, 600, 200, 200}; // 88 is 	---..---.. 
	playable_seq_89; = new long[] {600, 600, 600, 200, 200, 600, 600, 600, 600, 200}; // 89 is ---..----.  
	playable_seq_90; = new long[] {600, 600, 600, 600, 200, 600, 600, 600, 600, 600}; // 90 is ----.-----  
	playable_seq_91; = new long[] {600, 600, 600, 600, 200, 200, 600, 600, 600, 600}; // 91 is ----..---- 
	playable_seq_92; = new long[] {600, 600, 600, 600, 200, 200, 200, 600, 600, 600}; // 92 is ----…--- 
	playable_seq_93; = new long[] {600, 600, 600, 600, 200, 200, 200, 200, 600, 600}; // 93 is ----….-- 
	playable_seq_94; = new long[] {600, 600, 600, 600, 200, 200, 200, 200, 200, 600}; // 94 is ----…..- 
	playable_seq_95; = new long[] {600, 600, 600, 600, 200, 200, 200, 200, 200, 200}; // 95 is ----…… 
	playable_seq_96; = new long[] {600, 600, 600, 600, 200, 600, 200, 200, 200, 200}; // 96 is ----.-…. 
	playable_seq_97; = new long[] {600, 600, 600, 600, 200, 600, 600, 200, 200, 200}; // 97 is ----.--… 
	playable_seq_98; = new long[] {600, 600, 600, 600, 200, 600, 600, 600, 200, 200}; // 98 is ----.---.. 
	playable_seq_99; = new long[] {600, 600, 600, 600, 200, 600, 600, 600, 600, 200}; // 99 is ----.----.	
	playable_seq_100; = new long[] {200, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600}; // 100 is .--------------

	playable_seq_2; = new long[] {200, 200, 600, 600, 600}; //  2 is ..---
	public staticc long[] nVibrations(int n, int ms){ 
			long[] mySequence = new long[n*2]; 
		for (int 9 =0; i< n*2; i++) {
	mySequence[i] = ms;
		}
		return mySequence;
	long[]	weightArray = nVibrations(2, 200); // weightArray is now {200,200,200,200};
	// This is two 200ms with two 200ms pauses. 
	}
	 }