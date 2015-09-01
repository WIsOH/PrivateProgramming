/**
 * HorseRace.c
 * Program to control game
 **/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#include "Horse.h"
#include "Race.h"

struct horseList {
	struct Horse *horse;
	struct horseList *next;
	int placeOnTrack;
};				//Linked list attempt, Jesus take the wheel. 

struct horseList *create_horse_listee(struct Horse *horse,
					struct horseList *raceHorse)
{
	struct horseList *racey = (struct horseList *)malloc(sizeof
								 (struct
								  horseList));

	racey->horse = horse;
	racey->next = raceHorse;

	return racey;
};

struct horseList *create_horse_linked_list(int numOfRacers)
{
	struct horseList *hLHead, *hLCurr;
	hLHead = NULL;
	int i;

	for (i = 0; i < numOfRacers; i++) {
		hLCurr = create_horse_listee(gen_horse(), hLHead);
		hLHead = hLCurr;
	};

	return hLHead;
};

int main()
{
	srand(time(NULL));
	struct horseList *headOfHorseList = create_horse_linked_list(8);

	start_race(headOfHorseList);
	while (!race(headOfHorseList));
	return 0;
};
