# Cordova Plugin MATH

This repository explains how to create a cordova android plugin, and how to consume an android library from the plugin.

In order to consume a library, I've created a Math library to do arytmethic operations.

## How to add

```bash
$ cordova plugin add --link [plugin_path]/cordova-plugin-math/
```

## How to use
This plugin receives five parammeters, *operation*,
*n1*, *n2*, *callback* and *errorcallback*

```javascript

(<any>window).MATH.doOperation(
	"+",2,3,
	function(result){},
	function(error){}
);


```
**operation** indicates wich operation is going to do. There are four available operations:

* *+* 
* *-* 
* *\** 
* */* 

**Callback** this callback receives the result of the operation.

**ErrorCallback** this callback is triggered when send a wrong operation.


## Content of the plugin

Now, I'm going to explain the content of the plugin and what is the finality of each file.

#### [plugin.xml](https://github.com/navasmdc/CordovaPluginMath/blob/master/plugin.xml)

This file contains the configuration and description of the plugin.

#### [package.json](https://github.com/navasmdc/CordovaPluginMath/blob/master/package.json)

This file contains more plugin configuration.

#### [libs/math.aar](https://github.com/navasmdc/CordovaPluginMath/blob/master/libs/math.aar)

Our android library.

#### [libs/build-extras.gradle](https://github.com/navasmdc/CordovaPluginMath/blob/master/libs/build-extras.gradle)

This file defines the lines will be joined to the build.gradle of the generated android project

#### [www/MATH.js](https://github.com/navasmdc/CordovaPluginMath/blob/master/www/MATH.js)

This file defines how to will be called the plugin from javascript

#### [PluginMATH.java](https://github.com/navasmdc/CordovaPluginMath/blob/master/src/com/gc/math/PluginMATH.java)

This file defines the android behaviour of our plugin
