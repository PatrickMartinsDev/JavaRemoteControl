package controller;

public class Control implements Controller {
  //Atributs
  private int volume;
  private boolean on;
  private boolean playing;

  //Special Methods

  //Constructor
  public Control() {
    this.volume = 50;
    this.on = false;
    this.playing = false;
  }

  //Getters ans Setters
  private int getVolume() {
    return volume;
  }
  private void setVolume(int volume) {
    this.volume = volume;
  }
  private boolean getOn() {
    return on;
  }
  private void setOn(boolean on) {
    this.on = on;
  }
  private boolean getPlaying() {
    return playing;
  }
  private void setPlaying(boolean playing) {
    this.playing = playing;
  }

  //Abstract Methods
  @Override
  public void on() {
    this.setOn(true);
  }

  @Override
  public void off() {
    this.setOn(false);
  }

  @Override
  public void openMenu() {
    System.out.println("MENU");
    System.out.println("Is it on? " + this.getOn());
    System.out.println("Is it playing? " + this.getPlaying());
    System.out.println("Volume: " + this.getVolume());
    for (int i = 0; i <= this.getVolume(); i+=10) {
      System.out.print("|");
  }
}

  @Override
  public void closeMenu() {
    System.out.println("Closing Menu...");
  }

  @Override
  public void upVolume() {
    if (this.getOn()) {
      this.setVolume(this.getVolume()+1);
    }
  }

  @Override
  public void downVolume() {
    if (this.getOn()) {
      this.setVolume(this.getVolume()-1);
  }
}

  @Override
  public void mute() {
    if (this.getOn() && this.getVolume() > 0) {
      this.setVolume(0);
  }
}

  @Override
  public void unmute() {
    if (this.getOn() && this.getVolume() == 0) {
      this.setVolume(50);
    }
  }

  @Override
  public void play() {
    if (this.getOn() && !this.getPlaying()) {
      this.setPlaying(true);
    }
  }

  @Override
  public void pause() {
    if (this.getOn() && this.getPlaying()) {
      this.setPlaying(false);
    }
  }
};
