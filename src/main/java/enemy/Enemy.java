package enemy;

public abstract class Enemy {

        private int hitPoints;
        private String name;

        public Enemy(String name, int hitPoints) {
                this.name = name;
                this.hitPoints = hitPoints;
        }


        public int getHitPoints() {
                return hitPoints;
        }

        public void setHitPoints(int hitPoints) {
                this.hitPoints = hitPoints;
        }

        public void takeDamage(int damage) {
                this.hitPoints -= damage;
        }

}