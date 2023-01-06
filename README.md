# SimpleGemsAPI
Welcome to the official SimpleGemsAPI!

### Note: The API is now available inside of the main plugin jar.

# API Usage
Import the SimpleGemsAPI.jar into your project.

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
    <version>LATEST</version>
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
GemsAPI.INSTANCE.getProfileData(player.getUniqueId()).getGems(player);

GemsAPI.INSTANCE.getProfileData(player.getUniqueId()).getOfflineGems(player);

GemsAPI.INSTANCE.getProfileData(player.getUniqueId()).hasGems(player, amount);

GemsAPI.INSTANCE.getProfileData(player.getUniqueId()).hasOfflineGems(player, amount);

GemsAPI.INSTANCE.getProfileData(player.getUniqueId()).giveGemsItem(player, amount);

GemsAPI.INSTANCE.getProfileData(player.getUniqueId()).giveGems(player, amount);

GemsAPI.INSTANCE.getProfileData(player.getUniqueId()).giveOfflineGems(player, amount);

GemsAPI.INSTANCE.getProfileData(player.getUniqueId()).takeGems(player, amount);

GemsAPI.INSTANCE.getProfileData(player.getUniqueId()).takeOfflineGems(player, amount);

GemsAPI.INSTANCE.getProfileData(player.getUniqueId()).setGems(player, amount);

GemsAPI.INSTANCE.getProfileData(player.getUniqueId()).setOfflineGems(player, amount);
```
