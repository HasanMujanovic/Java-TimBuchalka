public class Main {
    public static void main(String[] args) {
       int resenje = getBucketCount(3.4,2.1,1.5,2);
    System.out.println(resenje);
    System.out.println(getBucketCount(3.4,2.1,1.5));
    System.out.println(getBucketCount(3.4,1.5));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if ((width  <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)){
            return -1;
        }
        double bucketToBuy = Math.ceil(((width * height) / areaPerBucket) - extraBuckets);
        int wholeNumber = (int) bucketToBuy;

        return wholeNumber;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)){
            return -1;
        }
        double bucketToBuy = Math.ceil(((width * height) / areaPerBucket));
        int wholeNumber = (int) bucketToBuy;

        return wholeNumber;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if ((area <= 0) || (areaPerBucket <= 0)){
            return -1;
        }
        double bucketToBuy = Math.ceil(area / areaPerBucket);
        int wholeNumber = (int) bucketToBuy;
        return wholeNumber;
    }

}
