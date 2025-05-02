# VisiGen

<p align="center">
<img src="logo.png"
width="400">
</p>

  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white) ![JavaFX](https://img.shields.io/badge/javafx-%23FF0000.svg?style=for-the-badge&logo=javafx&logoColor=white) <img src="https://img.shields.io/badge/-HuggingFace-FDEE21?style=for-the-badge&logo=HuggingFace&logoColor=black" /> <img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white" /> <img src="https://img.shields.io/badge/Visual_Studio_Code-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white" /> <img src="https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white" />  


## ❔Overview

VisiGen is an Hugging Face Image Generator JavaFX desktop application that transforms text prompts into almost detail images using a cutting-edge AI model's API hosted on Hugging Face. Designed for developers and AI enthusiasts, this tool seamlessly integrates natural language input with real-time image generation.
Users can enter descriptive text, press a button (or hit Enter), and receive a medium-quality AI-generated image in a few seconds. Powered with JavaFX, Java 21 and JavaFX, ideal for desktop platforms.
NOTE:
This application is in development phase only. More Updates and Features Coming Soon!
Stay tuned.


## 👀 Demo

🎬 [Watch the demo](CuatrosGame.mp4)


### ✨ HuggingFaceImageGenerator Title Screen

<p align="center">
<img src="titlescreen.png"
width="400">
</p>

#### System Requirements

> Both MacOS and Windows supported.


## Code

### 🛠️ Environment Setup

```bash
git clone https://github.com/dave21-py/huggingface-image-generator.git
```

#### Gradle Setup

```bash
gradle init --type java-application --dsl groovy --package app --test-framework junit-jupiter --use-defaults --overwrite 
```
#### Gradle commands

```bash
gradle clean build
```

```bash
gradle run
```

#### JavaFX Setup
##### Add a line to app/build.gradle
```bash
plugins {
    id 'application'
    id 'jacoco'
    id 'org.openjfx.javafxplugin' version '0.1.0'
}
```
#### Add a new block to the bottom of app/build.gradle:
```bash
javafx {
    version = "23.0.1"
    modules = [ 'javafx.controls', 'javafx.fxml', 'javafx.media' ]
}
```

## ✨ Credits

> + David Geddam [github.com](https://github.com/dave21-py)


## 🚀 Citation

If you find our work useful, please consider citing:

```
title={HUGGINGFACEIMAGEGENERATOR},
  author={David Geddam},
  year={2025}
}
```

## 📭 Contact

For any questions, please raise a concern or contact us at
+ David Geddam [linkedin.com](https://www.linkedin.com/in/david-geddam/)
