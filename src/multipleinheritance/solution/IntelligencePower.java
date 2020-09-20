package multipleinheritance.solution;

public interface IntelligencePower {
  String WISE_THOUGHT = "Buy low, sell high";

  static void saySomeThingSmart() {
    System.out.println("If you can't do great things, do small things in a great way.");
  }

  void invent(String somethingToEnvent);
}
