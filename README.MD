#  springboot-graphql-sqqr-jwt-demo

GraphQL java backend representing the right way to authenticate/authorize using Spring boot, [graphql-spqr](https://github.com/leangen/graphql-spqr) & jsonwebtoken
the power of [graphql-spqr](https://github.com/leangen/graphql-spqr) java qraphql implementation is amazing
and make things easy to be implemented like spring security using normal jsonwebtoken and simple filter

To secure your mutations and queries you just use spring security annotation "hasRole('ADMIN')" etc..
This repository implemented a simple mutation for login to get your token and queries
The first one has a security annotation (You should be loggedin to use it) the other one is for public

First try to call users query you can call it without being logged in
The other query is user which get one user by providing it's id in the query it's secured
You have to be logged in to be able to call it that's why you should call first signin mutation with username & password
Which are ( username: admin , password: admin ), this will return your token
Next query put this token in your post request header to be able to call the secured query

I'm using potgresql database and the password is encrypted using BCrypt which included in spring security


## Installation

```bash
# Clone this repository
git clone https://github.com/blacktoviche/springboot-graphql-sqqr-jwt-demo
# Go into the repository
cd springboot-graphql-sqqr-jwt-demo
# Install dependencies
mvn install
# Compile the app
mvn compile
# Package the app
mvn package
# Run the app
mvn spring-boot:run
```








## License
- [MIT](LICENSE)

Twitter [@SyrianDeveloper](https://www.twitter.com/SyrianDeveloper)