/*
 * generated by Xtext 2.14.0
 */
package ru.spbstu.application.configurator.model.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import ru.spbstu.application.configurator.model.InfoProjectRuntimeModule
import ru.spbstu.application.configurator.model.InfoProjectStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class InfoProjectIdeSetup extends InfoProjectStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new InfoProjectRuntimeModule, new InfoProjectIdeModule))
	}
	
}
