/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2022 RefracDevelopment
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package me.refrac.simplegems.api;

import me.refrac.simplegems.plugin.manager.ProfileData;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * The SimpleGemsAPI allows you to hook into SimpleGems to either modify and grab data
 * or to add new features and events.
 */
public class GemsAPI {
    public static GemsAPI INSTANCE;

    /**
     * @return Is the SimpleGemsAPI enabled and registered?
     */
    public static boolean isRegistered() {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to get a player's profile data.
     *
     * @return Player's profile
     */
    public ProfileData getProfileData(Player player) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to get player gems.
     *
     * @param player player
     * @return Player's gems
     */
    public double getGems(Player player) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * This will pay gems to the specified player
     *
     * @param player player profile
     * @param target target profile
     * @param amount paid gems
     * @param silent silent gems
     */
    public void payGems(Player player, Player target, double amount, boolean silent) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * This will give gems in item form
     * to the player who withdraw them or
     * received them by doing events etc
     *
     * @param player player profile
     * @param amount gems to remove and turn into an item
     */
    public void giveGemsItem(Player player, int amount) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to check if the player has enough gems
     *
     * @param player player
     * @param amount gems
     * @return If the player has enough gems
     */
    public boolean hasGems(Player player, double amount) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to give player gems.
     *
     * @param player player
     * @param amount gems
     */
    public void giveGems(Player player, double amount) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to take player gems.
     *
     * @param player data
     * @param amount gems
     */
    public void takeGems(Player player, double amount) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to set player gems.
     *
     * @param player data
     * @param amount gems
     */
    public void setGems(Player player, double amount) {
        throw new IllegalPluginAccessException("API is not registered!");
    }
}