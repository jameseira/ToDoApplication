package com.b1115817.todolistapplication;

/**
 *
 * @author james
 */
public class ToDo {
    private String title;
    private String description;
    private boolean complete;
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String t){
        title = t;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    
}
