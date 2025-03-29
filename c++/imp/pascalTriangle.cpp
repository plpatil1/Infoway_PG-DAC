#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int n = 11, m;

    for (int i = 0; i < n; i++) {
        // Print leading spaces to center-align the triangle
        cout << setw((n - i) * 2) << " ";

        m = 1;
        for (int j = 0; j <= i; j++) {
            cout << setw(4) << m; // Proper spacing for numbers
            m = m * (i - j) / (j + 1); // Pascal's Triangle formula
        }
        cout << "\n";
    }

    return 0;
}
