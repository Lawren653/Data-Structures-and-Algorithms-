#include <iostream>
using namespace std;

struct Node {
    int data;
    Node *next;
};

Node *head = NULL;

void insertAt(int pos, int value) {
    Node *n = new Node;
    n->data = value;

    if (pos == 1 || head == NULL) {
        n->next = head;
        head = n;
        return;
    }

    Node *temp = head;
    for (int i = 1; i < pos - 1 && temp->next != NULL; i++)
        temp = temp->next;

    n->next = temp->next;
    temp->next = n;
}

void deleteAt(int pos) {
    Node *temp = head;

    if (pos == 1) {
        head = head->next;
        delete temp;
        return;
    }

    for (int i = 1; i < pos - 1; i++)
        temp = temp->next;

    Node *toDelete = temp->next;
    temp->next = toDelete->next;
    delete toDelete;
}

void search(int pos) {
    Node *temp = head;
    for (int i = 1; i < pos; i++)
        temp = temp->next;
    cout << "Item " << pos << " is " << temp->data << endl;
}

void display() {
    Node *temp = head;
    while (temp != NULL) {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}

int main() {
    insertAt(1, 34);
    insertAt(1, 34);
    insertAt(1, 24);
    insertAt(1, 23);
    insertAt(1, 52);
    display();

    insertAt(1, 421);
    display();

    insertAt(4, 202);
    display();

    insertAt(4, 102);
    display();

    deleteAt(3);
    display();

    search(4);

    return 0;
}
