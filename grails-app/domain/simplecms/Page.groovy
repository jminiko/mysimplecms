package simplecms

class Page {
    String content
    String id
    Date createdDate
    Date modifiedDate
    static belongsTo=[createdByUser:RoleUser ]
    static mapping = {
        content type: 'text'
    }
}
