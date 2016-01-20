package com.stephenturley.test
import geb.Page

class HelloWorldPage extends Page {
    static url = "/signup"
    static at = {title == "Hello"}
}