#include<iostream>
using namespace std;

void inv(int B1[][3], int B2[][3])
{

    B2[0][0] = B1[0][1];
    B2[0][1] = B1[0][0];
    B2[0][2] = B1[0][2];

    
    int k = 1;
    int n = B1[0][2];

    
    for(int i=0; i<B1[0][1]; i++){
        for(int j=1; j<=n; j++){
            if(i == B1[j][1]){
                B2[k][0] = B1[j][1];
                B2[k][1] = B1[j][0];
                B2[k][2] = B1[j][2];
                k = k+1;
            }
        }
    }

    cout<<"\nTranspose : \n";
    for(int i=0; i<7; i++){
        for(int j=0; j<3; j++){
            cout<<B2[i][j]<<" ";
        }
        cout<<"\n";
    }
}

void add(int B1[][3], int B2[][3]){
    if(B1[0][0] != B2[0][0] || B1[0][1] != B2[0][1]){
        return;
    }
    int T1 = B1[0][2];
    int T2 = B2[0][2];

    int i, j, k;
    i = j = k = 1;

    int B[14][3];

    B[0][0] = B1[0][0];
    B[0][1] = B1[0][1];

    while(i<=T1 and j<=T2){
        if(B1[i][0] < B2[j][0]){
            //cout<<"hi"<<B1[i][0]<<" "<<B1[i][1]<<" "<<B1[i][2]<<"\n";
            B[k][0] = B1[i][0];
            B[k][1] = B1[i][1];
            B[k][2] = B1[i][2];
            k=k+1;
            i=i+1;
        }
        else if(B2[j][0] < B1[i][0]){
            // cout<<"hlo"<<B1[i][0]<<" "<<B1[i][1]<<" "<<B1[i][2]<<"\n";
            // cout<<"hi"<<B2[i][0]<<" "<<B2[i][1]<<" "<<B2[i][2]<<"\n";
            B[k][0] = B2[j][0];
            B[k][1] = B2[j][1];
            B[k][2] = B2[j][2];
            k=k+1;
            j=j+1;
        }
        else if(B2[j][1] < B1[i][1]){
            //cout<<"hi"<<B2[i][0]<<" "<<B2[i][1]<<" "<<B2[i][2]<<"\n";
            B[k][0] = B2[j][0];
            B[k][1] = B2[j][1];
            B[k][2] = B2[j][2];
            k = k+1;
            j = j+1;
        }
        //problem
        else if(B1[i][1] < B2[j][1]){
            //cout<<"hi"<<B1[i][0]<<" "<<B1[i][1]<<" "<<B1[i][2]<<"\n";
            B[k][0] = B1[i][0];
            B[k][1] = B1[i][1];
            B[k][2] = B1[i][2];
            k=k+1;
            i=i+1;
        }
        else{
            B[k][0] = B1[i][0];
            B[k][1] = B1[i][1];
            B[k][2] = B1[i][2] + B2[j][2];
            k=k+1;
            i=i+1;
            j=j+1;
        }
    }

    while(i<=T1){
        B[k][0] = B1[i][0];
        B[k][1] = B1[i][1];
        B[k][2] = B1[i][2];
        k=k+1;
        i=i+1;
    }

    while(j<=T2){
        B[k][0] = B2[j][0];
        B[k][1] = B2[j][1];
        B[k][2] = B2[j][2];
        k = k+1;
        j = j+1;
    }

    B[0][2] = k-1;

    for(int i=0; i<k; i++){
        for(int j=0; j<3; j++){
            cout<<B[i][j]<<" ";
        }
        cout<<"\n";
    }
    
}



int main(){
    int B1[][3] = {{5,6,6},{0,4,9},{1,1,8},{2,0,4},{2,3,2},{3,5,5},{4,2,2}};
    int B2[][3] = {{5,6,8},{0,2,4},{0,4,8},{1,1,6},{1,2,4},{2,3,6},{3,4,2},{3,5,6},{4,3,7}};
   
    int inp;
    cout<<"\n 1.ADD\n2. Transpose";
    cin>>inp;
    if(inp==1)
        add(B1,B2);
    else if (inp==2)
        inv(B1,B2);

    return 0;
} 