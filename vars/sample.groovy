def call(){
def date = sh(script: 'date', returnStdout: true).trim()
echo "Hello Murali, Current date is : ${date}"
sh '''
sudo yum install docker -y
sudo service docker start
docker run -d -p 80:80 myimage --nginx
'''
}
