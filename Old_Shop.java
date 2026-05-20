/*
Problem: Price Check sdfsdf

There is a shop with old-style cash registers.
Instead of scanning products automatically, the cashier manually enters prices.

Given:
1. products[] -> product names
2. productPrices[] -> correct prices of products
3. productSold[] -> sold products
4. soldPrice[] -> entered selling prices

Determine how many pricing errors occurred.

A pricing error occurs when:
soldPrice[i] != actual price of productSold[i]

---------------------------------------------------

Example:

products = ["eggs", "milk", "cheese"]

productPrices = [2.89, 3.29, 5.79]

productSold = ["eggs", "eggs", "cheese", "milk"]

soldPrice = [2.89, 2.99, 5.97, 3.29]

---------------------------------------------------

Explanation:

eggs   -> expected 2.89 -> sold 2.89 -> correct
eggs   -> expected 2.89 -> sold 2.99 -> error
cheese -> expected 5.79 -> sold 5.97 -> error
milk   -> expected 3.29 -> sold 3.29 -> correct

Total errors = 2

Output:
2
*/

import java.util.HashMap;

public class Old_Shop {
    public static void main(String[] args) {

        String[] products = {"eggs", "milk", "cheese"};

        double[] productPrices = {2.89, 3.29, 5.79};

        String[] productSold = {"eggs", "eggs", "cheese", "milk"};

        double[] soldPrice = {2.89, 2.99, 5.97, 3.29};

        int result = priceCheck(
                products,
                productPrices,
                productSold,
                soldPrice
        );

        System.out.println("Number of pricing errors: " + result);
    }

    public static int priceCheck(
            String[] products,
            double[] productPrices,
            String[] productSold,
            double[] soldPrice
    ) {

        int error=0;

        HashMap<String,Double> map=new HashMap<>();
        for(int i=0; i<products.length; i++)
        {
            map.put(products[i],productPrices[i]);
        }

        for(int i=0; i<productSold.length; i++)
        {
            if(Double.compare(map.get(productSold[i]),soldPrice[i])!=0)
            {
                error++;
            }
        }

        return error;
    }
}
