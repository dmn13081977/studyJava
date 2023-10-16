interface Movable {
    int getX();
    int getY();
    void setX(int newX);
    void setY(int newY);
}

interface Storable {
    int getInventoryLength();
    String getInventoryItem(int index);
    void setInventoryItem(int index, String item);
}

interface Command {
    void execute();
    void undo();
}

class CommandMove implements Command {
    Movable entity;
    int xMovement;
    int yMovement;

//    int x;
//    int y;


    @Override
    public void execute() {
//        x = entity.getX();
//        y = entity.getY();
//
//        entity.setX(entity.getX());
//        entity.setY(entity.getY());
//
//        xMovement = entity.getX() + x;
//        yMovement = entity.getY() + y;
    }

    @Override
    public void undo() {
//        xMovement = x;
//        yMovement = y;
    }
}


class CommandPutItem implements Command {
    Storable entity;
    String item;


    @Override
    public void execute() {
//        for (int i = 0; i < entity.getInventoryLength(); i++) {
//            if (entity.getInventoryItem(i) == null) {
//                entity.setInventoryItem(i, item);
//                break;
//            }
//        }
    }

    @Override
    public void undo() {
//        for (int i = entity.getInventoryLength() - 1; i >= 0; i--) {
//            if (entity.getInventoryItem(i) != null) {
//                entity.setInventoryItem(i, null);
//                break;
//            }
//        }
    }
}