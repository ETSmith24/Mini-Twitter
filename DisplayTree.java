import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

//this class displays the tree in a separate window fromr the admin panel
public class DisplayTree extends JPanel implements ActionListener {
  private int newNodeSuffix = 1;
  private static String ADD_COMMAND = "add";
  private static String REMOVE_COMMAND = "remove";
  private static String CLEAR_COMMAND = "clear";

  private DynamicTree treePanel;

  //constructor
  public DisplayTree() {
    super(new BorderLayout());

    // Create the components.
    treePanel = new DynamicTree();

    JButton addButton = new JButton("Add");
    addButton.setActionCommand(ADD_COMMAND);
    addButton.addActionListener(this);

    JButton removeButton = new JButton("Remove");
    removeButton.setActionCommand(REMOVE_COMMAND);
    removeButton.addActionListener(this);

    JButton clearButton = new JButton("Clear");
    clearButton.setActionCommand(CLEAR_COMMAND);
    clearButton.addActionListener(this);

    // Lay everything out.
    treePanel.setPreferredSize(new Dimension(300, 150));
    add(treePanel, BorderLayout.CENTER);

    JPanel panel = new JPanel(new GridLayout(0, 3));
    panel.add(addButton);
    panel.add(removeButton);
    panel.add(clearButton);
    add(panel, BorderLayout.SOUTH);
  }


  //sets behavior for button clicks
  public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();

    if (ADD_COMMAND.equals(command)) {
      // Add button clicked
      treePanel.addObject("New Node " + newNodeSuffix++);
    } else if (REMOVE_COMMAND.equals(command)) {
      // Remove button clicked
      treePanel.removeCurrentNode();
    } else if (CLEAR_COMMAND.equals(command)) {
      // Clear button clicked.
      treePanel.clear();
    }
  }


  //creates and displays the GUI
  public static void createAndShowGUI() {
    // Create and set up the window.
    JFrame frame = new JFrame("Display Tree");

    // Create and set up the content pane.
    DisplayTree newContentPane = new DisplayTree();
    newContentPane.setOpaque(true);
    frame.setContentPane(newContentPane);

    // Display the window.
    frame.pack();
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        createAndShowGUI();
      }
    });
  }
}