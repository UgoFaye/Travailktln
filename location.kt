class location {
    var nom=""
    var categorie = "x"
    var nbrKmParcourus = 0
    var nbJoursLocation = 0

    constructor()
    constructor(nom : String, categorie : Char, nbKmParcourus : Int, nbJoursLocation : Int) {
        this.nom = nom
        this.categorie = categorie
        this.nbrKmParcourus = nbrKmParcourus
        this.nbJoursLocation = nbJoursLocation
    }

}