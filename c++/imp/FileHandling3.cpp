#include <iostream>
#include <sstream>
#include <string>

using namespace std;

int main() {
    string line, word;
    int wordCount = 0, charCount = 0, lineCount = 0;

    cout << "Enter multiple lines (Press Ctrl+D or Ctrl+Z to stop input):" << endl;
    
    while (getline(cin, line)) {  // Read input line by line
        lineCount++;
        charCount += line.length(); // Count characters in each line
        
        stringstream ss(line);
        while (ss >> word) {  // Extract words from the line
            wordCount++;
        }
    }

    cout << "\nTotal Lines: " << lineCount << endl;
    cout << "Total Words: " << wordCount << endl;
    cout << "Total Characters (excluding newlines): " << charCount << endl;

    return 0;
}
