package simplecms.admin

class AdminController {

    def index() {
        def page = simplecms.Page.first()
        render(view:"index",model:[page:page]) 
    }
    def save( ){
        def page = simplecms.Page.get(params.mid)
        println page
        page.content = params.content 
        page.save(flush:true)
        redirect(action:"index",controller:"content")
    }
}
