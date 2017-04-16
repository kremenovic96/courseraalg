import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ranko on 14.4.17..
 */
public class BruteCollinearPoints {
    private LineSegment[] segments;

    public BruteCollinearPoints(Point[] points){
        ArrayList<LineSegment> sgmnts = new ArrayList<>();
        Point[] pointsCopy = Arrays.copyOf(points, points.length);
        for (int i = 0; i < pointsCopy.length-3;i++){
            for(int j = i+1; j<pointsCopy.length-2;j++){
                for (int k = j+1; k < pointsCopy.length-1;k++){
                    for (int l = k+1;l<pointsCopy.length;l++){
                        if(pointsCopy[i].slopeTo(pointsCopy[j]) == pointsCopy[i].slopeTo(pointsCopy[k]) && pointsCopy[i].slopeTo(pointsCopy[j]) == pointsCopy[i].slopeTo(pointsCopy[l]))
                        {
                            sgmnts.add(new LineSegment(pointsCopy[i], pointsCopy[l]));
                        }
                    }
                }
            }
        }
        segments = sgmnts.toArray(new LineSegment[sgmnts.size()]);
    }
    public int numberOfSegments(){return segments.length;}
    public LineSegment[] segments(){return Arrays.copyOf(segments, numberOfSegments());}

}
