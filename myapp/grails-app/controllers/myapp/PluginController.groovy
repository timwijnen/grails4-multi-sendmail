package myapp

import myplugin.EmailService

class PluginController {

    EmailService emailService

    def index() {
        render(view: "/hello/hello")
    }

    def mail() {
        emailService.sendEmail()
    }
}
