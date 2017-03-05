#include <iostream>
#include "malloc.h"
#include "node.h"

using namespace std;

struct node* HEAD;

// Operations on List
void createList(int size);
void traverseList();
void insertList(int data, int pos);
void searchList(int data);
void deleteFromList(int data);
void deleteList();
void reverseList();

int main(){
    cout << "Linked List Operations" << endl;
    HEAD = (struct node*) malloc(sizeof(struct node));
    HEAD->data = -1;
    HEAD->next = NULL;

    cout << HEAD->data;

    createList(10);
    traverseList();
    deleteList();
    return EXIT_SUCCESS;
}

void createList(int size){
    struct node* currPtr;

    currPtr = HEAD;

    while(currPtr != NULL){
        currPtr = currPtr->next;
    }

    for(int i = 0; i < size; ++i){
        struct node* newNode = (struct node*) malloc(sizeof(struct node));
        newNode->data = i;
        newNode->next = NULL;
        currPtr->next = newNode;
        currPtr = newNode;
    }
}

void traverseList()
{
    struct node* currPtr;

    currPtr = HEAD;

    while(currPtr != NULL)
    {
        cout << currPtr->data << endl;
        currPtr = currPtr->next;
    }
}

void deleteList()
{

    struct node* currPtr;
    struct node* nextPtr;

    currPtr = HEAD;

    while(currPtr != NULL)
    {
        nextPtr = currPtr->next;
        free(currPtr);
        currPtr = nextPtr;
    }

    HEAD = NULL;
}
