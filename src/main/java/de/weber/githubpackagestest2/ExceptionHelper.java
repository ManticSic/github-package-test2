package de.weber.githubpackagestest2;

public class ExceptionHelper
{
    private ExceptionHelper() {}

    /**
     * Throws an exception if if the passed value is null
     * @param obj checked if null
     * @param argumentName name of the variable
     * @throws ArgumentNullException
     */
    public static void ThrowIfNull(Object obj, String argumentName) throws ArgumentNullException
    {
        if (obj == null) {
            throw new ArgumentNullException(argumentName);
        }
    }
}
