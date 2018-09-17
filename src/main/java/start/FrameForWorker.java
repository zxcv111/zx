	package start;
	
	import Grid.GridBagConstraintsForPanelForWorkerForButton;//Импортируем класс GridBagConstraintsForPanelForWorkerForButton из пакета Grid
	import Grid.GridBagConstraintsForPanelForWorkerForLabel;//Импортируем класс GridBagConstraintsForPanelForWorkerForLabel из пакета Grid
	import Grid.GridBagConstraintsForPanelForWorkerForTextAreas;//Импортируем класс GridBagConstraintsForPanelForWorkerForTextAreas из пакета Grid
	import Grid.GridBagConstraintsForPanelForWorkerForTextFields;//Импортируем класс GridBagConstraintsForPanelForWorkerForTextFields из пакета Grid
	
	import javax.swing.*;//Импортирование библиотек для создания графического интерфейса
	import java.awt.*;//Импортирование библиотек для графического интерфейса
	import java.awt.event.ActionEvent;//Импортирование библиотеки для обработки события
	
	public class FrameForWorker extends JFrame {//Создание класса FrameForWorker который наследуется от JFrame
	
	public FrameForWorker(){//Начало описания свойств
	setDefaultCloseOperation(EXIT_ON_CLOSE);//Метод для определения события при закрытии окна(завершение программы)
	setSize(600,500);//Метод для определения размера окна
	setLocationRelativeTo(null);//Указание места расположения окна(центр)
	
	JPanel panelForWorker = new JPanel();//Создаем объект panelForWorker класса JPanel
	add(panelForWorker);//Добавляем panelForWorker
	
	GridBagLayout gridBagLayout = new GridBagLayout();//Создаем объект gridBagLayout класса GridBagLayout
	panelForWorker.setLayout(gridBagLayout);//Добавляем менеджер компановки на panelForWorker
	GridBagConstraintsForPanelForWorkerForLabel gridLabel = new GridBagConstraintsForPanelForWorkerForLabel();//Создаем объект gridLabel класса GridBagConstraintsForPanelForWorkerForLabel
	GridBagConstraintsForPanelForWorkerForTextFields gridFields = new GridBagConstraintsForPanelForWorkerForTextFields();//Создаем объект gridFields класса GridBagConstraintsForPanelForWorkerForTextFields
	GridBagConstraintsForPanelForWorkerForTextAreas gridAreas = new GridBagConstraintsForPanelForWorkerForTextAreas();//Создаем объект gridAreas класса GridBagConstraintsForPanelForWorkerForTextAreas
	GridBagConstraintsForPanelForWorkerForButton gridButtonCalculation = new GridBagConstraintsForPanelForWorkerForButton();//Создаем объект gridButtonCalculation класса GridBagConstraintsForPanelForWorkerForButton
	GridBagConstraintsForPanelForWorkerForButton gridButtonExit = new GridBagConstraintsForPanelForWorkerForButton();//Создаем объект gridButtonExit класса GridBagConstraintsForPanelForWorkerForButton
	gridButtonExit.gridx = 1;//задаем номер столбца для gridButtonExit
	
	JLabel labelForPanelForWorker = new JLabel("Работник");//Создаем объект label класса JLabel
	gridBagLayout.setConstraints(labelForPanelForWorker,gridLabel);//Добавление к менеджеру компановки параметров расположения для label
	panelForWorker.add(labelForPanelForWorker);//добавление на panelForWorker labelForPanelForWorker
	
	JPanel panelForTextFields = new JPanel();//Создаем объект label класса JLabel
	panelForTextFields.setLayout(new GridLayout(3,3,10,10));//Добавление к менеджера компановки к panelForTextFields
	
	JLabel labelForBlackAndWhitePrinting = new JLabel("Объем черно-белой печати");//Создаем объект label класса JLabel
	panelForTextFields.add(labelForBlackAndWhitePrinting);//добавление на panelForTextFields labelForBlackAndWhitePrinting
	final JTextField textFieldForBlackAndWhitePrinting = new JTextField();//Создаем объект textFieldForBlackAndWhitePrinting класса JTextField
	panelForTextFields.add(textFieldForBlackAndWhitePrinting);//добавление на panelForTextFields textFieldForBlackAndWhitePrinting
	JLabel labelForLetter1 = new JLabel("страниц");//Создаем объект labelForLetter1 класса JLabel
	panelForTextFields.add(labelForLetter1);//добавление на panelForTextFields labelForLetter1
	
	JLabel labelForColorPrinting = new JLabel("Объем цветной печати");//Создаем объект label класса JLabel
	panelForTextFields.add(labelForColorPrinting);//добавление на panelForTextFields labelForColorPrinting
	final JTextField textFieldForColorPrinting = new JTextField();//Создаем объект textFieldForColorPrinting класса JTextField
	panelForTextFields.add(textFieldForColorPrinting);//добавление на panelForTextFields textFieldForColorPrinting
	JLabel labelForLetter2 = new JLabel("страниц");//Создаем объект labelForLetter2 класса JLabel
	panelForTextFields.add(labelForLetter2);//добавление на panelForTextFields labelForLetter2
	
	JLabel labelForModel = new JLabel("Модель Принтера");//Создаем объект labelForModel класса JLabel
	panelForTextFields.add(labelForModel);//добавление на panelForTextFields labelForModel
	final JComboBox comboBoxForModel = new JComboBox();//Создаем объект comboBoxForModel класса JComboBox
	comboBoxForModel.setEditable(true);
	comboBoxForModel.addItem("HP LaserJet Pro M104a");//добавление на comboBoxForModel
	comboBoxForModel.addItem("Xerox Phaser 3020BI");//добавление на comboBoxForModel
	comboBoxForModel.addItem("Canon i-SENSYS LBP7010C");//добавление на comboBoxForModel
	panelForTextFields.add(comboBoxForModel);//добавление на panelForTextFields comboBoxForModel
	
	gridBagLayout.setConstraints(panelForTextFields,gridFields);//Добавление к менеджеру компановки параметров расположения для panelForTextFields
	panelForWorker.add(panelForTextFields);//добавление на panelForWorker panelForTextFields
	
	JPanel panelForTextAreas = new JPanel();//Создаем объект panelForTextAreas класса JPanel
	panelForTextAreas.setLayout(new GridLayout(3,3,10,10));
	JLabel labelForPaper = new JLabel("Расход Бумаги");//Создаем объект labelForPaper класса JLabel
	panelForTextAreas.add(labelForPaper);//добавление на panelForTextAreas labelForPaper
	final JTextArea textAreaForPaper = new JTextArea();
	panelForTextAreas.add(textAreaForPaper);//добавление на panelForTextAreas textAreaForPaper
	JLabel label1 = new JLabel("Упаковок");//Создаем объект label1 класса JLabel
	panelForTextAreas.add(label1);//добавление на panelForTextAreas label1
	
	JLabel labelForCartridge = new JLabel("Расход картриджей");//Создаем объект labelForCartridge класса JLabel
	panelForTextAreas.add(labelForCartridge);//добавление на panelForTextAreas labelForCartridge
	final JTextArea textAreaForCartridge = new JTextArea();//Создаем объект textAreaForCartridge класса JTextArea
	panelForTextAreas.add(textAreaForCartridge);//добавление на panelForTextAreas textAreaForCartridge
	JLabel label2 = new JLabel("Штук");//Создаем объект label2 класса JLabel
	panelForTextAreas.add(label2);//добавление на panelForTextAreas label2
	
	
	JLabel labelForLoad = new JLabel("Нагрузка на принтер");//Создаем объект labelForLoad класса JLabel
	panelForTextAreas.add(labelForLoad);//добавление на panelForTextAreas labelForLoad
	final JTextArea textAreaForLoad = new JTextArea();//Создаем объект textAreaForLoad класса JTextArea
	panelForTextAreas.add(textAreaForLoad);//добавление на panelForTextAreas textAreaForLoad
	JLabel label4 = new JLabel("%");//Создаем объект label4 класса JLabel
	panelForTextAreas.add(label4);//добавление на panelForTextAreas label4
	gridBagLayout.setConstraints(panelForTextAreas,gridAreas);//Добавление к менеджеру компановки параметров расположения для panelForTextAreas
	panelForWorker.add(panelForTextAreas);//добавление на panelForTextAreas panelForTextAreas
	
	final JButton buttonCalculation = new JButton("Расчет");//Создаем объект buttonCalculation класса JButton
	buttonCalculation.addActionListener(new AbstractAction() {//Добавляем слушатель к кнопке
	public void actionPerformed(ActionEvent e) {//Создаем метод для слушателя
	try {
	textAreaForPaper.setText(String.format("%.1f",calculationsPaper(Double.parseDouble(textFieldForBlackAndWhitePrinting.getText()),Double.parseDouble(textFieldForColorPrinting.getText()))));//Вывод на textAreaForPaper в формате с 1 цифрой после запятой возвращаемое значение метода calculationsPaper с входными парамметрами textFieldForBlackAndWhitePrinting и textFieldForColorPrinting
	textAreaForCartridge.setText(String.format("%.1f",calculationsCartridge(Double.parseDouble(textFieldForBlackAndWhitePrinting.getText()),Double.parseDouble(textFieldForColorPrinting.getText()))));//Вывод на textAreaForCartridge в формате с 1 цифрой после запятой возвращаемое значение метода calculationsCartridge с входными парамметрами textFieldForBlackAndWhitePrinting и textFieldForColorPrinting
	textAreaForLoad.setText(String.format("%.1f",calculationsLoad(Double.parseDouble(textFieldForBlackAndWhitePrinting.getText()),Double.parseDouble(textFieldForColorPrinting.getText()),String.valueOf(comboBoxForModel.getSelectedItem()))));//Вывод на textAreaForLoad в формате с 1 цифрой после запятой возвращаемое значение метода calculationsLoad с входными парамметрами textFieldForBlackAndWhitePrinting, textFieldForColorPrinting и comboBoxForModel
	}catch (NumberFormatException e1){
	JOptionPane.showMessageDialog(null,"Вы ввели не цифры");
	}
	
	}
	});
	gridBagLayout.setConstraints(buttonCalculation,gridButtonCalculation);//Добавление к менеджеру компановки параметров расположения для buttonCalculation
	panelForWorker.add(buttonCalculation);//добавление на panelForWorker labelForPanelForWorker
	
	JButton buttonExit = new JButton("Выход");//Создаем объект buttonExit класса JButton
	buttonExit.addActionListener(new AbstractAction() {//Добавляем слушатель к кнопке
	public void actionPerformed(ActionEvent e) {//Создаем метод для слушателя
	dispose();//закрываем фрейм
	}
	});
	gridBagLayout.setConstraints(buttonExit,gridButtonExit);//Добавление к менеджеру компановки параметров расположения для buttonExit
	panelForWorker.add(buttonExit);//добавление на panelForWorker labelForPanelForWorker
	
	setVisible(true);//Метод делающий выдимым обьект класса
	}
	public double calculationsPaper(double BLACKANDWHITE,double COLOR){//Создание метода calculationsPaper с входными значениями BLACKANDWHITE, COLOR
	return BLACKANDWHITE / 500 + COLOR / 500;//Вывод результата
	}
	public double calculationsCartridge(double BLACKANDWHITE,double COLOR){//Создание метода calculationsCartridge с входными значениями BLACKANDWHITE, COLOR
	return (BLACKANDWHITE+COLOR)/1500;//Вывод результата
	}
	public double calculationsLoad(double BLACKANDWHITE,double COLOR,String MODEL){//Создание метода calculationsLoad с входными значениями BLACKANDWHITE, COLOR и MODEL
	if (MODEL=="HP LaserJet Pro M104a"){//Сравнение MODEL со строчкой HP LaserJet Pro M104a
	return (BLACKANDWHITE + COLOR)/20000*100;//Вывод результата
	}else {
	if (MODEL=="Xerox Phaser 3020BI"){//Сравнение MODEL со строчкой Xerox Phaser 3020BI
	return (BLACKANDWHITE+COLOR)/25000*100;//Вывод результата
	}else {
	if (MODEL=="Canon i-SENSYS LBP7010C"){//Сравнение MODEL со строчкой Canon i-SENSYS LBP7010C
	return (BLACKANDWHITE+COLOR)/30000*100;//Вывод результата
	}else {
	return 0;//Вывод 0 если не совпадает не с одной строчкой
	}
	}
	}
	
	
	}
	}
