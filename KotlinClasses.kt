
/*
    classes in Kotlin. First define the object...say student; a student will have a couple of properties such as:
    name
    email
    id
    courses
    grades
    program
    cameraIsOn
 */
 class Student(
    /*this is where a constructor goes to */
    name: String, 
    id: Int,
    program: String,
    cameraIsOn: Boolean = false,
    courses: MutableList<String> = mutableListOf(),
    grades: MutableList<Float> = mutableListOf()
 ){
     private var name = name
     private var id = id
     private var program = program
     private var cameraIsOn = cameraIsOn
     private var courses = courses
     private var grades = grades
     var email: String
     var stringID: String

    init{
        stringID = "A00" + id
        email = stringID + "@mycambrian.ca"
    }
    //secondary constructor connecting to the primary constructor using "this"
    constructor(
        name: String,
        id: Int,
        program: String,
        cameraIsOn: Boolean,
        courses: MutableList<String>,
        grades: MutableList<Float>,
        email: String,
        stringID: String
    ) : this(name, id, program, cameraIsOn, courses, grades){
        this.email = email
        this.stringID = stringID
    }
    fun getName(): String = this.name
    fun getID(): String = this.stringID
    fun getProgram(): String = this.program
    fun getIsCameraOne(): Boolean = this.cameraIsOn
    fun getCourses(): MutableList<String>{
        return courses
    }
    fun getStringifiedID(): String = "A00" + id
    fun setGrade(course: String, value: Float){
        if(value <= 100 && value >= 0){
            val index = courses.indexOf(course)
            this.grades[index] = value
        }
    }
 }