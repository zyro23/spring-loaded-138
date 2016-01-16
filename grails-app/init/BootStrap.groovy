import javax.money.Monetary

class BootStrap {

    def init = { servletContext ->
		Monetary.getCurrency("USD");
    }
    def destroy = {
    }
}
