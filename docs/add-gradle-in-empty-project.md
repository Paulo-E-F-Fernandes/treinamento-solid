# Adicionar o gradle em um projeto não configurado

Para esse projeto, realizei a criação no repositório remoto e após isso foi realizado o _clone_ do mesmo para o ambiente
local.

Como para esse projeto, eu estava escrevendo apenas a documentação, percebi apenas quando fui tentar criar as classes de
código-fonte _Java_, que não havia sido realizado a configuração do projeto para ser _Java_ com _Gradle_ ou _Maven_.

Dessa forma, precisei configurar o projeto para ser _Java_ utilizando _Gradle_. Caso eu tivesse o _Gradle_ instalado na
máquina, poderia apenas executar o comando `gradle init` na raiz do projeto, mas como esse não era a situação, o _Gradle_
não está instalado na máquina, precisei realizar a configuração do projeto com o _Gradle Wrapper_. Para isso, utilizei os
passos descritos abaixo:

- Copiar a pasta `gradle/` e os arquivos `gradlew`, `gradlew.bat` de algum projeto existente para a raiz do novo projeto.
- Abrir um terminal na raiz do novo projeto.
- Executar o comando `./gradlew init` para utilizar o _wrapper_ que foi copiado para iniciar o projeto _Java_ no projeto
desejado.
  - Ao executar esse comando, será realizada perguntas sobre a configuração do projeto:
	```shell
	$ ./gradlew init

	Welcome to Gradle 8.10!

	Here are the highlights of this release:
	- Support for Java 23
	- Faster configuration cache
	- Better configuration cache reports
	
	For more details see https://docs.gradle.org/8.10/release-notes.html
	
	Starting a Gradle Daemon, 1 incompatible Daemon could not be reused, use --status for details
	
	Found existing files in the project directory: 'E:\desenv\training\treinamento-solid'.
	Directory will be modified and existing files may be overwritten.  Continue? (default: no) [yes, no] yes
	
	Select type of build to generate:
		1: Application
		2: Library
		3: Gradle plugin
		4: Basic (build structure only)
	Enter selection (default: Application) [1..4] 1

	Select implementation language:
		1: Java
		2: Kotlin
		3: Groovy
		4: Scala
		5: C++
		6: Swift
	Enter selection (default: Java) [1..6] 1

	Enter target Java version (min: 7, default: 21): 11
	
	Project name (default: treinamento-solid):
	
	Select application structure:
		1: Single application project
		2: Application and library project
	Enter selection (default: Single application project) [1..2] 1

	Select build script DSL:
		1: Kotlin
		2: Groovy
	Enter selection (default: Kotlin) [1..2] 2
	
	Select test framework:
		1: JUnit 4
		2: TestNG
		3: Spock
		4: JUnit Jupiter
	Enter selection (default: JUnit Jupiter) [1..4] 4
	
	Generate build using new APIs and behavior (some features may change in the next minor release)? (default: no) [yes, no] no


	> Task :init
	Learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.10/samples/sample_building_java_applications.html
	
	Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.
	
	You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.
	
	For more on this, please refer to https://docs.gradle.org/8.10/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.
	
	BUILD SUCCESSFUL in 5m 5s
	1 actionable task: 1 executed

	````
