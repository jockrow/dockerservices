at root project run:

./mvnw clean package

cd DockerFiles/mysql
docker build --build-arg -t mysql/mysql-server

cd DockerFiles/application
docker build -t spring_boot_docker .

docker pull mysql/mysql-server
docker run --name=mysql1 -d mysql/mysql-server

docker run -d -p 8080:8080 spring_boot_docker