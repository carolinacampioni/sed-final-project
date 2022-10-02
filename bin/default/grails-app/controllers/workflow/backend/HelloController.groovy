package workflow.backend

import grails.rest.*
import grails.converters.*
import static org.springframework.http.HttpStatus.*

class HelloController  {
    static allowedMethods = [
        index:          'GET'
]
    static responseFormats = ['json', 'xml']
        def index() {
            def retorno     = [:]
                retorno.code    = "1"
                retorno.message = "Hello World"
        render retorno as JSON
    }
}
