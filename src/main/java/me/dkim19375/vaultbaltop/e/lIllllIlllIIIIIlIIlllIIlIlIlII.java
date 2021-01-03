package me.dkim19375.vaultbaltop.e;

import java.util.LinkedHashMap;
import org.bukkit.OfflinePlayer;

public class lIllllIlllIIIIIlIIlllIIlIlIlII {
  public static LinkedHashMap<OfflinePlayer, Double> IIIllIIIlIIlllIIIIlIIIlllIllIl() {
    // Byte code:
    //   0: invokestatic IIIllIIIlIIlllIIIIlIIIlllIllIl : ()Lnet/milkbowl/vault/economy/Economy;
    //   3: astore_0
    //   4: new java/util/LinkedHashMap
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_1
    //   12: invokestatic getOfflinePlayers : ()[Lorg/bukkit/OfflinePlayer;
    //   15: dup
    //   16: astore_2
    //   17: arraylength
    //   18: istore_3
    //   19: iconst_0
    //   20: iconst_1
    //   21: dup
    //   22: pop2
    //   23: dup
    //   24: istore #4
    //   26: iload_3
    //   27: if_icmpge -> 62
    //   30: aload_2
    //   31: iload #4
    //   33: aaload
    //   34: astore #5
    //   36: aload_1
    //   37: aload_0
    //   38: aload #5
    //   40: dup_x1
    //   41: iinc #4, 1
    //   44: invokeinterface getBalance : (Lorg/bukkit/OfflinePlayer;)D
    //   49: invokestatic valueOf : (D)Ljava/lang/Double;
    //   52: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   55: pop
    //   56: iload #4
    //   58: goto -> 26
    //   61: athrow
    //   62: aload_1
    //   63: invokestatic lIlIlIIlllllIIIllIllIIlIllIIlI : (Ljava/util/Map;)Ljava/util/LinkedHashMap;
    //   66: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #230	-> 0
    //   #145	-> 4
    //   #87	-> 12
    //   #176	-> 36
    //   #87	-> 55
    //   #157	-> 62
  }
}


/* Location:              C:\Users\Na\Documents\IntelliJ\obfuscate\VaultBaltop-1.0.0.jar!\me\dkim19375\vaultbaltop\e\lIllllIlllIIIIIlIIlllIIlIlIlII.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */