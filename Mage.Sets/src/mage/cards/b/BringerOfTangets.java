package mage.cards.b;

import mage.MageInt;
import mage.abilities.common.DiesSourceTriggeredAbility;
import mage.abilities.effects.keyword.ManifestDreadEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;


/**
 * @author DSCat
 */
public final class BringerOfTangets extends CardImpl {

  public BringerOfTangets(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{C}{C}");

        this.subtype.add(SubType.SPIRIT);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        // When this creature dies dies, manifest dread.
        this.addAbility(new DiesSourceTriggeredAbility(new ManifestDreadEffect()));
    }

    private BringerOfTangets(final BringerOfTangets card) {
        super(card);
    }

    @Override
    public BringerOfTangets copy() {
        return new BringerOfTangets(this);
    }
}