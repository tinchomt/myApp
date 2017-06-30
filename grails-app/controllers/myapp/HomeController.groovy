package myapp

class HomeController {

    def index() {
	respond([name: session.name ?: 'Usuario', vehicleList: Vehicle.list(), vehicleTotal: Vehicle.count()])
  }

   def updateName(String name) {
	log.info "Configuration data source"
        session.name = name 

        flash.message = "Name has been updated" 

        redirect action: 'index' 
    }

}
