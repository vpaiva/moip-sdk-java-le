package br.com.moip.resource;

public class IdentityDocument {
    
    private Type type;
    private String number;
    private String issuer;
    private ApiDate issueDate;
    
    public String getNumber() {
        return this.number;
    }
    
    public String getIssuer() {
        return this.issuer;
    }
    
    public ApiDate getIssueDate() {
        return this.issueDate;
    }
    
    public Type getType() {
        return this.type;
    }
    
    public enum Type {
        RG
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IdentityDocument{");
        sb.append("type='").append(this.type).append('\'');
        sb.append(", number='").append(this.number).append('\'');
        sb.append("}");
        return sb.toString();
    }
}
