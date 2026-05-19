package mage.cards.c;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.OneOrMoreLeaveWithoutDyingTriggeredAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.dynamicvalue.common.CountersControllerCount;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.effects.common.counter.AddCountersPlayersEffect;
import mage.abilities.effects.common.discard.DiscardControllerEffect;
import mage.abilities.effects.keyword.AirbendTargetEffect;
import mage.abilities.keyword.ChannelAbility;
import mage.abilities.keyword.HasteAbility;
import mage.abilities.keyword.MadnessAbility;
import mage.abilities.triggers.BeginningOfUpkeepTriggeredAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.constants.TargetController;
import mage.counters.CounterType;
import mage.filter.FilterPermanent;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.game.permanent.token.AllyToken;
import mage.players.Player;
import mage.target.TargetPermanent;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class CreepingScratchMite extends CardImpl {

    private static final DynamicValue xValue = new CountersControllerCount(CounterType.EXPERIENCE);

    public CreepingScratchMite(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{C}");

        
        this.subtype.add(SubType.HORROR);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // Discard creeping scratch mite: Each player chooses a permanent, then puts a scratch counter on it. Discard a card.
        Ability ability = new ChannelAbility("{0}", new CreepingScratchMiteEffect());
        ability.addEffect(new DiscardControllerEffect(1).setText("Discard a card"));
        this.addAbility(ability);
        //Madness {2}
        this.addAbility(new MadnessAbility(new ManaCostsImpl<>("{2}")));
    }

    private CreepingScratchMite(final CreepingScratchMite card) {
        super(card);
    }

    @Override
    public CreepingScratchMite copy() {
        return new CreepingScratchMite(this);
    }

    class CreepingScratchMiteEffect extends OneShotEffect {

        CreepingScratchMiteEffect() {

        super(Outcome.Benefit);
            staticText = "Each Player chooses target permanent, then puts a scratch counter on it. Discard a card.";
  
        }
    @Override
    public boolean apply(Game game, Ability source) {
        FilterPermanent keepFilter = new FilterPermanent();
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null) {
            for (UUID playerId : game.getState().getPlayersInRange(controller.getId(), game)) {
                Player player = game.getPlayer(playerId);
                if (player != null) {
                    TargetPermanent target = new TargetPermanent();

                    player.choose(Outcome.Benefit, target, source, game);
                    Permanent permanent = game.getPermanent(target.getFirstTarget());
                    if (permanent != null) {
                        permanent.addCounters(CounterType.SCRATCH.createInstance(), source.getControllerId(), source, game);
                    }
                }
            }
        }
        return true;
    }

    @Override
    public OneShotEffect copy() {
        return new CreepingScratchMiteEffect();
    }
    }
}
