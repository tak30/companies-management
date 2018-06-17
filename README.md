# Companies management service
> Example of Spring MVC service

<https://warm-plateau-56435.herokuapp.com/companies>

## Running it locally

```
mvn package
java -jar target/dependency/webapp-runner.jar target/*.war
```

## Usage example

See examples folder

## Devlopment setup

Install Java 8 and Maven.

## Release History

* 0.0.1
    * First version with minor bugs

## Meta

Distributed under the MIT license.

[https://github.com/tak30](https://github.com/tak30)

## Contributing

1. Fork it (<https://github.com/tak30/companies-management/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

## TODO
1. Unit testing
2. Integration testing
3. Add delete operation
4. Fix bugs regarding required attributes
5. Fix bug: When executing a put with an empty list of BeneficialOwners the list get's overriden.


## Future work
1. Add authentication: I would suggest _hmac_ as this is a little service out of an organization. 
If the service would be part of a big environment then I would suggest ussing _oAuth_ to delegate the authentication 
to a trusted service.
2. Make the service redundant: Implement a DB based repository, put a load balancer and deploy more instances.

