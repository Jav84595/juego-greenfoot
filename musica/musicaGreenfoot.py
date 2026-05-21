from earsketch import *

# Tema retro estilo 8-bit

init()
setTempo(115)

# Pistas
DRUMS = 1
BASS = 2
LEAD = 3
PAD = 4
SFX = 5

# -------------------------
# Inicio
# -------------------------

fitMedia(EIGHT_BIT_ATARI_PAD_001, PAD, 1, 5)
fitMedia(EIGHT_BIT_ANALOG_DRUM_LOOP_002, DRUMS, 1, 5)
fitMedia(EIGHT_BIT_ATARI_BASSLINE_001, BASS, 1, 5)

fitMedia(EIGHT_BIT_ATARI_LEAD_001, LEAD, 1, 2)
fitMedia(EIGHT_BIT_ATARI_LEAD_002, LEAD, 2, 3)
fitMedia(EIGHT_BIT_ATARI_LEAD_003, LEAD, 3, 4)
fitMedia(EIGHT_BIT_ATARI_LEAD_004, LEAD, 4, 5)

# -------------------------
# Parte principal
# -------------------------

fitMedia(EIGHT_BIT_ANALOG_DRUM_LOOP_005, DRUMS, 5, 9)
fitMedia(EIGHT_BIT_ATARI_BASSLINE_002, BASS, 5, 9)

fitMedia(EIGHT_BIT_ATARI_LEAD_005, LEAD, 5, 6)
fitMedia(EIGHT_BIT_ATARI_LEAD_006, LEAD, 6, 7)
fitMedia(EIGHT_BIT_ATARI_LEAD_007, LEAD, 7, 8)
fitMedia(EIGHT_BIT_ATARI_LEAD_008, LEAD, 8, 9)

# -------------------------
# Parte más tranquila
# -------------------------

fitMedia(EIGHT_BIT_ATARI_PAD_002, PAD, 9, 13)
fitMedia(EIGHT_BIT_ANALOG_DRUM_LOOP_008, DRUMS, 9, 13)
fitMedia(EIGHT_BIT_ATARI_BASSLINE_003, BASS, 9, 13)

fitMedia(EIGHT_BIT_ATARI_LEAD_009, LEAD, 9, 10)
fitMedia(EIGHT_BIT_ATARI_LEAD_010, LEAD, 10, 11)
fitMedia(EIGHT_BIT_ATARI_LEAD_011, LEAD, 11, 12)
fitMedia(EIGHT_BIT_ATARI_LEAD_012, LEAD, 12, 13)

# -------------------------
# Última sección
# -------------------------

fitMedia(EIGHT_BIT_ANALOG_DRUM_LOOP_012, DRUMS, 13, 17)
fitMedia(EIGHT_BIT_ATARI_BASSLINE_004, BASS, 13, 17)

fitMedia(EIGHT_BIT_ATARI_LEAD_013, LEAD, 13, 14)
fitMedia(EIGHT_BIT_ATARI_LEAD_006, LEAD, 14, 15)
fitMedia(EIGHT_BIT_ATARI_LEAD_003, LEAD, 15, 16)
fitMedia(EIGHT_BIT_ATARI_LEAD_008, LEAD, 16, 17)

# Efecto final
fitMedia(EIGHT_BIT_ATARI_SFX_003, SFX, 16, 17)

# Ajuste de volumen
setEffect(DRUMS, VOLUME, GAIN, -6)
setEffect(BASS, VOLUME, GAIN, -8)
setEffect(LEAD, VOLUME, GAIN, -10)
setEffect(PAD, VOLUME, GAIN, -16)
setEffect(SFX, VOLUME, GAIN, -12)

finish()