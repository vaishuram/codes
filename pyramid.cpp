#include <iostream>
#include <string>
using namespace std;

int main()
{
        int num;
        cin>>num;
        int se=num-1;
        for(int i = 0; i < num; i++)
        {
            for(int j = 0; j < se;j++){
                    cout<<" ";
                   
            }
             se--;
            for(int k = 0; k < (2*i)+1 ;k++){
                    cout<<"*";
                    }
            cout<<endl;
        }
}
