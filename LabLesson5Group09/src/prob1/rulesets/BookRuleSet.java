package prob1.rulesets;

import java.awt.Component;

import prob1.gui.BookWindow;



/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
	private static final double MINBOOKPRICE = 0.49;
	private BookWindow bookwindow;
	
	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		bookwindow = (BookWindow) ob;
		isEmptyFieldsRule();//Rule 1
		isIsbNumericBetweenTenAndThirteenRule();//Rule 2		
		isIsbMustBeZeroOrOneForTenDigitsRule();// Rule 3	
		isValidateIsbFirtsTreeDigitsRule(); //Rule 4
		isFloatPriceRule(); //Rule 5
		isPriceGratherThat049();// Rule 6
	}

	private void isEmptyFieldsRule() throws RuleException {
		// TODO Auto-generated method stub
		if(bookwindow.getIsbnValue()== null || bookwindow.getTitleValue()==null || bookwindow.getPriceValue()==null ||
				bookwindow.getIsbnValue().isEmpty() || bookwindow.getTitleValue().isEmpty() || bookwindow.getPriceValue().isEmpty()) {
			throw new RuleException("All fields must be non-empty!");
		}
	}

	private void isIsbNumericBetweenTenAndThirteenRule() throws RuleException {
		char[] range_array = bookwindow.getIsbnValue().trim().toCharArray();
		for (int i = 0; i < range_array.length; i++) {
			if (!Character.isDigit(range_array[i])) {
				throw new RuleException("Isbn Error all charaters on isbn must be numbers !");
			}
		}

		int range = bookwindow.getIsbnValue().trim().length();
		if (!(range == 10 || range == 13)) 
		{
			throw new RuleException("Isbn Exeption , the range of isb must be between 10 and 13!");
		}

	}

	private void isIsbMustBeZeroOrOneForTenDigitsRule() throws RuleException {

		int range = bookwindow.getIsbnValue().trim().length();

		if (range == 10) {
			String rule0 = String.valueOf(bookwindow.getIsbnValue().charAt(0));

			if (!(rule0.contains("0") || rule0.contains("1"))) {
				throw new RuleException(" Your  Isbn has length 10, the first digit must be 0 or 1!");

			}

		}

	}

	private void isValidateIsbFirtsTreeDigitsRule() throws RuleException {
		// TODO Auto-generated method stub
		int range = bookwindow.getIsbnValue().trim().length();

		if (range == 13) {
			String rule = bookwindow.getIsbnValue().substring(0, 3);

			if (!(rule.contains("979") || rule.contains("978"))) {
				throw new RuleException(" Isbn  error , the first 3 digits must be either 978 or 979");

			}

		}

	}

	private void isFloatPriceRule() throws RuleException {
		// TODO Auto-generated method stub

		try {
			Float.parseFloat(bookwindow.getPriceValue().trim());
		} catch (Exception e) {
			throw new RuleException("Price must be a floating point number with two decimal places");
		}

		if (!bookwindow.getPriceValue().matches("[-+]?[0-9]*\\.[0-9]{2}")) {
			throw new RuleException("Price must be a floating point number with two decimal places");
		}
	}

	private void isPriceGratherThat049() throws RuleException {
		// TODO Auto-generated method stub
		String price = bookwindow.getPriceValue().trim();
		if (!(Float.parseFloat(price) >= MINBOOKPRICE)) {
			throw new RuleException(
					"Price must be a floating point number with two decimal places more greather that 0.49");
		}
	}
}
