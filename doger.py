import pygame
import random
import sys

# Initialize pygame
pygame.init()

# Constants
WIDTH = 600
HEIGHT = 800
FPS = 60
WHITE = (255, 255, 255)
BLUE = (0, 0, 255)
RED = (255, 0, 0)
BLACK = (0, 0, 0)

# Setup window
screen = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Dodger – Avoid the Falling Blocks")
clock = pygame.time.Clock()

# Player properties
player_width = 50
player_height = 50
player_x = WIDTH // 2 - player_width // 2
player_y = HEIGHT - player_height - 10
player_speed = 8

player_rect = pygame.Rect(player_x, player_y, player_width, player_height)

# Block properties
block_width = 50
block_height = 50
block_speed = 6
blocks = []

def create_block():
    x = random.randint(0, WIDTH - block_width)
    y = -block_height
    return pygame.Rect(x, y, block_width, block_height)

# Score setup
score = 0
font = pygame.font.SysFont(None, 36)

# Game loop
running = True
while running:
    clock.tick(FPS)
    screen.fill(WHITE)

    # Event handling
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # Key movement
    keys = pygame.key.get_pressed()
    if keys[pygame.K_LEFT] and player_rect.left > 0:
        player_rect.x -= player_speed
    if keys[pygame.K_RIGHT] and player_rect.right < WIDTH:
        player_rect.x += player_speed

    # Block creation
    if random.randint(1, 30) == 1:
        blocks.append(create_block())

    # Block movement
    for block in blocks[:]:
        block.y += block_speed
        if block.y > HEIGHT:
            blocks.remove(block)

    # Collision detection
    for block in blocks:
        if player_rect.colliderect(block):
            print("Game Over!")
            pygame.quit()
            sys.exit()

    # Score update
    score += 1
    score_text = font.render(f"Score: {score}", True, BLACK)
    screen.blit(score_text, (10, 10))

    # Draw player and blocks
    pygame.draw.rect(screen, BLUE, player_rect)
    for block in blocks:
        pygame.draw.rect(screen, RED, block)

    # Update screen
    pygame.display.flip()

pygame.quit()
sys.exit()
