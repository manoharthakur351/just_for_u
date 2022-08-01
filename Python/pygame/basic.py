import pygame

pygame.init()

screen_width, screen_hight = 1080, 2160
surface = pygame.display.set_mode(( screen_width, screen_hight))

running = True

while running:
  pygame.display.flip()
