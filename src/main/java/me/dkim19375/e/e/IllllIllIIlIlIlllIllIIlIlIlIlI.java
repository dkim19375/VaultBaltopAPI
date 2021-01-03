/*     */ package me.dkim19375.e.e;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.net.URL;
/*     */ import java.util.Scanner;
/*     */ import me.dkim19375.e.lIllllIlllIIIIIlIIlllIIlIlIlII;
/*     */ import org.bukkit.plugin.java.JavaPlugin;
/*     */ import org.bukkit.util.Consumer;
/*     */ 
/*     */ public class IllllIllIIlIlIlllIllIIlIlIlIlI {
/*     */   public IllllIllIIlIlIlllIllIIlIlIlIlI(String str, JavaPlugin javaPlugin) {
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
/*  23 */       .IIIIIIIlllllIIllIIlllIIlIlIlII = str;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 193 */     this.IlIlIlIllllIIlIlIIlIlIIllllIll = null;
/*     */     this.IlIlIIIIIIllIIIIllIIIlIlIIlIII = javaPlugin;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final String IIIIIIIlllllIIllIIlllIIlIlIlII;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final URL IlIlIlIllllIIlIlIIlIlIIllllIll;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final JavaPlugin IlIlIIIIIIllIIIIllIIIlIlIIlIII;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void IIIllIIIlIIlllIIIIlIIIlllIllIl(Consumer consumer, Consumer<IOException> consumer1) {
/*     */     lIllllIlllIIIIIlIIlllIIlIlIlII.IIIllIIIlIIlllIIIIlIIIlllIllIl(jsonObject -> {
/*     */           String str = jsonObject.get(lIllllIlllIIIIIlIIlllIIlIlIlII.IIIllIIIlIIlllIIIIlIIIlllIllIl("|\030o&C=e\034")).getAsString();
/*     */           a.accept(str);
/*     */         }consumer1, this.IlIlIlIllllIIlIlIIlIlIIllllIll, this.IlIlIIIIIIllIIIIllIIIlIlIIlIII);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IllllIllIIlIlIlllIllIIlIlIlIlI(String str, URL uRL, JavaPlugin javaPlugin) {
/* 241 */     this.IIIIIIIlllllIIllIIlllIIlIlIlII = str;
/*     */     this.IlIlIlIllllIIlIlIIlIlIIllllIll = uRL;
/*     */     this.IlIlIIIIIIllIIIIllIIIlIlIIlIII = javaPlugin; } public void lIIIIIIIIlIIIIlIllIlllIlIIIIIl(Consumer consumer1, Consumer consumer2) {
/* 244 */     Bukkit.getScheduler().runTaskAsynchronously((Plugin)this.IlIlIIIIIIllIIIIllIIIlIlIIlIII, () -> {
/*     */           try {
/*     */             InputStream inputStream = this.IlIlIlIllllIIlIlIIlIlIIllllIll.openStream();
/*     */             Throwable throwable = null;
/*     */             try {
/*     */               Scanner scanner = new Scanner(inputStream);
/*     */               Throwable throwable1 = null;
/*     */               try {
/*     */                 if (scanner.hasNext())
/*     */                   consumer1.accept(scanner.next()); 
/*     */               } catch (Throwable throwable2) {
/*     */                 throw throwable1 = throwable2;
/*     */               } finally {
/*     */                 Exception exception = null;
/*     */               } 
/*     */             } catch (Throwable throwable1) {
/*     */               throw throwable = throwable1;
/*     */             } finally {
/*     */               Exception exception = null;
/*     */             } 
/*     */           } catch (IOException iOException) {
/*     */             consumer2.accept(iOException);
/*     */           } 
/*     */         });
/*     */   }
/*     */   
/*     */   public IllllIllIIlIlIlllIllIIlIlIlIlI(URL uRL, JavaPlugin javaPlugin) {
/*     */     this.IIIIIIIlllllIIllIIlllIIlIlIlII = null;
/*     */     this.IlIlIlIllllIIlIlIIlIlIIllllIll = uRL;
/*     */     this.IlIlIIIIIIllIIIIllIIIlIlIIlIII = javaPlugin;
/*     */   }
/*     */   
/*     */   public void lIlIlIIlllllIIIllIllIIlIllIIlI(Consumer consumer1, Consumer consumer2) {
/*     */     Bukkit.getScheduler().runTaskAsynchronously((Plugin)this.IlIlIIIIIIllIIIIllIIIlIlIIlIII, () -> {
/*     */           try {
/*     */             InputStream inputStream = (new URL((new StringBuilder()).insert(0, IIIlIllIIllIIlllIIlIIIllIIllIl.IIIllIIIlIIlllIIIIlIIIlllIllIl("QehDJ+\026>}Du\032JauSVeqW\027~Kv\026}ySXr@>iDxUMt2DQa#F\\bsAKry\t")).append(this.IIIIIIIlllllIIllIIlllIIlIlIlII).toString())).openStream();
/*     */             Throwable throwable = null;
/*     */             try {
/*     */               Scanner scanner = new Scanner(inputStream);
/*     */               Throwable throwable1 = null;
/*     */               try {
/*     */                 if (scanner.hasNext())
/*     */                   consumer1.accept(scanner.next()); 
/*     */               } catch (Throwable throwable2) {
/*     */                 throw throwable1 = throwable2;
/*     */               } finally {
/*     */                 Exception exception = null;
/*     */               } 
/*     */             } catch (Throwable throwable1) {
/*     */               throw throwable = throwable1;
/*     */             } finally {
/*     */               Exception exception = null;
/*     */             } 
/*     */           } catch (IOException iOException) {
/*     */             consumer2.accept(iOException);
/*     */           } 
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Na\Documents\IntelliJ\obfuscate\VaultBaltop-1.0.0.jar!\me\dkim19375\e\e\IllllIllIIlIlIlllIllIIlIlIlIlI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */