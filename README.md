# Deber2_ContenidoAudiovisual_Verdezoto
Proyecto de programación orientada a objetos (Java) que gestiona distintos tipos de contenido audiovisual.

## Objetivos

- Este proyecto busca ampliar un sistema base de gestión de contenido audiovisual usando conceptos de POO como herencia, asociación, agregación y composición. 
- Incluye nuevas clases, relaciones entre ellas y una clase de prueba funcional. 
- También se práctica la gestión de proyectos con Git y GitHub.

## Estructura del Proyecto

### Clases principales
- `ContenidoAudiovisual`: Clase abstracta base

### Subclases Heredadas
- `Pelicula`: Gestión de películas con actores
- `SerieDeTV`: Gestión de series con temporadas
- `Documental`: Gestión de documentales con investigador
- `Linkedin`: Nueva subclase para contenido educativo de LinkedIn
- `Tiktok`: Nueva subclase para contenido de TikTok

### Clases de Relación
- `Actor`: Relacionada con Pelicula
- `Temporada`: Relacionada con SerieDeTV
- `Investigador`: Relacionada con Documental

## Clases Nuevas Añadidas

**Incorporación de nuevas clases:** `Actor`, `Temporada`, `Investigador` - Clases de relación con las clases existentes

**Expansión del proyecto:** `Linkedin`, `Tiktok` - Nuevas subclases que extienden ContenidoAudiovisual

## Instrucciones de Clonación y Ejecución

### Clonar el Repositorio

```bash
git clone https://github.com/valeriaverdezoto96-dev/Deber2_ContenidoAudiovisual_Verdezoto.git
cd Deber2_ContenidoAudiovisual_Verdezoto
```

### Requisitos
- Java JDK 8 o superior
- Eclipse IDE (recomendado) o cualquier editor de código

### Ejecutar en Eclipse
1. Abre Eclipse IDE
2. Selecciona `File` → `Import` → `General` → `Existing Projects into Workspace`
3. Selecciona la carpeta del proyecto clonado
4. Ejecuta: `src/poo/PruebaAudioVisual.java` → `Run As` → `Java Application`