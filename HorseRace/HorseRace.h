/**
 * HorseRace.h
 * Header file for HorseRace.c
 **/

#ifndef HORSERACE_H_
#define HORSERACE_H_

struct HorseListee {
    struct Horse *horse;
    struct HorseListee *next;
};

#endif
