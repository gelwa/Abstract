package exercises._2;

public abstract class Member {
    
    static int membercount;
    static int profcount;
    static int studentcount;
    static int tutorcount;
    static int bachelorcount;
    static int mastercount;
    
    public String firstName;
    public String lastName;
    public int id;
    public int age;
    
    public String role;
    
    public String degree;
    
    public int day;
    public int month;
    public int year;
    
    public int getMember() {
        return membercount;
    }
    
    public int getProf() {
        return profcount;
    }
    
    public int getStudent() {
        return studentcount;
    }
    
    public int getTutor() {
        return studentcount;
    }
    
    public int getB() {
        return bachelorcount;
    }
    
     public int getM() {
        return mastercount;
    }
     
    public void count() {
        System.out.println("===Member Statistics===");
        System.out.println("Members: " + getMember());
        System.out.println("Professors: " + getProf());
        System.out.println("Students: " + getStudent());
        System.out.println("Tutors: " + getTutor());
        System.out.println("Members with Bachelor degree: " + getB());
        System.out.println("Members with Master degree: " + getM());
    }
    
    public void setMember(String _firstName, String _lastName, int _id, int _age, int _entryday, int _entrymonth, int _entryyear) {
        firstName = _firstName;
        lastName = _lastName;
        id = _id;
        age = _age;
        day = _entryday;
        month = _entrymonth;
        year = _entryyear;
    }
    
    
    public void setDegree(String _degree) {
        switch (_degree) {
            case "no":
                degree = "no Degree";
                break;
            case "Bachelor":
                degree = "Bachelor Degree";
                bachelorcount++;
                break;
            case "Master":
                degree = "Master Degree";
                mastercount++;
                break;
            default:
                degree = "Degree unknown";
        }
    }
    
    public void setEntry(int _day, int _month, int _year) {
        day = _day;
        month = _month;
        year = _year;
    }
    
    public String getFirst() {
        return firstName;
    }
    
    public String getLast() {
        return lastName;
    }
    
    public int getId() {
        return id;
    }
    
    public int getAge() {
        return age;
    }
          
    public String getRole() {
        return role;
    }
    
    public String getDegree() {
        return degree;
    }
    
    public int getDay() {
        return day;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getYear() {
        return year;
    }
    
    public void getEntry() {
        System.out.format("%02d.%02d.%02d", day, month, year);
    }
    
    
    public void info() {
        System.out.println("ID " + getId() + ":\t" + getFirst() + " " + getLast() + ", " + getAge() + ", " + getRole() + ", " + getDegree() + ", Date of Entry: " + getDay() + "/" + getMonth() + "/" + getYear());
    }
    
}


