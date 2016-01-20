package com.stephenturley.application
import geb.Page

class HelloWorldPage extends Page {
    static url = "/signup"
    static at = {title == "Hello"}
}