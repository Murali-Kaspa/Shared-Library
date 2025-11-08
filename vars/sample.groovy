def call(){
def date = sh(script: 'date', returnStdout: true).trim()
echo "Hello Murali, Current date is : ${date}"
echo "sudo yum install docker -y"
echo "sudo service docker start"
'''
}
