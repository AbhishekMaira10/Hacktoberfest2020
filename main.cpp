#include <stdio.h>
#include <conio.h>
#include <string.h>
#include <ctype.h>
#include <iostream>
using namespace std;

main(){

string a1;
string a2;

cout<<"L O G I N "<<endl;
cout<<"Masukkan Username anda : "; cin>>a1;
cout<<"Masukkan Password anda : "; cin>>a2;

if(a2 == "Asia"){
	
cout<<a1<<", Password anda benar, terima kasih"<<endl;
}else {
cout<<a1<<", Password anda Salah, Coba lagi"<<endl;
}
getch();

}
