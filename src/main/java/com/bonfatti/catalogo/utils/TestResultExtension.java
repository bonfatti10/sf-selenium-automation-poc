package com.bonfatti.catalogo.utils;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;

public class TestResultExtension implements TestWatcher {
    private static WebDriver driver;

    // Método para definir o WebDriver
    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    // Método para retornar o WebDriver
    public static WebDriver getDriver() {
        return driver;
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        System.out.println("Test failed: " + context.getDisplayName());
        captureScreenshot("Screenshot_on_failure");
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        System.out.println("Test successful: " + context.getDisplayName());
        captureScreenshot("Screenshot_on_success");
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        System.out.println("Test aborted: " + context.getDisplayName());
    }

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        System.out.println("Test disabled: " + context.getDisplayName() + " Reason: " + reason.orElse("No reason provided"));
    }
    public static void takeScreenshot(String name) {
        captureScreenshot(name);
    }

    // Método para capturar e salvar o screenshot
   public static void captureScreenshot(String name) {
        if (driver != null) {
            try {
                // Captura o screenshot como array de bytes
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

                // Cria o diretório 'screenshots' se não existir
                File dir = new File("screenshots");
                if (!dir.exists()) {
                    dir.mkdirs();
                }

                // Gera o nome do arquivo com timestamp
                String timestamp = String.valueOf(System.currentTimeMillis());
                File file = new File("screenshots/" + name + "_" + timestamp + ".png");

                // Salva o screenshot no diretório
                try (FileOutputStream fos = new FileOutputStream(file)) {
                    fos.write(screenshot);
                    System.out.println("Screenshot saved as: " + file.getAbsolutePath());
                }

                // Anexa o screenshot ao relatório do Allure
                Allure.addAttachment(name, "image/png", new ByteArrayInputStream(screenshot), "png");

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("WebDriver is not initialized, screenshot not taken.");
        }
    }
}
