package myapp

class PluginController {

    def index() {
        render(view: "/plugin/plugin", plugin: 'myplugin')
    }

    def mail() {
        render(template:"/mail/email", plugin: 'myplugin')
    }
}
