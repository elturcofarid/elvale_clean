package com.onlysystem.elvale.architecture;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

class ArchitectureTest {

    private static JavaClasses importedClasses;

    @BeforeAll
    static void setup() {
        importedClasses = new ClassFileImporter().importPackages("com.onlysystem.elvale");
    }

    @Test
    void layerDependenciesAreRespected() {
        layeredArchitecture()
                .consideringAllDependencies()
                .layer("Controllers").definedBy("..adapter.in.rest..")
                .layer("Services").definedBy("..domain.service..")
                //.layer("Repositories").definedBy("..repository..")
                .whereLayer("Controllers").mayNotBeAccessedByAnyLayer()
                .whereLayer("Services").mayOnlyBeAccessedByLayers("Controllers")
               // .whereLayer("Repositories").mayOnlyBeAccessedByLayers("Services")
                .check(importedClasses);
    }

    @Test
    void controllersShouldHaveControllerSuffix() {
        ArchRule rule = classes()
                .that().areAnnotatedWith(RestController.class)
                .should().haveSimpleNameEndingWith("Controller");
        rule.check(importedClasses);
    }

    @Test
    void servicesShouldHaveServiceSuffix() {
        ArchRule rule = classes()
                .that().areAnnotatedWith(Service.class)
                .should().haveSimpleNameEndingWith("Service");
        rule.check(importedClasses);
    }

     @Test
    void repositoriesShouldHaveRepositorySuffix() {
        ArchRule rule = classes()
                .that().areAnnotatedWith(Repository.class)
                .should().haveSimpleNameEndingWith("Repository");
        rule.check(importedClasses);
    }

    @Test
    void servicesShouldNotDependOnControllers() {
        ArchRule rule = noClasses()
                .that().resideInAPackage("..service..")
                .should().dependOnClassesThat().resideInAPackage("..controller..");
        rule.check(importedClasses);
    }

    
    @Test
    void repositoriesShouldNotDependOnServices() {
        ArchRule rule = noClasses()
                .that().resideInAPackage("..repository..")
                .should().dependOnClassesThat().resideInAPackage("..service..");
        rule.check(importedClasses);
    }
}