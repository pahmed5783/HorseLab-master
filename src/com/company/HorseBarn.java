package com.company;


public class HorseBarn {
    private Horses[] spaces;

    public HorseBarn (Horses[] spaces) {
        this.spaces = spaces;
    }

    public int findHorseSpace (String name) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] != null && name.equals(spaces[i].getName()))
                return i;
        }
        return -1;
    }

    public void consolidate () {
        for(int i = 0;i<spaces.length;i++)
        {
            if(spaces[i] == null)
            {
                for(int x=i; x<spaces.length-i;x++)
                {
                    if(spaces[x] != null)
                    {
                        spaces[i] = spaces[x];
                    }
                }
            }
        }
    }
}
