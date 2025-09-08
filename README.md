# Dr1nkWater

This is a clock-like software made to remind people (myself the most) about drinking water. It is not made to be a huge, complex, megasmart software; it is just meant to work and remind me (and possibly you :) to drink water).

## Motivation

Two weeks ago, I had no ions in my body at all and suffered from dehydration. I had to drink water like a camel in the desert, and I saw the need to drink water as more important than ever. If you disagree, that's fine—just check out this link from the [Mayo Clinic](https://www.mayoclinic.org/healthy-lifestyle/nutrition-and-healthy-eating/in-depth/water/art-20044256). So, for fun, I decided to make this reminder application.

> [!NOTE]
> This is for Unix-based systems. A Windows version is coming soon.
> You must have Gradle installed on your system to run this.
> Once you are in dehydration time you cannot exit the app until it's done so good luck and stay dehydrated haha

## Getting Started

Prerequisites
Java Development Kit (JDK) 11 or higher

Gradle (The project includes the Gradle Wrapper, so a manual installation is not strictly required)

## Installation

First, clone this repository to your local machine:

```sh
git clone https://github.com/INNOCENT-ops806/Dr1nkWater.git
```

## Usage

This project uses a bash script to run the application in the background. Before using it, you need to make a small change to the script to reflect your project's location.

Edit the script path: Open `asset/water_reminder.sh` and change the cd command to point to the correct path on your system.

Make the script executable:

```sh
chmod +x asset/water_reminder.sh
```

Run manually: To test the script, you can run it directly:

```sh
./asset/water_reminder.sh
```

## Automation

For continuous use, you can add a line to your ~/.bashrc file to ensure the reminder runs automatically every time you open a new terminal session.

Open your `~/.bashrc` file in your preferred editor. For example, using nano:

```sh
nano ~/.bashrc
```

Add the following line to the end of the file. Be sure to replace `/home/your_username/` with the correct path to your project.

# Start the water reminder script in the background

`/home/your_username/Project/GitProject/Dr1nkWater/asset/water_reminder.sh &`

Note: Using $HOME is a good practice as it makes the script portable to different users on the same system.

Reload your ~/.bashrc file to apply the changes without restarting your terminal:

```sh
source ~/.bashrc
```

## Support

Wanna buy me water? If this project helped you, you can show your support here: [Buy me water](https://paypal.me/1NN0C3NT126)

## Contribution

If you want to help me create a version for Windows, you are very much open to do so. Cheers!
