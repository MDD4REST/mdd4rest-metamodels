<h1 align="center">
  <br>
  <a href="https://github.com/IcelyFramework/icely-metamodels"><img src="docs/north-star.png" alt="Icely Metamodels" width="200"></a>
  <br>
  Icely Metamodels
  <br>
</h1>

<h4 align="center">EMF Metamodels are used by the icely-framework generator</h4>

<p align="center">
  <img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/IcelyFramework/icely-metamodels">
  <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/IcelyFramework/icely-metamodels">
  <img alt="GitHub" src="https://img.shields.io/github/license/IcelyFramework/icely-metamodels">
  <img alt="GitHub Repo stars" src="https://img.shields.io/github/stars/IcelyFramework/icely-metamodels?style=social">
</p>

<p align="center">
  <a href="#about">About</a> •
  <a href="#user-content--key-features">Key Features</a> •
  <a href="#user-content--how-to-use">How To Use</a> •
  <a href="#user-content--roadmap">Roadmap</a> •
  <a href="#user-content--contributing">Contributing</a> •
  <a href="#license">License</a>
</p>

[comment]: <> (![screenshot]&#40;docs/screenshot.png&#41;)

## About
List of metamodels:
- CIM: 
  - [Activity Storming](https://github.com/IcelyFramework/icely-activity-storming)
- PIM:
  - Dynamic & Security View
  - Static View
- PSM:
  - Abstract PSM:
    - Service
    - Deployment
    - Configuration
  - Generator PSM:
    - JDL
    - [OpenAPI](https://github.com/opendata-for-all/openapi-metamodel)
    - [Sculptor](https://github.com/sculptor/sculptor)
    
## ✨ Key Features

## 🚀 How To Use

### Using Update Site
You can use the update site through the `Help->Install new software` menu in Eclipse to install Icely Metamodels from:  
[https://icelyframework.github.io/icely-metamodels/updates/](https://icelyframework.github.io/icely-metamodels/updates/)

### Using Standalone as Package
To use Icely Metamodels as standlone package, JARs are available from Github Packages.

Example using Maven:
```xml
<dependencies>
  ...
    <dependency>
        <groupId>com.github.icelyframework.metamodels</groupId>
        <artifactId>com.github.icelyframework.metamodels</artifactId>
        <version>1.1.0-SNAPSHOT</version>
    </dependency>
  ...
</dependencies>
```

Example using Gradle Groovy:
```groovy
dependencies {
    implementation 'com.github.icelyframework.metamodels:com.github.icelyframework.metamodels:1.0.0'
}
```

## ☑ Roadmap
If you want to see a new feature feel free to create a new Issue. Here are some features which are either underway or planned:

If you'd like to give any of these a shot feel free to contribute.

## Support

<a href="https://www.buymeacoffee.com/amirdeljouyi" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/purple_img.png" alt="Buy Me A Coffee" style="height: 41px !important;width: 174px !important;box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;-webkit-box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;" ></a>

## License

Copyright © 2021 [Amir Deljouyi](https://github.com/amirdeljouyi).  
Icely Metamodels is made available under the [Apache-2.0](https://github.com/IcelyFramework/icely-annotator/blob/main/LICENSE) licensed.

## 🤝 Contributing
Contributions, issues and feature requests are welcome.  
Feel free to check [issues page](https://github.com/IcelyFramework/icely-annotator/issues) if you want to contribute.

---

> [amirdeljouyi](http://ce.sharif.edu/~deljouyi) &nbsp;&middot;&nbsp;
> GitHub [@amirdeljouyi](https://github.com/amirdeljouyi) &nbsp;&middot;&nbsp;
> Twitter [@amirdeljouyi](https://twitter.com/amirdeljouyi)
