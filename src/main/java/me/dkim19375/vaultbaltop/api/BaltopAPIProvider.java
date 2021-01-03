/*    */ package me.dkim19375.vaultbaltop.api;
/*    */ 
/*    */ import me.dkim19375.vaultbaltop.VaultBaltop;
/*    */ import me.dkim19375.vaultbaltop.api.interf.VaultBaltopAPI;
/*    */ import net.milkbowl.vault.economy.Economy;
/*    */ 
/*    */ public class BaltopAPIProvider {
/*  8 */   private static VaultBaltopAPI apiInstance = null;
/*    */   
/*    */   public static VaultBaltopAPI getAPI() {
/* 11 */     return apiInstance;
/*    */   }
/*    */   
/*    */   public static Economy getEconomy() {
/* 15 */     return VaultBaltop.getEconomy();
/*    */   }
/*    */   
/*    */   public static void register(VaultBaltopAPI api) {
/* 19 */     apiInstance = api;
/*    */   }
/*    */ }


/* Location:              C:\Users\Na\Documents\IntelliJ\obfuscate\VaultBaltop-1.0.0.jar!\me\dkim19375\vaultbaltop\api\BaltopAPIProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */