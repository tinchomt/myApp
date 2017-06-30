package myapp

def vehicles = Vehicle.list()

println vehicles.size()

def pickup = Vehicle.findByName("Minivan")

println pickup.name
println pickup.make.name
println pickup.model.name

def nissan = Make.findByName("Nissan")

def nissans = Vehicle.findAllByMake(nissan)

println nissans.size()