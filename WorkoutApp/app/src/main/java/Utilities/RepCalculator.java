package Utilities;

// TODO: Use different formula options for calculating one rep max

public class RepCalculator
{
    public static float CalculateMaximumReps(float weight, int repetitions)
    {
        if(weight > 0 && repetitions > 0)
        {
            return EpleyFormula(weight, repetitions);
        }

        return weight;
    }

    private static float EpleyFormula(float weight, int repetitions)
    {
        return weight * (1f + (repetitions/30f));
    }

    private static float BrzyckiFormulate(float weight, int repetitions)
    {
        return weight / 1.0278f - (0.0278f * repetitions);
    }

    private static float McGlothinFormula(float weight, int repetitions)
    {
        return 100 * weight / 101.3f - (2.67123f * repetitions);
    }

    private static float OConnerFormula(float weight, int repetitions)
    {
        return weight * 1f + (repetitions / 40f);
    }

}