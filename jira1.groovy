def issue = [fields: [ project: [key: 'TESTPRO'],
                       summary: 'New JIRA Created from Jenkins.',
                       description: 'New JIRA Created from Jenkins.',
                       issuetype: [name: 'Task']]]
def newIssue = jiraNewIssue issue: issue, site: 'YOURJIRASITE'
echo newIssue.data.key
