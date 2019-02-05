package prob1.rulesets;

import java.awt.Component;

import prob1.gui.CDWindow;


/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	private CDWindow cdwindow;

	@Override
	public void applyRules(Component ob) throws RuleException {

		cdwindow = (CDWindow) ob;
		isEmptyFieldsRule(); //Rule 1
		isFloatPriceRule(); //Rule 2
		isPriceGratherThat049(); //Rule 3

	}

	private void isEmptyFieldsRule() throws RuleException {	

		if (cdwindow.getArtistValue()== null || cdwindow.getTitleValue()==null || cdwindow.getPriceValue()==null ||
				cdwindow.getArtistValue().isEmpty() || cdwindow.getTitleValue().isEmpty() || cdwindow.getPriceValue().isEmpty()) {
			throw new RuleException("All fields must be non-empty!");
		}
	}

	private void isFloatPriceRule() throws RuleException {

		try {
			Float.parseFloat(cdwindow.getPriceValue().trim());
		} catch (Exception e) {
			throw new RuleException("Price must be a floating point number with two decimal places ");
		}

		if (!cdwindow.getPriceValue().trim().matches("[-+]?[0-9]*\\.[0-9]{2}")) {
			throw new RuleException("Price must be a floating point number with two decimal places ");
		}
	}

	private void isPriceGratherThat049() throws RuleException {

		String price = cdwindow.getPriceValue().trim();
		if (!(Float.parseFloat(price) >= 0.49)) {
			throw new RuleException("Price must be a floating point number with two decimal places more greather that 0.49");
		}
	}
}
