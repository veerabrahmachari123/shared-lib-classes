def call(Map config[:]){
    def appName=config.get('appName','demo-app')
    def port=config.get('port',3000)
    def environment=config.get('environment','dev')

    echo 'Starting the App...'
    
    echo "APP Name:${appName}"
    echo "Port:${port}"
    echo "Environment:${environment}"

    echo "Deployment Completed...."
}