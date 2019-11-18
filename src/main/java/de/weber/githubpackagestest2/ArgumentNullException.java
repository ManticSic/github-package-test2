package de.weber.githubpackagestest2;

public class ArgumentNullException extends Exception
{
    public ArgumentNullException(String argumentName) {
        super("Argument '" + argumentName + "' is null!");
    }
}
