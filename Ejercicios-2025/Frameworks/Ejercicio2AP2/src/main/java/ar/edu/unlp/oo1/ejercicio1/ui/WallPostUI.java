package ar.edu.unlp.oo1.ejercicio1.ui;

import java.awt.GridLayout;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import ar.edu.unlp.oo1.ejercicio1.impl.WallPost;
import ar.edu.unlp.oo1.ejercicio1.impl.WallPostImpl;

public class WallPostUI {

  private WallPost wallPost;
  private JTextArea textArea;
  private JLabel featuredLabelTitle;
  private JCheckBox featuredCheckbox;
  private JLabel likesLabelTitle;
  private JLabel likesLabel;
  private JButton like; 
  private JButton dislike; 
  private JFrame window;
  private static final Logger logger = Logger.getLogger(WallPostImpl.class.getName());
	static {
      try {
          // Crear el FileHandler (true para modo append)
          FileHandler fileHandler = new FileHandler("userInterface.txt", true);

          // Opcional: usar un formato más legible
          fileHandler.setFormatter(new SimpleFormatter());

          // Agregar el handler al logger
          logger.addHandler(fileHandler);

      } catch (IOException e) {
          System.err.println("No se pudo configurar el logger: " + e.getMessage());
      }
  }

  public WallPostUI() {
    this.wallPost = new WallPostImpl();
    this.textArea = new JTextArea();
    this.featuredLabelTitle = new JLabel("Featured");
    this.featuredCheckbox = new JCheckBox();
    this.likesLabelTitle = new JLabel("Likes");
    this.like = new JButton("Like");
    this.likesLabel = new JLabel();
    this.dislike = new JButton("Dislike");
    this.window = new JFrame("WallPost");
    this.setUpWindow();
    this.wireComponents();
    this.window.setVisible(true);
  }
  
  private void setUpWindow() {
    JPanel pane = new JPanel();
    this.window.getContentPane().add(pane);
    this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.window.setSize(640, 480);
    pane.setLayout(new GridLayout(5,1,1,10));
    pane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
   
    JScrollPane scrollPane = new JScrollPane(this.textArea);
    pane.add(scrollPane);
    this.textArea.setEditable(true);
    this.textArea.setLineWrap(true);
    this.textArea.setWrapStyleWord(true);
    
    JPanel featuredPane = new JPanel();
    featuredPane.setLayout(new GridLayout(1, 2));
    featuredPane.add(this.featuredLabelTitle);
    featuredPane.add(this.featuredCheckbox);
    pane.add(featuredPane);
    
    JPanel likesPane = new JPanel();
    likesPane.setLayout(new GridLayout(1, 2));
    likesPane.add(this.likesLabelTitle);
    likesPane.add(this.likesLabel);
    likesLabel.setText("0");
    pane.add(likesPane);
    
    JPanel likeButtonsPane = new JPanel();
    likeButtonsPane.setLayout(new GridLayout(1, 2));
    likeButtonsPane.add(this.like);
    likeButtonsPane.add(this.dislike);
    pane.add(likeButtonsPane);
  
    this.window.pack();
  }
  
  private void wireComponents() {
    this.like.addActionListener( e -> {
      this.wallPost.like();
      logger.info("Se le dio like a la publicacion");      
      this.likesLabel.setText(String.valueOf(this.wallPost.getLikes()));
    });
    
    this.dislike.addActionListener( e -> {
      this.wallPost.dislike();
      logger.info("Se le dio dislike a la publicacion"); 
      this.likesLabel.setText(String.valueOf(this.wallPost.getLikes()));
    });
    
    this.featuredCheckbox.addActionListener(e -> {
      this.wallPost.toggleFeatured();
      logger.info("Se la marco como destacada a la publicacion"); 
    });
    
    this.textArea.getDocument().addDocumentListener(new DocumentListener() {
      
      @Override
      public void removeUpdate(DocumentEvent e) {
    	logger.info("Se eliminó texto de la publicación");
        wallPost.setText(textArea.getText());
      }
      
      @Override
      public void insertUpdate(DocumentEvent e) {
    	logger.info("Se agregó texto a la publicación");
        wallPost.setText(textArea.getText());
      }
      
      @Override
      public void changedUpdate(DocumentEvent e) {
    	  logger.info("Se le cambio texto a la publicación");
        wallPost.setText(textArea.getText());
      }
    });
    
    
  }
}
