package myplugin

class EmailService {

    def mailService
    def grailsApplication

    def sendEmail() {
        mailService.sendMail {
            to grailsApplication.config.getProperty('email.to')
            from grailsApplication.config.getProperty('email.from')
            subject 'Test email'
            html view: '/mail/email'
        }
    }
}
