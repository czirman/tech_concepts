package org.czirman.test

import spock.lang.Specification

class DummySpec extends  Specification{
    def "simple test"() {
        expect:
        1 + 1 == 2
    }
}
