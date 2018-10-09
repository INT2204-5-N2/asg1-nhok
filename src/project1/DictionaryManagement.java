package project1;

import java.util.Scanner;
import java.io.*;

public class DictionaryManagement {
      private int wordCount;
      private String search = new String("search");
      public String getSearch(){return search;}
      private String fix = new String("fix");
      public String getFix(){return fix;}
      private String delete = new String("delete");
      public String getDelete(){return delete;}
      Dictionary a = new Dictionary();
      public int getWordCount(){
        return wordCount;
      }

  public void insertFromCommandline(){
    Scanner keyboard = new Scanner(System.in);
    Scanner word = new Scanner(System.in);
    System.out.println("Nhap so luong tu: ");
    wordCount = keyboard.nextInt();
    for(int i=0; i<wordCount; i++){
      Word words = new Word();
      words.word_target = word.nextLine();
      words.word_explain = word.nextLine();
      a.dictionary.add(words);
    }
  }

  public void insertFromFile()  throws FileNotFoundException,IOException {
    Scanner tu;
    File file = new File("src/project1/Tudien.txt");
    tu = new Scanner(file);
    BufferedReader reader = new BufferedReader(new FileReader("C:/Github/asg1-nhok/src/word/Tudien.txt"));
    int lines = 0;
    while (reader.readLine() != null) {
      lines++;
    }
    System.out.println(lines);
    reader.close();
    for(int i=0; i<lines;i++){
      String s = new String(tu.nextLine());
      wordCount++;
      String[] day = s.split("  ");
      Word words1 = new Word();
      words1.word_target = day[0];
      words1.word_explain = day[1];
      a.dictionary.add(words1);
    }
  }

  public void dictionaryLookUp(){
    Scanner Searchs = new Scanner(System.in);
    System.out.println("An search de search, nut bat ky de thoat");
    String keyWord = Searchs.nextLine();
    if(keyWord.equals(search)){
      System.out.println("Nhap tu can tim kiem: ");
      String keySearch = Searchs.nextLine();
      for(int i=0; i<wordCount; i++){
        if(a.dictionary.get(i).word_target.equals(keySearch)) {
          System.out.println(a.dictionary.get(i).word_target + "   " + a.dictionary.get(i).word_explain);
          break;
        }
      }
    }
}
  public  void dictionaryFix(){
    Scanner wFix = new Scanner(System.in);
    System.out.println("Nhap tu can sua: ");
    String wordFix = wFix.nextLine();
    for(int i=0; i<wordCount; i++){
      if(a.dictionary.get(i).word_target.equals(wordFix)) {
        System.out.println("Ban muon sua thanh tu: ");
        a.dictionary.get(i).word_target = wFix.nextLine();
        break;
      }
    }
  }

  public void dictionaryDelete(){
    Scanner wDelete = new Scanner(System.in);
    System.out.println("Nhap tu can xoa: ");
    String wordDelete = wDelete.nextLine();
    for(int i=0; i<wordCount; i++){
      if(a.dictionary.get(i).word_target.equals(wordDelete)){
        a.dictionary.remove(i);
        wordCount--;
        break;
      }
    }
  }

}
