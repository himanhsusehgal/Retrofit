
package com.example.retrofit;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FilteredClasses {

    @SerializedName("filtered data")
    @Expose
    private List<FilteredDatum> filteredData = null;

    public List<FilteredDatum> getFilteredData() {
        return filteredData;
    }

    public void setFilteredData(List<FilteredDatum> filteredData) {
        this.filteredData = filteredData;
    }

}
