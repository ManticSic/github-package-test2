package de.weber.githubpackagestest2;

public class ExceptionHelper
{
    private ExceptionHelper() {}

    public static void ThrowIfNull(Object obj, String argumentName) throws ArgumentNullException
    {
        if (obj == null) {
            throw new ArgumentNullException(argumentName);
        }
    }
}
