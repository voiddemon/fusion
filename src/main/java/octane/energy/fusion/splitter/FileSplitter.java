package octane.energy.fusion.splitter;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
@Component
public class FileSplitter {

    @Value("${report.base.dir}")
    private String baseDirPath;

    private String inputDir = "input";
    private String outputDir = "output";
    private String processDir = "processing";
    private String archiveDir = "archived";
    private String errorDir = "error";

    @Scheduled(cron = "0 */2 * * * *")
    public void processor() throws IOException {
        for (String fileSourcePathStr : getFiles()) {
            processFile(fileSourcePathStr);
        }
    }

    private void processFile(String fileSourcePathStr) throws IOException {
        Path sourcePath = Paths.get(fileSourcePathStr);
        String fileName = sourcepath.getFileName().toString();
        boolean isSuccess = false;

//        log.info("File {} splitting process is started", fileName);


        Path processingFilePath = moveFile(inputDir, processDir, fileName);

        BufferedWriter writer = createBufferedFileWriter(fileName);
        try (BufferedReader reader = new BufferedReader(new FileReader(processingFilePath.toFile()))) {
            String readLine = "";
            while ((readLine = reader.readLine()) != null) {
                if (readLine)
            }
        }

        private void

        private void deleteIncompleteOutputFile (String fileToDelete){
            Path filePath = Paths.get(baseDirPath, outputDir, fileToDelete);
            try {
                Files.deleteIfExists(filePath);
            } catch (Exception e) {
//                log.error("sdkhgkfhsgdfhg", fileToDelete)
            }
        }

    }

}
