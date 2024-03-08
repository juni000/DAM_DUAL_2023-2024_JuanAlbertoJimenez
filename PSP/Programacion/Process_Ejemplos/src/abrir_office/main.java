package abrir_office;

import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		ProcessBuilder word = new ProcessBuilder("C:\\Program Files\\Microsoft Office\\root\\Office16\\WINWORD.EXE");
		ProcessBuilder exel = new ProcessBuilder("C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE");
		ProcessBuilder power = new ProcessBuilder("C:\\Program Files\\Microsoft Office\\root\\Office16\\POWERPNT.EXE");
		word.start();
		exel.start();
		power.start();
	}

}
