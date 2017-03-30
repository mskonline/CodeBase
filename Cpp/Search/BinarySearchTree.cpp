#include <iostream>
#include "../Data_Structures/node.h"
#include <vector>
using namespace std;

node *root = NULL;

void insert(int);
void insertKey(node *, int);

void search(int);
void searchKey(node *, int);

int height(node *);

int minimum(node *);
int maximum(node *);

void top_view(node *);
void printLeft(node *);
void printForwardLeft(node *);
void printRight(node *);
void printForwardRight(node *);

void printPreOrder(node *);
void printInOrder(node *);
void printPostOrder(node *);


node* convertBST(node* root);
void collectData(node *current, vector<int> *vec);


int main(int argc, const char * argv[])
{
    insert(5);
    insert(4);
    insert(7);
    insert(3);
    insert(10);

    // cout << "Height : " << height(root) << endl;

    // printPreOrder(root);

    // search(7);

    //cout << "Minimum : " << minimum(root) << endl;
    //cout << "Maximum : " << maximum(root) << endl;

    convertBST(root);

    // top_view(root);
    return 0;
}

void insert(int key)
{
    if(root != NULL)
        insertKey(root, key);
    else
    {
        root = new node;
        root->data = key;
        root->left = NULL;
        root->right = NULL;
    }
}

void insertKey(node *current, int key)
{
    if(key < current->data){
        if(current->left != NULL)
            insertKey(current->left, key);
        else{
            current->left = new node;
            current->left->data = key;
            current->left->left = NULL;
            current->left->right = NULL;
        }
    } else {
        if(current->right != NULL)
            insertKey(current->right, key);
        else{
            current->right = new node;
            current->right->data = key;
            current->right->left = NULL;
            current->right->right = NULL;
        }
    }
}

void search(int key)
{
    if(root == NULL)
        return;

    searchKey(root, key);
}

void searchKey(node *current, int key)
{
    if(current == NULL)
    {
        cout << "Key " << key << " Not Found" << endl;
        return;
    }


    if(current->data == key)
    {
        cout << "Key " << key << " Found" << endl;
        return;
    }

    if(key < current->data)
        searchKey(current->left, key);
    else
        searchKey(current->right, key);
}

int height(node *current)
{
    if(current == NULL)
        return -1;
    else
    {
        int lheight = height(current->left);
        int rheight = height(current->right);

        if(lheight > rheight)
            return (lheight + 1);
        else
            return (rheight + 1);
    }
}

void top_view(node *current)
{
    printLeft(current);
    printForwardRight(current->right);
}

void printLeft(node *current)
{
    if(current == NULL)
        return;

    if(current->left != NULL)
        printLeft(current->left);

    cout << current->data << endl;
}

void printForwardLeft(node *current)
{
    if(current == NULL)
        return;

    cout << current->data << endl;

    if(current->left != NULL)
        printForwardLeft(current->left);
}

void printRight(node *current)
{
    if(current == NULL)
        return;

    if(current->right != NULL)
        printRight(current->right);

    cout << current->data << endl;
}

void printForwardRight(node *current)
{
    if(current == NULL)
        return;

    cout << current->data << endl;

    if(current->right != NULL)
        printForwardRight(current->right);
}

int minimum(node *current)
{
    if(current == NULL)
        return -1;

    if(current->left != NULL)
        minimum(current->left);
    else
        return current->data;
}

int maximum(node *current)
{
    if(current == NULL)
        return -1;

    if(current->right != NULL)
        maximum(current->right);
    else
        return current->data;
}

void printPreOrder(node *current)
{
    if(current == NULL)
        return;

    cout << current->data << endl;

    printPreOrder(current->left);
    printPreOrder(current->right);
}

void printInOrder(node *current)
{
    if(current == NULL)
        return;

    printInOrder(current->left);

    cout << current->data << endl;

    printInOrder(current->right);
}

void printPostOrder(node *current)
{
    if(current == NULL)
        return;

    printPostOrder(current->left);
    printPostOrder(current->right);

    cout << current->data << endl;
}

//
node* convertBST(node* root)
{
    vector<int> *array = new vector<int>();

    collectData(root, array);

    for(int i = 0; i < array->size(); ++i)
        cout << array->at(i);
}

void collectData(node *current, vector<int> *vec)
{
    if(current == NULL)
        return;

    collectData(current->left, vec);
    vec->push_back(current->data);

    collectData(current->right, vec);
}


