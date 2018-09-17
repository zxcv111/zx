	package Grid;//Пакет Grid
	
	import java.awt.*;//Импортирование библиотек для графического интерфейса
	
	public class GridBagConstraintsForAdmin extends GridBagConstraints {//Создание класса GridBagConstraintsForAdmin который наследуется от GridBagConstraints
	public GridBagConstraintsForAdmin(){//Начало описания свойств
	anchor = GridBagConstraints.CENTER;//Выравнивание компонента
	fill = GridBagConstraints.NONE;//Стратегия распределения компонента по свободному пространству
	gridheight = 1;//Количество строк для объекта
	gridwidth = 1;//Количество столбцов для объекта
	gridx = 2;//Номер столбца
	gridy = 1;//Номер строки
	insets = new Insets(0, 60, 0, 0);//Отступы
	ipadx = 0;//Увелечение размеров компонента по горизонтале
	ipady = 0;//Увелечение размеров компонента по вертикале
	weightx = 0.0;//Стратегия изменения размеров компонента по строке
	weighty = 0.0;//Стратегия изменения размеров компонента по столбцу
	}
	}
