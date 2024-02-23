pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello, world'
            }
        }
        stage('Тестирование') {
            steps {
                echo 'Переносим код в рабочую среду или создаем артефакт'
            }
        }
        stage('Развертывание') {
            steps {
                     script {
                    def test = 2 + 2 > 3 ? 'hopefully' : 'unlikely'
                    echo test
                }
            }
        }
    }
}