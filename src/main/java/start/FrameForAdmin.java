	package start;
	
	import Grid.GridBagConstraintsForPanelForWorkerForButton;//Импортируем класс GridBagConstraintsForPanelForWorkerForButton из пакета Grid
	import Grid.GridBagConstraintsForPanelForWorkerForLabel;//Импортируем класс GridBagConstraintsForPanelForWorkerForLabel из пакета Grid
	import Grid.GridBagConstraintsForPanelForWorkerForTextFields;//Импортируем класс GridBagConstraintsForPanelForWorkerForTextFields из пакета Grid
	
	import javax.swing.*;//Импортирование библиотек для создания графического интерфейса
	import java.awt.*;//Импортирование библиотек для графического интерфейса
	import java.awt.event.ActionEvent;//Импортирование библиотеки для обработки события

	public class FrameForAdmin extends JFrame {//Создание класса FrameForAdmin который наследуется от JFrame
	public FrameForAdmin(){//Начало описания свойств
	setDefaultCloseOperation(EXIT_ON_CLOSE);//Метод для определения события при закрытии окна(завершение программы)
	setSize(500,500);//Метод для определения размера окна
	setLocationRelativeTo(null);//Указание места расположения окна(центр)
	GridBagLayout layout = new GridBagLayout();//Создаем layout класса GridBagLayout
	setLayout(layout);//Добавление менеджера компановки
	
	JPanel panelForFrameForAdminLabel = new JPanel();//Создаем объект panelForFrameForAdminLabel класса JPanel
	JLabel labelForFrameForAdmin = new JLabel("Администратор");//Создаем объект labelForFrameForAdmin класса JLabel
	panelForFrameForAdminLabel.add(labelForFrameForAdmin);
	panelForFrameForAdminLabel.setLayout(new FlowLayout(FlowLayout.CENTER));
	
	JPanel panelForFrameForAdmin = new JPanel();
	panelForFrameForAdmin.setLayout(new GridLayout(3,3,10,20));
	
	JLabel labelForNumber = new JLabel("Расход бумаги");//Создаем объект labelForNumber класса JLabel
	panelForFrameForAdmin.add(labelForNumber);
	final JTextField textFieldForNumber = new JTextField();//Создаем объект textFieldForNumber класса JTextField
	panelForFrameForAdmin.add(textFieldForNumber);
	JLabel labelForPackaging = new JLabel("упаковок");//Создаем объект labelForPackaging класса JLabel
	panelForFrameForAdmin.add(labelForPackaging);
	
	JLabel labelForCartridge = new JLabel("Расход катриджей");//Создаем объект labelForCartridge класса JLabel
	panelForFrameForAdmin.add(labelForCartridge);
	final JTextField textFieldForCartridge = new JTextField();//Создаем объект textFieldForCartridge класса JTextField
	panelForFrameForAdmin.add(textFieldForCartridge);
	JLabel labelForPieces = new JLabel("штук");//Создаем объект labelForPieces класса JLabel
	panelForFrameForAdmin.add(labelForPieces);
	
	JLabel labelForPay = new JLabel("Стоимость расходов");//Создаем объект labelForPay класса JLabel
	panelForFrameForAdmin.add(labelForPay);
	final JTextArea textForPay = new JTextArea();//Создаем объект textForPay класса JTextField
	panelForFrameForAdmin.add(textForPay);
	JLabel labelForRub = new JLabel("рублей");//Создаем объект labelForRub класса JLabel
	panelForFrameForAdmin.add(labelForRub);
	
	JButton buttonExit = new JButton("Выход");//Создаем объект buttonExit класса JButton
	buttonExit.addActionListener(new AbstractAction() {//Добавляем слушатель к кнопке
	public void actionPerformed(ActionEvent e) {//Создаем метод для слушателя
	dispose();//закрываем фрейм
	}
	});
	
	JButton buttonForNumber = new JButton("Расчет");//Создаем объект buttonForNumber класса JButton
	buttonForNumber.addActionListener(new AbstractAction() {//Добавляем слушатель к кнопке
	public void actionPerformed(ActionEvent e) {//Создаем метод для слушателя
	try {//Проверка на ввод числа
	textForPay.setText(String.valueOf(numberForButton(Integer.parseInt(textFieldForNumber.getText()),Integer.parseInt(textFieldForCartridge.getText()))));//Вывод на textForPay возвращаемое значение метода numberForButton с входными парамметрами textFieldForNumber и textFieldForCartridge
	}catch (NumberFormatException e1){
	JOptionPane.showMessageDialog(null,"Введите число!");//Выводим сообщение "Вы ввели неправильный пароль"
	}
	
	}
	});
	
	
	GridBagConstraintsForPanelForWorkerForLabel gridLabel = new GridBagConstraintsForPanelForWorkerForLabel();//Создаем объект gridLabel класса GridBagConstraintsForPanelForWorkerForLabel
	layout.setConstraints(panelForFrameForAdminLabel,gridLabel);//Добавление к менеджеру компановки параметров расположения для panelForFrameForAdminLabel
	add(panelForFrameForAdminLabel);//Добавление panelForFrameForAdminLabel
	GridBagConstraintsForPanelForWorkerForTextFields gridText = new GridBagConstraintsForPanelForWorkerForTextFields();//Создаем объект gridText класса GridBagConstraintsForPanelForWorkerForTextFields
	layout.setConstraints(panelForFrameForAdmin,gridText);//Добавление к менеджеру компановки параметров расположения для panelForFrameForAdmin
	add(panelForFrameForAdmin);//Добавление panelForFrameForAdmin
	GridBagConstraintsForPanelForWorkerForButton gridButton = new GridBagConstraintsForPanelForWorkerForButton();//Создаем объект gridButton класса GridBagConstraintsForPanelForWorkerForButton
	GridBagConstraintsForPanelForWorkerForButton gridButton1 = new GridBagConstraintsForPanelForWorkerForButton();//Создаем объект gridButton1 класса GridBagConstraintsForPanelForWorkerForButton
	gridButton.gridy = 6;//задаем номер строки для gridButton
	gridButton1.gridy = 6;//задаем номер строки для gridButton1
	gridButton1.gridx = 1;//задаем номер столбца для gridButton1
	layout.setConstraints(buttonForNumber,gridButton);//Добавление к менеджеру компановки параметров расположения для buttonForNumber
	add(buttonForNumber);//Добавление buttonForNumber
	layout.setConstraints(buttonExit,gridButton1);//Добавление к менеджеру компановки параметров расположения для buttonExit
	add(buttonExit);//Добавление buttonExit
	
	setVisible(true);//Метод делающий видимым объект класса
	}
	public int numberForButton(int TEXTFIELDNUMBER,int TEXTFIELDCARTRIDGE){//Создание метода numberForButton с входными значениями TEXTFIELDNUMBER, TEXTFIELDCARTRIDGE
	return TEXTFIELDNUMBER*300+TEXTFIELDCARTRIDGE*1500;//Вывод результата
	}
	}
