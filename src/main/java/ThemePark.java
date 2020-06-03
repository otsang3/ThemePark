import attractions.Attraction;
import behaviours.IConnect;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private ArrayList<IConnect> attractionsAndStalls;
    private ArrayList<IReviewed> reviewedAttractionsAndStalls;
    private String name;

    public ThemePark(String name){
        this.attractionsAndStalls = new ArrayList<IConnect>();
        this.reviewedAttractionsAndStalls = new ArrayList<IReviewed>();
        this.name = name;
    }


    public void visit(Visitor visitor, Attraction attraction){
        attraction.increaseVisitCount();
        visitor.visitedAttraction(attraction);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<IConnect> getAttractionsAndStalls() {
        return this.attractionsAndStalls;
    }

    public ArrayList<IReviewed> getReviewedAttractionsAndStalls() {
        return this.reviewedAttractionsAndStalls;
    }

    public void addAttraction(IConnect attraction){
        this.attractionsAndStalls.add(attraction);
    }

    public void addReview(IReviewed attraction){
        this.reviewedAttractionsAndStalls.add(attraction);
    }

    public HashMap returnValues(){
        HashMap<String, Integer> allReviews = new HashMap<String, Integer>();
        for (IReviewed iReviewed : this.reviewedAttractionsAndStalls){
            allReviews.put(iReviewed.getName(), iReviewed.getRating());
        }
        return allReviews;
    }

}
