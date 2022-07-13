# SimpleGemsAPI
Welcome to the official SimpleGemsAPI!

# API Usage
Import the SimpleGemsAPI.jar or use maven.

### Maven

```POM
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```

```POM
<dependency>
    <groupId>com.github.RefracDevelopment</groupId>
    <artifactId>SimpleGemsAPI</artifactId>
    <version>2.0</version>
</dependency>
```

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
