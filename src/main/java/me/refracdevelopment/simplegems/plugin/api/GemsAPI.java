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
package me.refracdevelopment.simplegems.plugin.api;

import me.refracdevelopment.simplegems.plugin.api.manager.ProfileData;
import me.refracdevelopment.simplegems.plugin.api.manager.ProfileManager;
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
        throw new IllegalPluginAccessException("SimpleGemsAPI is not registered!");
    }

    /**
     * The #getProfileManager method allows you to use settings inside the
     * profile management class. This gives you info on gems, settings, and more.
     *
     * @return player's profile.
     */
    public ProfileManager getProfileManager() {
        throw new IllegalPluginAccessException("SimpleGemsAPI is not registered!");
    }

    /**
     * The #getProfileData method allows you to get a player's profile data.
     *
     * @return player's profile data.
     */
    public ProfileData getProfileData() {
        throw new IllegalPluginAccessException("SimpleGemsAPI is not registered!");
    }
}