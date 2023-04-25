package bstorm.models.characters.interfaces;

import bstorm.models.characters.Entity;

public interface DieEventSubscriber {

    void execute(Entity e);
}
