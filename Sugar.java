public class Sugar extends Cookie
{
  String shape;
  boolean isDecorated;
  Sugar()
  {
    shape = "";
    isDecorated = false;
  }
  Sugar(String setShape, boolean setDecorated)
  {
    shape = setShape;
    isDecorated = setDecorated;
  }

  String returnShape()
  {
    return shape;
  }
  void setShape(String newShape)
  {
    shape = newShape;
  }
  void cutShapes(String newShape, int setNum)
  {
    System.out.println(setNum + " cookies were cut into " + newShape);
    setShape(newShape);
    setNumber(setNum);
  }

  void decorateCookie()
  {
    if (isItReady() == true)
    {
      isDecorated = true;
      System.out.println("The cookies were decorated");
    }
    else
    {
      System.out.println("Make sure to bake the cookies first");
    }
  }
}