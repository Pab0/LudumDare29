//Each Scene is one level, with its own enemies, background, map etc.
public class Scene {
	
	Enemy[] enemies;
	World lnkWorld;
	
	boolean[][] collisionMap;		//false means no collision, true means collision

}
