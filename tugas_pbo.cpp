#include <iostream>

using namespace std;

	void garis(){
		int i=0;
		while(i<=10){
			cout<<"===";
			i++;
		};
		cout<<endl;
	}

int main(){
	string nama="Geraldi Jari Assaji";
	int nim;
	char kelas;
	string prak[5];
	string matkul[5];
	int nilai;
	//array multidimensi
	string daftar[5][5]={{"PEMROGRAMAN ORIENTASI OBJEK","01",},
                            {"SISTEM OPERASI (SO)         ","02"},
                            {"BASIS DATA(BASDAT)        ","03"},
                            {"STATISTIKA INFORMATIKA(SI)     ","04"},
                            {"STRUKTUR DATA(SDATA)           ","05"}};
    //input secara dinamis
    garis();
    cout<<"1. Input data"<<endl;
    cout<<"2. Exit"<<endl;
    cin>>nilai;
    if(nilai==1){
    	cout<<"Kelas Anda : ";cin>>kelas;
    cout<<"Nim Anda   : ";cin>>nim;
    garis();
    
    //output array multidimensi
    cout<<"NAMA PRAKTIKUM \t\t KODE PRAKTIKUM"<<endl;
    for(int i=0; i<5;i++){
    	cout<<daftar[i][0]<<"\t"<<daftar[i][1];
    	cout<<endl;
	}
	garis();
    //perulangan for, array
    cout<<"Masukkan Praktikum Anda : "<<endl;
    for(int i=0; i<5; i++){
    	cout<<"Praktikum Ke-"<<i<<":";cin>>prak[i];
	}
	garis();
	//output
	cout<<"Nama : "<<nama<<endl;
	cout<<"Kelas: "<<kelas<<endl;
	cout<<"Nim  : "<<nim<<endl;
	garis();
	//menampilkan array
	for(int i=0; i<5; i++){
		cout<<"Praktikum "<<prak[i]<<endl;
	}
	int j=1;
	cout<<"Masukan Matakuliah Anda: "<<endl;
	do {
		cout<<"-";cin>>matkul[j];
		j++;
	;}
	while(j<=5);
	}
	else{
		cout<<"Keluar";
	}
    
	
	
}
