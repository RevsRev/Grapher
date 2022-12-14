package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ApplicationFrame extends JFrame implements MouseWheelListener, MouseListener
{
    private JPanel contentPane;

    public ApplicationFrame()
    {
        setContentPane(contentPane);
        setSize(3200,1600);

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                onClose();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                onClose();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        addMouseWheelListener(this);
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g)
    {
    }

    private void onClose()
    {
        dispose();
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e)
    {
        //int scrollAmount = e.getScrollAmount();
        //System.out.println(scrollAmount);
        //view.zoom(getSize(), e.getLocationOnScreen(), scrollAmount);

        //repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
    }

    @Override
    public void mousePressed(MouseEvent e)
    {

    }

    @Override
    public void mouseReleased(MouseEvent e)
    {

    }

    @Override
    public void mouseEntered(MouseEvent e)
    {

    }

    @Override
    public void mouseExited(MouseEvent e)
    {

    }
}
