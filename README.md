# SimpleGemsAPI
Welcome to the official SimpleGemsAPI!

# API Usage
Import the SimpleGemsAPI.jar into your project.
Make sure you add SimpleGems to your depends or softdepends
```YAML
depend:
  - SimpleGems

softdepend:
  - SimpleGems
```

```JAVA
public double getGems(Player player) {
    return GemsAPI.INSTANCE.getGems(player);
}

public boolean hasGems(Player player, double amount) {
    return GemsAPI.INSTANCE.hasGems(player, amount);
}

public void giveGemsItem(Player player, int amount) {
    GemsAPI.INSTANCE.giveGemsItem(player, amount);
}

public ItemStack getGemsItem() {
    return GemsAPI.INSTANCE.getGemsItem();
}

public void giveGems(Player player, double amount) {
    GemsAPI.INSTANCE.giveGems(player, amount);
}

public void takeGems(Player player, double amount) {
    GemsAPI.INSTANCE.takeGems(player, amount);
}

public void setGems(Player player, double amount) {
    GemsAPI.INSTANCE.setGems(player, amount);
}
```
