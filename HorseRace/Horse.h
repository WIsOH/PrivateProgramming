/**
 * Horse.h
 * Header file for Horse.c
 **/

#ifndef HORSE_H_
#define HORSE_H_

struct Horse {
    char *name;
    int raceNumber;
    int odds;
};

char *horseNames[15];

int horse();

struct Horse *create_horse(char *name, int raceNumber, int odds);

#endif
