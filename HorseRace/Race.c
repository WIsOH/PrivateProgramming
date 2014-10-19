/**
 * Race.c
 * File to process actual Race
 **/

#include <stdio.h>
#include <stdlib.h>

#include "HorseRace.h"
#include "Horse.h"

double chanceToAdv;

void start_race(struct HorseListee *listHead) {
    while(listHead) {
	printf("%s is number %d his odds of advancing are %%%d\n",
		listHead->horse->name, listHead->horse->raceNum,
		listHead->horse->odds);
	listHead = listHead->next;
    };
};
