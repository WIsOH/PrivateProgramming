/**
 * Horse.c
 * Program to handle horses for horse races
 **/

#include <stdio.h>
#include <stdlib.h>

#define NUMBER_OF_HORSE_NAMES 15

struct Horse *create_horse(char *name, int raceNumber, int odds);

struct Horse {
    char *name;
    int raceNumber;
    int odds;
}; //Horse to be raced around track

struct RaceHorse {
    struct Horse *horse;
    struct RaceHorse *next;
}; //Linked list attempt, Jesus take the wheel. 

char horseNames[NUMBER_OF_HORSE_NAMES][50] = {"Mirage", "In Front",
    "Horlicks", "Go Tebow Go", "Sotally Tober", "Comply or Die",
    "Flat Fleet Feet", "Hoof Hearted", "Notacatbutallama",
    "Nosoupforyou", "Flyer", "Mucho Macho Man", "Dust Bunny",
    "Geoff", "Quantum Leap"};

struct Horse *create_horse(char *name, int raceNumber, int odds) {
   struct Horse *horsey = (struct Horse*)malloc(sizeof(struct Horse));
   horsey->name = name;
   horsey->raceNumber = raceNumber;
   horsey->odds = odds;
   return horsey;
};

struct Horse *gen_horse() {
    char *nameToUse;
    int raceNumber;
    int odds = 50;
    int i;

    do {
	i = rand() % NUMBER_OF_HORSE_NAMES;
	if(horseNames[i][0] != 'x')
	nameToUse = horseNames[i];
    } while(nameToUse[0] == '\0');
    
   raceNumber = rand() % 100;
	    
   struct Horse *genHorse = create_horse(nameToUse, raceNumber, odds);
   
   return genHorse;

   nameToUse[0] = 'x'; //Makes name nonreusable
};

struct RaceHorse *create_race_horse(struct Horse *horse,
	struct RaceHorse *raceHorse) {
    struct RaceHorse *racey =(struct RaceHorse*)malloc(sizeof
	    (struct RaceHorse));

    racey->horse = horse;
    racey->next = raceHorse;

    return racey;
};
