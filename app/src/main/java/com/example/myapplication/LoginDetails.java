package com.example.myapplication;

import java.util.ArrayList;

public class LoginDetails
{
    private static String UserName[];
    private static String UserPassword[];
    private static int Array=0;

    public void setArray(int size)
    {
        if (Array == 0)
        {
            UserName = new String[size];
            UserPassword= new String[size];
            setDefaultUsers();
        }
    }

    public void setDefaultUsers(){
        UserName[0]="Grandma";
        UserPassword[0]="1234";

        UserName[1]="Granpa";
        UserPassword[1]="4321";

        UserName[2]="GranSon";
        UserPassword[2]="9999";

        UserName[3]="GranDaughter";
        UserPassword[3]="0000";
        Array=4;
    }

    public ArrayList<Detail> returnArray(){
        ArrayList<Detail> tmpAr = new ArrayList<>();
        for (int i = 0; i <Array ; i++)
        {
            Detail temp = new Detail(UserName[i],UserPassword[i]);
            tmpAr.add(temp);
        }
        return tmpAr;
    }


    public void add(String Username,String Password){
        UserName[Array]=Username;
        UserPassword[Array]=Password;
        Array++;
    }

    public boolean Valid(String Username,String Password)
    {
        boolean bLoop = false;
        for (int i = 0; i <Array ; i++)
        {
            if ((UserPassword[i].equals(Password))&&(UserName[i].equals(Username)))
            {
                bLoop=true;
            }
        }
        return bLoop;
    }
}
