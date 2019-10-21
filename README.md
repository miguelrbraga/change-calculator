# change-calculator

Calculator that calculates the change to return when a certain payment is performed, based on the existent coins. An instance of Payment needs to be created, passing three arguments: an integer which represents the charges (in pences), another integer representing the value introduced by the user to pay the charges (in pences), the coins available to be returned (array of Coin). When executing processChange on the instance of Payment, an HashMap should be returned with the amount of each Coin that should be given to the user.

Classes explained:

OnePoundCoin, FiftyPencesCoin, TwentyPencesCoin, TenPencesCoin, FivePencesCoin, TwoPencesCoin and OnePenceCoin all extend the abstract class Coin.

The ChangeCalculator class is the main, whereas Payment is the class which establishes the relationship between the user's input and the remaining classes.
