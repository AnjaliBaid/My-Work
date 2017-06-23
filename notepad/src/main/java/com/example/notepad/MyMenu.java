package com.example.notepad;

/**
 * Created by anju on 22/6/17.
 */

public class MyMenu {
    public int imgId;
    public String txtFlName;
    public String txtFlMdfd;
    public String txtFsz;
    public String text;

         public MyMenu(int imgId,String txtFlName,String txtFlMdfd,String txtFsz, String text) {
             this.imgId = imgId;
             this.txtFlName=txtFlName;
             this.txtFlMdfd = txtFlMdfd;
             this.txtFsz = txtFsz;
             this.text = text;
         }
}
