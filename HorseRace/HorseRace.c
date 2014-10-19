/**
 * HorseRace.c
 * Program to control game
 **/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#include "Horse.h"
#include "Race.h"

struct HorseListee {
    struct Horse *horse;
    struct HorseListee *next;
    int placeOnTrack;
}; //Linked list attempt, Jesus take the wheel. 

struct HorseListee *create_horse_listee(struct Horse *horse,
	struct HorseListee *raceHorse) {
    struct HorseListee *racey =(struct HorseListee*)malloc(sizeof
	    (struct HorseListee));

    racey->horse = horse;
    racey->next = raceHorse;

    return racey;
};

struct HorseListee *create_horse_linked_list(int numOfRacers) {
    struct HorseListee *hLHead, *hLCurr;
    hLHead = NULL;
    int i;
    
    for(i=0;i<numOfRacers;i++) {
	hLCurr = create_horse_listee(gen_horse(), hLHead);
	hLHead = hLCurr;
    };

    return hLHead;
};

int main() {
    srand(time(NULL));
    struct HorseListee *headOfHorseList = create_horse_linked_list(8);

    start_race(headOfHorseList);
};
