package objectmother;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FacilitiesObjectMotherTest extends TestCase {
    @Test
    public void test() {
        FacilitiesObjectMother facilitiesObjectMother = new FacilitiesObjectMother();
        TraditionalFacilities bicycleCenter = facilitiesObjectMother.createUndamagedTraditionalFacilities();
        TraditionalFacilities toilet = facilitiesObjectMother.createDamagedTraditionalFacilities();
        ElectronicFacilities gondola = facilitiesObjectMother.createPowerOnDamagedElectronicFacilities();
        ElectronicFacilities rollerCoaster = facilitiesObjectMother.createPowerOnUndamagedElectronicFacilities();
        ElectronicFacilities bumperCars = facilitiesObjectMother.createPowerOffDamagedElectronicFacilities();
        ElectronicFacilities elevator = facilitiesObjectMother.createPowerOffUndamagedElectronicFacilities();

        assertFalse(bicycleCenter.isDamaged());
        assertFalse(bicycleCenter.isClosed());

        assertTrue(toilet.isDamaged());
        assertTrue(toilet.isClosed());

        assertTrue(gondola.isClosed());
        assertTrue(gondola.isDamaged());
        assertTrue(gondola.isPowered());

        assertFalse(rollerCoaster.isClosed());
        assertFalse(rollerCoaster.isDamaged());
        assertTrue(rollerCoaster.isPowered());

        assertTrue(bumperCars.isClosed());
        assertTrue(bumperCars.isDamaged());
        assertFalse(bumperCars.isPowered());

        assertTrue(elevator.isClosed());
        assertFalse(elevator.isDamaged());
        assertFalse(elevator.isPowered());

        System.out.print("TraditionalFacilities:getInstance:("+bicycleCenter.hashCode()+"): ");
        System.out.print("Bicycle Center: ");
        bicycleCenter.enter();
        System.out.print("TraditionalFacilities:getInstance:("+toilet.hashCode()+"): ");
        System.out.print("Toilet: ");
        toilet.enter();
        System.out.print("ElectronicFacilities:getInstance:("+gondola.hashCode()+"): ");
        System.out.print("Gondola: ");
        gondola.enter();
        System.out.print("ElectronicFacilities:getInstance:("+rollerCoaster.hashCode()+"): ");
        System.out.print("Roller Coaster: ");
        rollerCoaster.enter();
        System.out.print("ElectronicFacilities:getInstance:("+bumperCars.hashCode()+"): ");
        System.out.print("Bumper Cars: ");
        bumperCars.enter();
        System.out.print("ElectronicFacilities:getInstance:("+elevator.hashCode()+"): ");
        System.out.print("Elevator: ");
        elevator.enter();
    }
}
