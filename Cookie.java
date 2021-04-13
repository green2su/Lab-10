public class Cookie
{
  int number;
  int bakeTemp;
  int bakeTime;
  boolean isReady;
  Cookie()
  {
    number = 0;
    bakeTemp = 0;
    bakeTime = 0;
    isReady = false;
  }
  
  Cookie(int setTotalCookies, int setBakeTemp, int setBakeTime)
  {
    number = setTotalCookies;
    bakeTemp = setBakeTemp;
    bakeTime = setBakeTime;
    isReady = false;
  }

  boolean isItReady()
  {
    return isReady;
  }

  void setNumber(int numberSet)
  {
    number = numberSet;
  }

  void bakeCookies(int cookTemp, int cookTime)
  {
    System.out.println(number + " cookies were baked at " + cookTemp + " degrees F for " + cookTime + " minutes");
    isReady = true;
  }
}