CC=gcc
CFLAGS= -g -Wall

HorseRace: Horse.o HorseRace.o Race.o
	$(CC) $(CFLAGS) -o HorseRace Horse.o HorseRace.o Race.o

Horse.o: Horse.c Horse.h
	$(CC) $(CFLAGS) -c Horse.c 
	
HorseRace.o: HorseRace.c HorseRace.h Horse.h Race.h
	$(CC) $(CFLAGS) -c HorseRace.c

Race.o: Race.c Race.h Horse.h HorseRace.h
	$(CC) $(CFLAGS) -c Race.c

clean:
	$(RM) count *.o *~
