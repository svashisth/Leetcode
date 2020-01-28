package com.leetcode.top.intw.ques;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.apache.commons.lang3.RandomUtils;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 *
 */
public class IntersectionOf2Arrays {

	Set<Integer> set = new HashSet<Integer>();
	
	public static void main(String[] args) {
		 IntersectionOf2Arrays sr = new IntersectionOf2Arrays();
		 int[] nums1 = {1,2};
		int[] nums2 = {1,2};
		int[] intersect = sr.intersect(nums1, nums2);
		System.out.println(":: " + Arrays.toString(intersect));
		
		nums1 = new int[]{1,2};
		nums2 = new int[]{1};
		intersect = sr.intersect(nums1, nums2);
		System.out.println(":: " + Arrays.toString(intersect));
		
		nums1 = new int[]{7,2,9,3,4,5};
		nums2 = new int[]{1,3,7,3};
		intersect = sr.intersect(nums1, nums2);
		System.out.println(":: " + Arrays.toString(intersect));
		
		nums1 = new int[]{6662,4720,3681,2191,333,232,6155,3609,8130,1145,8498,4956,5535,8950,1482,8807,5299,9694,5915,8125,5888,2729,3647,9633,1910,4588,9807,2338,9851,2435,3111,2395,7091,5047,9068,2316,8167,9974,3985,681,429,1698,7408,4610,5618,3216,736,1195,4780,714,941,7519,4956,2241,5743,5364,8613,4913,4080,835,839,3154,6581,8365,8249,1723,7984,6766,6205,4291,6265,3385,9269,9908,9599,1288,1445,6644,3662,7194,18,2326,5332,3816,3216,9490,5017,3782,2564,3983,4000,3853,2369,4023,184,3314,7883,464,5694,2150,346,2546,5139,984,2154,5921,2809,3829,3757,3127,1354,4690,5462,1378,1013,2700,1447,6018,2444,5920,6313,9742,8279,1408,6259,7735,3195,242,633,3304,1090,9264,4040,4474,7197,1429,1073,7337,1070,566,7041,4174,7187,475,6604,9509,3861,9995,3089,7946,6114,5749,4533,8379,9836,4917,7572,3367,2223,3880,1147,4646,3403,3135,5073,4707,1796,8377,7524,1726,1881,1392,5566,3081,3393,5873,7345,494,10,2434,6600,8964,8248,9198,3139,7556,5224,7570,3494,2167,796,4353,4349,1911,6156,1283,559,1044,1157,9554,3293,6256,1271,4270,9997,2267,1204,7814,1210,5215,8686,7539,9648,2301,7522,6527,8727,359,8723,1141,6840,4852,8708,5639,8310,7932,8087,2550,1033,3659,9378,394,5089,9058,9218,7026,4340,7802,639,8849,2934,8235,9276,3468,647,9184,3898,4585,9684,7092,9797,4780,7643,7480,2949,4932,8443,4277,9668,6817,9090,5461,4811,3274,3357,4045,7210,5162,1811,7119,5949,5783,2315,970,747,5876,9967,1038,3508,273,7102,972,3060,7088,3037,7249,1563,7368,3302,6813,8246,3187,7622,1250,4508,4117,6017,7392,6649,6026,26,5993,8610,3590,2675,2222,5240,8420,1175,6584,5481,7061,5221,7980,592,2264,1042,7433,3320,3744,1692,1704,4031,5322,8936,670,5210,3504,8987,1219,3656,9515,5118,8708,9144,5276,1018,3750,6170,7621,9823,5848,4132,1190,5917,4299,448,3759,6323,3265,9250,931,3987,8892,2547,5829,6626,7873,4814,9401,7440,2090,7303,394,2513,2248,5914,5445,7041,9008,8911,8766,6466,3815,5687,6113,9033,7897,9590,5688,5609,127,1567,7444,2166,9694,4838,4624,4095,9673,2471,7558,7524,2471,8998,1365,2455,8400,6486,5132,3837,1094,4915,9342,5147,5166,381,860,7789,862,2008,3839,394,5839,7619,7473,6126,863,6731,8429,1651,4130,2333,4539,7236,5435,6374,5112,4276,7247,6467,7107,4797,1785,6322,8187,9247,7652,6485,4562,5840,4313,4365,8666,5063,7,4907,3211,324,2189,2177,5849,249,4469,1748,7403,2499,8135,8824,3434,687,4889,7750,3017,4861,8206,7181,2238,4921,3892,5985,5912,6257,2466,2138,8397,9646,7977,7449,7239,5091,3746,395,3051,81,3934,4116,2864,6069,621,5981,5330,8695,7298,2141,1002,4802,4250,8819,8428,5046,1808,1166,924,1082,860,2225,4127,8057,272,3217,6888,3034,4074,6027,5548,5864,4396,1452,5685,4813,7093,2572,5854,7400,504,6486,6158,1438,5442,5499,6346,5506,2974,3350,3484,3367,3744,4447,1345,8805,2442,8174,9721,614,2174,9425,581,9072,5384,6922,3454,1388,8825,6219,5004,3993,8479,4763,6792,1393,2759,7960,1862,8828,6441,981,6364,810,8791,1111,289,5937,9332,9803,1501,5876,5709,3103,3505,6300,6369,2848,8445,5876,1117,552,9462,6630,3701,4832,4031,8693,4621,8765,948,2239,6243,7746,7602,6610,7796,3884,4827,4046,5027,9890,3187,1384,8833,1993,5299,9876,7823,2858,5353,3925,7153,4983,6461,2351,9066,2155,4560,3815,4164,2933,7633,2567,6511,8479,8935,4594,6799,9792,4398,1920,349,5719,936,1121,9895,1462,1979,9872,853,1156,2444,1153,2239,824,8978,281,4076,9756,2547,9174,2044,8795,9560,3479,6045,5606,5426,2556,4848,7144,4989,6578,8715,5785,9866,9008,865,3868,386,4115,5595,2203,2745,5649,8597,9302,8247,7799,795,4080,1520,2397,7166,4656,7098,5829,2076,1270,4989,956,3774,1643,3170,4891,8470,8156,2414,2910,864,8134,2723,2252,3963,8591,1328,416,8965,4921,3429,1987,8810,8155,691,7093,2949,8314,1134,7741,2960,4766,8093,8250,3936,4004,1827,6646,909,186,3610,1314,357,4692,8534,4661,638,3004,4708,5478,260,1217,5990,1378,2076,3826,1239,7186,2528,4496,4432,7809,5853,4562,6289,6319,2573,6696,5222,5712,94,5047,9885,2354,6275,2945,9106,1735,8409,6772,7413,1017,8103,7105,1694,4071,7395,3890,8098,5076,3226,6719,9000,1700,8037,1971,919,8295,2358,4839,1564,7395,2042,200,4286,3922,6785,6185,2989,612,7028,3112,8014,9599,6191,5146,527,2983,2142,5448,5897,1758,2055,7074,769,1874,1151,9394,1717,5975,5157,9892,2820,7056,5133,3175,5204,345,9593,5354,1837,9683,2718,2129,3901,5255,182,874,9483,619,5200,4178,5143,789,6243,2022,9694,7035,7490,8652,6616,7547,3401,1178,6221,175,3612,7715,8881,6439,1467,2361,541,5799,6464,8984,2935,3231,9578,7222,1146,9407,6631,2471,8384,8961,1687,2935,7186,8378,3383,712,2005,666,6075,9177,1428,508,4413,1979,5985,7111,9211,2228,3450,1341,2963,4351,6941,6023,490,2678,5169,476,4241,3753,9717,9733,5865,2661,6368,5557,468,9732,9956,7409,9748,7678,5200,9192,5491,3928,878,9575,5533,2205,694,9809,1506,4845,4735,150,34,9207,3428,142,5694,4342,3257,7616,7094,4741,6981,3684,5619,6382,654,8845,1045,2444,659,5608,5893,1956,2314,62,7937,9143,9008,727,4361,8926,2816,3887,6874,7645,9133,9023,9125,8882,1789,2659,5649,2323,4729,8,6122,8103,1782,4061,6747,3470,7225,772,2086,3202,3719,2115,4098,5423,527,2024,8680,1193,7110};
		nums2 = new int[]{1,3,7,3,7774,1906,4794,507,1455,3903,2603,7893,9041,9750,9410,6546,8034,6107,2167,8170,9128,1940,837,7772,4411,5234,2933,8951,1669,1292,5131,2607,719,1806,5142,5590,2954,8990,3279,5699,9797,8117,4934,9327,2959,8068,835,2445,4285,7590,5748,8929,5629,7202,3004,5760,6614,8270,5633,1414,8552,8356,5711,7204,7888,1881,9264,7436,2365,5852,6525,2592,5486,6940,6255,3293,5640,9910,8856,1513,6193,598,6884,6124,899,3509,5923,8882,2715,6309,7021,2554,5637,3037,1797,9640,9312,1351,1729,4517,6347,2437,8726,7630};
		intersect = sr.intersect(nums1, nums2);
		System.out.println(":: " + Arrays.toString(intersect));
	}
	
	public int[] intersect(int[] nums1, int[] nums2) {
		int[] res = new int[0];
		if(nums1.length == 0 || nums2.length == 0)
		{
			return res;
		}
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		if(nums1[nums1.length-1] < nums2[0] || nums1[0] > nums2[nums2.length-1])
		{
			return res;
		}
		
		res = new int[nums1.length > nums2.length ? nums2.length : nums1.length];
		int i=0,j = 0;
		int resIndx = 0;
		while( i < nums1.length && j < nums2.length)  {
			if(nums1[i] > nums2[j])
			{
				j++;
			}
			else if(nums1[i] < nums2[j])
			{
				i++;
			}
			else
			{
				res[resIndx++] = nums1[i];
				i++;
				j++;
			}
		}
		
		return Arrays.copyOfRange(res, 0, resIndx);
    }
}
