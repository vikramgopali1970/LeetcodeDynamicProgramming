package LeetcodeDynamicProgramming;

public class Main {

    public static void main(String[] args){
        /**
         * Leet Code #256: Paint House
         * */
//        PaintHouse ph = new PaintHouse();
//        System.out.println(ph.minCostDP(new int[][]{{8,12,18},{14,6,8},{10,9,13},{2,17,14},{18,18,6},{2,1,15},{19,20,2},{18,15,16},{20,18,18},{15,10,10},{2,20,18},{14,5,15},{18,10,12},{9,17,19},{9,1,6},{4,4,10},{7,8,15},{16,17,4},{16,16,13},{12,7,10},{14,13,8},{16,6,18},{10,5,10},{3,5,11},{9,9,6},{10,15,19},{4,5,19},{12,17,17}}));
//        System.out.println(ph.minCostDP(new int[][]{{17,2,17},{16,16,5},{14,3,19}}));

        /**
         * Leet Code #121: Best Time to Buy and Sell Stock
         * */
//        BestTimeToBuyAndSellStock bttbass = new BestTimeToBuyAndSellStock();
//        System.out.println(bttbass.maxProfitDP(new int[]{7,1,5,3,6,4}));

        /**
         * Leet Code #746: Min Cost Climbing Stairs
         * */
//        MinCostClimbingStairs mccs = new MinCostClimbingStairs();
//        System.out.println(mccs.minCostClimbingStairsRecursion(new int[]{841,462,566,398,243,248,238,650,989,576,361,126,334,729,446,897,953,38,195,679,65,707,196,705,569,275,259,872,630,965,978,109,56,523,851,887,91,544,598,963,305,481,959,560,454,883,50,216,732,572,511,156,177,831,122,667,548,978,771,880,922,777,990,498,525,317,469,151,874,202,519,139,670,341,514,469,858,913,94,849,839,813,664,163,3,802,21,634,944,901,446,186,843,742,330,610,932,614,625,169,833,4,81,55,124,294,71,24,929,534,621,543,417,534,427,327,179,90,341,949,368,692,646,290,488,145,273,617,596,82,538,751,80,616,763,826,932,184,630,478,163,925,259,237,839,602,60,786,603,413,816,278,4,35,243,64,631,405,23,638,618,829,481,877,756,482,999,973,718,157,262,752,931,882,741,40,77,535,542,879,607,879,321,46,210,116,244,830,591,285,382,925,48,497,913,203,239,696,162,623,291,525,950,27,546,293,108,577,672,354,256,3,671,998,22,989,557,424,251,923,542,243,46,488,80,374,372,334,190,817,150,742,362,196,75,193,162,645,859,758,433,903,199,289,175,303,475,818,213,576,181,668,243,297,572,549,840,161,292,719,226,338,981,345,203,655,210,65,111,746,76,935,406,646,976,567,32,726,638,674,727,861,426,297,349,464,973,341,452,826,223,805,940,458,468,967,107,345,987,553,407,916,103,324,367,864,74,946,712,596,105,194,79,634,855,703,70,170,543,208,739,632,663,880,857,824,258,743,488,659,647,470,958,492,211,927,356,488,744,570,143,674,502,589,270,80,6,463,506,556,495,713,407,229,689,280,162,454,757,565,267,575,417,948,607,269,852,938,560,24,222,580,604,800,628,487,485,615,796,384,555,226,412,445,503,810,949,966,28,768,83,213,883,963,831,390,951,378,497,440,780,209,734,290,96,398,146,56,445,880,910,858,671,164,552,686,748,738,837,556,710,787,343,137,298,685,909,828,499,816,538,604,652,7,272,729,529,343,443,593,992,434,588,936,261,873,64,177,827,172,712,628,609,328,672,376,628,441,9,92,525,222,654,699,134,506,934,178,270,770,994,158,653,199,833,802,553,399,366,818,523,447,420,957,669,267,118,535,971,180,469,768,184,321,712,167,867,12,660,283,813,498,192,740,696,421,504,795,894,724,562,234,110,88,100,408,104,864,473,59,474,922,759,720,69,490,540,962,461,324,453,91,173,870,470,292,394,771,161,777,287,560,532,339,301,90,411,387,59,67,828,775,882,677,9,393,128,910,630,396,77,321,642,568,817,222,902,680,596,359,639,189,436,648,825,46,699,967,202,954,680,251,455,420,599,20,894,224,47,266,644,943,808,653,563,351,709,116,849,38,870,852,333,829,306,881,203,660,266,540,510,748,840,821,199,250,253,279,672,472,707,921,582,713,900,137,70,912,51,250,188,967,14,608,30,541,424,813,343,297,346,27,774,549,931,141,81,120,342,288,332,967,768,178,230,378,800,408,272,596,560,942,612,910,743,461,425,878,254,929,780,641,657,279,160,184,585,651,204,353,454,536,185,550,428,125,889,436,906,99,942,355,666,746,964,936,661,515,978,492,836,468,867,422,879,92,438,802,276,805,832,649,572,638,43,971,974,804,66,100,792,878,469,585,254,630,309,172,361,906,628,219,534,617,95,190,541,93,477,933,328,984,117,678,746,296,232,240,532,643,901,982,342,918,884,62,68,835,173,493,252,382,862,672,803,803,873,24,431,580,257,457,519,388,218,970,691,287,486,274,942,184,817,405,575,369,591,713,158,264,826,870,561,450,419,606,925,710,758,151,533,405,946,285,86,346,685,153,834,625,745,925,281,805,99,891,122,102,874,491,64,277,277,840,657,443,492,880,925,65,880,393,504,736,340,64,330,318,703,949,950,887,956,39,595,764,176,371,215,601,435,249,86,761,793,201,54,189,451,179,849,760,689,539,453,450,404,852,709,313,529,666,545,399,808,290,848,129,352,846,2,266,777,286,22,898,81,299,786,949,435,434,695,298,402,532,177,399,458,528,672,882,90,547,690,935,424,516,390,346,702,781,644,794,420,116,24,919,467,543,58,938,217,502,169,457,723,122,158,188,109,868,311,708,8,893,853,376,359,223,654,895,877,709,940,195,323,64,51,807,510,170,508,155,724,784,603,67,316,217,148,972,19,658,5,762,618,744,534,956,703,434,302,541,997,214,429,961,648,774,244,684,218,49,729,990,521,948,317,847,76,566,415,874,399,613,816,613,467,191}));
//        System.out.println(mccs.minCostClimbingStairsDP(new int[]{841,462,566,398,243,248,238,650,989,576,361,126,334,729,446,897,953,38,195,679,65,707,196,705,569,275,259,872,630,965,978,109,56,523,851,887,91,544,598,963,305,481,959,560,454,883,50,216,732,572,511,156,177,831,122,667,548,978,771,880,922,777,990,498,525,317,469,151,874,202,519,139,670,341,514,469,858,913,94,849,839,813,664,163,3,802,21,634,944,901,446,186,843,742,330,610,932,614,625,169,833,4,81,55,124,294,71,24,929,534,621,543,417,534,427,327,179,90,341,949,368,692,646,290,488,145,273,617,596,82,538,751,80,616,763,826,932,184,630,478,163,925,259,237,839,602,60,786,603,413,816,278,4,35,243,64,631,405,23,638,618,829,481,877,756,482,999,973,718,157,262,752,931,882,741,40,77,535,542,879,607,879,321,46,210,116,244,830,591,285,382,925,48,497,913,203,239,696,162,623,291,525,950,27,546,293,108,577,672,354,256,3,671,998,22,989,557,424,251,923,542,243,46,488,80,374,372,334,190,817,150,742,362,196,75,193,162,645,859,758,433,903,199,289,175,303,475,818,213,576,181,668,243,297,572,549,840,161,292,719,226,338,981,345,203,655,210,65,111,746,76,935,406,646,976,567,32,726,638,674,727,861,426,297,349,464,973,341,452,826,223,805,940,458,468,967,107,345,987,553,407,916,103,324,367,864,74,946,712,596,105,194,79,634,855,703,70,170,543,208,739,632,663,880,857,824,258,743,488,659,647,470,958,492,211,927,356,488,744,570,143,674,502,589,270,80,6,463,506,556,495,713,407,229,689,280,162,454,757,565,267,575,417,948,607,269,852,938,560,24,222,580,604,800,628,487,485,615,796,384,555,226,412,445,503,810,949,966,28,768,83,213,883,963,831,390,951,378,497,440,780,209,734,290,96,398,146,56,445,880,910,858,671,164,552,686,748,738,837,556,710,787,343,137,298,685,909,828,499,816,538,604,652,7,272,729,529,343,443,593,992,434,588,936,261,873,64,177,827,172,712,628,609,328,672,376,628,441,9,92,525,222,654,699,134,506,934,178,270,770,994,158,653,199,833,802,553,399,366,818,523,447,420,957,669,267,118,535,971,180,469,768,184,321,712,167,867,12,660,283,813,498,192,740,696,421,504,795,894,724,562,234,110,88,100,408,104,864,473,59,474,922,759,720,69,490,540,962,461,324,453,91,173,870,470,292,394,771,161,777,287,560,532,339,301,90,411,387,59,67,828,775,882,677,9,393,128,910,630,396,77,321,642,568,817,222,902,680,596,359,639,189,436,648,825,46,699,967,202,954,680,251,455,420,599,20,894,224,47,266,644,943,808,653,563,351,709,116,849,38,870,852,333,829,306,881,203,660,266,540,510,748,840,821,199,250,253,279,672,472,707,921,582,713,900,137,70,912,51,250,188,967,14,608,30,541,424,813,343,297,346,27,774,549,931,141,81,120,342,288,332,967,768,178,230,378,800,408,272,596,560,942,612,910,743,461,425,878,254,929,780,641,657,279,160,184,585,651,204,353,454,536,185,550,428,125,889,436,906,99,942,355,666,746,964,936,661,515,978,492,836,468,867,422,879,92,438,802,276,805,832,649,572,638,43,971,974,804,66,100,792,878,469,585,254,630,309,172,361,906,628,219,534,617,95,190,541,93,477,933,328,984,117,678,746,296,232,240,532,643,901,982,342,918,884,62,68,835,173,493,252,382,862,672,803,803,873,24,431,580,257,457,519,388,218,970,691,287,486,274,942,184,817,405,575,369,591,713,158,264,826,870,561,450,419,606,925,710,758,151,533,405,946,285,86,346,685,153,834,625,745,925,281,805,99,891,122,102,874,491,64,277,277,840,657,443,492,880,925,65,880,393,504,736,340,64,330,318,703,949,950,887,956,39,595,764,176,371,215,601,435,249,86,761,793,201,54,189,451,179,849,760,689,539,453,450,404,852,709,313,529,666,545,399,808,290,848,129,352,846,2,266,777,286,22,898,81,299,786,949,435,434,695,298,402,532,177,399,458,528,672,882,90,547,690,935,424,516,390,346,702,781,644,794,420,116,24,919,467,543,58,938,217,502,169,457,723,122,158,188,109,868,311,708,8,893,853,376,359,223,654,895,877,709,940,195,323,64,51,807,510,170,508,155,724,784,603,67,316,217,148,972,19,658,5,762,618,744,534,956,703,434,302,541,997,214,429,961,648,774,244,684,218,49,729,990,521,948,317,847,76,566,415,874,399,613,816,613,467,191}));

        /**
         * Leet Code #70: Climbing Stairs
         * */
//        ClimbingStairs cs = new ClimbingStairs();
//        System.out.println(cs.climbStairsDP(45));

        /**
         * Leet Code #53: Maximum Subarray
         * */
//        MaximumSubarray msa = new MaximumSubarray();
//        System.out.println(msa.maxSubArray(new int[]{1,2,3,4,-3,-4,5,4,6}));


        /**
         * Leet Code #198: House Robber
         * */
//        HouseRobber hr = new HouseRobber();
//        System.out.println(hr.robDP(new int[]{1,2,3,4,-3,-4,5,4,6}));

        /**
         * Leet Code #276: Paint Fence
         * */
//        PaintFence pf = new PaintFence();
//        System.out.println(pf.numWays(3,2));


        /**
         * Leet Code #877: Stone Game
         * */
//        StoneGame sg = new StoneGame();
//        System.out.println(sg.stoneGameRecursion(new int[]{59,48,36,70,59,93,60,98,15,32,31,13,27,14,8,17,4,76,24,47,39,81,26,6,70,73,8,36,71,19,66,61,86,63,97,32,15,36,68,69,32,53,83,35,100,41,44,8,28,76,39,90,37,35,11,99,48,49,64,74,6,54,12,99,34,47,78,36,51,26,43,83,10,68,32,48,72,54,64,64,44,62,77,60,100,84,15,24,95,6,6,8,24,21,84,61,75,26,63,54}));
//        System.out.println(sg.stoneGameRecursion(new int[]{5,3,4,5}));


        /**
         * Leet Code #983: Minimum Cost For Tickets
         * */
//        MinimumCostForTickets mct = new MinimumCostForTickets();
//        System.out.println(mct.mincostTicketDP(new int[]{6,9,10,14,15,16,17,18,20,22,23,24,29,30,31,33,35,37,38,40,41,46,47,51,54,57,59,65,70,76,77,81,85,87,90,91,93,94,95,97,98,100,103,104,105,106,107,111,112,113,114,116,117,118,120,124,128,129,135,137,139,145,146,151,152,153,157,165,166,173,174,179,181,182,185,187,188,190,191,192,195,196,204,205,206,208,210,214,218,219,221,225,229,231,233,235,239,240,245,247,249,251,252,258,261,263,268,270,273,274,275,276,280,283,285,286,288,289,290,291,292,293,296,298,299,301,303,307,313,314,319,323,325,327,329,334,339,340,341,342,344,346,349,352,354,355,356,357,358,359,363,364},
//                new int[]{21,115,345}));
//        System.out.println(mct.mincostTicketDP(new int[]{1,2,3,4,5,6,7,8,9,10,30,31},new int[]{2,7,15}));


        /**
         * Leet Code #931: Minimum Falling Path Sum
         * */
        MinimumFallingPathSum mfs = new MinimumFallingPathSum();
        System.out.println(mfs.minFallingPathSumDP(new int[][]{{-51,-35,74},{-62,14,-53},{94,61,-10}}));


    }

}
