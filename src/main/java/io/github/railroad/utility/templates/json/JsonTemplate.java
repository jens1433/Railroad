package io.github.railroad.utility.templates.json;

import java.io.File;

import org.jetbrains.annotations.NotNull;

import io.github.railroad.project.Project;
import io.github.railroad.project.lang.LangProvider;
import javafx.stage.Stage;

/**
 * Class used for creating JsonTemplates for the json generator
 * @author matyrobbrt
 *
 */
public abstract class JsonTemplate {
	
	public final Project project;
	public final String fileName;

	protected JsonTemplate(@NotNull Project project, String fileName) {
		this.project = project;
		this.fileName = fileName;
	}

	protected final Stage stage = new Stage();

	public abstract void openWindow();
	
	public void writeDirectory(File dir) {
		if (!dir.exists())
			dir.mkdirs();
	}
	
	public String fromLang(String key) {
		return LangProvider.fromLang("jsonGenerator." + key);
	}
	
	protected void clearCache() {

	}
}
