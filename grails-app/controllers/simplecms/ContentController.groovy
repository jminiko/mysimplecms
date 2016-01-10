package simplecms

class ContentController {
    
    def index() { 
    
        def page_model = simplecms.Page.first()
        render(view:"index.gsp",model:[content:page_model.content.decodeHTML()],layout : null)
    }
}
