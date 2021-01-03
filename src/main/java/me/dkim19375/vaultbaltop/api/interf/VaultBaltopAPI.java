package me.dkim19375.vaultbaltop.api.interf;

import me.dkim19375.vaultbaltop.Entry;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.OfflinePlayer;

import java.util.LinkedHashMap;
import java.util.UUID;

public interface VaultBaltopAPI {

    /**
     * @param spot the leaderboard spot.
     *             For example, 1 would get the player with the highest amount of money
     * @return the OfflinePlayer instance of the player and their balance
     */
    Entry<OfflinePlayer, Double> getPlayer(int spot);

    /**
     * @return the balance leaderboard
     */
    LinkedHashMap<OfflinePlayer, Double> getBaltop();

    /**
     * @return a UUID array of the leaderboard
     */
    UUID[] getUUIDLeaderboard();

    /**
     * @return an OfflinePlayer array of the leaderboard
     */
    OfflinePlayer[] getPlayerLeaderboard();

    /**
     * @return a double (balance) array of the leaderboard
     */
    Double[] getBalanceLeaderboard();


    /**
     * @return the Economy
     */
    Economy getEconomy();
}