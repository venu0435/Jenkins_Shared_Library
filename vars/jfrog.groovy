def call()
{
  sh "curl -X PUT -u admin:Aravind@111 -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://13.233.136.69:8082/artifactory/libs-snapshot/"
}
