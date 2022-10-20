package controller;

public interface Controller {
  public abstract void on();
  public abstract void off();
  public abstract void openMenu();
  public abstract void closeMenu();
  public abstract void upVolume();
  public abstract void downVolume();
  public abstract void mute();
  public abstract void unmute();
  public abstract void play();
  public abstract void pause();
}
