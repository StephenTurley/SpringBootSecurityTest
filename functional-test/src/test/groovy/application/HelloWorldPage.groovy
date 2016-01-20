package com.stephenturley.application
import geb.Page

class HelloWorldPage extends Page {
    static url = "/"
    static at = {title == "Hello"}
}