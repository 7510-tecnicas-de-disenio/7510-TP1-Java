package ar.uba.fi.tdd.rulogic;

import ar.uba.fi.tdd.rulogic.model.Interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) throws IOException {
		System.out.println("Simple logic interpreter (SLI)");
		Interpreter i = new Interpreter(args[0]);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		if (i.dbHasMalformations()) {
			System.out.println("(SLI) Error: Malformed database");
			return;
		} else {
			System.out.print("Database loaded successfully. Enter any query. Exit with 'q'.\n(SLI) ");
		}

		String line = br.readLine();
		while (!line.equals("q")) {
			System.out.println(i.answer(line));

			System.out.print("(SLI) ");
			line = br.readLine();
		}
    }
}
