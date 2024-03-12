#define BYTE 8
#include <iostream>
#include <thread>
#include <string.h>
#include <fstream>
#include <list>

//class Encription{
//private:
struct word{
    char w[BYTE];};

    void WriteFile();
    void ReadFile(std::string filename);//reads teh file 8 bytes at a time and loads the list1

    //underground function
    void ReadList(list<word> l);



std::list<word> list1;
std::list<word> list2;

int main(){


}


void ReadFile(std::string filename){//is called by the first thread
    ifstream file;//let's see ho it needs to be made

    word p1;//struct service 

}



