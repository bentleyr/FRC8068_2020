package frc.robot;


public class Utilities {

    public static double analogScaling(double minimumInput, double maximumInput, double minimumOutput, double maximumOutput, boolean clampOutput, double input )
    {
        double slope = ( maximumOutput - minimumOutput ) / ( maximumInput - minimumInput );
        double yIntercept = maximumOutput - ( slope * maximumInput );
        double result = ( slope * input ) + yIntercept;

        if (clampOutput)
        {
            if ( result < minimumOutput )
            {
                return minimumOutput;
            }
            else if ( result > maximumOutput )
            {
                return maximumOutput;
            }
        }

        return result;
    }

    public static void testAnalogScaling()
    {
        double result = 0.0;

        result = analogScaling( 0.0, 100.0, 0.0, 200.0, false, 0.0 );
        if ( result == 0.0 )
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, false, 0.0 ) == 0.0 => Passed");
        }
        else
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, false, 0.0 ) returned " + result + " => FAILED");            
        }

        result = analogScaling( 0.0, 100.0, 0.0, 200.0, false, 25.0 );
        if ( result == 50.0 )
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, false, 25.0 ) == 50.0 => Passed");
        }
        else
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, false, 25.0 ) returned " + result + " => FAILED");            
        }

        result = analogScaling( 0.0, 100.0, 0.0, 200.0, false, 50.0 );
        if ( result == 100.0 )
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, false, 50.0 ) == 100.0 => Passed");
        }
        else
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, false, 50.0 ) returned " + result + " => FAILED");            
        }

        result = analogScaling( 0.0, 100.0, 0.0, 200.0, false, 75.0 );
        if ( result == 150.0 )
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, false, 75.0 ) == 150.0 => Passed");
        }
        else
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, false, 75.0 ) returned " + result + " => FAILED");            
        }

        result = analogScaling( 0.0, 100.0, 0.0, 200.0, false, 100.0 );
        if ( result == 200.0 )
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, false, 100.0 ) == 200.0 => Passed");
        }
        else
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, false, 100.0 ) returned " + result + " => FAILED");            
        }

        result = analogScaling( 0.0, 100.0, 0.0, 200.0, false, -25.0 );
        if ( result == -50.0 )
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, false, -25.0 ) == -50.0 => Passed");
        }
        else
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, false, -25.0 ) returned " + result + " => FAILED");            
        }

        result = analogScaling( 0.0, 100.0, 0.0, 200.0, false, 125.0 );
        if ( result == 250.0 )
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, false, 125.0 ) == 250.0 => Passed");
        }
        else
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, false, 125.0 ) returned " + result + " => FAILED");            
        }

        result = analogScaling( 0.0, 100.0, 0.0, 200.0, true, -25.0 );
        if ( result == 0.0 )
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, true, -25.0 ) == 0.0 => Passed");
        }
        else
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, true, -25.0 ) returned " + result + " => FAILED");            
        }

        result = analogScaling( 0.0, 100.0, 0.0, 200.0, true, 125.0 );
        if ( result == 200.0 )
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, true, 125.0 ) == 200.0 => Passed");
        }
        else
        {
            System.out.println("analogScaling( 0.0, 100.0, 0.0, 200.0, true, 125.0 ) returned " + result + " => FAILED");            
        }

    }
}