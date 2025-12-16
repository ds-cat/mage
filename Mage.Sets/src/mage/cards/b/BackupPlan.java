package mage.cards.b;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.OneOrMoreLeaveWithoutDyingTriggeredAbility;
import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.dynamicvalue.common.CountersControllerCount;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.effects.common.counter.AddCountersPlayersEffect;
import mage.abilities.effects.keyword.AirbendTargetEffect;
import mage.abilities.keyword.UndyingAbility;
import mage.abilities.triggers.BeginningOfUpkeepTriggeredAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.counters.CounterType;
import mage.filter.StaticFilters;
import mage.game.permanent.token.AllyToken;
import mage.target.TargetPermanent;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 * @author DSCat
 */
public final class BackupPlan extends CardImpl {


    public BackupPlan(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.INSTANT},"{B}");

        //gain 1 life
        this.getSpellAbility().addEffect(new GainLifeEffect(1));

        //undying evil
        this.getSpellAbility().addEffect(new GainAbilityTargetEffect(new UndyingAbility(), Duration.EndOfTurn));
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());
    }

    private BackupPlan(final BackupPlan card) {
        super(card);
    }

    @Override
    public BackupPlan copy() {
        return new BackupPlan(this);
    }
}
