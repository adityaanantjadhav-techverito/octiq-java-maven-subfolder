# octiq-java-maven-subfolder

> Synthetic fixture for testing Octiq's GitHub import of Java projects. Not a real application.

## Scenario

A polyglot-looking repository whose root has no build file. The only Maven project lives one level down in `backend/`, next to a non-Java `docs/` folder. The import should find it and build from there.

## What this exercises

- Project-root discovery via immediate subdirectories (exactly one marker)
- The build changing into the subfolder before running Maven
- Ignoring non-Java siblings such as `docs/`

## Expected result on import

| Field | Expected |
| --- | --- |
| stack | `java` |
| build tool | `maven` |
| Java version | `17` |
| image | `maven:3.9-eclipse-temurin-17` |
| framework | `java` |
| project root | `backend` |
| final phase | `ready` |
| build green | `true` |
| failure code | n/a |

Do not add another directory containing a build file; that would turn this into the ambiguous-roots case.

## Layout

```
.
├── .gitignore
├── docs/overview.md
└── backend/
    ├── pom.xml
    └── src/main/java/com/octiq/fixture/Service.java
```
