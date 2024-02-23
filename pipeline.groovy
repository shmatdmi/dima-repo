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
            }
        }
        stage('Развертывание') {
            steps {
                echo 'Переносим код в рабочую среду или создаем артефакт'
            }
        }
    }
}