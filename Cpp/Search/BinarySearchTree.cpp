#include <iostream>

using namespace std;

struct node
{
    int data;
    node *left;
    node *right;
};

node *root = NULL;

void insert(int);
void insertKey(node *, int);

void search(int);
void searchKey(node *, int);

void printPreOrder(node *);
void printInOrder(node *);
void printPostOrder(node *);

int main(int argc, const char * argv[])
{
    insert(5);
    insert(2);
    insert(7);

    printPreOrder(root);

    search(7);

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
