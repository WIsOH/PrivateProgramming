CC = clang
FILES = Battleship.c
ALL_LIBS = allegro_acodec-5.0 allegro_audio-5.0 allegro_color-5.0
ALL_LIBS := allegro_dialog-5.0 allegro_font-5.0 allegro_image-5.0
ALL_LIBS := allegro_main-5.0 allegro_memfile-5.0 allegro_physfs-5.0
ALL_LIBS := allegro_primitives-5.0 allegro_ttf-5.0 allegro_image-5.0
ALL_LIBS := allegro_dialog-5.0

build: $(FILES)
	$(CC) -Wall $(FILES) -o Battleship `pkg-config --libs $(ALL_LIBS)`

clean:
	rm -f *.o core

rebuild: clean build
