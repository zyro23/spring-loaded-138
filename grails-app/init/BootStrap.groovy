import javax.money.Monetary

class BootStrap {

    def init = { servletContext ->
		println System.properties.foo
		println System.properties.springloaded
		Monetary.getCurrency("USD");
    }
    def destroy = {
    }
}
