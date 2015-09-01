/**
 * HorseRace.h
 * Header file for HorseRace.c
 **/

#ifndef HORSERACE_H_
#define HORSERACE_H_

struct horseList {
    struct Horse *horse;
    struct horseList *next;
    int placeOnTrack;
};

#endif
