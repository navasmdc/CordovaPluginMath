var argscheck = require('cordova/argscheck'),
    channel = require('cordova/channel'),
    utils = require('cordova/utils'),
    exec = require('cordova/exec'),
    cordova = require('cordova');

channel.createSticky('onCordovaInfoReady');
// Tell cordova channel to wait on the CordovaInfoReady event
channel.waitForInitialization('onCordovaInfoReady');


function MATH() {}


MATH.prototype.doOperation = function(operation, n1, n2,successCallback, errorCallback) {
    exec(successCallback, errorCallback, "MATH", operation, [n1, n2]);
};


module.exports = new MATH();
