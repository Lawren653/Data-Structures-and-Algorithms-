#include <iostream>
using namespace std;

void swapAndAdd(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
    a = a + 15;
    b = b + 15;
}

int main() {
    int x = 10, y = 20;
    swapAndAdd(x, y);
    cout << "x = " << x << ", y = " << y << endl;

    int a = 50;
    int *ptr = &a;
    int b = *ptr + 10;
    *ptr = 100;
    int c = *ptr + 10;

    cout << "a = " << a << endl;
    cout << "b = " << b << endl;
    cout << "c = " << c << endl;
    cout << "ptr = " << ptr << endl;
    cout << "*ptr = " << *ptr << endl;

    return 0;
}
