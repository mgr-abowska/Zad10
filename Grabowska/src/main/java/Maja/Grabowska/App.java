package Maja.Grabowska;


public class App 
{
    public static boolean isOdd(int num)
    {
    	for(int i = 2; i <= num/2; ++i)
        {
            // warunek dla liczby pierwszej
            if(num % i == 0)
            {
                return false;
            }
        }
    	return true;
    }

    	
    	
    }

