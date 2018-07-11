package HomeWork14;

/*  14.
     Given the frequency of some photons in hertz (e.g 4.3MHz = 4300000),
     print the corresponding wavelength of the light.
     If it walls in the visible spectrum, print the corresponding color (eg “green”, “red”, etc.)
 */

public class Wavelength
{
    public static void main(String[] args) {
        int lightSpeed = 299_792_458;
        long oneMeterConvertedToNanometers = 1_000_000_000L;
        long lightSpeedInNanometers = lightSpeed * oneMeterConvertedToNanometers;

        long lightFrequency = 400_000_000_000_000L;

        boolean isLightFrequencyValid = lightFrequency >0;
        String notValid = (!isLightFrequencyValid) ?
                "Input not valid, light frequency must be > 0." : "";
        System.out.println(notValid);

        long lightWavelengthInNanometers = lightSpeedInNanometers / lightFrequency;

        String noColor = (isLightFrequencyValid && (lightWavelengthInNanometers <380 ||
                        lightWavelengthInNanometers >750)) ?
                "Not a color in the visible spectrum. " + lightWavelengthInNanometers+ "nm": "";
        System.out.println(noColor);

        String red = (isLightFrequencyValid && (lightSpeedInNanometers >=620 && lightWavelengthInNanometers <=750))?
                +lightWavelengthInNanometers+"nm, Corresponding to the RED spectrum of light." :"";
        System.out.println(red);

        String orange = (isLightFrequencyValid && (lightWavelengthInNanometers >=590 &&
        lightSpeedInNanometers <= 620)) ? +lightWavelengthInNanometers+
                "nm, corresponding to the Orange spectrum of light." :"";
        System.out.println(orange);

        String yellow = (isLightFrequencyValid && (lightWavelengthInNanometers >=570 &&
        lightWavelengthInNanometers <=590)) ? +lightWavelengthInNanometers+
                "nm, corresponding to the Yellow spectrum of light.":"";
        System.out.println(yellow);

        String green = (isLightFrequencyValid && (lightWavelengthInNanometers >= 495 &&
        lightWavelengthInNanometers <=570)) ? +lightWavelengthInNanometers+
                "nm, corresponding to the Green spectrum of light.":"";
        System.out.println(green);

        String blue = (isLightFrequencyValid && (lightWavelengthInNanometers >=450 &&
        lightWavelengthInNanometers <= 495))? +lightWavelengthInNanometers+
                "mn, corresponding to Blue spectrum of light.":"";
        System.out.println(blue);

        String violet = (isLightFrequencyValid && (lightWavelengthInNanometers >=380 &&
        lightWavelengthInNanometers <=450))? +lightWavelengthInNanometers+
                "nm, corresponding to the Violet spectrum of light." :"";
        System.out.println(violet);
    }
}
