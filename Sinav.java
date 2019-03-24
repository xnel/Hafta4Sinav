package com.zeynel;

import java.util.Random;

public class Sinav {

	public static void main(String[] args) {

		Random rastgele = new Random();

		int islemSayisi = rastgele.nextInt(5);

		SinavClass sinavNesne = new SinavClass();

		for (int i = 0; i < islemSayisi; ++i) {

			int hangiSayi = rastgele.nextInt(10);
			System.out.println("uretilen sayi" + " " + hangiSayi);
			int hangiMethod = rastgele.nextInt(2);

			switch (hangiMethod) {

			case 0:
				int faktoriyelSonuc = sinavNesne.faktoriyel(hangiSayi);
				System.out.println("faktoriyel sonuc= " + faktoriyelSonuc);

				break;

			case 1:
				int fonksiyonSonuc = sinavNesne.fonksiyon(hangiSayi);
				System.out.println("fonksiyon sonuc= " + fonksiyonSonuc);
				break;
			}
		}

		System.out.println("faktoriyel islemi" + " " + sinavNesne.sayac1 + " " + "kez yapildi");
		System.out.println("fonksiyon islemi" + " " + sinavNesne.sayac2 + " " + "kez yapildi");

	}

}

//random sayi kadar islem yapýlacak.
//random islem türü
//