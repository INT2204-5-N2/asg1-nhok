package project1;

import java.util.Scanner;
import java.io.*;

public class DictionaryManagement {
      private int wordCount;
      private String search = new String("1");
      public String getSearch(){return search;}
      private String fix = new String("2");
      public String getFix(){return fix;}
	  private String delete = new String("3");
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
    Scanner words0;
    File file = new File("src\\project1\\Tudien.txt");
    words0 = new Scanner(file);
	FileReader fileread = new FileReader("C:\\Github\\asg1-nhok\\src\\project1\\Tudien.txt");
    BufferedReader reader = new BufferedReader(fileread);
    int dong = 0;
    while (reader.readLine() != null) {
      dong++;
    }
    System.out.println(dong);
	fileread.close();
    reader.close();
    for(int i=0; i<dong;i++){
      String s = new String(words0.nextLine());
      wordCount++;
      String[] day = s.split("	");
      Word words1 = new Word();
      words1.word_target = day[0];
      words1.word_explain = day[1];
      a.dictionary.add(words1);
    }
  }

  public void dictionaryLookUp(){
    Scanner Searchs = new Scanner(System.in);
      System.out.println("Nhap tu can tim kiem: ");
      String keySearch = Searchs.nextLine();
      for(int i=0; i<wordCount; i++){
        if(a.dictionary.get(i).word_target.equals(keySearch)) {
          System.out.println(a.dictionary.get(i).word_target + "   " + a.dictionary.get(i).word_explain);
          break;
        }
	if(i==wordCount-1) System.out.println("Error");
    }
	System.out.println("Nhap 1 de tiep tuc, bat ki de dung lai: ");
	String key = Searchs.nextLine();
	if(key.equals("1")) dictionaryLookUp();
}
  public  void dictionaryFix(){
    Scanner Fixs = new Scanner(System.in);
    System.out.println("Nhap tu can sua: ");
    String wordFix = Fixs.nextLine();
    for(int i=0; i<wordCount; i++){
      if(a.dictionary.get(i).word_target.equals(wordFix)) {
        System.out.println("Ban muon sua thanh tu: ");
        a.dictionary.get(i).word_target = Fixs.nextLine();
        break;
      }
	  if(i==wordCount-1) System.out.println("Error");
    }
	System.out.println("Nhap 1 de tiep tuc, bat ki de dung lai: ");
	String key = Fixs.nextLine();
	if(key.equals("1")) dictionaryFix();
  }

  public void dictionaryDelete(){
    Scanner Deletes = new Scanner(System.in);
    System.out.println("Nhap tu can xoa: ");
    String wordDelete = Deletes.nextLine();
    for(int i=0; i<wordCount; i++){
      if(a.dictionary.get(i).word_target.equals(wordDelete)){
        a.dictionary.remove(i);
        wordCount--;
        break;
      }
	  if(i==wordCount-1) System.out.println("Error");
    }
	System.out.println("Nhap 1 de tiep tuc, bat ki de dung lai: ");
	String key = Deletes.nextLine();
	if(key.equals("1")) dictionaryDelete();
  }

}
