/*     */ package me.dkim19375.e;
/*     */ 
/*     */ public class IIllIlllIIIIlIllIIIIIIllllIIll {
/*     */   private FileConfiguration IIIlIlIIIlIllIIIllllIllIIIllII;
/*     */   
/*     */   public void lIIIIIIIIlIIIIlIllIlllIlIIIIIl() {
/*   7 */     this.IIIlIlIIIlIllIIIllllIllIIIllII = (FileConfiguration)YamlConfiguration.loadConfiguration(this.IlIlIlIllllIIlIlIIlIlIIllllIll);
/*     */   }
/*     */   private final File IIIIIIIlllllIIllIIlllIIlIlIlII; private final File IlIlIlIllllIIlIlIIlIlIIllllIll;
/*     */   private final String IlIlIIIIIIllIIIIllIIIlIlIIlIII;
/*     */   
/*     */   public IIllIlllIIIIlIllIIIIIIllllIIll(File file, String str) {
/*  13 */     this
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  23 */       .IlIlIIIIIIllIIIIllIIIlIlIIlIII = str;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 193 */     this; super(file, str); ((IIllIlllIIIIlIllIIIIIIllllIIll)new File()).IlIlIlIllllIIlIlIIlIlIIllllIll = (File)this;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     ((IIllIlllIIIIlIllIIIIIIllllIIll)file).IIIIIIIlllllIIllIIlllIIlIlIlII = (File)this;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 240 */     this.IIIlIlIIIlIllIIIllllIllIIIllII = (FileConfiguration)YamlConfiguration.loadConfiguration(this.IlIlIlIllllIIlIlIIlIlIIllllIll); } public boolean IIIllIIIlIIlllIIIIlIIIlllIllIl() {
/*     */     return lIlIlIIlllllIIIllIllIIlIllIIlI().delete();
/*     */   } public boolean lIlIlIIlllllIIIllIllIIlIllIIlI(String str) {
/*     */     return this.IIIlIlIIIlIllIIIllllIllIIIllII.contains(str);
/*     */   } public File lIlIlIIlllllIIIllIllIIlIllIIlI() {
/*     */     return this.IIIIIIIlllllIIllIIlllIIlIlIlII;
/*     */   } public void IIIllIIIlIIlllIIIIlIIIlllIllIl(String str1, String str2) {
/* 247 */     if (this.IIIlIlIIIlIllIIIllllIllIIIllII.getString(str1) == null) {
/*     */       this.IIIlIlIIIlIllIIIllllIllIIIllII.set(str1, str2);
/*     */       try {
/*     */         this.IIIlIlIIIlIllIIIllllIllIIIllII.save(this.IlIlIlIllllIIlIlIIlIlIIllllIll);
/*     */         return;
/*     */       } catch (IOException iOException) {}
/*     */     } 
/*     */   }
/*     */   
/*     */   public void IIIllIIIlIIlllIIIIlIIIlllIllIl(Map map) {
/*     */     this.IIIlIlIIIlIllIIIllllIllIIIllII.addDefaults(map);
/*     */   }
/*     */   
/*     */   public void lIlIlIIlllllIIIllIllIIlIllIIlI() {
/*     */     if (!this.IlIlIlIllllIIlIlIIlIlIIllllIll.exists()) {
/*     */       if (!this.IIIIIIIlllllIIllIIlllIIlIlIlII.exists())
/*     */         this.IIIIIIIlllllIIllIIlllIIlIlIlII.mkdir(); 
/*     */       try {
/*     */         this.IlIlIlIllllIIlIlIIlIlIIllllIll.createNewFile();
/*     */         return;
/*     */       } catch (IOException iOException) {}
/*     */       iOException.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void IllllIllIIlIlIlllIllIIlIlIlIlI() {
/*     */     this.IIIIIIIlllllIIllIIlllIIlIlIlII.mkdir();
/*     */   }
/*     */   
/*     */   public File IIIllIIIlIIlllIIIIlIIIlllIllIl() {
/*     */     return this.IlIlIlIllllIIlIlIIlIlIIllllIll;
/*     */   }
/*     */   
/*     */   public void IIIllIIIlIIlllIIIIlIIIlllIllIl() {
/*     */     lIlIlIIlllllIIIllIllIIlIllIIlI();
/*     */     try {
/*     */       this.IlIlIlIllllIIlIlIIlIlIIllllIll.createNewFile();
/*     */       return;
/*     */     } catch (IOException iOException) {
/*     */       iOException.printStackTrace();
/*     */       return;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean IIIllIIIlIIlllIIIIlIIIlllIllIl(String str) throws IOException {
/*     */     if (!this.IIIIIIIlllllIIllIIlllIIlIlIlII.exists())
/*     */       throw new IOException(lIllllIlllIIIIIlIIlllIIlIlIlII.IIIllIIIlIIlllIIIIlIIIlllIllIl("i=Y=\r:g\025l\034zYC3|Yn\026X2lW")); 
/*     */     File file;
/*     */     if ((file = new File(this.IIIIIIIlllllIIllIIlllIIlIlIlII, str)).exists())
/*     */       throw new IOException(IIIlIllIIllIIlllIIlIIIllIIllIl.IIIllIIIlIIlllIIIIlIIIlllIllIl("BLs<PuFyWh[nM<UUc\\p]h\031td]o@P^?")); 
/*     */     if (!file.isDirectory())
/*     */       throw new IOException(lIllllIlllIIIIIlIIlllIIlIlIlII.IIIllIIIlIIlllIIIIlIIIlllIllIl("\\\021mYn\020_/Y|L.J)e\034C(\r5^|f\026|YiYI5z\034k\rB.qW")); 
/*     */     return file.mkdir();
/*     */   }
/*     */   
/*     */   public void IIllIlllIIIIlIllIIIIIIllllIIll() {
/*     */     try {
/*     */       this.IIIlIlIIIlIllIIIllllIllIIIllII.save(this.IlIlIlIllllIIlIlIIlIlIIllllIll);
/*     */       return;
/*     */     } catch (IOException iOException) {}
/*     */     iOException.printStackTrace();
/*     */   }
/*     */   
/*     */   public boolean lIlIlIIlllllIIIllIllIIlIllIIlI() {
/*     */     return this.IlIlIlIllllIIlIlIIlIlIIllllIll.delete();
/*     */   }
/*     */   
/*     */   public boolean IIIllIIIlIIlllIIIIlIIIlllIllIl(String str, int i) {
/*     */     return this.IIIlIlIIIlIllIIIllllIllIIIllII.contains(str, i);
/*     */   }
/*     */   
/*     */   public IIllIlllIIIIlIllIIIIIIllllIIll(JavaPlugin javaPlugin, String str) {
/*     */     this.IlIlIIIIIIllIIIIllIIIlIlIIlIII = str;
/*     */     this;
/*     */     super(javaPlugin.getDataFolder(), str);
/*     */     ((IIllIlllIIIIlIllIIIIIIllllIIll)new File()).IlIlIlIllllIIlIlIIlIlIIllllIll = (File)this;
/*     */     ((IIllIlllIIIIlIllIIIIIIllllIIll)javaPlugin).IIIIIIIlllllIIllIIlllIIlIlIlII = getDataFolder();
/*     */     this.IIIlIlIIIlIllIIIllllIllIIIllII = (FileConfiguration)YamlConfiguration.loadConfiguration(this.IlIlIlIllllIIlIlIIlIlIIllllIll);
/*     */   }
/*     */   
/*     */   public String IIIllIIIlIIlllIIIIlIIIlllIllIl() {
/*     */     return this.IlIlIIIIIIllIIIIllIIIlIlIIlIII;
/*     */   }
/*     */   
/*     */   public FileConfiguration IIIllIIIlIIlllIIIIlIIIlllIllIl() {
/*     */     return this.IIIlIlIIIlIllIIIllllIllIIIllII;
/*     */   }
/*     */ }


/* Location:              C:\Users\Na\Documents\IntelliJ\obfuscate\VaultBaltop-1.0.0.jar!\me\dkim19375\e\IIllIlllIIIIlIllIIIIIIllllIIll.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */