	package start;
	
	import Grid.GridBagConstraintsForAdmin;//Импортируем класс GridBagConstraintsForAdmin из пакета Grid
	import Grid.GridBagConstraintsForExit;//Импортируем класс GridBagConstraintsForExit из пакета Grid
	import Grid.GridBagConstraintsForLabel;//Импортируем класс GridBagConstraintsForLabel из пакета Grid
	import Grid.GridBagConstraintsForWorker;//Импортируем класс GridBagConstraintsForWorker из пакета Grid
	
  import javax.swing.*;//Импортирование библиотек для создания графического интерфейса
  import java.awt.*;//Импортирование библиотек для графического интерфейса
	import java.awt.event.ActionEvent;//Импортирование библиотеки для обработки события
	
	public class FrameUserSelection extends JFrame {//Создание класса FrameUserSelection который наследуется от JFrame
	FrameUserSelection(){//Начало описания свойств
	setDefaultCloseOperation(EXIT_ON_CLOSE);//Метод для определения события при закрытии окна(завершение программы)
	setSize(400,200);//Метод для определения размера окна
	setLocationRelativeTo(null);//Указание места расположения окна(центр)
	
	JPanel panel = new JPanel();//Создаем объект panel класса JPanel
	setContentPane(panel);//Добавляем panel
	
	GridBagLayout gridBagLayout = new GridBagLayout();//Создаем объект gridBagLayout класса GridBagLayout
	panel.setLayout(gridBagLayout);//Добавляем менеджер компановки на panel
	
	
	JLabel label = new JLabel("Выберите пользователя");//Создаем объект label класса JLabel
	label.setHorizontalAlignment(JLabel.CENTER);
	GridBagConstraintsForLabel gridBagConstraintsForLabel = new GridBagConstraintsForLabel();//Создаем объект gridBagConstraintsForLabel класса GridBagConstraintsForLabel
	gridBagLayout.setConstraints(label,gridBagConstraintsForLabel);//Добавление к менеджеру компановки параметров расположения для label
	panel.add(label);//добавление на panel label
	
	JButton buttonForWorker = new JButton(" Работник ");//Создаем объект buttonForWorker класса JButton
	buttonForWorker.addActionListener(new AbstractAction() {//Добавляем слушатель к кнопке
	
	public void actionPerformed(ActionEvent e) {//Создаем метод для слушателя
	FrameForWorker frameForWorker = new FrameForWorker();//Создаем объект frameForWorker класса FrameForWorker
	}
	});
	GridBagConstraintsForWorker gridBagConstraintsForWorker = new GridBagConstraintsForWorker();//Создаем объект gridBagConstraintsForWorker класса GridBagConstraintsForWorker
	gridBagLayout.setConstraints(buttonForWorker,gridBagConstraintsForWorker);//Добавление к менеджеру компановки параметров расположения для buttonForWorker
	panel.add(buttonForWorker);//добавление на panel buttonForWorker
	
	JButton buttonForAdmin = new JButton("Администратор");//Создаем объект buttonForAdmin класса JButton
	buttonForAdmin.addActionListener(new AbstractAction() {//Добавляем слушатель к кнопке
	
	public void actionPerformed(ActionEvent e) {//Создаем метод для слушателя
	FrameForAdminPassword frameForAdmin = new FrameForAdminPassword();//Создаем объект frameForAdmin класса FrameForAdminPassword
	}
	});
	GridBagConstraintsForAdmin gridBagConstraintsForAdmin = new GridBagConstraintsForAdmin();//Создаем объект gridBagConstraintsForAdmin класса GridBagConstraintsForAdmin
	gridBagLayout.setConstraints(buttonForAdmin,gridBagConstraintsForAdmin);//Добавление к менеджеру компановки параметров расположения для buttonForAdmin
	panel.add(buttonForAdmin);//добавление на panel buttonForAdmin
	
	JButton buttonForExit = new JButton("Выход");//Создаем объект buttonForExit класса JButton
	GridBagConstraintsForExit gridBagConstraintsForExit = new GridBagConstraintsForExit();//Создаем объект gridBagConstraintsForExit класса GridBagConstraintsForExit
	gridBagLayout.setConstraints(buttonForExit,gridBagConstraintsForExit);//Добавление к менеджеру компановки параметров расположения для buttonForExit
	buttonForExit.addActionListener(new AbstractAction() {//Добавляем слушатель к кнопке
	
	public void actionPerformed(ActionEvent e) {//Создаем метод для слушателя
	System.exit(0);//Метод выхода из программы
	}
	});
	panel.add(buttonForExit);//добавление на panel buttonForExit
	
	
	setVisible(true);//Метод делающий выдимым обьект класса
	}
	}
