import java.util.*;

public class CarteDeCredit {




    public static void main(String[] args){
        System.out.println("\nPROJET FINAL JAVA ");
        System.out.println("Realiser par : Exhorte MBOUMBA & Astou DIEME ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\t\t CONNEXION A VOTRE ESPACE CLIENT ");
        System.out.println("\t\t ---------------------------------");
        System.out.println("\t\t veuillez remplir les champs si-dessous:\n");
        double[] donneeUtilisateur = recupererDonneeUtilisateur();

        int numeroCompte = (int) donneeUtilisateur[0];
        double soldeDebut = donneeUtilisateur[1];
        double totalCharges = donneeUtilisateur[2];
        double totalPaiement = donneeUtilisateur[3];
        double limitecredit = donneeUtilisateur[4];

        double nouveauSolde = nouveauSolde(soldeDebut, totalCharges, totalPaiement);

        System.out.println("\n\t\t INFORMATION COMPTE CLIENT ");
        System.out.println("\t\t ----------------------------\n");
        affichageInformations(numeroCompte, nouveauSolde, limitecredit);
    }

    public static void affichageInformations(int numeroCompte, double nouveauSolde, double limiteCredit){

        System.out.println("Numero de compte : " + numeroCompte);
        System.out.println("Nouveau solde : " + nouveauSolde);
        if(nouveauSolde > limiteCredit){
        System.out.print("limite de credit depassee! ");
        }
    }

    public static double nouveauSolde(double soldeDebut, double totalCharges, double totalPaiements){
        return soldeDebut + totalCharges - totalPaiements;
    }

    public static double[] recupererDonneeUtilisateur(){
        Scanner sc = new Scanner(System.in);
        double[] donnees = new double[5];

        System.out.print("Numero de compte : ");
        donnees[0] = sc.nextInt();

        System.out.print("Solde Debut du mois : ");
        donnees[1] = sc.nextDouble();

        System.out.print("Total des charges : ");
        donnees[2] = sc.nextDouble();

        System.out.print("Total des paiements : ");
        donnees[3] = sc.nextDouble();

        System.out.print("Limites de credit : ");
        donnees[4] = sc.nextDouble();

        sc.close();
        return donnees;
    }
}
