package com.zeynel;

public class SinavClass {

	int sayac1;
	int sayac2;

	int faktoriyel(int x) {

		int sonuc = 1;
		for (int i = 1; i <= x; i++) {
			sonuc = sonuc * i;
			

		}
		++sayac1;

		return sonuc;

	}

	int fonksiyon(int x) {

		++sayac2;
		return x * x * x + (x - 3) * (x - 3) + 5;
	}

}