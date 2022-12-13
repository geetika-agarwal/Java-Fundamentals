package fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesUsingNio {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("filesNio.txt");
//		Path createdFilePath = Files.createFile(path);
//		System.out.println("Created Files at: " + createdFilePath);

		Files.writeString(path, "Writing into the file\n");
		Files.writeString(path, "Writing second line", StandardOpenOption.APPEND);
		List<String> lines = Files.readAllLines(path);
		for (String line : lines) {
			System.out.println(line);
		}
	}
}
