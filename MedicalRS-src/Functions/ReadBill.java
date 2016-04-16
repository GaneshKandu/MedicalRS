/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Functions;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Admin
 */
public class ReadBill
{

    /**
     *
     * @param path
     * @return
     * @throws java.io.IOException
     */
    public String RB(String path) throws java.io.IOException
 {
  
  String s1="";
  String bdata="";
  BufferedReader br = new BufferedReader(new FileReader (path));
  BufferedReader pr = new BufferedReader(new FileReader (path));
 while(pr.read()!=-1)
 {
  s1 =br.readLine();
  pr.readLine();
  bdata=bdata+s1+"\n";
 } 
  return bdata;
 }
}