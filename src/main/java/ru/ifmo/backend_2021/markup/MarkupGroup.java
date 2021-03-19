package ru.ifmo.backend_2021.markup;

import java.util.ArrayList;

public abstract class MarkupGroup extends MarkupElement{
     private String specialSymbol;
     private ArrayList<MarkupElement> parts;

     public MarkupGroup(String specialSymbol, ArrayList<MarkupElement> parts){
         this.specialSymbol = specialSymbol;
         this.parts = parts;
     }

     @Override
     public StringBuilder toMarkdown(StringBuilder str){
         str.append(this.specialSymbol);
         for (MarkupElement element: parts){
             element.toMarkdown(str);
         }
         str.append(this.specialSymbol);
         return str;
     }
}
