package trickyTopics;

class ThisKeywordExample {
	//this refers to current class object
	//super refers to parent class object
	//both can't be used together
	//both should be first statement wherever used
    
    private int x;

    public void setX(int x) {
        //x=x;
        this.x = x; // "this" refers to the instance variable x
    }
    
        public int getX() {
        return x;
    }

        public void caller()
        {
            this.setX(5);
            System.out.println("value of x is: "+this.getX());
        }
    public static void main(String[] args) {
         ThisKeywordExample th = new ThisKeywordExample();
         th.caller();
         //or
         th.setX(5);
         System.out.println("value of x is: "+th.getX());
    }
}