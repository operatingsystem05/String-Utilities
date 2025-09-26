public class StringUtilities
{
    protected static String cleanString(String input)
    {
        return input.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    protected static String reverse(String input)
    {
        String cleaned = cleanString(input);
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    protected static int vowelCount(String input)
    {
        int count =0;
        String vowels = "aeiouy";
        input = input.toLowerCase();

        for (char c : input.toCharArray())
        {
            if(vowels.indexOf(c) != -1)
            {
                count++;
            }
        }
        return count;
    }
}