public class Task {
    private int id;
    private String taskTitle;
    private String taskStatus;

    public Task(int id, String title, String status){
        this.id = id;
        this.taskStatus = status;
        this.taskTitle = title;


    }
    public String getName(){
        return this.taskTitle;
    }
    public String getStatus(){
        return this.taskStatus;
    }
    public int getId(){
        return this.id;
    }
    public void setStatus(String status){
        this.taskStatus = status;
    }







}