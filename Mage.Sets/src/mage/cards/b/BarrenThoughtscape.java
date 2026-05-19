package mage.cards.b;

import mage.MageInt;
import mage.abilities.Ability;


import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.dynamicvalue.common.CountersControllerCount;

import mage.abilities.effects.Effect;
import mage.abilities.effects.keyword.ScryEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;

import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.constants.TargetController;
import mage.counters.CounterType;
import mage.filter.StaticFilters;

import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.DiscardCardCost;

import mage.game.Game;
import mage.watchers.common.DiscardedCardWatcher;

import mage.constants.Zone;



import java.util.UUID;

/**
 * @author DSCat
 */
public final class BarrenThoughtscape extends CardImpl {




    public BarrenThoughtscape(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{1}{C}{C}");

         // Discard a card:  Scry X, where X is the number of cards discarded this turn.
        Ability ability = new SimpleActivatedAbility(new ScryEffect(BarrenThoughtscapeValue.instance), new DiscardCardCost());
        this.addAbility(ability);
    }

    private BarrenThoughtscape(final BarrenThoughtscape card) {
        super(card);
    }
    @Override
    public BarrenThoughtscape copy() {
        return new BarrenThoughtscape(this);
    }


}
enum BarrenThoughtscapeValue implements DynamicValue {
    instance;

    @Override
    public int calculate(Game game, Ability sourceAbility, Effect effect) {
        return DiscardedCardWatcher.getDiscarded(sourceAbility.getControllerId(), game);
    }

    @Override
    public BarrenThoughtscapeValue copy() {
        return instance;
    }

    @Override
    public String getMessage() {
        return "card you've discarded this turn";
    }

    @Override
    public String toString() {
        return instance.toString() ;
    }

}
