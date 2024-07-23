public abstract class Contacts {
    
    private String type;
    private String description;
    Contacts(String type,String description){
        this.setDescription(description);
        this.setType(type);
    }
    protected String getType(){
        return this.type;
    }
    protected String getDescription(){
        return this.description;
    }

    public void setType(String type){
        this.type = type;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public abstract String getPhone();
    public abstract String getPlace();
    public abstract String getEmail();
    

}
