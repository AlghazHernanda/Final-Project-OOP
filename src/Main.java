/*
Nama = Mohamad Alghaz Hernanda(069), Muhammad Galang Satria (003), Roisyal Bariz (023)
kelas = A
Tugas = Project TicTacToe
*/
public class Main{
public static void main(String args[]) 
    {
    
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } 
    catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } 
    catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } 
    catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } 
    catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* membuat dan menampilkan display */
    java.awt.EventQueue.invokeLater(new Runnable() 
    {
        public void run() {
            new TicTacToe().setVisible(true);
        }
    });
}
}