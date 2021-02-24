public class petleZad4
{
    public static void main(String[] args)
    {
        int [] tablica = new int[10];

//        for (int element:tablica)
//        {
//            element = (int) (Math.random()*10);
//        }

        
        for(int i=0; i< tablica.length; i++)
        {
            tablica[i] =10 - (int) (Math.random() * 20);
        }
        for (int element:tablica)
        {
            System.out.println(element);
        }


    }
}


//tablica[0] =(int) (Math.random()*10);