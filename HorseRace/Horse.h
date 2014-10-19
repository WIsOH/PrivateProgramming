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

struct RaceHorse {
    struct Horse *horse;
    struct RaceHorse *next;
};

char *horseNames[15];

int horse();

struct Horse *create_horse(char *name, int raceNumber, int odds);

struct Horse *gen_horse();

struct RaceHorse *create_race_horse(struct Horse horse,
	struct RaceHorse raceHorse);

#endif
