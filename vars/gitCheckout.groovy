def call(Map stageParams) {

    checkout([
        $class: 'GitSCM',
        branches: [[name:  '*/master' ]],
        userRemoteConfigs: [[ url: 'https://github.com/Rohitkumarr050/backend-coding-test.git' ]]
    ])
  }