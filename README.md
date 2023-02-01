# higher-lower-lol-champ-api
The backend api code for the HigherLower LoL Champ edition project

## Architecture Diagram
![arch_diagram](https://github.com/DigitalWatergun/higher-lower-lol-champ-api/blob/main/diagram/HigherLowerLolChamp_Architecture_Diagram.png)

The backend api was created using Java and Springboot. This is a very simple backend which will talk to the Postgres database to retrieve all the champion names and matches played information. It will then serve it to the frontend as a list of dictionaries, where the frontend can randomly select a champion and display its info. 
