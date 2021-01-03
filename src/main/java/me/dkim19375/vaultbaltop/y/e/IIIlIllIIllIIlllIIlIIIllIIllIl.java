/*     */ package me.dkim19375.vaultbaltop.y.e;
/*     */ 
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.UUID;
/*     */ import me.dkim19375.vaultbaltop.Entry;
/*     */ import me.dkim19375.vaultbaltop.api.BaltopAPIProvider;
/*     */ import me.dkim19375.vaultbaltop.api.interf.VaultBaltopAPI;
/*     */ import me.dkim19375.vaultbaltop.e.lIllllIlllIIIIIlIIlllIIlIlIlII;
/*     */ import me.dkim19375.vaultbaltop.e.llIIIIIllIlIIlIIlIIlIIlllIllIl;
/*     */ import net.milkbowl.vault.economy.Economy;
/*     */ import org.bukkit.OfflinePlayer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class IIIlIllIIllIIlllIIlIIIllIIllIl
/*     */   implements VaultBaltopAPI
/*     */ {
/*     */   public LinkedHashMap<OfflinePlayer, Double> getBaltop() {
/* 102 */     return lIllllIlllIIIIIlIIlllIIlIlIlII.IIIllIIIlIIlllIIIIlIIIlllIllIl();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Economy getEconomy() {
/* 123 */     return BaltopAPIProvider.getEconomy();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Entry<OfflinePlayer, Double> getPlayer(int i) {
/* 157 */     return llIIIIIllIlIIlIIlIIlIIlllIllIl.IIIllIIIlIIlllIIIIlIIIlllIllIl(i, this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double[] getBalanceLeaderboard() {
/* 202 */     return me.dkim19375.vaultbaltop.e.e.IIIlIllIIllIIlllIIlIIIllIIllIl.IIIllIIIlIIlllIIIIlIIIlllIllIl();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OfflinePlayer[] getPlayerLeaderboard() {
/* 220 */     return me.dkim19375.vaultbaltop.e.e.IIIlIllIIllIIlllIIlIIIllIIllIl.IIIllIIIlIIlllIIIIlIIIlllIllIl();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UUID[] getUUIDLeaderboard() {
/* 240 */     return me.dkim19375.vaultbaltop.e.e.IIIlIllIIllIIlllIIlIIIllIIllIl.IIIllIIIlIIlllIIIIlIIIlllIllIl();
/*     */   }
/*     */ }


/* Location:              C:\Users\Na\Documents\IntelliJ\obfuscate\VaultBaltop-1.0.0.jar!\me\dkim19375\vaultbaltop\y\e\IIIlIllIIllIIlllIIlIIIllIIllIl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */