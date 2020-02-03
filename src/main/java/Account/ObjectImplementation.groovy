package Account
def object=new FirstGroovyClass()
object.methodOne()

def objectone=new FirstGroovyClass(name:'only one para')
println objectone.getName()

def objectTwo=new FirstGroovyClass(name:'FirstGroovyClass',place:'CreateObject')
println objectTwo.getName()
println objectTwo.getPlace()
objectTwo.setName("second name by set")
println objectTwo.getName()