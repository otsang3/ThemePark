package behaviours;

import people.Visitor;

public interface ITicketed {

    double defaultPrice(Visitor visitor);
    double priceFor(Visitor visitor);
}
