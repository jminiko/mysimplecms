package simplecms

class RoleUser {
    
    Date dateCreated
    String lastname
    String firstname
    String password
    String email
    static hasMany = [pages:Page]
    static constraints = {
    }
}
