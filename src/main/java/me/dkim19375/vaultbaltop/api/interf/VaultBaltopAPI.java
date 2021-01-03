package me.dkim19375.vaultbaltop.api.interf;

import java.util.LinkedHashMap;
import java.util.UUID;
import me.dkim19375.vaultbaltop.Entry;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.OfflinePlayer;

public interface VaultBaltopAPI {
  Entry<OfflinePlayer, Double> getPlayer(int paramInt);
  
  LinkedHashMap<OfflinePlayer, Double> getBaltop();
  
  UUID[] getUUIDLeaderboard();
  
  OfflinePlayer[] getPlayerLeaderboard();
  
  Double[] getBalanceLeaderboard();
  
  Economy getEconomy();
}


/* Location:              C:\Users\Na\Documents\IntelliJ\obfuscate\VaultBaltop-1.0.0.jar!\me\dkim19375\vaultbaltop\api\interf\VaultBaltopAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */