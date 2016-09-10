#include <stdio.h>
#include <stdlib.h>
void readarray(char array[],int n);
void printarray(char array[],int n);
void insert(char  array[] , int n);
void delete(char  array[] , int n);
int main()
{	
	char array[15];
	int n,i,j;
	printf("Enter the num of characters:\n");
	scanf("%d", &n);
	fflush(stdin);
	readarray(array,n);
	printf("Enter no.of elements to be inserted:\n");
	scanf("%d",&j);	
	for(i=0;i<j;i++)
	{
		insert(array,n);
		n++;
	}
	printf("Array characters after insertion:\n");
	printarray(array,n);
	printf("Enter no . of characters to be deleted\n");
	scanf("%d",&j);
	for(i=0;i<j;i++)
	{
		delete(array,n);
		n--;
	}
	printf("The array characters after deletion:\n");
	printarray(array,n);
	return 0;
}

void readarray(char array[],int n)
{
	int i;
	printf("Enter the characters\n");	
	for(i=0;i<n;i++)
		scanf(" %c",&array[i]);
}

void printarray(char array[],int n)
{
	int i;
	for(i=0;i<n;i++)
		printf("%c ",array[i]);
	printf("\n");
}

void insert(char array[],int n)
{
	printf("Enter the character\n");
	scanf(" %c",&array[n]);
}

void delete(char array[],int n)
{
		array[n] == 0;

}


