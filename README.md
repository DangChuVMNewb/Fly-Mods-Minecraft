# Fly Mod for Minecraft

[![Build Status](https://github.com/DangChuVMNewb/Fly-Mods-Minecraft/actions/workflows/main.yml/badge.svg)](https://github.com/DangChuVMNewb/Fly-Mods-Minecraft/actions/workflows/main.yml)
[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

A simple Fabric mod that allows players to toggle flight mode on and off with a simple command.

## Features

*   **Toggle Flight:** Use the `/fly` command to enable or disable your ability to fly.
*   **Cross-Gamemode Support:** Works seamlessly for players in Survival or Adventure mode.
*   **On-Screen Notifications:** Displays a clear status message on your action bar to indicate whether flight is enabled or disabled.
*   **Multi-Language Support:** The mod is translated into multiple languages.

## Requirements

*   **Minecraft:** `~1.21.8`
*   **Mod Loader:** [Fabric Loader](https://fabricmc.net/use/)
*   **API:** [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api)
*   **Java:** `Java 21` or newer

## Installation

1.  Ensure you have [Fabric Loader](https://fabricmc.net/use/) and [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api) installed.
2.  Download the latest release from the [Releases page](https://github.com/DangChuVMNewb/Fly-Mods-Minecraft/releases) or the [Actions workflow](https://nightly.link/DangChuVMNewb/Fly-Mods-Minecraft/workflows/build/main).
3.  Place the downloaded `.jar` file into your `.minecraft/mods` folder.
4.  Launch the game using the Fabric profile.

## Usage

Simply type the following command in the chat to toggle flight mode:

```
/fly
```

An on-screen message will confirm whether flight has been enabled or disabled.

## Future Goals

We are actively working on improving Fly Mod. Here are some of the features we plan to implement in the near future:

*   **Configurable Keybinding:** We want to add a customizable hotkey so you can toggle flight without needing to type the command.
*   **Flight Speed Control:** An upcoming feature will be a command (e.g., `/flyspeed <speed>`) to allow players to adjust their flight speed, from a gentle float to a rapid soar.
*   **Server Configuration & Permissions:** For server administrators, we plan to add a server-side configuration file. This will allow them to disable the mod in specific dimensions or control which players can use the fly command, possibly through integration with common permission mods.

## Permissions

Currently, the `/fly` command is available to all players on the server by default. Future updates will include options for server owners to restrict its usage.

## FAQ (Frequently Asked Questions)

*   **Q: Will using this mod get me banned on a server?**
    *   **A:** On public servers that do not explicitly allow it, yes, this is considered cheating and will likely get you banned. This mod is intended for use in single-player worlds or on private servers where you have permission from the administrator.

*   **Q: Does this mod work with Forge?**
    *   **A:** No, this is a Fabric mod and requires the Fabric mod loader.

*   **Q: Can I adjust my flight speed?**
    *   **A:** Not at the moment, but this is a high-priority feature that we plan to add soon.

## Supported Languages

The mod includes translations for the following languages:

- Arabic (ar_sa)
- German (de_de)
- English (en_us)
- Spanish (es_es)
- French (fr_fr)
- Hindi (hi_in)
- Italian (it_it)
- Japanese (ja_jp)
- Korean (ko_kr)
- Malay (ms_my)
- Portuguese (pt_br)
- Russian (ru_ru)
- Thai (th_th)
- Turkish (tr_tr)
- Vietnamese (vi_vn)
- Chinese (zh_cn)

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
    *(On Windows, use `gradlew.bat build`)*

3.  The built `.jar` file will be located in the `build/libs/` directory.

## Contributing

This is a free and open-source project. Contributions of any kind are welcome! Feel free to open an issue or submit a pull request.

## License

This project is licensed under the **Apache License 2.0**. See the [LICENSE.txt](LICENSE.txt) file for details.
