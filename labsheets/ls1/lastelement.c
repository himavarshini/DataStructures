#include <stdio.h>
void readArray(int A[],int n);
void printArray(int A[],int n);
void insertElement(int A[],int n);
void deleteElement(int A[],int n);
void checkArrayComplete(int A[],int n);
void checkArrayEmpty(int A[],int n);

int main()
{
	int A[15],i,n,j;
	printf("Enter the size of the array\n");
	scanf("%d",&n);
	readArray(A,n);	
	printf("Enter the no. of elements to be inserted\n");
	scanf("%d",&j);
	for(i=0;i<j;i++)
	{
	printf("Enter the element to be inserted:\n");
	insertElement(A,n+i);
	}
	n = n+j;
	printf("The array elements after insertion\n");
	printArray(A,n);
	printf("Enter the no. of elements to be deleted\n");
	scanf("%d",&j);
	for(i=0;i<j;i++)
	{
	deleteElement(A,n);
	}
	n = n-j;
	printf("The array elements after deletion\n");
	printArray(A,n);
	checkArrayComplete(A,n);
	checkArrayEmpty(A,n);
	return 0;
}

void readArray(int A[],int n)
{
	int i;
	printf("Enter the elements of the array\n");
	for(i=0;i<n; i++)
		scanf("%d",&A[i]);
}

void printArray(int A[],int n)
{
	int i;
	for(i=0;i<n;i++)
		printf("%d\t",A[i]);
	printf("\n");
}
		
void insertElement(int A[], int n)
{
	scanf("%d",&A[n]); 
}

void deleteElement(int A[],int n)
{
	A[n] = 0;
}
		
void checkArrayComplete(int A[],int n)
{	
	int i,count;
	for(i=0;i<15;i++)
	{
		if(A[i] != 0)
		count++;
	}
	if(count == 15)
		printf("The array is fully occupied\n");
}
void checkArrayEmpty(int A[],int n)
{
	int i,count;
	for(i=0;i<15;i++)
	{
		if(A[i] != 0)
		count++;
	}
	if(count == 0)
		printf("The array is empty\n");
}


	
