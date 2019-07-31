
package com.example.retrofit;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FilteredDatum {

    @SerializedName("classes")
    @Expose
    private String classes;
    @SerializedName("subjects")
    @Expose
    private List<String> subjects = null;

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

}
