/*XY Sequence
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
You are given four integers n, B, x and y. You should build a sequence a0,a1,a2,…,an where a0=0 and for each i≥1 you can choose:

either ai=ai−1+x
or ai=ai−1−y.
Your goal is to build such a sequence a that ai≤B for all i and ∑i=0nai is maximum possible.

Input
The first line contains a single integer t (1≤t≤104) — the number of test cases. Next t cases follow.

The first and only line of each test case contains four integers n, B, x and y (1≤n≤2⋅105; 1≤B,x,y≤109).

It's guaranteed that the total sum of n doesn't exceed 2⋅105.

Output
For each test case, print one integer — the maximum possible ∑i=0nai.

Example
inputCopy
3
5 100 1 30
7 1000000000 1000000000 1000000000
4 1 7 3
outputCopy
15
4000000000
-10
Note
In the first test case, the optimal sequence a is [0,1,2,3,4,5].

In the second test case, the optimal sequence a is [0,109,0,109,0,109,0,109].

In the third test case, the optimal sequence a is [0,−3,−6,1,−2].
*/
#include <iostream>

using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        long long n,B,x,y,sum=0;
        cin>>n>>B>>x>>y;
        long long arr[n+1];
        arr[0]=0;
        for(long long i=1;i<=n;i++){
            if(arr[i-1]+ x <= B){
                arr[i] = arr[i-1]+ x;
            }
            else{
                arr[i] = arr[i-1]- y;
            }
            sum += arr[i];
        }
        cout<<sum<<endl;
    }

    return 0;
}
