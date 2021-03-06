import java.util.Random;
//1. create an array of ints. don't initialize it yet.
int[] iList;
void setup() {
  //2. set the size of your window
  //  if you are using Processing 3, you cannot use variables
  //  because the developers don't know how programming is supposed to work.
size(800,500);
  //3. initialize your array with the built in width variable
  iList = new int[width];
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  for(int i= 0; i<width; i++){
    iList[i] = (int)random(height);
  }
  //5. call the noStroke() method
noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
background(250, 144, 5);
  //7. set the color for your graph
fill(135, 5, 250);
  //8. draw a rectangle for each int in your array.
  //   the x value will be the element of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array
for(int a = 0; a<iList.length; a++){
  rect(a, height, 1, -iList[a]);
}

  //9. call the stepSort method
stepSort(iList);
  //10. extract the code that randomizes the array into a method. √

  //11. call the method you made in step 10 when the mouse is pressed

}

void randomizeArray(){
  for(int a = 0; a<iList.length; a++){
    Random ran = new Random();
    iList[a] = ran.nextInt(width);
  }
}
void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
