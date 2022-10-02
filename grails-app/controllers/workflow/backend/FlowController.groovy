package workflow.backend

import grails.rest.*
import grails.converters.*
import static org.springframework.http.HttpStatus.*

import workflow.backend.Flow

class FlowController  {
    
    static allowedMethods = [
        create:          'POST',
        delete:          'POST'
    ]
    
    static responseFormats = ['json', 'xml']
    
    def create() {

        def flow

        if (request?.JSON?.name){
            flow = Flow.findByName(request?.JSON?.name)    
            if (!flow)
            {
                flow = new Flow()
                flow.name               = request?.JSON?.name
                flow.age                = request?.JSON?.age
                flow.sex                = request?.JSON?.sex
                flow.favoriteColour     = request?.JSON?.favoriteColour  
                flow.save flush: true
            } else {
                flow = [:]
                flow.status  = "Erro"
                flow.message = "Registro ja existente"
            }

        }else{
            flow = [:]
            flow.status  = "Erro"
            flow.message = "Registro nao preenchido"
        }

            render flow as JSON
    }

    def delete() {
            
        def flow = Flow.findByName(request?.JSON?.name)    
        if (flow) {
            flow.delete flush: true
            flow = [:]
            flow.status  = "Sucesso"
            flow.message = "Registro excluido"
        } else {
            flow = [:]
            flow.status  = "Erro"
            flow.message = "Registro não encontrado"
        }

        render flow as JSON
    }
}
