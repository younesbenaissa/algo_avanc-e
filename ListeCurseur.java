public interface ListeCurseur
 {
/**place le curseur devant le premier �l�ment **/
public void allerAuDebut();

 /** renvoie l'�l�ment juste apr�s le curseur
 Quand il n'y a pas d��l�ment suivant, renvoie null **/
public Object voirSuivant();

 /** avance le curseur d�un �l�ment plus loin
  sauf si on est en fin de liste **/
public void avancer();

 /** ins�re don juste apr�s le curseur
  (en t�te si le curseur est au debut de la liste) **/
public void ajouter(Object don);

 /** Supprime la donn�e en position juste aprés le curseur.
 Supprimer quand le curseur est en fin de liste l�ve une erreur **/
public void supprimer() throws Exception;

/** vrai quand il n'y a pas d��l�ment juste apr�s **/
public boolean estEnFin(); 

}
