def newGit(repo)
{
  git "${repo}" 
}

def newMaven()
{
 sh 'mvn package' 
}

def newDeploy(jobname,ip,context)
{
  deploy adapters: [tomcat9(credentialsId: ${jobtname}, path: '', url: ${ip})], contextPath: ${context}, war: '**/*.war' 
}

def runSelenium(jobname)
{
  sh 'java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar' 
}

def newDelivery(jobname,ip,context)
{
  deploy adapters: [tomcat9(credentialsId: ${jobname}, path: '', url: ${ip})], contextPath: ${context}, war: '**/*.war' 
}
