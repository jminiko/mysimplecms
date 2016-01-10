class BootStrap {

    def init = { servletContext ->
        if(simplecms.Page.count == 0){
            def user = new simplecms.RoleUser()
            user.dateCreated = new Date()
            user.firstname  ="Jim"
            user.lastname = "INIKO"
            user.email = "jean-marc@iniko.info"
            user.password="test123"
            def p = new simplecms.Page()
            def content = '''
                mon contenu<br><a href="http://grails.io">GRAILS.IO</a>
                <cite>Jean-Marc INIKO</cite>
               '''
            p.content = content.encodeAsHTML()
            p.id=1
            p.createdDate = new Date()
            p.modifiedDate = new Date()
            p.createdByUser = user.save(flush:true)
            p.save(flush:true)
            println p.errors
        }  
    }
    def destroy = {
    }
}
