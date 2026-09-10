package za.co.verifyhire.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificationReportTest {

    @Test
    public void shouldReturnReportId() {
        VerificationReport report = new VerificationReport(
                "VR1",
                null,
                true,
                "All requirements verified."
        );

        assertEquals("VR1", report.getReportId());
    }

    @Test
    public void shouldReturnApplication() {
        VerificationReport report = new VerificationReport(
                "VR1",
                null,
                true,
                "All requirements verified."
        );

        assertEquals(null, report.getApplication());
    }
}