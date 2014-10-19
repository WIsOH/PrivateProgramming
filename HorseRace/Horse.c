/**
 * Horse.c
 * Program to handle horses for horse races
 **/

#include <stdio.h>
#include <stdlib.h>

#define NUMBER_OF_HORSE_NAMES 15

struct Horse *create_horse(char *name, int raceNum, int odds);

struct Horse {
    char *name;
    int raceNum;
    int odds;
}; //Horse to be raced around track

char horseNames[NUMBER_OF_HORSE_NAMES][50] = {"Mirage", "In Front",
    "Horlicks", "Go Tebow Go", "Sotally Tober", "Comply or Die",
    "Flat Fleet Feet", "Hoof Hearted", "Notacatbutallama",
    "Nosoupforyou", "Flyer", "Mucho Macho Man", "Dust Bunny",
    "Geoff", "Quantum Leap"};

struct Horse *create_horse(char *name, int raceNum, int odds) {
   struct Horse *horsey = (struct Horse*)malloc(sizeof(struct Horse));
   horsey->name = name;
   horsey->raceNum = raceNum;
   horsey->odds = odds;
   return horsey;
};

struct Horse *gen_horse() {
    char *nameToUse;
    int raceNum;
    int odds = 50;
    int i;

    do {
	i = rand() % NUMBER_OF_HORSE_NAMES;
	if(horseNames[i][0] != 'x')
	nameToUse = horseNames[i];
    } while(nameToUse[0] == '\0');
    
   raceNum = rand() % 100;
	    
   struct Horse *genHorse = create_horse(nameToUse, raceNum, odds);
   
   return genHorse;

   nameToUse[0] = 'x'; //Makes name nonreusable
};
