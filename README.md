# Fly Mod

A simple Minecraft mod for Fabric that allows players to toggle flight mode on and off with a simple command.

## Project Goals

### Completed
- [x] Create a `/fly` command to toggle flight for players.
- [x] Support for Survival and Adventure modes.
- [x] On-screen status notifications.

### Future Goals
- [ ] Add a configurable keybinding to toggle flight.
- [ ] Implement a command to adjust flight speed.
- [ ] Add a configuration file for server-side settings (e.g., disabling the mod in certain dimensions).

## Features

*   Adds the `/fly` command to enable or disable the ability to fly.
*   Works for players in Survival or Adventure mode.
*   Displays a flight status message directly on the screen.

## Requirements

*   **Minecraft:** `~1.21.8`
*   **Mod Loader:** Fabric Loader
*   **API:** Fabric API
*   **Java:** `Java 21` or newer

## Installation

1.  Ensure you have Fabric Loader and Fabric API installed.
2.  Download the latest build artifact from the [Actions workflow](https://nightly.link/DangChuVMNewb/Fly-Mods-Minecraft/workflows/main/main).
3.  Place the downloaded `.jar` file into your `mods` folder (`.minecraft/mods`).
4.  Launch the game using the Fabric profile.

## Usage

Simply type the following command in the chat to toggle fly mode:

```
/fly
```

## Building from Source

1.  Clone this repository:
    ```sh
    git clone https://github.com/DangChuVMNewb/Fly-Mods-Minecraft.git
    cd Fly-Mods-Minecraft
    ```
2.  Run the Gradle build command:
    ```sh
    ./gradlew build
    ```
    (On Windows, use `gradlew.bat build`)

3.  The built `.jar` file will be located in the `build/libs/` directory.

## License

This project is licensed under the [CC0-1.0 Universal](https://creativecommons.org/publicdomain/zero/1.0/) license.
