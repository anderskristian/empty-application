package springboot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("starting query maven");

        Main m = new Main();
        try {
            m.checkDependencyTree();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    boolean isWindows = System.getProperty("os.name")
            .toLowerCase().startsWith("windows");


    public void checkDependencyTree() {

        ProcessBuilder processBuilder = new ProcessBuilder();

        if (isWindows) {
            processBuilder.command("cmd.exe", "/c", "mvn dependency:tree");
        } else {
            processBuilder.command("bash", "-c", "mvn dependency:tree");
        }

        try {

            Process process = processBuilder.start();

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println("calling maven completed");
                System.out.println(output);
                System.exit(0);
            } else {
                System.exit(exitVal);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
