import com.sivakame.basicintro.DaggerGardenComponent
import com.sivakame.basicintro.GardenComponent
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertEquals
import org.junit.Test


class DiscoveryGardenTest {

    @Test
    fun givenGeneratedComponent_whenBuildingCar_thenDependenciesInjected() {
        val component: GardenComponent = DaggerGardenComponent.create()
        val roseGarden = component.buildDiscoveryGarden()
        val lavenderGarden = component.buildDiscoveryGarden()
        assertNotNull(roseGarden)
        assertNotNull(lavenderGarden)
        assertNotNull(roseGarden.plant)
        assertNotNull(lavenderGarden.plant)
        assertNotNull(roseGarden.generalPlantingAdvice)
        assertNotNull(lavenderGarden.generalPlantingAdvice)
        assertNotEquals(roseGarden.plant, lavenderGarden.plant)
        assertEquals(roseGarden.generalPlantingAdvice, lavenderGarden.generalPlantingAdvice)
    }
}