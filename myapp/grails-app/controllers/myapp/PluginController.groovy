package myapp

class PluginController {

    def index() {
        render(view: "/hello/hello", plugin: 'myplugin')
    }

    def mail() {
        render(template:"/mail/email", plugin: 'myplugin')
    }
}
