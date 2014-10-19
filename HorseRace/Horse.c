/**
 * Horse.c
 * Program to handle horses for horse races
 **/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define NUMBER_OF_HORSE_NAMES 15

struct Horse *create_horse(char *name, int raceNum, int odds);

struct Horse {
    char *name;
    int raceNum;
    int odds;
}; //Horse to be raced around track

char *horseNames[NUMBER_OF_HORSE_NAMES] = {"Mirage", "In Front",
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
    int odds = ((rand() % 10) + -5 ) + 50; //Creates number between 45-55
    int i;

    do {
	i = rand() % NUMBER_OF_HORSE_NAMES;
	nameToUse = horseNames[i];
    } while(nameToUse[0] == '\0');
    
   raceNum = rand() % 100;
	    
   struct Horse *genHorse = create_horse(nameToUse, raceNum, odds);
  
   horseNames[i] = "\0";
   printf("%s", horseNames[i]);
   return genHorse;
};
