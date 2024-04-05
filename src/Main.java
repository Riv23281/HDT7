import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BinaryTree<String, String> englishDictionary = new BinaryTree<>();
        BinaryTree<String, String> spanishDictionary = new BinaryTree<>();
        BinaryTree<String, String> frenchDictionary = new BinaryTree<>();

       
        loadDictionary("diccionario.txt", englishDictionary, spanishDictionary, frenchDictionary);

        System.out.println("Diccionario en inglés:");
        englishDictionary.inorderTraversal(englishDictionary.root, "english");
        System.out.println("\nDiccionario en español:");
        spanishDictionary.inorderTraversal(spanishDictionary.root, "spanish");


    }

    public static void loadDictionary(String fileName, BinaryTree<String, String> englishDictionary,
                                      BinaryTree<String, String> spanishDictionary,
                                      BinaryTree<String, String> frenchDictionary) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                Association<String, String> association = new Association<>(parts[0], parts[1]);

                englishDictionary.insert(association);
                spanishDictionary.insert(new Association<>(parts[1], parts[0]));
                frenchDictionary.insert(new Association<>(parts[2], parts[0]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
