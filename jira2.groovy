def response = jiraGetComponent id: 10000
  echo response.successful
  echo response.code
  echo response.error
  echo response.data.toString()

  try {
    jiraGetComponent id: 10000
  } catch (error) {
    echo error
  }
