## Plugin architecture
According to [Cheriton School of Computer Science](https://cs.uwaterloo.ca/~m2nagapp/courses/CS446/1195/Arch_Design_Activity/PlugIn.pdf):
- The Plugin architecture pattern consists of two types of architecture components: a core
system and plug-in modules. Application logic is divided between independent plug-in
modules and the basic core system, providing extensibility, flexibility, and isolation of
application features and custom processing logic

- Vocabulary for components and connectors:
  - Core : The core is the main application, while plugins contain additional features that
  are added to the main application. Each plugin normally contains one new
  functionality. The core keeps track of attached plugins through a plugin registry,
  which includes information like the plug-in name and the protocol for accessing it.
  - Plugin : Plugins can be added or removed from the core anytime. One plugin’s
  addition or removal from the core does not affect the other plugins. Plugins are
  beneficial, providing extensibility, flexibility, and isolation of application features and
  custom processing logic.

## How to Run
**Build Source Code**
```shell
mvn clean install
```

**Run Main application**
```shell
java -jar java-plugin-main-app/target/java-plugin-main-app-1.0-SNAPSHOT.jar
```