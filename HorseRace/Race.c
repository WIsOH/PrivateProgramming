/**
 * Race.c
 * File to process actual Race
 **/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "HorseRace.h"
#include "Horse.h"

int raceWon;

void start_race(struct horseList *listHead)
{
	raceWon = 0;
	struct horseList *save = listHead;

	while (listHead) {
		printf("%s is number %d his odds of advancing are %%%d"
			" followed by %s\n",
		       listHead->horse->name, listHead->horse->raceNum,
		       listHead->horse->odds,listHead->next->horse->name);
	listHead = listHead->next;
	};
	listHead = save;
};

int race(struct horseList *listHead)
{
	int raceWon = 0;
	struct horseList *save = listHead;

	while (!raceWon) {
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
		*/

		if (listHead->placeOnTrack >= 20) {
			raceWon = 1;
			printf("%s has won!\n", listHead->horse->name);
		};

		listHead = listHead->next;
	};

	listHead=save;
	return raceWon;
};
