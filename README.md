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
GemsAPI.INSTANCE.getGems(player);

GemsAPI.INSTANCE.getOfflineGems(player);

GemsAPI.INSTANCE.hasGems(player, amount);

GemsAPI.INSTANCE.hasOfflineGems(player, amount);

GemsAPI.INSTANCE.giveGemsItem(player, amount);

GemsAPI.INSTANCE.giveGems(player, amount);

GemsAPI.INSTANCE.giveOfflineGems(player, amount);

GemsAPI.INSTANCE.takeGems(player, amount);

GemsAPI.INSTANCE.takeOfflineGems(player, amount);

GemsAPI.INSTANCE.setGems(player, amount);

GemsAPI.INSTANCE.setOfflineGems(player, amount);
```
