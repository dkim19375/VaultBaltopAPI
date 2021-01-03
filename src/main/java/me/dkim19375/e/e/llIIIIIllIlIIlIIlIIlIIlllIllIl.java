/*     */ package me.dkim19375.e.e;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import me.clip.placeholderapi.expansion.PlaceholderExpansion;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.plugin.java.JavaPlugin;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class llIIIIIllIlIIlIIlIIlIIlllIllIl
/*     */   extends PlaceholderExpansion
/*     */ {
/*     */   private final String IIIIIIIlllllIIllIIlllIIlIlIlII;
/*     */   private final String IlIlIlIllllIIlIlIIlIlIIllllIll;
/*     */   private final String IlIlIIIIIIllIIIIllIIIlIlIIlIII;
/*     */   
/*     */   public llIIIIIllIlIIlIIlIIlIIlllIllIl(JavaPlugin plugin, @Nullable String identifier, @Nullable String authors, @Nullable String a) {
/* 176 */     this.IlIlIlIllllIIlIlIIlIlIIllllIll = plugin.getDescription().getName();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.IlIlIlIllllIIlIlIIlIlIIllllIll = identifier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 241 */     if (((identifier == null) ? authors : authors) == null)
/*     */       this.IlIlIIIIIIllIIIIllIIIlIlIIlIII = plugin.getDescription().getAuthors().toString(); 
/*     */     this.IlIlIIIIIIllIIIIllIIIlIlIIlIII = authors;
/*     */     if (a == null) {
/*     */       this.IIIIIIIlllllIIllIIlllIIlIlIlII = plugin.getDescription().getVersion();
/*     */       return;
/*     */     } 
/*     */     this.IIIIIIIlllllIIllIIlllIIlIlIlII = a;
/*     */   }
/*     */   
/*     */   public String getVersion() {
/*     */     return this.IIIIIIIlllllIIllIIlllIIlIlIlII;
/*     */   }
/*     */   
/*     */   public String getIdentifier() {
/*     */     return this.IlIlIlIllllIIlIlIIlIlIIllllIll;
/*     */   }
/*     */   
/*     */   public String getAuthor() {
/*     */     return this.IlIlIIIIIIllIIIIllIIIlIlIIlIII;
/*     */   }
/*     */   
/*     */   public boolean canRegister() {
/*     */     true;
/*     */     return true;
/*     */   }
/*     */   
/*     */   public boolean persist() {
/*     */     true;
/*     */     return true;
/*     */   }
/*     */   
/*     */   public abstract String onPlaceholderRequest(Player paramPlayer, @Nullable String paramString);
/*     */ }


/* Location:              C:\Users\Na\Documents\IntelliJ\obfuscate\VaultBaltop-1.0.0.jar!\me\dkim19375\e\e\llIIIIIllIlIIlIIlIIlIIlllIllIl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */