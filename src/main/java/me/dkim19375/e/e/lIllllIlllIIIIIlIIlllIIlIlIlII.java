/*     */ package me.dkim19375.e.e;
/*     */ 
/*     */ import com.google.common.io.ByteStreams;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParser;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.net.URL;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.plugin.Plugin;
/*     */ import org.bukkit.plugin.java.JavaPlugin;
/*     */ import org.bukkit.util.Consumer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class lIllllIlllIIIIIlIIlllIIlIlIlII
/*     */ {
/*     */   public static void IIIllIIIlIIlllIIIIlIIIlllIllIl(Consumer a, Consumer consumer1, String str, JavaPlugin javaPlugin) {
/*  51 */     Bukkit.getScheduler().runTaskAsynchronously((Plugin)javaPlugin, () -> {
/*     */           String str;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           try {
/*     */             InputStream inputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             byte[] arrayOfByte = ByteStreams.toByteArray(inputStream = (new URL(a)).openStream());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             str = new String(arrayOfByte);
/*  79 */           } catch (IOException iOException) {
/*     */             consumer1.accept(iOException);
/*     */             return;
/*     */           } 
/*     */           JsonParser jsonParser;
/*     */           JsonElement jsonElement;
/*     */           JsonObject jsonObject = (jsonElement = (jsonParser = new JsonParser()).parse(str)).getAsJsonObject();
/*     */           consumer2.accept(jsonObject);
/*     */         });
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void IIIllIIIlIIlllIIIIlIIIlllIllIl(Consumer a, Consumer consumer1, URL uRL, JavaPlugin javaPlugin) {
/* 195 */     Bukkit.getScheduler().runTaskAsynchronously((Plugin)javaPlugin, () -> {
/*     */           String str;
/*     */           try {
/*     */             InputStream inputStream;
/*     */             byte[] arrayOfByte = ByteStreams.toByteArray(inputStream = a.openStream());
/*     */             str = new String(arrayOfByte);
/*     */           } catch (IOException iOException) {
/*     */             consumer1.accept(iOException);
/*     */             return;
/*     */           } 
/*     */           JsonParser jsonParser;
/*     */           JsonElement jsonElement;
/*     */           JsonObject jsonObject = (jsonElement = (jsonParser = new JsonParser()).parse(str)).getAsJsonObject();
/*     */           consumer2.accept(jsonObject);
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Na\Documents\IntelliJ\obfuscate\VaultBaltop-1.0.0.jar!\me\dkim19375\e\e\lIllllIlllIIIIIlIIlllIIlIlIlII.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */