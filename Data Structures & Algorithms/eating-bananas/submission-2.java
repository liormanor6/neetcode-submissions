class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int mink = 1;
        int maxk = piles[piles.length-1];
        int minEatingSpeed = 1000000000;
        while (mink <= maxk)
        {
            int middlek = (mink + maxk) / 2;
            int hoursToEat = numHoursToEat(piles, middlek);
            if (hoursToEat > h)
            {
                mink = middlek + 1;
            }
            else if (hoursToEat <= h)
            {
                if (middlek < minEatingSpeed)
                {
                    minEatingSpeed = middlek;
                }
                maxk = middlek - 1;
            }
        }
        return minEatingSpeed;
    }

    public int numHoursToEat(int piles[], int k)
    {
        int sumHours = 0;
        for (int i = 0; i < piles.length; i++)
        {
            sumHours += (piles[i] / k);
            if (piles[i] % k != 0)
            {
                sumHours++;
            }
        }
        return sumHours;
    }
}
