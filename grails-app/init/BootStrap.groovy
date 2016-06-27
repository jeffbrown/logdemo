class BootStrap {

    def init = { servletContext ->
        log.info 'This is an INFO message'
        log.error 'This is an ERROR message'
        log.warn 'This is a WARN message'
    }
    def destroy = {
    }
}
