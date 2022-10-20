class Ball {
  
  // ... Properties here.
  
  // Ball constructor
  public Ball() {
    resetMovement();
  }
  
  // Getter Methods
  
  public PVector getPosition() {
    return position;
  }
  
  // Reset position and randomize direction.
  
  public void resetMovement() {
    // Set position to the center of the screen
    position = new PVector(width/2, height/2);
    
    // Get a random speed
    float speed = random(-s, s);
    // Set the y direction to half of the speed
    // to ensure it moves faster in the left or
    // right direction
    direction = new PVector(speed, speed/2);
  }
  
  // Set direction on the x-axis.
  
  public void setDirection(float x) {
     direction.x = x * speed;
  }
  
  // Updates the ball's position, add boundaries 
  // and draw its visuals.
  
  public void update() {
    // Add velocity
    position.add(direction);
    
    // Check if the ball has reached the top
    // or the bottom of the screen.
    if (position.y < 0 || position.y > height) {
      // Invert the direction on the y-axis.
      direction.y = -direction.y;
    }
    
    // Set the fill color to white.
    fill(255);
    // Draw the ball's circle.
    circle(position.x, position.y, d); 
  }
}
