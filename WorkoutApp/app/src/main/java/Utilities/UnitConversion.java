package Utilities;

// TODO: Implement more UnitSystems

public class UnitConversion
{
    public static float ConvertUnit(float weight, UnitSystem currentSystem, UnitSystem newSystem)
    {
        if(weight > 0 && currentSystem != newSystem)
        {
            if(newSystem == UnitSystem.Imperial)
            {
                weight *= 2.205;
            }
            else if(newSystem == UnitSystem.Metric)
            {
                weight /= 2.205;
            }
        }

        return weight;
    }

}
