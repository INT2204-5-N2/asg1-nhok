package project1;

import java.util.Scanner;
import java.io.*;


public class DictionaryCommandline{
  DictionaryManagement x = new DictionaryManagement();
  boolean isRunning = true;
  public void showAllWords(){
    System.out.println("No    |English      |VietNam\n");
    for(int i=0; i<x.getWordCount(); i++){
      System.out.println(i + "    |" + x.a.dictionary.get(i).word_target + "     |" + x.a.dictionary.get(i).word_explain + "\n");
        }
  }
  public void dictionaryBasic() throws FileNotFoundException,IOException {
    x.insertFromCommandline();
    x.insertFromFile();
    showAllWords();
  }

  public void endApp(){
    this.isRunning = false;
  }

  public void dictionaryAdvanced(int i, boolean isRunning) throws FileNotFoundException,IOException {
    System.out.println("Danh sach lenh: ");
	System.out.println("1-Search. ");
	System.out.println("2-Fix. ");
	System.out.println("3-Delete. ");
	System.out.println("0-Ket Thuc. ");
	System.out.println("Lenh cua ban: ");
    Scanner command = new Scanner(System.in);
    String keyWord = command.nextLine();
    if(keyWord.equals(x.getSearch())) x.dictionaryLookUp();
    if(keyWord.equals(x.getFix())) {
		x.dictionaryFix();
		showAllWords();
	}
    if(keyWord.equals(x.getDelete())) {
	x.dictionaryDelete();
	showAllWords();
	}
    if(keyWord.equals("0")) endApp();
  }

  public void dictionarySearcher(){
    Scanner wSearcher = new Scanner(System.in);
    System.out.println("Search(An 0 de bo qua): ");
    String wordSearcher = wSearcher.nextLine();
    String WordSearcher = wordSearcher.substring(0, 1).toUpperCase() + wordSearcher.substring(1);
    if(!wordSearcher.equals("0")){
      for(int i=0; i<x.getWordCount(); i++){
        if(x.a.dictionary.get(i).word_target.startsWith(WordSearcher)){
          System.out.println(x.a.dictionary.get(i).word_target + "\t");
        }
      }
    }
  }

  public static void main(String args[]) throws FileNotFoundException,IOException {
    DictionaryCommandline a = new DictionaryCommandline();
    a.dictionaryBasic();
    Scanner input = new Scanner(System.in);
    int i=0;
    while(a.isRunning){
      a.dictionaryAdvanced(i, a.isRunning);
      //if(a.isRunning) a.dictionarySearcher();
      if(i==0) i++;
    }
  }
}
