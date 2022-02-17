public class Arthur extends Knight{

   void attack(Ogre ogre){
        ogre.energy = (int) (ogre.energy * 0.5);
        ogre.revenge(this);
   }
}
