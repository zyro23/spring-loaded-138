import javax.money.Monetary

class BootStrap {

    def init = { servletContext ->
		println Monetary.getCurrency("USD");
    }
    def destroy = {
    }
}
