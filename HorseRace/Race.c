/**
 * Race.c
 * File to process actual Race
 **/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "HorseRace.h"
#include "Horse.h"

void start_race(struct HorseListee *listHead)
{
	struct HorseListee *save = listHead;

	while (listHead) {
		printf("%s is number %d his odds of advancing are %%%d\n",
		       listHead->horse->name, listHead->horse->raceNum,
		       listHead->horse->odds);
	listHead = listHead->next;
	};
	
	listHead = save;
};

int race(struct HorseListee *listHead)
{
	struct HorseListee *save = listHead;
	char *pos;
	int raceWon = 0;
	int i;

	while (listHead) {
		if (rand() % 100 * 50 >= 2500) {
			listHead->placeOnTrack += 1;
			printf("%s has advanced on place on the track\n",
					listHead->horse->name);
		};

		/**for (i = 0; i = listHead->horse->placeOnTrack; i++)
			strcat(' ', pos);
		strcat('#', pos);

		printf("%s", pos);
		printf("####################");

		listHead = listHead->next;*/

		if (listHead->placeOnTrack >= 20) {
			raceWon = 1;

			printf("%s has won!\n", listHead->horse->name);
			return raceWon;
		} else {
			return raceWon;
		};
	};

	listHead = save;
};
