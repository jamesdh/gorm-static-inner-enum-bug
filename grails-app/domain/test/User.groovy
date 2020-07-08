package test

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class User {

    String username
    State state

    static constraints = {
        username unique: true
    }

    static mapping = {
        state(enumType: "string", defaultValue: State.ACTIVE)
    }

    enum State {
        ACTIVE,
        INACTIVE,
        UNKNOWN
    }
}
