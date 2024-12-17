```groovy
def myMethod(List<String> list) {
  list.each { item ->
    println item.toUpperCase()
  }
}

myMethod(null)