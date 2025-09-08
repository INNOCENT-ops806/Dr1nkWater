#!/bin/bash

# A simple script to launch the water reminder application
# Check if a process named 'java' is already running with a specific pattern.
# This prevents the script from launching multiple times.
if pgrep -f "java -cp .*Dr1nkWater.*" > /dev/null
then
	echo "Water reminder is already running. Exiting."
	exit 1
fi

# Change to the project directory
cd $HOME/Project/GitProject/Dr1nkWater/ # You have to change this to the path in which you cloned the repo

# Set the reminder interval in seconds
REMINDER_INTERVAL=5400 # 1 hour 30 minutes, you can customize this to your liking though

while true
do
	sleep $REMINDER_INTERVAL

    # Use the Gradle Wrapper to run the Java application
    ./gradlew run &

    # The 'disown' command detaches the background process from the terminal.
    disown
done
