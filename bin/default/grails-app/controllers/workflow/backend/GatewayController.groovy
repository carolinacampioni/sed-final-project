package workflow.backend

import grails.rest.*
import grails.converters.*
import static org.springframework.http.HttpStatus.*

class GatewayController  {
    static allowedMethods = [
        create:           'GET',
        option_create:    'GET'
    ]
    
    static responseFormats = ['json', 'xml']

    def create() {
        def retorno     = [:]
        retorno.code    = "1"
        retorno.message = "Hello World"
        render retorno as JSON
    }
    def option_create() {
        def retorno     = [:]
        retorno.code    = "1"
        retorno.message = "Hello World"
        render retorno as JSON
    }
}
