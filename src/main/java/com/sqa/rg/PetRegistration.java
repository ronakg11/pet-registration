/**
 *   File Name: PetRegistration.java<br>
 *
 *   Gavandi, Ronak<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 12, 2016
 *
 */

package com.sqa.rg;

import com.sqa.rg.helpers.*;

/**
 * PetRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Gavandi, Ronak
 * @version 1.0.0
 * @since 1.0
 *
 */
public class PetRegistration {
	private static enum species {
		BIRD, CAT, DOG, REPTILE
	}

	private static String appName = "Pet Registration";
	private static String dob;
	private static char gender;
	private static String petName;
	private static boolean rabiesShot;
	private static String userName;
	private static double yearlyFoodCosts;

	public static void main(String[] args) {
		userName = RequestInput.getString("Could I get your name please? ");
		System.out.println("\nHi " + userName + ", welcome to the " + appName + " application!\n");
	}
}
