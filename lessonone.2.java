public class PezDispenser {
  public static final int MAX_PEZ = 12;
  private String mCharacterName;
  private int mPezCount;

  public PezDispenser(String characterName) {
   mCharacterName = characterName;
   mPezCount = 0;
  }

  public boolean dispense() {
    boolean wasDispensed = false;
    if (!isEmpty()) {
      mPezCount--;
      wasDispensed = true;
    }
    return wasDispensed;
  }

  public boolean isEmpty() {
   return mPezCount == 0;
  }

  public void load() {
   load(MAX_PEZ);
  }

  public void load(int pezAmount) {
    mPezCount += pezAmount;
  }

  public String getCharacterName() {
   return mCharacterName;
  }
}
