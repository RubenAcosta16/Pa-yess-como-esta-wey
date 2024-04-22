/*

 */
package Otros;

import java.awt.Color;


public class FocoBtn  extends javax.swing.JTextField{

  private java.awt.Color colorOriginal = Color.GRAY;

    private boolean CambiarColor = false;

    public boolean getCambiarColor() {
        return CambiarColor;
    }

    public void setCambiarColor(boolean CambiarColor) {
        this.CambiarColor = CambiarColor;
    }

    public FocoBtn() {
        super();

        java.awt.event.FocusAdapter fl = new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfTextBoxExFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfTextBoxExFocusLost(evt);
            }
        };
        addFocusListener(fl);

    }

    private void jtfTextBoxExFocusGained(java.awt.event.FocusEvent evt) {
        if (getCambiarColor()) {
            colorOriginal = getBackground();
            setBackground(Color.magenta);
        } else {
            setBackground(colorOriginal);
        }
    }

    private void jtfTextBoxExFocusLost(java.awt.event.FocusEvent evt) {
        setBackground(colorOriginal);
    }


















    
}
