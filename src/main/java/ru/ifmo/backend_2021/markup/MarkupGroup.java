package ru.ifmo.backend_2021.markup;

import java.util.List;

public abstract class MarkupGroup extends MarkupElement{
     private String specialSymbol;
     private List<MarkupElement> parts;

     public MarkupGroup(String specialSymbol, List<MarkupElement> parts){
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
