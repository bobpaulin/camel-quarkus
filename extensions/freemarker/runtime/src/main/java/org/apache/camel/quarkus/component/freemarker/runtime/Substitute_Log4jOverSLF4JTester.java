package org.apache.camel.quarkus.component.freemarker.runtime;

import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;
import freemarker.log._Log4jOverSLF4JTester;

@TargetClass(_Log4jOverSLF4JTester.class)
final class Substitute_Log4jOverSLF4JTester {

    @Substitute
    public static final boolean test() {
        return false;
    }
}
