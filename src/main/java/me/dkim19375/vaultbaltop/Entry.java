/*    */ package me.dkim19375.vaultbaltop;
/*    */ 
/*    */ import java.util.Map;
/*    */ 
/*    */ public final class Entry<K, V> implements Map.Entry<K, V> {
/*    */   private K key;
/*    */   private V value;
/*    */   
/*    */   public Entry(K key, V value) {
/* 10 */     this.key = key;
/* 11 */     this.value = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public K getKey() {
/* 16 */     return this.key;
/*    */   }
/*    */ 
/*    */   
/*    */   public V getValue() {
/* 21 */     return this.value;
/*    */   }
/*    */   
/*    */   public K setKey(K key) {
/* 25 */     K old = this.key;
/* 26 */     this.key = key;
/* 27 */     return old;
/*    */   }
/*    */ 
/*    */   
/*    */   public V setValue(V value) {
/* 32 */     V old = this.value;
/* 33 */     this.value = value;
/* 34 */     return old;
/*    */   }
/*    */   
/*    */   public Entry<K, V> setValues(K key, V value) {
/* 38 */     Entry<K, V> e = new Entry(this.key, this.value);
/* 39 */     this.key = key;
/* 40 */     this.value = value;
/* 41 */     return e;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 46 */     return (new StringBuilder()).append(this.key).append("=").append(this.value).toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\Na\Documents\IntelliJ\obfuscate\VaultBaltop-1.0.0.jar!\me\dkim19375\vaultbaltop\Entry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */