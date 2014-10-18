/**
 * Horse.c
 * Program to handle horses for horse races
 **/

#include <stdio.h>
#include <stdlib.h>

struct Horse {
    char *name;
    int raceNumber;
    int odds;
}; //Horse to be raced around track

char *horseNames[15] = {"Mirage", "In Front", "Comply or Die",
    "Horlicks", "Go Tebow Go", "Sotally Tober",
    "Flat Fleet Feet", "Hoof Hearted", "Notacatbutallama",
    "Nosoupforyou", "Flyer", "Mucho Macho Man", "Dust Bunny",
    "Geoff", "Quantum Leap"};

int horse() {
    struct Horse luckyDay;
    luckyDay.raceNumber = rand() % 100;
    printf("%d", luckyDay.raceNumber);

    return 0;
};

struct Horse *create_horse(char *name, int raceNumber, int odds) {
   struct Horse *newHorse = (struct Horse*)malloc(sizeof(struct Horse));
   newHorse->name = name;
   newHorse->raceNumber = raceNumber;
   newHorse->odds = odds;
   return newHorse;
}
