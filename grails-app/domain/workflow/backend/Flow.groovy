package workflow.backend

class Flow {

    String name
    String age
    String sex 
    String favoriteColour   

    static mapping = {
        table        'pessoaFisica'
        version      false
        
        name                 column: 'tb_name'
        age                  column: 'tb_age'
        sex                  column: 'tb_sex'
        favoriteColour       column: 'tb_favoriteColour'

        //id generator:'sequence', params:[sequence:'SEQ_AFFILIATE']
        id column: 'id', generator: 'increment'
    }

    static constraints = {
       

    }
}
