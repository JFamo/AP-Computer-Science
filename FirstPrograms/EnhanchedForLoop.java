public class EnhanchedForLoop {
    public static void main(String args[]){
        
       //vars
       int[] numbers = {100, -50, 1000, 25000, 1000000, -550, 10000000, -50000, -10, 754125, -1, -250000, -1000000, -50, 0};
       
       //mean
       double mean = 0;
       for(int num : numbers){
           mean += num;
       }
       mean = mean / numbers.length;
       
       //median
       double median = ((numbers[7] + numbers[8])/2);
       
       //mode
       int maxoccurences = 0;
       int maxnum = numbers[0];
       for(int num : numbers){
           int occurences = 0;
           for(int num2 : numbers){
               if(num2 == num){
                   occurences++;
                }
           }
           if(occurences > maxoccurences){
               maxnum = num;
               maxoccurences = occurences;
            }
       }
       
       //standard deviation
       double sum = 0;
       for(int num : numbers){
           sum += Math.pow((num-mean),2);
       }
       sum = sum / (numbers.length - 1);
       
       //loop
       for(int num : numbers){
           System.out.print(num + " ");
       }
       
       System.out.println("\nMean : " + mean);
       System.out.println("Median : " + median);
       System.out.println("Mode : " + maxnum);
       System.out.println("Std. Dev : " + sum);
       
    }
}