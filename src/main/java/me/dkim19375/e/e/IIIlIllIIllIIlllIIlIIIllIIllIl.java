/*     */ package me.dkim19375.e.e;
/*     */ 
/*     */ import com.sk89q.worldedit.bukkit.BukkitAdapter;
/*     */ import com.sk89q.worldedit.math.BlockVector3;
/*     */ import com.sk89q.worldedit.util.Location;
/*     */ import com.sk89q.worldedit.world.World;
/*     */ import com.sk89q.worldguard.LocalPlayer;
/*     */ import com.sk89q.worldguard.WorldGuard;
/*     */ import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
/*     */ import com.sk89q.worldguard.protection.ApplicableRegionSet;
/*     */ import com.sk89q.worldguard.protection.flags.StateFlag;
/*     */ import com.sk89q.worldguard.protection.managers.RegionManager;
/*     */ import com.sk89q.worldguard.protection.regions.RegionContainer;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.World;
/*     */ import org.bukkit.entity.Player;
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
/*     */ 
/*     */ 
/*     */ 
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
/*     */ {
/*     */   public static boolean IIIllIIIlIIlllIIIIlIIIlllIllIl(Player a, Location location, StateFlag stateFlag, Consumer consumer) {
/*  67 */     RegionContainer regionContainer = WorldGuard.getInstance().getPlatform().getRegionContainer();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     World world = IIIllIIIlIIlllIIIIlIIIlllIllIl(location.getWorld());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 170 */     RegionManager regionManager = regionContainer.get(world);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 209 */     BlockVector3 blockVector3 = IIIllIIIlIIlllIIIIlIIIlllIllIl(location);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 245 */     if (regionManager == null)
/*     */       consumer.accept(null); 
/*     */     ApplicableRegionSet applicableRegionSet = regionManager.getApplicableRegions(blockVector3);
/*     */     LocalPlayer localPlayer = IIIllIIIlIIlllIIIIlIIIlllIllIl(a);
/*     */     1;
/*     */     true;
/*     */     1;
/*     */     false[1] = stateFlag;
/*     */     return (new StateFlag[1]).testState(true, true);
/*     */   }
/*     */   
/*     */   public static BlockVector3 IIIllIIIlIIlllIIIIlIIIlllIllIl(Location a) {
/*     */     return BlockVector3.at(a.getX(), a.getY(), a.getZ());
/*     */   }
/*     */   
/*     */   public static BlockVector3 IIIllIIIlIIlllIIIIlIIIlllIllIl(Location a) {
/*     */     return BlockVector3.at(a.getX(), a.getY(), a.getZ());
/*     */   }
/*     */   
/*     */   public static boolean IIIllIIIlIIlllIIIIlIIIlllIllIl(Player a, StateFlag stateFlag, Consumer consumer) {
/*     */     RegionContainer regionContainer = WorldGuard.getInstance().getPlatform().getRegionContainer();
/*     */     World world = IIIllIIIlIIlllIIIIlIIIlllIllIl(a.getWorld());
/*     */     RegionManager regionManager = regionContainer.get(world);
/*     */     BlockVector3 blockVector3 = IIIllIIIlIIlllIIIIlIIIlllIllIl(a.getLocation());
/*     */     if (regionManager == null)
/*     */       consumer.accept(null); 
/*     */     ApplicableRegionSet applicableRegionSet = regionManager.getApplicableRegions(blockVector3);
/*     */     LocalPlayer localPlayer = IIIllIIIlIIlllIIIIlIIIlllIllIl(a);
/*     */     1;
/*     */     true;
/*     */     1;
/*     */     false[1] = stateFlag;
/*     */     return (new StateFlag[1]).testState(true, true);
/*     */   }
/*     */   
/*     */   public static World IIIllIIIlIIlllIIIIlIIIlllIllIl(World a) {
/*     */     return BukkitAdapter.adapt(a);
/*     */   }
/*     */   
/*     */   public static LocalPlayer IIIllIIIlIIlllIIIIlIIIlllIllIl(Player a) {
/*     */     return WorldGuardPlugin.inst().wrapPlayer(a);
/*     */   }
/*     */ }


/* Location:              C:\Users\Na\Documents\IntelliJ\obfuscate\VaultBaltop-1.0.0.jar!\me\dkim19375\e\e\IIIlIllIIllIIlllIIlIIIllIIllIl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */