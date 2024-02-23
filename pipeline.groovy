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
                echo 'Переносим код в рабочую среду или создаем артефакт'
            }
        }
    }
}