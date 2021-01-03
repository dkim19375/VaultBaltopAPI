package me.dkim19375.vaultbaltop.api;

import me.dkim19375.vaultbaltop.VaultBaltop;
import me.dkim19375.vaultbaltop.api.interf.VaultBaltopAPI;
import net.milkbowl.vault.economy.Economy;

public class BaltopAPIProvider {
    private static VaultBaltopAPI apiInstance = null;

    public static VaultBaltopAPI getAPI() {
        return apiInstance;
    }

    public static Economy getEconomy() {
        return VaultBaltop.getEconomy();
    }

    public static void register(VaultBaltopAPI api) {
        apiInstance = api;
    }
}
