#include <iostream>
#include <iomanip>  // For formatting bill

using namespace std;

// Structure to store ordered items
struct Order {
    string itemName;
    int price;
    int quantity;
};

// Global array to store orders
Order orders[100];
int orderCount = 0;
int totalBill = 0;

// Function to display main menu
void showMainMenu() {
    cout << "\n==== Hotel Menu ====\n";
    cout << "1. Hot Drinks\n";
    cout << "2. Cold Drinks\n";
    cout << "3. Snacks\n";
    cout << "4. Ice Cream\n";
    cout << "5. Exit & Show Bill\n";
    cout << "Enter your choice: ";
}

// Function to display sub-menu and take order
void takeOrder(string category, string items[], int prices[]) {
    int choice, quantity;
    
    do {
        cout << "\n=== " << category << " ===\n";
        for (int i = 0; i < 4; i++) {
            cout << i + 1 << ". " << items[i] << " - Rs. " << prices[i] << endl;
        }
        cout << "5. Exit to Main Menu\n";
        cout << "Enter your choice: ";
        cin >> choice;

        if (choice >= 1 && choice <= 4) {
            cout << "Enter quantity: ";
            cin >> quantity;

            // Store the order
            orders[orderCount].itemName = items[choice - 1];
            orders[orderCount].price = prices[choice - 1];
            orders[orderCount].quantity = quantity;
            orderCount++;

            // Update total bill
            totalBill += prices[choice - 1] * quantity;

            cout << "Added " << quantity << " " << items[choice - 1] << "(s) to your order.\n";
        }
    } while (choice != 5);
}

// Function to display bill and ordered items
void showBill() {
    cout << "\n===== Your Order Summary =====\n";
    cout << left << setw(20) << "Item" << setw(10) << "Price" << setw(10) << "Qty" << setw(10) << "Total\n";
    cout << "------------------------------------------\n";
    
    for (int i = 0; i < orderCount; i++) {
        cout << left << setw(20) << orders[i].itemName
             << setw(10) << orders[i].price
             << setw(10) << orders[i].quantity
             << setw(10) << (orders[i].price * orders[i].quantity) << endl;
    }
    cout << "------------------------------------------\n";
    cout << "Total Bill: Rs. " << totalBill << "\n";
    cout << "Thank you for visiting!\n";
}

int main() {
    int choice;
    
    // Menus and prices
    string hotDrinks[] = {"Tea", "Coffee", "Hot Chocolate", "Green Tea"};
    int hotPrices[] = {20, 20, 40, 30};

    string coldDrinks[] = {"Coke", "Pepsi", "Lemonade", "Cold Coffee"};
    int coldPrices[] = {20, 45, 35, 60};

    string snacks[] = {"Burger", "Sandwich", "Fries", "Pizza"};
    int snackPrices[] = {55, 45, 60, 90};

    string iceCreams[] = {"Vanilla", "Chocolate", "Strawberry", "Butterscotch"};
    int icePrices[] = {40, 50, 45, 55};

    do {
        showMainMenu();
        cin >> choice;

        switch (choice) {
            case 1:
                takeOrder("Hot Drinks", hotDrinks, hotPrices);
                break;
            case 2:
                takeOrder("Cold Drinks", coldDrinks, coldPrices);
                break;
            case 3:
                takeOrder("Snacks", snacks, snackPrices);
                break;
            case 4:
                takeOrder("Ice Cream", iceCreams, icePrices);
                break;
            case 5:
                showBill();
                break;
            default:
                cout << "Invalid choice! Please enter again.\n";
        }
    } while (choice != 5);

    return 0;
}
