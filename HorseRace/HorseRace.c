/**
 * HorseRace.c
 * Program to control game
 **/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#include "Horse.h"

int main() {
    srand(time(NULL));
    int i;

    struct Horse *cow = gen_horse();
    struct Horse *shloop = gen_horse();

    printf("%s and %d win!\n", cow->name, shloop->raceNumber);
};
