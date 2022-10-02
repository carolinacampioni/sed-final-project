package workflow

class UrlMappings {

    static mappings = {
        delete "/$controller/$id(.$format)?"(action:"delete")
        get "/$controller(.$format)?"(action:"index")
        get "/$controller/$id(.$format)?"(action:"show")
        post "/$controller(.$format)?"(action:"save")
        put "/$controller/$id(.$format)?"(action:"update")
        patch "/$controller/$id(.$format)?"(action:"patch")

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')

        get "/api/v1/hello/index"                           (controller: "hello", action:"index")
        
        //Componentes do módulo de gestão documentos
        get "/api/bpm/document/option/create"               (controller: "hello", action:"index")
        get "/api/bpm/document/option/alteration"           (controller: "hello", action:"index")
        get "/api/bpm/document/option/delete"               (controller: "hello", action:"index")
        get "/api/bpm/document/option/listing"              (controller: "hello", action:"index")
        get "/api/bpm/document/option/creation"             (controller: "hello", action:"index")
        get "/api/bpm/document/option/association"          (controller: "hello", action:"index")
        get "/api/bpm/document/option/search"               (controller: "hello", action:"index")
        get "/api/bpm/document/option/upload"               (controller: "hello", action:"index")
        get "/api/bpm/document/option/download"             (controller: "hello", action:"index")
        get "/api/bpm/document/option/recording"            (controller: "hello", action:"index")

        //workflow
        get "/api/bpm/flow/create"                          (controller: "flow",      action:"create")
        get "/api/bpm/activity/create"                      (controller: "activity",  action:"create")
        get "/api/bpm/activity/first/create"                (controller: "activity",  action:"first_create")
        get "/api/bpm/hierarchy/create"                     (controller: "hierarchy", action:"create")
        get "/api/bpm/gateway/create"                       (controller: "gateway",   action:"create")
        get "/api/bpm/gateway/option/create"                (controller: "gateway",   action:"option_create")

        get "/api/bpm/looping/create"                       (controller: "hello", action:"index")

        get "/api/bpm/actor/create"                         (controller: "hello", action:"index")
        get "/api/bpm/actor/member/create"                  (controller: "hello", action:"index")
       
    }
}
