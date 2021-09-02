/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




// Not to be used for time being, it was meant for filtering the inputs like, accepting
// only integers values, but it didn't work so, for time being i am using keyEvents to ignore the key presses which does not fall 
// in integer range.
package encapsulateClasses;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author smourya
 */
public class IntFilter extends DocumentFilter{
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
     
        Document doc = fb.getDocument();
        StringBuilder sb = new  StringBuilder();
        sb.append(doc.getText(0, doc.getLength()));
        sb.insert(offset, string);


        if(test(sb.toString())){
            super.insertString(fb, offset, string, attr);
        }
        else{

        }
     
     
     
 }

    private boolean test(String toString) {
        try{
            Integer.parseInt(toString);
            return true;
        }
        catch(NumberFormatException nfe){
            return false;
        }
    }
    
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder();
        sb.append(doc.getText(0, doc.getLength()));
        sb.replace(offset, offset + length, text);

        if (test(sb.toString())) {
           super.replace(fb, offset, length, text, attrs);
        } else {
        }
    }
    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        Document doc = fb.getDocument();
        StringBuilder sb = new  StringBuilder();
        sb.append(doc.getText(0, doc.getLength()));
        sb.delete(offset, offset+length);
        
        if(test(sb.toString())){
            super.remove(fb, offset, length);
        }
        else{
            
        }
        
        
        
        
        
        
    }
    
}



