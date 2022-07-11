import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class lms extends student_details implements ActionListener{
    static student_details id_21135=new student_details();
    static student_details id_21105=new student_details();
    static student_details id_21110=new student_details();
    static student_details id_21123=new student_details();
    static student_details id_21149=new student_details();
    static student_details id_21175=new student_details();

    static book_details book_tree = new book_details();

    static admin_details admin_books_details = new admin_details(100);

    static JLabel label;

    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    static LocalDateTime issuedate = LocalDateTime.now();
    static LocalDateTime returndate = issuedate.plusDays(7);
    static String issue_date=dtf.format(issuedate);
    static String return_date=dtf.format(returndate);
  
    static JFrame startup;
    static JButton userButton;
    static JButton adminButton;

    static JFrame user;
    static JButton user_login;
    static JButton user_back;
    static JTextField user_id;
    static JLabel user_label;
    static String user_university_id;
    static JOptionPane invalid_user_id;

    static JFrame user_functions;
    static JButton user_functions_back;
    static JButton user_functions_issue;
    static JButton user_functions_return;

    static JFrame admin;
    static JButton admin_login;
    static JButton admin_back;
    static JTextField admin_id;
    static JLabel admin_label; 
    static JTextField admin_password;
    static JLabel admin_label2;
    static String admin_university_id;
    static String admin_password_id;

    static JFrame admin_functions;
    static JButton admin_functions_back;
    static JButton admin_functions_addbook;
    static JButton admin_functions_deletebook;
    static JButton admin_functions_updatebook;
    static JButton admin_functions_printdetails;
    static JButton admin_functions_printinorder;

    static JFrame issue;
    static JButton issue_back;
    static JButton issue_issue;
    static JTextField issue_book_name;
    static JLabel issue_label;
    static String book_name;

    static JFrame issued_sucessfully;
    static JButton issued_sucessfully_back;
    static JLabel issued_sucessfully_label1;
    static JLabel issued_sucessfully_label2;
    static JLabel issued_sucessfully_label3;
    static JLabel issued_sucessfully_label4;
    static JLabel issued_sucessfully_label5;

    static JFrame Return;
    static JButton Return_back;
    static JButton Return_return;
    static JTextField Return_book_name;
    static JLabel Return_label;
    static String returned_book_name;

    static JFrame returned_sucessfully;
    static JButton returned_sucessfully_back;
    static JLabel returned_sucessfully_label;

    static JFrame add_frame;
    static JButton add_back;
    static JButton add_add;
    static JTextField add_book_name;
    static JLabel add_label;
    static String added_book_name;
    static JLabel add_quantity;
    static JTextField add_quantity_text;
    static int added_quantity;
    static JLabel add_quantity_label;

    static JFrame delete_frame;
    static JButton delete_back;
    static JButton delete_delete;
    static JTextField delete_book_name;
    static JLabel delete_label;
    static String deleted_book_name;
    static JLabel delete_quantity;
    static JTextField delete_quantity_text;
    static int deleted_quantity;

    static JFrame update_frame;
    static JButton update_back;
    static JButton update_update;
    static JTextField update_book_name;
    static JLabel update_label;
    static String updated_book_name;
    static JLabel update_quantity;
    static JTextField update_quantity_text;
    static int updated_quantity;

    static JFrame details;
    static JButton details_back;
    static JLabel details_label;
    static JLabel details_label1;
    static JLabel details_label2;
    static JLabel details_label3;
    static JLabel details_label4;
    static JLabel details_label5;
    static JLabel details_label6;
    static JLabel details_label7;
    static JLabel details_label8;
    static JLabel details_label9;
    static JLabel details_label10;
    static JLabel details_label11;
    static JLabel details_label12;

    static JFrame inorder;
    static JLabel inorder_label1;
    static JLabel inorder_label2;
    static JLabel inorder_label3;
    static JLabel inorder_label4;
    static JLabel inorder_label5;
    static JLabel inorder_label6;
    static JLabel inorder_label7;
    static JLabel inorder_label8;
    static JLabel inorder_label9;
    static JLabel inorder_label10;
    static JLabel inorder_label11;
    static JLabel inorder_label12;
    static JButton inorder_back;

    public static void add_books_to_queue(){
        admin_books_details.add_book_admin("Java", 10);
        admin_books_details.add_book_admin("C++", 20);
        admin_books_details.add_book_admin("C", 11);
        admin_books_details.add_book_admin("Python",23);
        admin_books_details.add_book_admin("HTML", 45);
        admin_books_details.add_book_admin("CSS",5);
        admin_books_details.add_book_admin("JavaScript", 100);
        admin_books_details.add_book_admin("PHP", 110);
        admin_books_details.add_book_admin("SQL", 101);
        admin_books_details.add_book_admin("Ruby", 1);
    }
    public static void add_books_to_tree(){
        book_tree.add_book("Java");
        book_tree.add_book("C++");
        book_tree.add_book("C");
        book_tree.add_book("Python");
        book_tree.add_book("HTML");
        book_tree.add_book("CSS");
        book_tree.add_book("JavaScript");
        book_tree.add_book("PHP");
        book_tree.add_book("SQL");
        book_tree.add_book("Ruby");
    }
    
    public static void startup(){
        userButton=new JButton("User");
        userButton.addActionListener(new lms());
        userButton.setBounds(100,200,250,40);
        userButton.setFocusable(false);

        adminButton=new JButton("Admin");
        adminButton.addActionListener(new lms());
        adminButton.setBounds(100,100,250,40);
        adminButton.setFocusable(false);

        startup=new JFrame();
        startup.setSize(600,600);
        startup.setTitle("Welcome to Library Management System");
        startup.setLayout(new GridLayout());
        startup.add(userButton);
        startup.add(adminButton);
        startup.setVisible(true);
    }
    public static void user(){
        user_login=new JButton("Login");
        user_login.addActionListener(new lms());
        user_login.setBounds(200,280,200,40);
        user_login.setFocusable(false);

        user_back=new JButton("Back");
        user_back.addActionListener(new lms());
        user_back.setBounds(0,0,40,20);
        user_back.setFocusable(false);

        user_id=new JTextField();
        user_id.setBounds(200,240,200,40);

        user_label=new JLabel("Enter your University ID: ");
        user_label.setBounds(200,200,200,40);

        label=new JLabel();

        user=new JFrame();
        user.setSize(600,600);
        user.setTitle("Welcome User");
        user.setVisible(true);
        user.add(user_label);
        user.add(user_id);
        user.add(user_login);
        user.add(user_back); 
        user.add(label);
    }
    public static void admin(){
        admin_login=new JButton("Login");
        admin_login.addActionListener(new lms());
        admin_login.setBounds(200,280,200,40);
        admin_login.setFocusable(false);

        admin_back=new JButton("Back");
        admin_back.addActionListener(new lms());
        admin_back.setBounds(0,0,40,20);
        admin_back.setFocusable(false);

        admin_id=new JTextField();
        admin_id.setBounds(200,160,200,40);

        admin_label=new JLabel("Enter your University ID: ");
        admin_label.setBounds(200,120,200,40);

        admin_password=new JTextField();
        admin_password.setBounds(200,240,200,40);

        admin_label2=new JLabel("Enter your Password: ");
        admin_label2.setBounds(200,200,200,40);

        label=new JLabel();

        admin=new JFrame();
        admin.setSize(600,600);
        admin.setTitle("Welcome Admin");
        admin.setVisible(true);
        admin.add(admin_label);
        admin.add(admin_id);
        admin.add(admin_label2);
        admin.add(admin_password);
        admin.add(admin_login);
        admin.add(admin_back);
        admin.add(label);    
    }
    public static void user_functions(){
        user_functions_back=new JButton("Back");
        user_functions_back.addActionListener(new lms());
        user_functions_back.setBounds(0,0,40,20);
        user_functions_back.setFocusable(false);

        user_functions_issue=new JButton("Issue");
        user_functions_issue.addActionListener(new lms());
        user_functions_issue.setBounds(200,200,200,40);
        user_functions_issue.setFocusable(false);

        user_functions_return=new JButton("Return");
        user_functions_return.addActionListener(new lms());
        user_functions_return.setBounds(200,240,200,40);
        user_functions_return.setFocusable(false);

        user_functions=new JFrame();
        user_functions.setSize(600,600);
        user_functions.setTitle("Welcome User");
        user_functions.setLayout(new GridLayout());
        user_functions.setVisible(true);
        user_functions.add(user_functions_issue);
        user_functions.add(user_functions_return);
        user_functions.add(user_functions_back);
    }
    public static void admin_functions(){
        admin_functions_back=new JButton("Back");
        admin_functions_back.addActionListener(new lms());
        admin_functions_back.setBounds(0,0,40,20);
        admin_functions_back.setFocusable(false);
        
        admin_functions_addbook=new JButton("Add Book");
        admin_functions_addbook.addActionListener(new lms());
        admin_functions_addbook.setBounds(200,200,200,40);
        admin_functions_addbook.setFocusable(false);
        
        admin_functions_deletebook=new JButton("Delete Book");
        admin_functions_deletebook.addActionListener(new lms());
        admin_functions_deletebook.setBounds(200,240,200,40);
        admin_functions_deletebook.setFocusable(false);
        
        admin_functions_updatebook=new JButton("Update Book");
        admin_functions_updatebook.addActionListener(new lms());
        admin_functions_updatebook.setBounds(200,280,200,40);
        admin_functions_updatebook.setFocusable(false);
        
        admin_functions_printdetails=new JButton("Print Details");
        admin_functions_printdetails.addActionListener(new lms());
        admin_functions_printdetails.setBounds(200,320,200,40);
        admin_functions_printdetails.setFocusable(false);
        
        admin_functions_printinorder=new JButton("Print In Order");
        admin_functions_printinorder.addActionListener(new lms());
        admin_functions_printinorder.setBounds(200,360,200,40);
        admin_functions_printinorder.setFocusable(false);
        
        admin_functions=new JFrame();
        admin_functions.setSize(600,600);
        admin_functions.setTitle("Welcome Admin");
        admin_functions.setLayout(new GridLayout());
        admin_functions.setVisible(true);
        admin_functions.add(admin_functions_back);
        admin_functions.add(admin_functions_addbook);
        admin_functions.add(admin_functions_deletebook);
        admin_functions.add(admin_functions_updatebook);
        admin_functions.add(admin_functions_printdetails);
        admin_functions.add(admin_functions_printinorder);

    }
    public static void issue(){
        issue_back=new JButton("Back");
        issue_back.addActionListener(new lms());
        issue_back.setBounds(0,0,40,20);
        issue_back.setFocusable(false);

        issue_issue=new JButton("Issue");
        issue_issue.addActionListener(new lms());
        issue_issue.setBounds(200,280,200,40);
        issue_issue.setFocusable(false);
        
        issue_book_name=new JTextField();
        issue_book_name.setBounds(200,240,200,40);
        
        issue_label=new JLabel("Enter book name: ");
        issue_label.setBounds(200,200,200,40);

        label=new JLabel();
        
        issue=new JFrame();
        issue.setSize(600,600);
        issue.setTitle("Issue");
        issue.setVisible(true);
        issue.add(issue_label);
        issue.add(issue_book_name);
        issue.add(issue_issue);
        issue.add(issue_back);
        issue.add(label);
    }
    public static void Return(){
        Return_back=new JButton("Back");
        Return_back.addActionListener(new lms());
        Return_back.setBounds(0,0,40,20);
        Return_back.setFocusable(false);
        
        Return_return=new JButton("Return");
        Return_return.addActionListener(new lms());
        Return_return.setBounds(200,280,200,40);
        Return_return.setFocusable(false);
        
        Return_book_name=new JTextField();
        Return_book_name.setBounds(200,240,200,40);
        
        Return_label=new JLabel("Enter Book Name ");
        Return_label.setBounds(200,200,200,40);

        label=new JLabel();
        
        Return=new JFrame();
        Return.setSize(600,600);
        Return.setTitle("Return");
        Return.setVisible(true);
        Return.add(Return_label);
        Return.add(Return_book_name);
        Return.add(Return_return);
        Return.add(Return_back);
        Return.add(label);
    }
    public static void issued_sucessfully(){
        issued_sucessfully_back=new JButton("Back");
        issued_sucessfully_back.addActionListener(new lms());
        issued_sucessfully_back.setBounds(0,0,40,20);
        issued_sucessfully_back.setFocusable(false);

        issued_sucessfully_label1=new JLabel(book_name+" Book Issued Successfully");
        issued_sucessfully_label1.setBounds(200,200,200,40);

        issued_sucessfully_label2=new JLabel("Issue date");
        issued_sucessfully_label2.setBounds(200,240,200,40);

        issued_sucessfully_label3=new JLabel(issue_date);   
        issued_sucessfully_label3.setBounds(200,280,200,40);

        issued_sucessfully_label4=new JLabel("Return date");
        issued_sucessfully_label4.setBounds(200,320,200,40);

        issued_sucessfully_label5=new JLabel(return_date);
        issued_sucessfully_label5.setBounds(200,360,200,40);
        
        label=new JLabel();

        issued_sucessfully=new JFrame();
        issued_sucessfully.setSize(600,600);
        issued_sucessfully.setTitle("Issued Sucessfully");
        issued_sucessfully.setVisible(true);
        issued_sucessfully.add(issued_sucessfully_back);
        issued_sucessfully.add(issued_sucessfully_label1);
        issued_sucessfully.add(issued_sucessfully_label2);
        issued_sucessfully.add(issued_sucessfully_label3);
        issued_sucessfully.add(issued_sucessfully_label4);
        issued_sucessfully.add(issued_sucessfully_label5);
        issued_sucessfully.add(label);
    }
    public static void returned_sucessfully(){
        returned_sucessfully_back=new JButton("Back");
        returned_sucessfully_back.addActionListener(new lms());
        returned_sucessfully_back.setBounds(0,0,40,20);
        returned_sucessfully_back.setFocusable(false);
        
        returned_sucessfully_label=new JLabel("Book Returned Successfully");
        returned_sucessfully_label.setBounds(200,200,200,40);

        label=new JLabel();
        
        returned_sucessfully=new JFrame();
        returned_sucessfully.setSize(600,600);
        returned_sucessfully.setTitle("Returned Sucessfully");
        returned_sucessfully.setVisible(true);
        returned_sucessfully.add(returned_sucessfully_label);
        returned_sucessfully.add(returned_sucessfully_back);
        returned_sucessfully.add(label);
    }
    public static void print_inorder(){
        inorder_back=new JButton();
        inorder_back.addActionListener(new lms());
        inorder_back.setBounds(0,0,40,20);
        inorder_back.setFocusable(false);

        if(added_book_name!=null && added_quantity!=0){
            inorder_label12=new JLabel(added_book_name+String.valueOf(added_quantity));
            inorder_label12.setBounds(200,160,200,40);
            if(deleted_book_name!=null ){
                if(deleted_book_name.equals("Java")){
                    inorder_label1=new JLabel();
                    inorder_label1.setBounds(200,200,200,40);

                    inorder_label2=new JLabel("C++");
                    inorder_label2.setBounds(200,240,200,40);
        
                    inorder_label3=new JLabel("C");
                    inorder_label3.setBounds(200,280,200,40);

                    inorder_label4=new JLabel("Python");
                    inorder_label4.setBounds(200,320,200,40);

                    inorder_label5=new JLabel("HTML");
                    inorder_label5.setBounds(200,360,200,40);

                    inorder_label6=new JLabel("CSS");
                    inorder_label6.setBounds(200,400,200,40);

                    inorder_label7=new JLabel("JavaScript");
                    inorder_label7.setBounds(200,440,200,40);

                    inorder_label8=new JLabel("PHP");
                    inorder_label8.setBounds(200,480,200,40);

                    inorder_label9=new JLabel("C#");
                    inorder_label9.setBounds(200,520,200,40);

                    inorder_label10=new JLabel("Ruby");
                    inorder_label10.setBounds(200,560,200,40);
                }
                else if(deleted_book_name.equals("C++")){
                    inorder_label1=new JLabel("Java");
                    inorder_label1.setBounds(200,200,200,40);
        
                    inorder_label2=new JLabel();
                    inorder_label2.setBounds(200,240,200,40);
        
                    inorder_label3=new JLabel("C");
                    inorder_label3.setBounds(200,280,200,40);
        
                    inorder_label4=new JLabel("Python");
                    inorder_label4.setBounds(200,320,200,40);
        
                    inorder_label5=new JLabel("HTML");
                    inorder_label5.setBounds(200,360,200,40);
        
                    inorder_label6=new JLabel("CSS");
                    inorder_label6.setBounds(200,400,200,40);
        
                    inorder_label7=new JLabel("JavaScript");
                    inorder_label7.setBounds(200,440,200,40);
        
                    inorder_label8=new JLabel("PHP");
                    inorder_label8.setBounds(200,480,200,40);
        
                    inorder_label9=new JLabel("C#");
                    inorder_label9.setBounds(200,520,200,40);
        
                    inorder_label10=new JLabel("Ruby");
                    inorder_label10.setBounds(200,560,200,40);
                }
                else if(deleted_book_name.equals("C")){
                    inorder_label1=new JLabel("Java");
                    inorder_label1.setBounds(200,200,200,40);
        
                    inorder_label2=new JLabel("C++");
                    inorder_label2.setBounds(200,240,200,40);
        
                    inorder_label3=new JLabel();
                    inorder_label3.setBounds(200,280,200,40);
        
                    inorder_label4=new JLabel("Python");
                    inorder_label4.setBounds(200,320,200,40);
        
                    inorder_label5=new JLabel("HTML");
                    inorder_label5.setBounds(200,360,200,40);
        
                    inorder_label6=new JLabel("CSS");
                    inorder_label6.setBounds(200,400,200,40);
        
                    inorder_label7=new JLabel("JavaScript");
                    inorder_label7.setBounds(200,440,200,40);
        
                    inorder_label8=new JLabel("PHP");
                    inorder_label8.setBounds(200,480,200,40);
        
                    inorder_label9=new JLabel("C#");
                    inorder_label9.setBounds(200,520,200,40);
        
                    inorder_label10=new JLabel("Ruby");
                    inorder_label10.setBounds(200,560,200,40);
                }
                else if(deleted_book_name.equals("Python")){
                    inorder_label1=new JLabel("Java");
                    inorder_label1.setBounds(200,200,200,40);
        
                    inorder_label2=new JLabel("C++");
                    inorder_label2.setBounds(200,240,200,40);
        
                    inorder_label3=new JLabel("C");
                    inorder_label3.setBounds(200,280,200,40);
        
                    inorder_label4=new JLabel();
                    inorder_label4.setBounds(200,320,200,40);
        
                    inorder_label5=new JLabel("HTML");
                    inorder_label5.setBounds(200,360,200,40);
        
                    inorder_label6=new JLabel("CSS");
                    inorder_label6.setBounds(200,400,200,40);
        
                    inorder_label7=new JLabel("JavaScript");
                    inorder_label7.setBounds(200,440,200,40);
        
                    inorder_label8=new JLabel("PHP");
                    inorder_label8.setBounds(200,480,200,40);
        
                    inorder_label9=new JLabel("C#");
                    inorder_label9.setBounds(200,520,200,40);
        
                    inorder_label10=new JLabel("Ruby");
                    inorder_label10.setBounds(200,560,200,40);
                }
                else if(deleted_book_name.equals("HTML")){
                    inorder_label1=new JLabel("Java");
                    inorder_label1.setBounds(200,200,200,40);
        
                    inorder_label2=new JLabel("C++");
                    inorder_label2.setBounds(200,240,200,40);
        
                    inorder_label3=new JLabel("C");
                    inorder_label3.setBounds(200,280,200,40);
        
                    inorder_label4=new JLabel("Python");
                    inorder_label4.setBounds(200,320,200,40);
        
                    inorder_label5=new JLabel();
                    inorder_label5.setBounds(200,360,200,40);
        
                    inorder_label6=new JLabel("CSS");
                    inorder_label6.setBounds(200,400,200,40);
        
                    inorder_label7=new JLabel("JavaScript");
                    inorder_label7.setBounds(200,440,200,40);
        
                    inorder_label8=new JLabel("PHP");
                    inorder_label8.setBounds(200,480,200,40);
        
                    inorder_label9=new JLabel("C#");
                    inorder_label9.setBounds(200,520,200,40);
        
                    inorder_label10=new JLabel("Ruby");
                    inorder_label10.setBounds(200,560,200,40);
                }
                else if(deleted_book_name.equals("CSS")){
                    inorder_label1=new JLabel("Java");
                    inorder_label1.setBounds(200,200,200,40);
        
                    inorder_label2=new JLabel("C++");
                    inorder_label2.setBounds(200,240,200,40);
        
                    inorder_label3=new JLabel("C");
                    inorder_label3.setBounds(200,280,200,40);
        
                    inorder_label4=new JLabel("Python");
                    inorder_label4.setBounds(200,320,200,40);
        
                    inorder_label5=new JLabel("HTML");
                    inorder_label5.setBounds(200,360,200,40);
        
                    inorder_label6=new JLabel();
                    inorder_label6.setBounds(200,400,200,40);
        
                    inorder_label7=new JLabel("JavaScript");
                    inorder_label7.setBounds(200,440,200,40);
        
                    inorder_label8=new JLabel("PHP");
                    inorder_label8.setBounds(200,480,200,40);
        
                    inorder_label9=new JLabel("C#");
                    inorder_label9.setBounds(200,520,200,40);
        
                    inorder_label10=new JLabel("Ruby");
                    inorder_label10.setBounds(200,560,200,40);
                }
                else if(deleted_book_name.equals("JavaScript")){
                    inorder_label1=new JLabel("Java");
                    inorder_label1.setBounds(200,200,200,40);
        
                    inorder_label2=new JLabel("C++");
                    inorder_label2.setBounds(200,240,200,40);
        
                    inorder_label3=new JLabel("C");
                    inorder_label3.setBounds(200,280,200,40);
        
                    inorder_label4=new JLabel("Python");
                    inorder_label4.setBounds(200,320,200,40);
        
                    inorder_label5=new JLabel("HTML");
                    inorder_label5.setBounds(200,360,200,40);
        
                    inorder_label6=new JLabel("CSS");
                    inorder_label6.setBounds(200,400,200,40);
        
                    inorder_label7=new JLabel();
                    inorder_label7.setBounds(200,440,200,40);
        
                    inorder_label8=new JLabel("PHP");
                    inorder_label8.setBounds(200,480,200,40);
        
                    inorder_label9=new JLabel("C#");
                    inorder_label9.setBounds(200,520,200,40);
        
                    inorder_label10=new JLabel("Ruby");
                    inorder_label10.setBounds(200,560,200,40);
                }
                else if(deleted_book_name.equals("PHP")){
                    inorder_label1=new JLabel("Java");
                    inorder_label1.setBounds(200,200,200,40);
        
                    inorder_label2=new JLabel("C++");
                    inorder_label2.setBounds(200,240,200,40);
        
                    inorder_label3=new JLabel("C");
                    inorder_label3.setBounds(200,280,200,40);
        
                    inorder_label4=new JLabel("Python");
                    inorder_label4.setBounds(200,320,200,40);
        
                    inorder_label5=new JLabel("HTML");
                    inorder_label5.setBounds(200,360,200,40);
        
                    inorder_label6=new JLabel("CSS");
                    inorder_label6.setBounds(200,400,200,40);
        
                    inorder_label7=new JLabel("JavaScript");
                    inorder_label7.setBounds(200,440,200,40);
        
                    inorder_label8=new JLabel();
                    inorder_label8.setBounds(200,480,200,40);
        
                    inorder_label9=new JLabel("C#");
                    inorder_label9.setBounds(200,520,200,40);
        
                    inorder_label10=new JLabel("Ruby");
                    inorder_label10.setBounds(200,560,200,40);
                }
                else if(deleted_book_name.equals("C#")){
                    inorder_label1=new JLabel("Java");
                    inorder_label1.setBounds(200,200,200,40);
        
                    inorder_label2=new JLabel("C++");
                    inorder_label2.setBounds(200,240,200,40);
        
                    inorder_label3=new JLabel("C");
                    inorder_label3.setBounds(200,280,200,40);
        
                    inorder_label4=new JLabel("Python");
                    inorder_label4.setBounds(200,320,200,40);
        
                    inorder_label5=new JLabel("HTML");
                    inorder_label5.setBounds(200,360,200,40);
        
                    inorder_label6=new JLabel("CSS");
                    inorder_label6.setBounds(200,400,200,40);
        
                    inorder_label7=new JLabel("JavaScript");
                    inorder_label7.setBounds(200,440,200,40);
        
                    inorder_label8=new JLabel("PHP");
                    inorder_label8.setBounds(200,480,200,40);
        
                    inorder_label9=new JLabel();
                    inorder_label9.setBounds(200,520,200,40);
        
                    inorder_label10=new JLabel("Ruby");
                    inorder_label10.setBounds(200,560,200,40);
                }
                else if(deleted_book_name.equals("Ruby")){
                    inorder_label1=new JLabel("Java");
                    inorder_label1.setBounds(200,200,200,40);
        
                    inorder_label2=new JLabel("C++");
                    inorder_label2.setBounds(200,240,200,40);
        
                    inorder_label3=new JLabel("C");
                    inorder_label3.setBounds(200,280,200,40);
        
                    inorder_label4=new JLabel("Python");
                    inorder_label4.setBounds(200,320,200,40);
        
                    inorder_label5=new JLabel("HTML");
                    inorder_label5.setBounds(200,360,200,40);
        
                    inorder_label6=new JLabel("CSS");
                    inorder_label6.setBounds(200,400,200,40);
        
                    inorder_label7=new JLabel("JavaScript");
                    inorder_label7.setBounds(200,440,200,40);
        
                    inorder_label8=new JLabel("PHP");
                    inorder_label8.setBounds(200,480,200,40);
        
                    inorder_label9=new JLabel("C#");
                    inorder_label9.setBounds(200,520,200,40);
        
                    inorder_label10=new JLabel();
                    inorder_label10.setBounds(200,560,200,40);
                }
            }
        }
        else{
            inorder_label12=new JLabel();
            inorder_label12.setBounds(200,160,200,40);

            inorder_label1=new JLabel("Java");
            inorder_label1.setBounds(200,200,200,40);

            inorder_label2=new JLabel("C++");
            inorder_label2.setBounds(200,240,200,40);

            inorder_label3=new JLabel("C");
            inorder_label3.setBounds(200,280,200,40);

            inorder_label4=new JLabel("Python");
            inorder_label4.setBounds(200,320,200,40);

            inorder_label5=new JLabel("HTML");
            inorder_label5.setBounds(200,360,200,40);

            inorder_label6=new JLabel("CSS");
            inorder_label6.setBounds(200,400,200,40);

            inorder_label7=new JLabel("JavaScript");
            inorder_label7.setBounds(200,440,200,40);

            inorder_label8=new JLabel("PHP");
            inorder_label8.setBounds(200,480,200,40);

            inorder_label9=new JLabel("C#");
            inorder_label9.setBounds(200,520,200,40);

            inorder_label10=new JLabel("Ruby");
            inorder_label10.setBounds(200,560,200,40);
        }
        

        inorder_label11=new JLabel("List of books available in the library ");
        inorder_label11.setBounds(200,600,200,40);

        label=new JLabel();

        inorder=new JFrame();
        inorder.setSize(600,600);
        inorder.setTitle("Print Inorder");
        inorder.setVisible(true);
        inorder.add(inorder_back);
        inorder.add(inorder_label11);
        inorder.add(inorder_label12);
        inorder.add(inorder_label1);
        inorder.add(inorder_label2);
        inorder.add(inorder_label3);
        inorder.add(inorder_label4);
        inorder.add(inorder_label5);
        inorder.add(inorder_label6);
        inorder.add(inorder_label7);
        inorder.add(inorder_label8);
        inorder.add(inorder_label9);
        inorder.add(inorder_label10);
        inorder.add(label);
    }
    public void add_admin(){
        add_back=new JButton("back");
        add_back.addActionListener(new lms());
        add_back.setBounds(0,0,40,20);
        add_back.setFocusable(false);

        add_add=new JButton("Add book");
        add_add.addActionListener(new lms());
        add_add.setBounds(200,280,200,40);
        add_add.setFocusable(false);

        add_book_name=new JTextField();
        add_book_name.setBounds(200,160,200,40);

        add_label=new JLabel("Enter Book Name: ");
        add_label.setBounds(200,120,200,40);
        
        add_quantity_label=new JLabel("Enter quantity");
        add_quantity_label.setBounds(200,200,200,40);
        
        add_quantity_text=new JTextField();
        add_quantity_text.setBounds(200,240,200,40);

        label=new JLabel();

        JFrame add_frame=new JFrame();
        add_frame.setSize(600,600);
        add_frame.setTitle("Add a book");
        add_frame.setVisible(true);
        add_frame.add(add_label);
        add_frame.add(add_book_name);
        add_frame.add(add_quantity_label);
        add_frame.add(add_quantity_text);
        add_frame.add(add_add);
        add_frame.add(add_back);
        add_frame.add(label);
    }
    public static void delete_admin(){
        delete_back=new JButton("back");
        delete_back.addActionListener(new lms());
        delete_back.setBounds(0,0,40,20);
        delete_back.setFocusable(false);
        
        delete_quantity=new JLabel("Enter quantity");
        delete_quantity.setBounds(200,200,200,40);
        
        delete_book_name=new JTextField();
        delete_book_name.setBounds(200,160,200,40);
        
        delete_quantity_text=new JTextField();
        delete_quantity_text.setBounds(200,240,200,40);
        
        delete_label=new JLabel("Enter Book Name: ");
        delete_label.setBounds(200,120,200,40);
        
        delete_delete=new JButton("Delete book");
        delete_delete.addActionListener(new lms());
        delete_delete.setBounds(200,280,200,40);
        delete_delete.setFocusable(false);

        label=new JLabel();
        
        JFrame delete_frame=new JFrame();
        delete_frame.setSize(600,600);
        delete_frame.setTitle("Delete a book");
        delete_frame.setVisible(true);
        delete_frame.add(delete_back);
        delete_frame.add(delete_label);
        delete_frame.add(delete_book_name);
        delete_frame.add(delete_quantity);
        delete_frame.add(delete_quantity_text);
        delete_frame.add(delete_delete);
        delete_frame.add(label);
    }
    public static void details(){
        details_label=new JLabel("Book Names and quantity");
        details_label.setBounds(200,200,200,40);

        if(added_book_name!=null && added_quantity!=0){
            details_label11=new JLabel(added_book_name+" "+String.valueOf(added_quantity));
            details_label11.setBounds(50,50,200,50);

            if(updated_book_name!=null && updated_quantity!=0){
                if(updated_book_name=="Java" && updated_quantity!=0){
                    details_label1=new JLabel("Java"+" "+String.valueOf(updated_quantity));
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(updated_book_name=="C" && updated_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+String.valueOf(updated_quantity));
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(updated_book_name=="C++" && updated_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+String.valueOf(updated_quantity));
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(updated_book_name=="Python" && updated_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+String.valueOf(updated_quantity));
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(updated_book_name=="C#" && updated_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+String.valueOf(updated_quantity));
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(updated_book_name=="Ruby" && updated_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+String.valueOf(updated_quantity));
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(updated_book_name=="PHP" && updated_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+String.valueOf(updated_quantity));
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(updated_book_name=="HTML" && updated_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+String.valueOf(updated_quantity));
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(updated_book_name=="CSS" && updated_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+String.valueOf(updated_quantity));
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(updated_book_name=="Javascript" && updated_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+String.valueOf(updated_quantity));
                    details_label10.setBounds(50,550,200,50);
                }  
            }
            else if(deleted_book_name!=null && deleted_quantity!=0){
                if(deleted_book_name=="Java" && deleted_quantity!=0){
                    details_label1=new JLabel();
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(deleted_book_name=="C" && deleted_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel();
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(deleted_book_name=="C++" && deleted_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel();
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(deleted_book_name=="Python" && deleted_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel();
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(deleted_book_name=="C#" && deleted_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel();
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(deleted_book_name=="Ruby" && deleted_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel();
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(deleted_book_name=="PHP" && deleted_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel();
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(deleted_book_name=="HTML" && deleted_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel();
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(deleted_book_name=="CSS" && deleted_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel();
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel("Javascript"+" "+"10");
                    details_label10.setBounds(50,550,200,50);
                }
                else if(deleted_book_name=="Javascript" && deleted_quantity!=0){
                    details_label1=new JLabel("Java"+" "+"10");
                    details_label1.setBounds(50,100,200,50);

                    details_label2=new JLabel("C"+" "+"10");
                    details_label2.setBounds(50,150,200,50);

                    details_label3=new JLabel("C++"+" "+"10");
                    details_label3.setBounds(50,200,200,50);

                    details_label4=new JLabel("Python"+" "+"10");
                    details_label4.setBounds(50,250,200,50);

                    details_label5=new JLabel("C#"+" "+"10");
                    details_label5.setBounds(50,300,200,50);

                    details_label6=new JLabel("Ruby"+" "+"10");
                    details_label6.setBounds(50,350,200,50);

                    details_label7=new JLabel("PHP"+" "+"10");
                    details_label7.setBounds(50,400,200,50);

                    details_label8=new JLabel("HTML"+" "+"10");
                    details_label8.setBounds(50,450,200,50);

                    details_label9=new JLabel("CSS"+" "+"10");
                    details_label9.setBounds(50,500,200,50);

                    details_label10=new JLabel();
                    details_label10.setBounds(50,550,200,50);
                }
            } 
        }
        else{
            details_label11=new JLabel();
            details_label11.setBounds(50,50,200,50);

            details_label1=new JLabel("Java"+" 10");
            details_label1.setBounds(50,100,200,50);

            details_label2=new JLabel("C"+" 10");
            details_label2.setBounds(50,150,200,50);

            details_label3=new JLabel("C++"+" 10");
            details_label3.setBounds(50,200,200,50);

            details_label4=new JLabel("Python"+" 10");
            details_label4.setBounds(50,250,200,50);

            details_label5=new JLabel("C#"+" 10");
            details_label5.setBounds(50,300,200,50);

            details_label6=new JLabel("Ruby"+" 10");
            details_label6.setBounds(50,350,200,50);

            details_label7=new JLabel("PHP"+" 10");
            details_label7.setBounds(50,400,200,50);

            details_label8=new JLabel("HTML"+" 10");
            details_label8.setBounds(50,450,200,50);

            details_label9=new JLabel("CSS"+" 10");
            details_label9.setBounds(50,500,200,50);

            details_label10=new JLabel("Javascript"+" 10");
            details_label10.setBounds(50,550,200,50);
        }
        
        details_back=new JButton("Back");
        details_back.setBounds(0,0,20,40);
        details_back.addActionListener(new lms());

        details=new JFrame("Book Details");
        details.setSize(600,600);
        details.setVisible(true);
        details.setLayout(null);
        details.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        details.setResizable(false);
        details.add(details_label);
        details.add(details_label11);
        details.add(details_label1);
        details.add(details_label2);
        details.add(details_label3);
        details.add(details_label4);
        details.add(details_label5);
        details.add(details_label6);
        details.add(details_label7);
        details.add(details_label8);
        details.add(details_label9);
        details.add(details_label10);
        details.add(details_back);
    }
    public static void update_admin(){
        update_back=new JButton("back");
        update_back.addActionListener(new lms());
        update_back.setBounds(0,0,40,20);
        update_back.setFocusable(false);
        
        update_quantity=new JLabel("Enter quantity");
        update_quantity.setBounds(200,200,200,40);
        
        update_book_name=new JTextField();
        update_book_name.setBounds(200,160,200,40);
        
        update_quantity_text=new JTextField();
        update_quantity_text.setBounds(200,240,200,40);
        
        update_label=new JLabel("Enter Book Name: ");
        update_label.setBounds(200,120,200,40);
        
        update_update=new JButton("Update book");
        update_update.addActionListener(new lms());
        update_update.setBounds(200,280,200,40);
        update_update.setFocusable(false);

        label=new JLabel();
        
        JFrame update_frame=new JFrame("Update a book");
        update_frame.setSize(600,600);
        update_frame.setTitle("Update a book");
        update_frame.setVisible(true);
        update_frame.setLayout(null);   
        update_frame.add(update_back);
        update_frame.add(update_label);
        update_frame.add(update_book_name);
        update_frame.add(update_quantity);
        update_frame.add(update_quantity_text);
        update_frame.add(update_update);
        update_frame.add(label);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==userButton){
            startup.dispose();
            user();
        }
        else if(e.getSource()==user_back){
            user.dispose();
            startup();
        }
        else if(e.getSource()==adminButton){
            startup.dispose();
            admin();
        }
        else if(e.getSource()==admin_back){
            admin.dispose();
            startup();
        }
        else if(e.getSource()==user_login){
            user_university_id=user_id.getText();
            if(user_university_id.equals("21135")==true){
                user.dispose();
                user_functions();
            }
            else if(user_university_id.equals("21105")==true){
                user.dispose();
                user_functions();
            }
            else if(user_university_id.equals("21123")==true){
                user.dispose();
                user_functions();
            }
            else if(user_university_id.equals("21175")==true){
                user.dispose();
                user_functions();
            }
            else if(user_university_id.equals("21149")==true){
                user.dispose();
                user_functions();
            }
            else if(user_university_id.equals("21110")==true){
                user.dispose();
                user_functions();
            }
            else{
                JOptionPane.showMessageDialog(null,"Enter Valid University ID","Invalid ID",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==user_functions_back){
            user_functions.dispose();
            user();
        }
        else if (e.getSource()==admin_login){
            admin_university_id=admin_id.getText();
            admin_password_id=admin_password.getText();
            if(admin_university_id.equals("LoginKaro")==true && admin_password_id.equals("PasswordDalo")==true){
                admin.dispose();
                admin_functions();
            }
            else{
                JOptionPane.showMessageDialog(null,"Enter Valid Credentials","Invalid Credentials",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (e.getSource()==admin_functions_back){
            admin_functions.dispose();
            admin();
        }
        else if(e.getSource()==user_functions_issue){
            user_functions.dispose();
            issue();
        }
        else if(e.getSource()==issue_back){
            issue.dispose();
            user_functions();
        }
        else if (e.getSource()==user_functions_return){
            user_functions.dispose();
            Return();
        }
        else if(e.getSource()==Return_back){
            Return.dispose();
            user_functions();
        }
        else if(e.getSource()==issue_issue){
            book_name=issue_book_name.getText();
            if(user_university_id.equals("21135")==true){
                if(id_21135.getCount()==3){
                    JOptionPane.showMessageDialog(null,"Maximum book issue capacity reached","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    id_21135.add_book(book_name);
                    issue.dispose();
                    issued_sucessfully();
                }
            }
            else if(user_university_id.equals("21105")==true){
                if(id_21105.getCount()==3){
                    JOptionPane.showMessageDialog(null,"Maximum book issue capacity reached","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    id_21105.add_book(book_name);
                    issue.dispose();
                    issued_sucessfully();
                }
            }
            else if(user_university_id.equals("21123")==true){
                if(id_21123.getCount()==3){
                    JOptionPane.showMessageDialog(null,"Maximum book issue capacity reached","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    id_21123.add_book(book_name);
                    issue.dispose();
                    issued_sucessfully();
                }
            }
            else if(user_university_id.equals("21175")==true){
                if(id_21175.getCount()==3){
                    JOptionPane.showMessageDialog(null,"Maximum book issue capacity reached","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    id_21175.add_book(book_name);
                    issue.dispose();
                    issued_sucessfully();
                }
            }
            else if(user_university_id.equals("21149")==true){
                if(id_21149.getCount()==3){
                    JOptionPane.showMessageDialog(null,"Maximum Book issue capacity reached","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    id_21149.add_book(book_name);
                    issue.dispose();
                    issued_sucessfully();
                }
            }
            else if(user_university_id.equals("21110")==true){
                if(id_21110.getCount()==3){
                    JOptionPane.showMessageDialog(null,"Maximum book issue capacity reached","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    id_21110.add_book(book_name);
                    issue.dispose();
                    issued_sucessfully();
                }
            }
        }
        else if(e.getSource()==issued_sucessfully_back){
            issued_sucessfully.dispose();
            user_functions();
        }
        else if (e.getSource()==Return_return){
            returned_book_name=Return_book_name.getText();
            if(user_university_id.equals("21135")==true){
                if(id_21135.isEmpty()==false){
                    id_21135.delete_book(returned_book_name);
                    Return.dispose();
                    returned_sucessfully();
                }
                else{
                    JOptionPane.showMessageDialog(null,"No Book Issued");
                }
            }
            else if(user_university_id.equals("21105")==true){
                if(id_21105.isEmpty()==false){
                    id_21105.delete_book(returned_book_name);
                    Return.dispose();
                    returned_sucessfully();
                }
                else{
                    JOptionPane.showMessageDialog(null,"No Book Issued");
                }
            }
            else if(user_university_id.equals("21123")==true){
                if(id_21123.isEmpty()==false){
                    id_21123.delete_book(returned_book_name);
                    Return.dispose();
                    returned_sucessfully();
                }
                else{
                    JOptionPane.showMessageDialog(null,"No Book Issued");
                }
            }
            else if(user_university_id.equals("21175")==true){
                if(id_21175.isEmpty()==false){
                    id_21175.delete_book(returned_book_name);
                    Return.dispose();
                    returned_sucessfully();
                }
                else{
                    JOptionPane.showMessageDialog(null,"No Book Issued");
                }
            }
            else if(user_university_id.equals("21149")==true){
                if(id_21149.isEmpty()==false){
                    id_21149.delete_book(returned_book_name);
                    Return.dispose();
                    returned_sucessfully();
                }
                else{
                    JOptionPane.showMessageDialog(null,"No Book Issued");
                }
            }
            else if(user_university_id.equals("21110")==true){
                if(id_21110.isEmpty()==false){
                    id_21110.delete_book(returned_book_name);
                    Return.dispose();
                    returned_sucessfully();
                }
                else{
                    JOptionPane.showMessageDialog(null,"No Book Issued");
                }
            }
        }
        else if(e.getSource()==returned_sucessfully_back){
            returned_sucessfully.dispose();
            user_functions();
        }
        else if(e.getSource()==admin_functions_printinorder){
            admin_functions.dispose();
            print_inorder();
        }
        else if(e.getSource()==inorder_back){
            inorder.dispose();
            admin_functions();
        }
        else if(e.getSource()==admin_functions_addbook){
            admin_functions.dispose();
            add_admin();
        }
        else if(e.getSource()==add_add){
            added_book_name=add_book_name.getText();
            added_quantity=Integer.parseInt(add_quantity_text.getText());
            admin_books_details.add_book_admin(added_book_name,added_quantity);
            JOptionPane.showMessageDialog(null,"Book Added Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getSource()==add_back){
            add_frame.dispose();
            admin_functions();
        }
        else if(e.getSource()==admin_functions_deletebook){
            admin_functions.dispose();
            delete_admin();
        }
        else if(e.getSource()==delete_back){
            delete_frame.dispose();
            admin_functions();
        }
        else if (e.getSource()==delete_delete){
            deleted_book_name=delete_book_name.getText();
            admin_books_details.delete_book_admin(deleted_book_name);
            JOptionPane.showMessageDialog(null,"Book Deleted Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getSource()==admin_functions_printdetails){
            admin_functions.dispose();
            details();
        }
        else if(e.getSource()==details_back){
            details.dispose();
            admin_functions();
        }
        else if(e.getSource()==admin_functions_updatebook){
            admin_functions.dispose();
            update_admin();
        }
        else if(e.getSource()==update_update){
            updated_book_name=update_book_name.getText();
            updated_quantity=Integer.parseInt(update_quantity_text.getText());
            if(admin_books_details.isEmpty_details()==true){
                JOptionPane.showMessageDialog(null,"No Books Available","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                admin_books_details.update_quantity(updated_book_name,updated_quantity);
                JOptionPane.showMessageDialog(null,"Book Updated Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(e.getSource()==update_back){
            update_frame.dispose();
            admin_functions();
        }  
    }
    public static void main(String[] args){
        add_books_to_tree();
        add_books_to_queue();
        startup();
    }
}
