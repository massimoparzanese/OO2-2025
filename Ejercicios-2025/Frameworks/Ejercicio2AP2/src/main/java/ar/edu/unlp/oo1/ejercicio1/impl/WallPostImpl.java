package ar.edu.unlp.oo1.ejercicio1.impl;
import java.io.IOException;
import java.util.logging.*;
/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	private String text;
	private int likes;
	private boolean isFeatured;
	private static final Logger logger = Logger.getLogger(WallPostImpl.class.getName());
	static {
        try {
            // Crear el FileHandler (true para modo append)
            FileHandler fileHandler = new FileHandler("modelo.txt", true);

            // Opcional: usar un formato más legible
            fileHandler.setFormatter(new SimpleFormatter());

            // Agregar el handler al logger
            logger.addHandler(fileHandler);

        } catch (IOException e) {
            System.err.println("No se pudo configurar el logger: " + e.getMessage());
        }
    }

	public WallPostImpl() {
		this.text = "Undefined post";

	}

	public WallPostImpl(String text, int likes, boolean isFeaured) {
		this.text = text;
		this.likes = likes;
		this.isFeatured = isFeaured;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;

	}

	@Override
	public int getLikes() {
		return likes;
	}

	@Override
	public void like() {
		this.likes = this.likes + 1;
		if(this.likes == 10)
			logger.warning("Se llego a 10 likes");
	}

	@Override
	public void dislike() {
		if (likes > 0) {
			this.likes = this.likes - 1;
			if(this.likes == 0)
				logger.warning("Se llego a 0 likes");
		}

	}

	@Override
	public boolean isFeatured() {
		return this.isFeatured;
	}

	@Override
	public void toggleFeatured() {
		this.isFeatured = !this.isFeatured;

	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de
	 * forma adecuada
	 */

	@Override
	public String toString() {
		return "WallPost {" + "text: " + getText() + ", likes: '" + getLikes() + "'" + ", featured: '" + isFeatured()
				+ "'" + "}";
	}

}
