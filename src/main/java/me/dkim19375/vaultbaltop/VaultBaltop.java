/*     */ package me.dkim19375.vaultbaltop;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.net.MalformedURLException;
/*     */ import java.util.logging.Level;
/*     */ import me.dkim19375.e.IIIlIllIIllIIlllIIlIIIllIIllIl;
/*     */ import me.dkim19375.vaultbaltop.api.BaltopAPIProvider;
/*     */ import me.dkim19375.vaultbaltop.api.interf.VaultBaltopAPI;
/*     */ import me.dkim19375.vaultbaltop.y.e.IIIlIllIIllIIlllIIlIIIllIIllIl;
/*     */ import net.milkbowl.vault.economy.Economy;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.plugin.Plugin;
/*     */ import org.bukkit.plugin.RegisteredServiceProvider;
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
/*     */ public class VaultBaltop
/*     */   extends IIIlIllIIllIIlllIIlIIIllIIllIl
/*     */ {
/*     */   public static Economy IIIllIIIlIIlllIIIIlIIIlllIllIl() {
/* 104 */     return IlIlIIIIIIllIIIIllIIIlIlIIlIII;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 110 */   private static Economy IlIlIIIIIIllIIIIllIIIlIlIIlIII = null;
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
/*     */   public void onEnable() {
/* 195 */     BaltopAPIProvider.register((VaultBaltopAPI)new IIIlIllIIllIIlllIIlIIIllIIllIl());
/*     */ 
/*     */     
/*     */     try {
/*     */       IIIlIllIIllIIlllIIlIIIllIIllIl.IIIllIIIlIIlllIIIIlIIIlllIllIl(this, (bool, vaultBaltop1, iOException) -> {
/*     */             if (!bool.booleanValue()) {
/*     */               if (iOException == null) {
/*     */                 this;
/*     */ 
/*     */                 
/*     */                 super();
/*     */ 
/*     */                 
/*     */                 (new StringBuilder()).IIIllIIIlIIlllIIIIlIIIlllIllIl(append(ChatColor.RED).append(IIIlIllIIllIIlllIIlIIIllIIllIl.IIIllIIIlIIlllIIIIlIIIlllIllIl("\036\016/\001;\036s@dZhAkM1Eb^r\005%\n&\024%\032sV-\017;jX\024pIk\\Rl7VG<p_wHv[a,")).toString());
/*     */ 
/*     */                 
/*     */                 getPluginLoader().disablePlugin((Plugin)vaultBaltop1);
/*     */ 
/*     */                 
/*     */                 return;
/*     */               } 
/*     */ 
/*     */               
/*     */               iOException.printStackTrace();
/*     */ 
/*     */               
/*     */               this;
/*     */ 
/*     */               
/*     */               super();
/*     */ 
/*     */               
/*     */               (new StringBuilder()).IIIllIIIlIIlllIIIIlIIIlllIllIl(append(ChatColor.RED).append(IIIlIllIIllIIlllIIlIIIllIIllIl.IIIllIIIlIIlllIIIIlIIIlllIllIl("FPqYc\001l\017+\b:\003)\024h\0378Jf\005%\023?\f=\001hD?@t\\1M`YwK~\036s`DApD(W~U)uZ\024j\\cHoSwA,")).toString());
/*     */               
/*     */               getPluginLoader().disablePlugin((Plugin)vaultBaltop1);
/*     */             } 
/*     */           });
/* 232 */     } catch (MalformedURLException malformedURLException) {
/*     */       malformedURLException.printStackTrace();
/*     */       this;
/*     */       super();
/*     */       (new StringBuilder()).IIIllIIIlIIlllIIIIlIIIlllIllIl(append(ChatColor.RED).append(IIIlIllIIllIIlllIIlIIIllIIllIl.IIIllIIIlIIlllIIIIlIIIlllIllIl("FPqYc\001l\017+\b:\003)\024h\0378Jf\005%\023?\f=\001hD?@t\\1M`YwK~\036s`DApD(W~U)uZ\024j\\cHoSwA,")).toString());
/*     */       getPluginLoader().disablePlugin((Plugin)this);
/*     */     } 
/*     */     boolean bool;
/*     */     if (!(bool = IIIllIIIlIIlllIIIIlIIIlllIllIl()))
/*     */       Bukkit.getLogger().log(Level.SEVERE, IIIlIllIIllIIlllIIlIIIllIIllIl.IIIllIIIlIIlllIIIIlIIIlllIllIl("@JZrO|\031bD}bO\024yZ~OfWk\004,")); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Na\Documents\IntelliJ\obfuscate\VaultBaltop-1.0.0.jar!\me\dkim19375\vaultbaltop\VaultBaltop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */