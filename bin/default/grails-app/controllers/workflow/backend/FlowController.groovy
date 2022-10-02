package workflow.backend

import grails.rest.*
import grails.converters.*
import static org.springframework.http.HttpStatus.*

class FlowController  {
    static allowedMethods = [
        create:          'GET'
    ]
    static responseFormats = ['json', 'xml']
        def create() {
            def retorno     = [:]
                retorno.code    = "1"
                retorno.message = "Hello World"
        render retorno as JSON
    }
}
