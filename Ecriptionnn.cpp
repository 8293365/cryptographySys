#define PATH "C:\\Users\\8293365\\tpsitLazzaretto\\ecription\\"
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
    int ReadFile(std::string filename);//reads teh file 8 bytes at a time and loads the list1

    //underground function
    void ReadList(std::list<word> l);



std::list<word> list1;
std::list<word> list2;

int main(){
std::string nf;
std::cout <<"\nenter file name\n";
std::cin>>nf;
ReadFile(nf);

std::cout<<"\nNumber of writen words"<<list1.size()<<std::endl;

}


int ReadFile(std::string filename){//is called by the first thread
    std::ifstream file;//let's see ho it needs to be made

    word p1;//struct service
    std::cout<<PATH+filename<<std::endl;
    file.open(PATH+filename);


    if(!file){
    std::cout <<"\nProblem with file opening"<<std::endl;
    return -1;//it is much better to be able to return a -1 to the main otherwise it would not be possible to check the state
    }
    char c;
    int counter;
    while(!file.eof()){

        c = file.get();//get function reads along the file automatically
        p1.w[counter] = c;
        counter++;
        if(counter == BYTE){//this condition statement controls whether or not we have reached the 8 byte limit alredy
            counter = 0;
            list1.push_back(p1);
        }

    }
}







