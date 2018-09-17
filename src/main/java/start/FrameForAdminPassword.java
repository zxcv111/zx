	package start;	
	
	import javax.swing.*;//Импортирование библиотек для создания графического интерфейса
	import java.awt.*;//Импортирование библиотек для графического интерфейса
	import java.awt.event.ActionEvent;//Импортирование библиотеки для обработки события
	
	
	
	public class FrameForAdminPassword extends JFrame {//Создание класса FrameForAdminPassword который наследуется от JFrame
	public FrameForAdminPassword(){//Начало описания свойств
	setDefaultCloseOperation(EXIT_ON_CLOSE);//Метод для определения события при закрытии окна(завершение программы)
	setSize(200,200);//Метод для определения размера окна
	setLocationRelativeTo(null);//Указание места расположения окна(центр)
	
	JPanel panelForFrameForAdminPassword = new JPanel();//Создаем объект panelForFrameForAdminPassword класса JPanel
	panelForFrameForAdminPassword.setLayout(new GridLayout(3,1,10,10));//Добавляем менеджер компановки на panelForFrameForAdminPassword
	
	JLabel labelForPanelForFrameForAdmin = new JLabel("Введите пароль");//Создаем объект labelForPanelForFrameForAdmin класса JLabel
	labelForPanelForFrameForAdmin.setHorizontalAlignment(JLabel.CENTER);//Размещаем надпись в центре
	panelForFrameForAdminPassword.add(labelForPanelForFrameForAdmin);//Добавление на panelForFrameForAdminPassword labelForPanelForFrameForAdmin
	
	final JPasswordField passwordField = new JPasswordField();//Создаем объект passwordField класса JPasswordField
	
	panelForFrameForAdminPassword.add(passwordField);//Добавление на panelForFrameForAdminPassword passwordField
	
	JButton buttonForPanelForFrameForAdmin = new JButton("Вход");//Создаем объект buttonForPanelForFrameForAdmin класса JButton
	buttonForPanelForFrameForAdmin.addActionListener(new AbstractAction() {//Добавляем слушатель к кнопке
	public void actionPerformed(ActionEvent e) {//Создаем метод для слушателя
	if (password(String.valueOf(passwordField.getPassword()))==true) {//Сравнение возвращаемого занчения из метода password с true
	FrameForAdmin frameForAdmin = new FrameForAdmin();//Создаем объект frameForAdmin класса FrameForAdmin
	dispose();//закрываем фрейм
	}
	else {
	JOptionPane.showMessageDialog(null,"Вы ввели неправильный пароль");//Выводим сообщение "Вы ввели неправильный пароль"
	}
	
	}
	});
	panelForFrameForAdminPassword.add(buttonForPanelForFrameForAdmin);//Добавление на panelForFrameForAdminPassword buttonForPanelForFrameForAdmin
	
	add(panelForFrameForAdminPassword);//Добавление panelForFrameForAdminPassword
	
	setVisible(true);//Метод делающий видимым объект класса
	}
	public boolean password(String PAS) {//Создание метода calculationsPaper с входным значением PAS
	if (PAS.equals("vlad")) {
	return true;
	} else {
	if (PAS.equals("max")) {
	return true;
	} else {
	if (PAS.equals("anya")) {
	return true;
	} else {
	if (PAS.equals("irina")) {
	return true;
	} else return false;
	}
	}
	}
	}
	}
