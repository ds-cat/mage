package mage.sets;

import mage.cards.ExpansionSet;
import mage.collation.BoosterCollator;
import mage.collation.BoosterStructure;
import mage.collation.CardRun;
import mage.collation.RarityConfiguration;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TheElk801
 */
public final class Slop extends ExpansionSet {

    private static final Slop instance = new Slop();

    public static Slop getInstance() {
        return instance;
    }

    private Slop() {
        super("Slop", "SLOP", ExpansionSet.buildDate(2025, 12, 13), SetType.EXPANSION);
        this.blockName = "Slop Block";
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.maxCardNumberInBooster = 390;

cards.add(new SetCardInfo("Barren Thoughtscape", 1, Rarity.RARE, mage.cards.b.BarrenThoughtscape.class));
cards.add(new SetCardInfo("Bringer of Tangents", 2, Rarity.COMMON, mage.cards.b.BringerOfTangets.class));
cards.add(new SetCardInfo("Creeping Scratch-mite", 3, Rarity.UNCOMMON, mage.cards.c.CreepingScratchMite.class));
cards.add(new SetCardInfo("De-story", 4, Rarity.UNCOMMON, mage.cards.d.Destory.class));
cards.add(new SetCardInfo("Embrace Oblivion Slop", 5, Rarity.RARE, mage.cards.e.EmbraceOblivionSlop.class));
cards.add(new SetCardInfo("Erupting Nexus", 6, Rarity.MYTHIC, mage.cards.e.EruptingNexus.class));
cards.add(new SetCardInfo("Familiar Abomination", 7, Rarity.COMMON, mage.cards.f.FamiliarAbomination.class));
cards.add(new SetCardInfo("Forsaken Archangel", 8, Rarity.MYTHIC, mage.cards.f.ForsakenArchangel.class));
cards.add(new SetCardInfo("Ganrav, Paradoxical Screamer", 9, Rarity.UNCOMMON, mage.cards.g.GanravParadoxicalScreamer.class));
cards.add(new SetCardInfo("Generic Bad Guy", 10, Rarity.UNCOMMON, mage.cards.g.GenericBadGuy.class));
cards.add(new SetCardInfo("Gray Mire", 11, Rarity.COMMON, mage.cards.g.GrayMire.class));
cards.add(new SetCardInfo("Hysteria", 12, Rarity.MYTHIC, mage.cards.h.Hysteria.class));
cards.add(new SetCardInfo("It That Blooms", 13, Rarity.UNCOMMON, mage.cards.i.ItThatBlooms.class));
cards.add(new SetCardInfo("Life from Nothing", 14, Rarity.COMMON, mage.cards.l.LifeFromNothing.class));
cards.add(new SetCardInfo("Meaningless Case", 15, Rarity.COMMON, mage.cards.m.MeaninglessCase.class));
cards.add(new SetCardInfo("Mixed Reality", 16, Rarity.UNCOMMON, mage.cards.m.MixedReality.class));
cards.add(new SetCardInfo("Mr. Sleepy", 17, Rarity.UNCOMMON, mage.cards.m.MrSleepy.class));
cards.add(new SetCardInfo("Ms. Honk", 18, Rarity.UNCOMMON, mage.cards.m.MsHonk.class));
cards.add(new SetCardInfo("Plastic Abomination", 19, Rarity.COMMON, mage.cards.p.PlasticAbomination.class));
cards.add(new SetCardInfo("Rampaging Scratch Beast", 20, Rarity.COMMON, mage.cards.r.RampagingScratchBeast.class));
cards.add(new SetCardInfo("The REAL Void Lord", 21, Rarity.RARE, mage.cards.t.TheRealVoidLord.class));
cards.add(new SetCardInfo("Scratch Razer", 22, Rarity.UNCOMMON, mage.cards.s.ScratchRazer.class));
cards.add(new SetCardInfo("Scratchgofy", 23, Rarity.RARE, mage.cards.s.Scratchgofy.class));
cards.add(new SetCardInfo("The Scratching", 24, Rarity.RARE, mage.cards.t.TheScratching.class));
cards.add(new SetCardInfo("Searing Void", 25, Rarity.COMMON, mage.cards.s.SearingVoid.class));
cards.add(new SetCardInfo("Shapeless Whisp", 26, Rarity.COMMON, mage.cards.s.ShapelessWhisp.class));
cards.add(new SetCardInfo("Slop Crusader", 27, Rarity.RARE, mage.cards.s.SlopCrusader.class));
cards.add(new SetCardInfo("Sorrowful Shadow", 28, Rarity.COMMON, mage.cards.s.SorrowfulShadow.class));
cards.add(new SetCardInfo("Spirit of Choice", 29, Rarity.RARE, mage.cards.s.SpiritOfChoice.class));
cards.add(new SetCardInfo("Spreading Scratches", 30, Rarity.COMMON, mage.cards.s.SpreadingScratches.class));
cards.add(new SetCardInfo("This Space is Left Intentionally Blank", 31, Rarity.MYTHIC, mage.cards.t.ThisSpaceIsLeftIntentionallyBlank.class));
cards.add(new SetCardInfo("Toon Class", 32, Rarity.RARE, mage.cards.t.ToonClass.class));
cards.add(new SetCardInfo("The Tripleing" , 33, Rarity.MYTHIC, mage.cards.t.TheTripleing.class));
cards.add(new SetCardInfo("Ugin, the Spirit Dragon", 34, Rarity.MYTHIC, mage.cards.u.UginTheSpiritDragon.class));
cards.add(new SetCardInfo("Unformed Abomination", 35, Rarity.COMMON, mage.cards.u.UnformedAbomination.class));
cards.add(new SetCardInfo("Vacuous Filler", 36, Rarity.COMMON, mage.cards.v.VacuousFiller.class));
cards.add(new SetCardInfo("Void Brute", 37, Rarity.COMMON, mage.cards.v.VoidBrute.class));
cards.add(new SetCardInfo("Void Cat", 38, Rarity.UNCOMMON, mage.cards.v.VoidCat.class));
cards.add(new SetCardInfo("Void Devourer", 39, Rarity.RARE, mage.cards.v.VoidDevourer.class));
cards.add(new SetCardInfo("Writhing Jealousy", 40, Rarity.COMMON, mage.cards.w.WrithingJealousy.class));
cards.add(new SetCardInfo("Altruism", 41, Rarity.UNCOMMON, mage.cards.a.Altruism.class));
cards.add(new SetCardInfo("Andy’s Chosen", 42, Rarity.MYTHIC, mage.cards.a.AndysChosen.class));
cards.add(new SetCardInfo("Anti-Skip Protection", 43, Rarity.RARE, mage.cards.a.AntiSkipProtection.class));
cards.add(new SetCardInfo("Banish to Hat Heaven", 44, Rarity.COMMON, mage.cards.b.BanishToHatHeaven.class));
cards.add(new SetCardInfo("Bullseye, Loyal Steed", 45, Rarity.RARE, mage.cards.b.BullseyeLoyalSteed.class));
cards.add(new SetCardInfo("Cat From Toy Story 4", 46, Rarity.UNCOMMON, mage.cards.c.CatFromToyStoryFour.class));
cards.add(new SetCardInfo("Chris \"Mario\" Pratt", 47, Rarity.COMMON, mage.cards.c.ChrisMarioPratt.class));
cards.add(new SetCardInfo("Cowboy Boots", 48, Rarity.UNCOMMON, mage.cards.c.CowboyBoots.class));
cards.add(new SetCardInfo("Daycare Rescuer", 49, Rarity.MYTHIC, mage.cards.d.DaycareRescuer.class));
cards.add(new SetCardInfo("Drain Disorder", 50, Rarity.RARE, mage.cards.d.DrainDisorder.class));
cards.add(new SetCardInfo("Duke Caboom", 51, Rarity.UNCOMMON, mage.cards.d.DukeCaboom.class));
cards.add(new SetCardInfo("Ego Dweller", 52, Rarity.RARE, mage.cards.e.EgoDweller.class));
cards.add(new SetCardInfo("The End 2", 53, Rarity.RARE, mage.cards.t.TheEnd2.class));
cards.add(new SetCardInfo("Escape Through Time", 54, Rarity.UNCOMMON, mage.cards.e.EscapeThroughTime.class));
cards.add(new SetCardInfo("Ethersworn Canonist", 55, Rarity.RARE, mage.cards.e.EtherswornCanonist.class));
cards.add(new SetCardInfo("Faith in Andy", 56, Rarity.COMMON, mage.cards.f.FaithInAndy.class));
cards.add(new SetCardInfo("Falling with Style", 57, Rarity.COMMON, mage.cards.f.FallingWithStyle.class));
cards.add(new SetCardInfo("Falling without Style", 58, Rarity.COMMON, mage.cards.f.FallingWithoutStyle.class));
cards.add(new SetCardInfo("Fanfiction Writer", 59, Rarity.RARE, mage.cards.f.FanfictionWriter.class));
cards.add(new SetCardInfo("Fill in the Blanks", 60, Rarity.UNCOMMON, mage.cards.f.FillInTheBlanks.class));
cards.add(new SetCardInfo("Finale", 61, Rarity.UNCOMMON, mage.cards.f.Finale.class));
cards.add(new SetCardInfo("Hat Heaven Mongoose", 62, Rarity.RARE, mage.cards.h.HatHeavenMongoose.class));
cards.add(new SetCardInfo("Hat Heaven Showdown", 63, Rarity.RARE, mage.cards.h.HatHeavenShowdown.class));
cards.add(new SetCardInfo("Heroic Triumph", 64, Rarity.COMMON, mage.cards.h.HeroicTriumph.class));
cards.add(new SetCardInfo("Hygiene Drug", 65, Rarity.COMMON, mage.cards.h.HygieneDrug.class));
cards.add(new SetCardInfo("Imposter Mongoose Lord", 66, Rarity.RARE, mage.cards.i.ImposterMongooseLord.class));
cards.add(new SetCardInfo("Intellectualism", 67, Rarity.COMMON, mage.cards.i.Intellectualism.class));
cards.add(new SetCardInfo("Jessie, Reluctant Backup", 68, Rarity.UNCOMMON, mage.cards.j.JessieReluctantBackup.class));
cards.add(new SetCardInfo("Ken, Fashionista", 69, Rarity.UNCOMMON, mage.cards.k.KenFashionista.class));
cards.add(new SetCardInfo("Lasso of Rope", 70, Rarity.COMMON, mage.cards.l.LassoOfRope.class));
cards.add(new SetCardInfo("A Long Journey Home", 71, Rarity.UNCOMMON, mage.cards.a.ALongJourneyHome.class));
cards.add(new SetCardInfo("Loyal Alien", 72, Rarity.COMMON, mage.cards.l.LoyalAlien.class));
cards.add(new SetCardInfo("Loyal Henchman", 73, Rarity.COMMON, mage.cards.l.LoyalHenchman.class));
cards.add(new SetCardInfo("Magical Enlargment", 74, Rarity.COMMON, mage.cards.m.MagicalEnlargment.class));
cards.add(new SetCardInfo("Mongoose Banisher", 75, Rarity.MYTHIC, mage.cards.m.MongoosBanisher.class));
cards.add(new SetCardInfo("OC Writer", 76, Rarity.UNCOMMON, mage.cards.o.OCWriter.class));
cards.add(new SetCardInfo("Order", 77, Rarity.RARE, mage.cards.o.Order.class));
cards.add(new SetCardInfo("The Phone From Toy Story 3", 78, Rarity.COMMON, mage.cards.t.ThePhoneFromToyStoryThree.class));
cards.add(new SetCardInfo("Quick Draw 2", 79, Rarity.COMMON, mage.cards.q.QuickDraw2.class));
cards.add(new SetCardInfo("The REAL Mongoose Lord", 80, Rarity.MYTHIC, mage.cards.t.TheRealMongooseLord.class));
cards.add(new SetCardInfo("Resolve Macguffin", 81, Rarity.COMMON, mage.cards.r.ResolveMacguffin.class));
cards.add(new SetCardInfo("Resurfacing", 82, Rarity.UNCOMMON, mage.cards.r.Resurfacing.class));
cards.add(new SetCardInfo("Sakura Hokage", 83, Rarity.MYTHIC, mage.cards.s.SakuraHokage.class));
cards.add(new SetCardInfo("Seeing Double", 84, Rarity.COMMON, mage.cards.s.SeeingDouble.class));
cards.add(new SetCardInfo("Sent to the Attic", 85, Rarity.UNCOMMON, mage.cards.s.SentToTheAttic.class));
cards.add(new SetCardInfo("Slinky Dog", 86, Rarity.COMMON, mage.cards.s.SlinkyDog.class));
cards.add(new SetCardInfo("Tour Guide Barbie", 87, Rarity.UNCOMMON, mage.cards.t.TourGuideBarbie.class));
cards.add(new SetCardInfo("Toy Repair Station", 88, Rarity.UNCOMMON, mage.cards.t.ToyRepairStation.class));
cards.add(new SetCardInfo("Toy Story Trilogy", 89, Rarity.COMMON, mage.cards.t.ToyStoryTrilogy.class));
cards.add(new SetCardInfo("Trapped in Film", 90, Rarity.COMMON, mage.cards.t.TrappedInFilm.class));
cards.add(new SetCardInfo("Unnamed Fem Enby", 91, Rarity.COMMON, mage.cards.u.UnnamedFemEnby.class));
cards.add(new SetCardInfo("Western Style Repeater", 92, Rarity.UNCOMMON, mage.cards.w.WesterStyleRepeater.class));
cards.add(new SetCardInfo("Woody’s Roundup", 93, Rarity.COMMON, mage.cards.w.WoodysRoundup.class));
cards.add(new SetCardInfo("Andy-Bot", 94, Rarity.RARE, mage.cards.a.Andybot.class));
cards.add(new SetCardInfo("Behemoth Manufacturer", 95, Rarity.UNCOMMON, mage.cards.b.BehemothManufacturer.class));
cards.add(new SetCardInfo("Behold the Truth", 96, Rarity.UNCOMMON, mage.cards.b.BeholdTheTruth.class));
cards.add(new SetCardInfo("Big Ideas", 97, Rarity.COMMON, mage.cards.b.BigIdeas.class));
cards.add(new SetCardInfo("Bonnie Star-Drone", 98, Rarity.COMMON, mage.cards.b.BonnieStarDrone.class));
cards.add(new SetCardInfo("Cloud Judgement", 99, Rarity.COMMON, mage.cards.c.CloudJudgement.class));
cards.add(new SetCardInfo("Cowboy Hat", 100, Rarity.UNCOMMON, mage.cards.c.CowboyHat.class));
cards.add(new SetCardInfo("Cowboy Mecha", 101, Rarity.COMMON, mage.cards.c.CowboyMecha.class));
cards.add(new SetCardInfo("Cowboy Vest", 102, Rarity.RARE, mage.cards.c.CowboyVest.class));
cards.add(new SetCardInfo("Debate Lord", 103, Rarity.COMMON, mage.cards.d.DebateLord.class));
cards.add(new SetCardInfo("Disrupt Thought", 104, Rarity.COMMON, mage.cards.d.DisruptThought.class));
cards.add(new SetCardInfo("Drain Ideas", 105, Rarity.RARE, mage.cards.d.DrainIdeas.class));
cards.add(new SetCardInfo("Dream Glider", 106, Rarity.COMMON, mage.cards.d.DreamGlider.class));
cards.add(new SetCardInfo("Expanded Intellect", 107, Rarity.RARE, mage.cards.e.ExpandedIntellect.class));
cards.add(new SetCardInfo("Forget Idea", 108, Rarity.COMMON, mage.cards.f.ForgetIdea.class));
cards.add(new SetCardInfo("Frigid Waters", 109, Rarity.UNCOMMON, mage.cards.f.FrigidWaters.class));
cards.add(new SetCardInfo("Idea Trawller", 110, Rarity.COMMON, mage.cards.i.IdeaTrawller.class));
cards.add(new SetCardInfo("L.D.C. Strategist", 111, Rarity.COMMON, mage.cards.l.LDCStrategist.class));
cards.add(new SetCardInfo("Loremaster Class", 112, Rarity.RARE, mage.cards.l.LoremasterClass.class));
cards.add(new SetCardInfo("Man-o’-Thoughts", 113, Rarity.COMMON, mage.cards.m.ManOThoughts.class));
cards.add(new SetCardInfo("Mind Thrust", 114, Rarity.UNCOMMON, mage.cards.m.MindTrust.class));
cards.add(new SetCardInfo("Mirage Manifest", 115, Rarity.RARE, mage.cards.m.MirageManifest.class));
cards.add(new SetCardInfo("Mongoose Accountant", 116, Rarity.RARE, mage.cards.m.MongooseAccountant.class));
cards.add(new SetCardInfo("Moonstruck Thought", 117, Rarity.UNCOMMON, mage.cards.m.MoonstructThought.class));
cards.add(new SetCardInfo("Mr. Evil Dr. Porkchop", 118, Rarity.MYTHIC, mage.cards.m.MrEvilDrPorkchop.class));
cards.add(new SetCardInfo("Mr. Shark", 119, Rarity.RARE, mage.cards.m.MrShark.class));
cards.add(new SetCardInfo("Naegate", 120, Rarity.COMMON, mage.cards.n.Negate.class));
cards.add(new SetCardInfo("Offscreen Training", 121, Rarity.COMMON, mage.cards.o.OffscreanTraining.class));
cards.add(new SetCardInfo("Opportunistic Toy", 122, Rarity.UNCOMMON, mage.cards.o.OpportunisticToy.class));
cards.add(new SetCardInfo("Plagiarize2", 123, Rarity.RARE, mage.cards.p.Plagiarize2.class));
cards.add(new SetCardInfo("Plot Convenience", 124, Rarity.COMMON, mage.cards.p.PlotConvenience.class));
cards.add(new SetCardInfo("Ptero-doll-ctyl", 125, Rarity.UNCOMMON, mage.cards.p.Pterodollctyl.class));
cards.add(new SetCardInfo("Recalibrate 2", 126, Rarity.UNCOMMON, mage.cards.r.Recalibrate2.class));
cards.add(new SetCardInfo("Research Generator", 127, Rarity.COMMON, mage.cards.r.ResearchGenerator.class));
cards.add(new SetCardInfo("Science Slave™", 128, Rarity.COMMON, mage.cards.s.ScienceSlave.class));
cards.add(new SetCardInfo("Space Ranger Utility Belt", 129, Rarity.MYTHIC, mage.cards.s.SpaceRangerUtilityBelt.class));
cards.add(new SetCardInfo("Spirit of Nostagia", 130, Rarity.MYTHIC, mage.cards.s.SpiritOfNostagia.class));
cards.add(new SetCardInfo("Spirit-Hunting Doll", 131, Rarity.MYTHIC, mage.cards.s.SpiritHuntingDoll.class));
cards.add(new SetCardInfo("Subconscious Defender", 132, Rarity.COMMON, mage.cards.s.SubcounsciousDefender.class));
cards.add(new SetCardInfo("Superego Dweller", 133, Rarity.RARE, mage.cards.s.SuperegoDweller.class));
cards.add(new SetCardInfo("Thirst for Purpose", 134, Rarity.UNCOMMON, mage.cards.t.ThirstForPurpose.class));
cards.add(new SetCardInfo("Toy Mage", 135, Rarity.UNCOMMON, mage.cards.t.ToyMage.class));
cards.add(new SetCardInfo("Toy Soldiers", 136, Rarity.UNCOMMON, mage.cards.t.ToySoldiers.class));
cards.add(new SetCardInfo("Trawl the Subconscious", 137, Rarity.UNCOMMON, mage.cards.t.TrawlTheSubconscious.class));
cards.add(new SetCardInfo("Unmoored Toy", 138, Rarity.COMMON, mage.cards.u.UnmooredToy.class));
cards.add(new SetCardInfo("Unwrite", 139, Rarity.COMMON, mage.cards.u.Unwrite.class));
cards.add(new SetCardInfo("Venture to Andy", 140, Rarity.MYTHIC, mage.cards.v.VentureToAndy.class));
cards.add(new SetCardInfo("Void Toy", 141, Rarity.COMMON, mage.cards.v.VoidToy.class));
cards.add(new SetCardInfo("Wall of Ideas", 142, Rarity.UNCOMMON, mage.cards.w.WallOfIdeas.class));
cards.add(new SetCardInfo("Wandering Narrator", 143, Rarity.UNCOMMON, mage.cards.w.WanderingNarrator.class));
cards.add(new SetCardInfo("Woody, Mind Master", 144, Rarity.MYTHIC, mage.cards.w.WoodyMindMaster.class));
cards.add(new SetCardInfo("The Writing Process", 145, Rarity.COMMON, mage.cards.t.TheWritingProcess.class));
cards.add(new SetCardInfo("Backup Plan", 146, Rarity.COMMON, mage.cards.b.BackupPlan.class));
cards.add(new SetCardInfo("The Big One", 147, Rarity.COMMON, mage.cards.t.TheBigOne.class));
cards.add(new SetCardInfo("Bog Base Henchgoon", 148, Rarity.UNCOMMON, mage.cards.b.BogBaseHenchgoon.class));
cards.add(new SetCardInfo("Boot Dwelling Serpent", 149, Rarity.COMMON, mage.cards.b.BootDwellingSerpent.class));
cards.add(new SetCardInfo("Boot Hell Showdown", 150, Rarity.RARE, mage.cards.b.BootHellShowdown.class));
cards.add(new SetCardInfo("Bootless Snake", 151, Rarity.COMMON, mage.cards.b.BootlessSnake.class));
cards.add(new SetCardInfo("Cast Down", 152, Rarity.UNCOMMON, mage.cards.c.CastDown.class));
cards.add(new SetCardInfo("Chase, Class Traitor", 153, Rarity.RARE, mage.cards.c.ChaseClassTraitor.class));
cards.add(new SetCardInfo("Cliché-Class Spaceship", 154, Rarity.UNCOMMON, mage.cards.c.ClicheClassSpaceship.class));
cards.add(new SetCardInfo("Creatively Bankrupt", 155, Rarity.RARE, mage.cards.c.CreativelyBankrupt.class));
cards.add(new SetCardInfo("A Difficult Choice", 156, Rarity.COMMON, mage.cards.a.ADifficultChoice.class));
cards.add(new SetCardInfo("Director-Virus!", 157, Rarity.MYTHIC, mage.cards.d.DirectorVirus.class));
cards.add(new SetCardInfo("Drain Creativity", 158, Rarity.RARE, mage.cards.d.DrainCreativity.class));
cards.add(new SetCardInfo("Drama Farmer", 159, Rarity.UNCOMMON, mage.cards.d.DramaFarmer.class));
cards.add(new SetCardInfo("Dreams of Slop", 160, Rarity.RARE, mage.cards.d.DreamsOfSlop.class));
cards.add(new SetCardInfo("Eidolon of Creative Bankruptcy", 161, Rarity.COMMON, mage.cards.e.EidolonOfCreativeBankruptcy.class));
cards.add(new SetCardInfo("Eye of Madness", 162, Rarity.UNCOMMON, mage.cards.e.EyeOfMadness.class));
cards.add(new SetCardInfo("Fade into Irrelevance", 163, Rarity.COMMON, mage.cards.f.FadeIntoIrrelevance.class));
cards.add(new SetCardInfo("Fall Down the Stairs", 164, Rarity.COMMON, mage.cards.f.FallDownTheStairs.class));
cards.add(new SetCardInfo("Forgotten Plotlines", 165, Rarity.COMMON, mage.cards.f.ForgottenPlotlines.class));
cards.add(new SetCardInfo("Horrid Swarm", 166, Rarity.UNCOMMON, mage.cards.h.HorridSwarm.class));
cards.add(new SetCardInfo("Hot Topic™ Debt Collector", 167, Rarity.UNCOMMON, mage.cards.h.HotTopicDebtCollector.class));
cards.add(new SetCardInfo("Id Dweller", 168, Rarity.UNCOMMON, mage.cards.i.IdDweller.class));
cards.add(new SetCardInfo("Imposter Snake Lord", 169, Rarity.COMMON, mage.cards.i.ImposterSnakeLord.class));
cards.add(new SetCardInfo("Impoverished Script Writer", 170, Rarity.COMMON, mage.cards.i.ImpoverishedScriptWriter.class));
cards.add(new SetCardInfo("Kirithree", 171, Rarity.COMMON, mage.cards.k.Kirithree.class));
cards.add(new SetCardInfo("Lotso Commander", 172, Rarity.RARE, mage.cards.l.LotsoCommander.class));
cards.add(new SetCardInfo("Lotso D.C. Propaganda", 173, Rarity.RARE, mage.cards.l.LotsoDCPropagandas.class));
cards.add(new SetCardInfo("Lotso D.C. Recuiter", 174, Rarity.COMMON, mage.cards.l.LotsoDcRecuiter.class));
cards.add(new SetCardInfo("Lotso Lieutenant", 175, Rarity.UNCOMMON, mage.cards.l.LotsoLieutenant.class));
cards.add(new SetCardInfo("Nameless Public Safety Hunter", 176, Rarity.UNCOMMON, mage.cards.n.NamelessPublicSafetyHunter.class));
cards.add(new SetCardInfo("Open Recasts", 177, Rarity.UNCOMMON, mage.cards.o.OpenRecasts.class));
cards.add(new SetCardInfo("Punished Woody", 178, Rarity.MYTHIC, mage.cards.p.PunishedWoody.class));
cards.add(new SetCardInfo("Ranger Mini-Drill", 179, Rarity.UNCOMMON, mage.cards.r.RangerMiniDrill.class));
cards.add(new SetCardInfo("The REAL Snake Lord", 180, Rarity.RARE, mage.cards.t.TheRealSnakeLord.class));
cards.add(new SetCardInfo("Reaper’s Penumbra", 181, Rarity.RARE, mage.cards.r.ReapersPenumbra.class));
cards.add(new SetCardInfo("Reoccuring Villan", 182, Rarity.UNCOMMON, mage.cards.r.ReoccuringVillan.class));
cards.add(new SetCardInfo("Revenge of stinky pete", 183, Rarity.COMMON, mage.cards.r.RevangeOfStinkyPete.class));
cards.add(new SetCardInfo("Rushed Deadlines", 184, Rarity.UNCOMMON, mage.cards.r.RushedDeadlines.class));
cards.add(new SetCardInfo("Sid, Toy Artisan", 185, Rarity.MYTHIC, mage.cards.s.SidToyArtisan.class));
cards.add(new SetCardInfo("Slopverse Denizen", 186, Rarity.RARE, mage.cards.s.SlopverseDenizen.class));
cards.add(new SetCardInfo("Snake Lord Assassin", 187, Rarity.RARE, mage.cards.s.SnakeLordAssassin.class));
cards.add(new SetCardInfo("Sooty Try", 188, Rarity.MYTHIC, mage.cards.s.SootyTry.class));
cards.add(new SetCardInfo("Spider Baby", 189, Rarity.COMMON, mage.cards.s.SpiderBaby.class));
cards.add(new SetCardInfo("STINKY PETE EMACIATED CORPSE MISSLE", 190, Rarity.COMMON, mage.cards.s.StinkyPeteEmaciatedCorpseMissle.class));
cards.add(new SetCardInfo("Tainted Floodwater", 191, Rarity.UNCOMMON, mage.cards.t.TaintedFloodwater.class));
cards.add(new SetCardInfo("Toy Dungeon Cadaver", 192, Rarity.COMMON, mage.cards.t.ToyDungeonCadaver.class));
cards.add(new SetCardInfo("Visions of the Abyss", 193, Rarity.COMMON, mage.cards.v.VisionsOfTheAbyss.class));
cards.add(new SetCardInfo("Void Monolith", 194, Rarity.MYTHIC, mage.cards.v.VoidMonolith.class));
cards.add(new SetCardInfo("Winged Snake", 195, Rarity.COMMON, mage.cards.w.WingedSnake.class));
cards.add(new SetCardInfo("Write Out", 196, Rarity.COMMON, mage.cards.w.WriteOut.class));
cards.add(new SetCardInfo("Another Mans Trash", 197, Rarity.MYTHIC, mage.cards.a.AnotherMansTrash.class));
cards.add(new SetCardInfo("Barrel of Monkeys", 198, Rarity.MYTHIC, mage.cards.b.BarrelOfMonkeys.class));
cards.add(new SetCardInfo("Blazing Desire", 199, Rarity.RARE, mage.cards.b.BlazingDesire.class));
cards.add(new SetCardInfo("Booster Sinclair Munchapper", 200, Rarity.UNCOMMON, mage.cards.b.BoosterSinclairMunchapper.class));
cards.add(new SetCardInfo("Boybuilder Skateboard", 201, Rarity.COMMON, mage.cards.b.BoybuilderSkateboard.class));
cards.add(new SetCardInfo("Brewing Storm", 202, Rarity.RARE, mage.cards.b.BrewingStorm.class));
cards.add(new SetCardInfo("Charred Soldier", 203, Rarity.UNCOMMON, mage.cards.c.CharredSoldier.class));
cards.add(new SetCardInfo("Creative Blitz", 204, Rarity.COMMON, mage.cards.c.CreativeBlitz.class));
cards.add(new SetCardInfo("Crunch Time", 205, Rarity.COMMON, mage.cards.c.CrunchTime.class));
cards.add(new SetCardInfo("Cymbol Monkey", 206, Rarity.COMMON, mage.cards.c.CymbolMonkey.class));
cards.add(new SetCardInfo("The Director Axe", 207, Rarity.COMMON, mage.cards.t.TheDirectorAxe.class));
cards.add(new SetCardInfo("Dozens of Feral Hogs", 208, Rarity.COMMON, mage.cards.d.DozensOfFeralHogs.class));
cards.add(new SetCardInfo("Drain Energy", 209, Rarity.RARE, mage.cards.d.DrainEnergy.class));
cards.add(new SetCardInfo("Duck-Man", 210, Rarity.UNCOMMON, mage.cards.d.DuckMan.class));
cards.add(new SetCardInfo("End of a Trilogy", 211, Rarity.COMMON, mage.cards.e.EndOfATrilogy.class));
cards.add(new SetCardInfo("Everything All at Once", 212, Rarity.COMMON, mage.cards.e.EverythingAllAtOnce.class));
cards.add(new SetCardInfo("Flaming Moon", 213, Rarity.COMMON, mage.cards.f.FlamingMoon.class));
cards.add(new SetCardInfo("Frog Car", 214, Rarity.COMMON, mage.cards.f.FrogCar.class));
cards.add(new SetCardInfo("Generated Abomination", 215, Rarity.COMMON, mage.cards.g.GeneratedAbomination.class));
cards.add(new SetCardInfo("Hand Box", 216, Rarity.UNCOMMON, mage.cards.h.HandBox.class));
cards.add(new SetCardInfo("Hot Shot Detective", 217, Rarity.COMMON, mage.cards.h.HotShotDetective.class));
cards.add(new SetCardInfo("Jessie, Plot Device", 218, Rarity.UNCOMMON, mage.cards.j.JessiePlotDevice.class));
cards.add(new SetCardInfo("Karla, Invading Inferno", 219, Rarity.RARE, mage.cards.k.KarlaInvadingInferno.class));
cards.add(new SetCardInfo("Knife Guy (Worm)", 220, Rarity.RARE, mage.cards.k.KnifeGuyWorm.class));
cards.add(new SetCardInfo("Loss of Structure", 221, Rarity.COMMON, mage.cards.l.LossOfStructure.class));
cards.add(new SetCardInfo("Massive Deals", 221, Rarity.COMMON, mage.cards.m.MassiveDeals.class));
cards.add(new SetCardInfo("The Meat Worm", 222, Rarity.RARE, mage.cards.t.TheMeatWorm.class));
cards.add(new SetCardInfo("Mira Nova", 223, Rarity.RARE, mage.cards.m.MiraNova.class));
cards.add(new SetCardInfo("Nail Ring", 224, Rarity.COMMON, mage.cards.n.NailRing.class));
cards.add(new SetCardInfo("Next-Bot", 225, Rarity.MYTHIC, mage.cards.n.NextBot.class));
cards.add(new SetCardInfo("Opening Your Eyes", 226, Rarity.UNCOMMON, mage.cards.o.OpeningYourEyes.class));
cards.add(new SetCardInfo("Pizza Planet Delivery Car", 227, Rarity.MYTHIC, mage.cards.p.PizzaPlanetDeliveryCar.class));
cards.add(new SetCardInfo("Plasticine Drake", 228, Rarity.UNCOMMON, mage.cards.p.PlasticineDrake.class));
cards.add(new SetCardInfo("Prospector Professor", 229, Rarity.RARE, mage.cards.p.ProspectorProfessor.class));
cards.add(new SetCardInfo("Psychosis Phantasm", 230, Rarity.COMMON, mage.cards.p.PsychosisPhantasm.class));
cards.add(new SetCardInfo("Scratch-flame Dragon", 231, Rarity.MYTHIC, mage.cards.s.ScratchFlameDrake.class));
cards.add(new SetCardInfo("Scratch-wave", 232, Rarity.RARE, mage.cards.s.ScratchWave.class));
cards.add(new SetCardInfo("Scratched", 233, Rarity.COMMON, mage.cards.s.Scratched.class));
cards.add(new SetCardInfo("Sentient Orb", 234, Rarity.UNCOMMON, mage.cards.s.SentientOrb.class));
cards.add(new SetCardInfo("Shivan Dragon", 235, Rarity.UNCOMMON, mage.cards.s.ShivanDragon.class));
cards.add(new SetCardInfo("Sid, Misunderstood Artist", 235, Rarity.UNCOMMON, mage.cards.s.SidMisunderstoodArtist.class));
cards.add(new SetCardInfo("Spectral Toy Beast", 236, Rarity.COMMON, mage.cards.s.SpectralToyBeast.class));
cards.add(new SetCardInfo("Spitfire Katana", 237, Rarity.UNCOMMON, mage.cards.s.SpitfireKatana.class));
cards.add(new SetCardInfo("Tearing Through Layers", 238, Rarity.UNCOMMON, mage.cards.t.TearingThroughLayers.class));
cards.add(new SetCardInfo("Toss in", 238, Rarity.UNCOMMON, mage.cards.t.TossIn.class));
cards.add(new SetCardInfo("Toy Hooker", 239, Rarity.UNCOMMON, mage.cards.t.ToyHooker.class));
cards.add(new SetCardInfo("Toy Tinkerer ", 240, Rarity.UNCOMMON, mage.cards.t.ToyTinkerer.class));
cards.add(new SetCardInfo("TOY-BOT", 241, Rarity.RARE, mage.cards.t.ToyBot.class));
cards.add(new SetCardInfo("Unnessary Side Character", 242, Rarity.COMMON, mage.cards.u.UnnessarySideCharacter.class));
cards.add(new SetCardInfo("Wild Laser Blast", 243, Rarity.COMMON, mage.cards.w.WildLaserBlast.class));
cards.add(new SetCardInfo("XR, Xperimental Ranger", 244, Rarity.MYTHIC, mage.cards.x.XrXperimentalRanger.class));
cards.add(new SetCardInfo("Young Stinky Pete", 245, Rarity.COMMON, mage.cards.y.YoungStinkyPete.class));
cards.add(new SetCardInfo("\"cash money\" ", 246, Rarity.COMMON, mage.cards.c.CashMoney.class));
cards.add(new SetCardInfo("All Consuming Rot", 250, Rarity.UNCOMMON, mage.cards.a.AllConsumingRot.class));
cards.add(new SetCardInfo("Apple Pitou", 251, Rarity.COMMON, mage.cards.a.ApplePitou.class));
cards.add(new SetCardInfo("Army Medic", 252, Rarity.UNCOMMON, mage.cards.a.ArmyMedic.class));
cards.add(new SetCardInfo("Army Toy", 253, Rarity.COMMON, mage.cards.a.ArmyToy.class));
cards.add(new SetCardInfo("Beckoning Call", 254, Rarity.COMMON, mage.cards.b.BeckoningCall.class));
cards.add(new SetCardInfo("Buster", 255, Rarity.UNCOMMON, mage.cards.b.Buster.class));
cards.add(new SetCardInfo("Cat Car", 256, Rarity.MYTHIC, mage.cards.c.CatCar.class));
cards.add(new SetCardInfo("Cat Feeder", 257, Rarity.RARE, mage.cards.c.CatFeeder.class));
cards.add(new SetCardInfo("Character Builder", 258, Rarity.RARE, mage.cards.c.CharacterBuilder.class));
cards.add(new SetCardInfo("Coming Home", 259, Rarity.RARE, mage.cards.c.ComingHome.class));
cards.add(new SetCardInfo("Crop Rotation", 260, Rarity.COMMON, mage.cards.c.CropRotation.class));
cards.add(new SetCardInfo("Curious Writer", 261, Rarity.UNCOMMON, mage.cards.c.CuriousWriter.class));
cards.add(new SetCardInfo("Drain Resources", 262, Rarity.RARE, mage.cards.d.DrainResources.class));
cards.add(new SetCardInfo("Dream Realm Walker", 263, Rarity.RARE, mage.cards.d.DreamRealmWalker.class));
cards.add(new SetCardInfo("Emergency Boot Knife", 264, Rarity.UNCOMMON, mage.cards.e.EmergencyBootKnife.class));
cards.add(new SetCardInfo("Ethan \"CAD\" MacManus", 265, Rarity.RARE, mage.cards.e.EthanCADMacManus.class));
cards.add(new SetCardInfo("Expansion of Plot", 266, Rarity.UNCOMMON, mage.cards.e.ExpansionOfPlot.class));
cards.add(new SetCardInfo("Fly-Man", 267, Rarity.COMMON, mage.cards.f.FlyMan.class));
cards.add(new SetCardInfo("Generic Dinosaur Toy", 268, Rarity.COMMON, mage.cards.g.GenericDinosaurToy.class));
cards.add(new SetCardInfo("Gluttonous Beast", 269, Rarity.COMMON, mage.cards.g.GluttonousBeast.class));
cards.add(new SetCardInfo("Goku Green", 270, Rarity.MYTHIC, mage.cards.g.GokuGreen.class));
cards.add(new SetCardInfo("Green Snake", 271, Rarity.COMMON, mage.cards.g.GreenSnake.class));
cards.add(new SetCardInfo("The Happy Canteen", 272, Rarity.MYTHIC, mage.cards.t.TheHappyCanteen.class));
cards.add(new SetCardInfo("Housewurm", 273, Rarity.MYTHIC, mage.cards.h.Housewurm.class));
cards.add(new SetCardInfo("Imposter Piss", 274, Rarity.RARE, mage.cards.i.ImposterPiss.class));
cards.add(new SetCardInfo("Incongruous Growth", 275, Rarity.COMMON, mage.cards.i.IncongruousGrowth.class));
cards.add(new SetCardInfo("Inevitable Confrontation", 276, Rarity.COMMON, mage.cards.i.InevitableConfrontation.class));
cards.add(new SetCardInfo("Main Character Syndrome", 277, Rarity.COMMON, mage.cards.m.MainCharacterSyndrome.class));
cards.add(new SetCardInfo("Meticulous Planner", 278, Rarity.COMMON, mage.cards.m.MeticulousPlanner.class));
cards.add(new SetCardInfo("Mr. Fresh", 279, Rarity.COMMON, mage.cards.m.MrFresh.class));
cards.add(new SetCardInfo("Mr. Normal", 280, Rarity.UNCOMMON, mage.cards.m.MrNormal.class));
cards.add(new SetCardInfo("Mr. Piss", 281, Rarity.COMMON, mage.cards.m.MrPiss.class));
cards.add(new SetCardInfo("Ms. Chess", 282, Rarity.COMMON, mage.cards.m.MsChess.class));
cards.add(new SetCardInfo("Ms. Kibble", 283, Rarity.UNCOMMON, mage.cards.m.MsKibble.class));
cards.add(new SetCardInfo("Mulcher", 284, Rarity.UNCOMMON, mage.cards.m.Mulcher.class));
cards.add(new SetCardInfo("Mutant Bear", 285, Rarity.COMMON, mage.cards.m.MutantBear.class));
cards.add(new SetCardInfo("New Beginnings" , 286, Rarity.COMMON, mage.cards.n.NewBeginnings.class));
cards.add(new SetCardInfo("Primordial Growth", 287, Rarity.RARE, mage.cards.p.PrimordialGrowth.class));
cards.add(new SetCardInfo("Prospector Mines", 288, Rarity.RARE, mage.cards.p.ProspectorMines.class));
cards.add(new SetCardInfo("Prospector Outfit", 289, Rarity.UNCOMMON, mage.cards.p.ProspectorOutfit.class));
cards.add(new SetCardInfo("Refreshed Mind", 290, Rarity.COMMON, mage.cards.r.RefreshedMind.class));
cards.add(new SetCardInfo("Resurrection of the Old One", 291, Rarity.RARE, mage.cards.r.ResurrectionOfTheOldOne.class));
cards.add(new SetCardInfo("Self-Driving Narrative", 292, Rarity.UNCOMMON, mage.cards.s.SelfDrivingNarrative.class));
cards.add(new SetCardInfo("Shadow Dweller", 293, Rarity.UNCOMMON, mage.cards.s.ShadowDweller.class));
cards.add(new SetCardInfo("Shattered Mirror Style", 294, Rarity.COMMON, mage.cards.s.ShatteredMirrorStyle.class));
cards.add(new SetCardInfo("Sir Beef, Conqueror of Mount Kibble", 295, Rarity.UNCOMMON, mage.cards.s.SirBeefConquerorOfMountKibble.class));
cards.add(new SetCardInfo("Slop-Gorger Wurm", 296, Rarity.RARE, mage.cards.s.SlopGorgerWurm.class));
cards.add(new SetCardInfo("Snake Lord Champion", 297, Rarity.MYTHIC, mage.cards.s.SnakeLordChampion.class));
cards.add(new SetCardInfo("Snake Lord Hypeman", 298, Rarity.COMMON, mage.cards.s.SnakeLordHypeman.class));
cards.add(new SetCardInfo("Spirit of Growth", 299, Rarity.COMMON, mage.cards.s.SpiritOfGrowth.class));
cards.add(new SetCardInfo("The Stinkwalker", 300, Rarity.UNCOMMON, mage.cards.t.TheStinkwalker.class));
cards.add(new SetCardInfo("Warped Glass Strike", 301, Rarity.UNCOMMON, mage.cards.w.WarpedGlassStrike.class));
cards.add(new SetCardInfo("Wild Terraforming", 302, Rarity.COMMON, mage.cards.w.WildTerraforming.class));
cards.add(new SetCardInfo("\"Stinky\" Pete", 303, Rarity.MYTHIC, mage.cards.s.StinkyPete.class));
cards.add(new SetCardInfo("Ambition", 304, Rarity.MYTHIC, mage.cards.a.Ambition.class));
cards.add(new SetCardInfo("Bonnie, Star Empress", 305, Rarity.MYTHIC, mage.cards.b.BonnieStarEmpress.class));
cards.add(new SetCardInfo("Brother Calm", 306, Rarity.RARE, mage.cards.b.BrotherCalm.class));
cards.add(new SetCardInfo("Buzz, Space Ranger", 307, Rarity.UNCOMMON, mage.cards.b.BuzzSpaceRanger.class));
cards.add(new SetCardInfo("Deep Mine Prospector" , 308, Rarity.UNCOMMON, mage.cards.d.DeepMineProspector.class));
cards.add(new SetCardInfo("The Director", 309, Rarity.UNCOMMON, mage.cards.t.TheDirector.class));
cards.add(new SetCardInfo("Future Rex", 310, Rarity.MYTHIC, mage.cards.f.FutureRex.class));
cards.add(new SetCardInfo("Invasion of Andy’s House", 311, Rarity.MYTHIC, mage.cards.i.InvasionOfAndysHouse.class));
cards.add(new SetCardInfo("Jessie, Unified", 312, Rarity.RARE, mage.cards.j.JessieUnified.class));
cards.add(new SetCardInfo("Lotso, Would be Tyrant", 313, Rarity.UNCOMMON, mage.cards.l.LotsoWouldBeTyrant.class));
cards.add(new SetCardInfo("Lucas Davidowicz", 314, Rarity.RARE, mage.cards.l.LucasDavidowicz.class));
cards.add(new SetCardInfo("Malicious Imprint", 315, Rarity.RARE, mage.cards.m.MaliciousImprint.class));
cards.add(new SetCardInfo("Punished Woody, Awakened", 316, Rarity.MYTHIC, mage.cards.p.PunishedWoodyAwakened.class));
cards.add(new SetCardInfo("Sell Out", 317, Rarity.UNCOMMON, mage.cards.s.SellOut.class));
cards.add(new SetCardInfo("The Snack Children", 318, Rarity.RARE, mage.cards.t.TheSnackChildren.class));
cards.add(new SetCardInfo("Stalling for Time", 319, Rarity.MYTHIC, mage.cards.s.StallingForTime.class));
cards.add(new SetCardInfo("Woody, Intellectual", 320, Rarity.UNCOMMON, mage.cards.w.WoodyIntellectual.class));
cards.add(new SetCardInfo("Zurg, Loving Father", 322, Rarity.MYTHIC, mage.cards.z.ZurgLovingFather.class));
cards.add(new SetCardInfo("The Dark Side of the Force", 322, Rarity.MYTHIC, mage.cards.t.TheDarkSideOfTheForce.class));
cards.add(new SetCardInfo("Godless Beast", 323, Rarity.UNCOMMON, mage.cards.g.GodlessBeast.class));
cards.add(new SetCardInfo("The Light Side of the Force", 324, Rarity.MYTHIC, mage.cards.t.TheLightSideOfTheForce.class));
cards.add(new SetCardInfo("The Splitening", 325, Rarity.MYTHIC, mage.cards.t.TheSplitening.class));
cards.add(new SetCardInfo("Double Tap", 326, Rarity.COMMON, mage.cards.d.DoubleTap.class));
cards.add(new SetCardInfo("Fact", 327, Rarity.COMMON, mage.cards.f.Fact.class));
cards.add(new SetCardInfo("Hard", 328, Rarity.RARE, mage.cards.h.Hard.class));
cards.add(new SetCardInfo("To Infinity", 329, Rarity.RARE, mage.cards.t.ToInfinty.class));
cards.add(new SetCardInfo("0.312598 Magic Stones", 330, Rarity.RARE, mage.cards.z.ZeroPointMagicStones.class));
cards.add(new SetCardInfo("Crucible of Worlds", 331, Rarity.MYTHIC, mage.cards.c.CrucibleOfWorlds.class));
cards.add(new SetCardInfo("Demo Mode Toy", 332, Rarity.COMMON, mage.cards.d.DemoModeToy.class));
cards.add(new SetCardInfo("Ken, Blank Slate", 333, Rarity.COMMON, mage.cards.k.KenBlankSlate.class));
cards.add(new SetCardInfo("Lunar Larry", 334, Rarity.COMMON, mage.cards.l.LunarLary.class));
cards.add(new SetCardInfo("Magic Stone", 335, Rarity.COMMON, mage.cards.m.MagicStone.class));
cards.add(new SetCardInfo("Makeshift Laser", 336, Rarity.COMMON, mage.cards.m.MakeshiftLaser.class));
cards.add(new SetCardInfo("Minor House Piece" , 337, Rarity.UNCOMMON, mage.cards.m.MinorHousePiece.class));
cards.add(new SetCardInfo("Pete’s Pickaxe", 338, Rarity.MYTHIC, mage.cards.p.PetesPickaxe.class));
cards.add(new SetCardInfo("Ring That Says \"Fuck\"", 339, Rarity.MYTHIC, mage.cards.r.RingThatSaysFuck.class));
cards.add(new SetCardInfo("Slop Mirror", 340, Rarity.RARE, mage.cards.s.SlopMirror.class));
cards.add(new SetCardInfo("Slop Scoop", 341, Rarity.COMMON, mage.cards.s.SlopScooop.class));
cards.add(new SetCardInfo("Sword of Slop and Madness", 342, Rarity.MYTHIC, mage.cards.s.SwordOfSlopAndMadness.class));
cards.add(new SetCardInfo("Toy Drone", 343, Rarity.COMMON, mage.cards.t.ToyDrone.class));
cards.add(new SetCardInfo("Toy in Andy’s Likeness", 344, Rarity.COMMON, mage.cards.t.ToyInAndysLikeness.class));
cards.add(new SetCardInfo("Toy Sword", 345, Rarity.COMMON, mage.cards.t.ToySword.class));
cards.add(new SetCardInfo("Trash Toy", 346, Rarity.COMMON, mage.cards.t.TrashToy.class));
cards.add(new SetCardInfo("Wilted Lotus", 347, Rarity.RARE, mage.cards.w.WiltedLotus.class));
cards.add(new SetCardInfo("Andy’s Apartment", 348, Rarity.MYTHIC, mage.cards.a.AndysApartment.class));
cards.add(new SetCardInfo("Andy’s House", 349, Rarity.MYTHIC, mage.cards.a.AndysHouse.class));
cards.add(new SetCardInfo("Andy’s Tree House", 350, Rarity.RARE, mage.cards.a.AndysTreeHouse.class));
cards.add(new SetCardInfo("Boot Hell", 351, Rarity.COMMON, mage.cards.b.BootHell.class));
cards.add(new SetCardInfo("Burnlands", 352, Rarity.COMMON, mage.cards.b.Burnlands.class));
cards.add(new SetCardInfo("City Hall", 353, Rarity.COMMON, mage.cards.c.CityHall.class));
cards.add(new SetCardInfo("Dead Growths", 354, Rarity.COMMON, mage.cards.d.DeadGrowths.class));
cards.add(new SetCardInfo("Dessert-Lands", 355, Rarity.MYTHIC, mage.cards.d.DessertLands.class));
cards.add(new SetCardInfo("Dr. House", 356, Rarity.MYTHIC, mage.cards.d.DrHouse.class));
cards.add(new SetCardInfo("Empty Acre", 357, Rarity.RARE, mage.cards.e.EmptyAcre.class));
cards.add(new SetCardInfo("Evolving Wilds" , 358, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
cards.add(new SetCardInfo("Exploded Ship", 359, Rarity.UNCOMMON, mage.cards.e.ExplodedShip.class));
cards.add(new SetCardInfo("The Forest", 360, Rarity.RARE, mage.cards.t.TheForest.class));
cards.add(new SetCardInfo("Hat Heaven Walkable City", 361, Rarity.UNCOMMON, mage.cards.h.HatHeavenWalkableCity.class));
cards.add(new SetCardInfo("Lotso DC Logistic Center", 362, Rarity.UNCOMMON, mage.cards.l.LostsoDCLogisticCenter.class));
cards.add(new SetCardInfo("Lotso’s Lair", 363, Rarity.RARE, mage.cards.l.LotsosLair.class));
cards.add(new SetCardInfo("Mount Kibble", 364, Rarity.RARE, mage.cards.m.MountKibble.class));
cards.add(new SetCardInfo("Scratch Lands", 365, Rarity.RARE, mage.cards.s.ScratchLands.class));
cards.add(new SetCardInfo("The Sea of Consciousness", 366, Rarity.RARE, mage.cards.t.TheSeaOfConsciousness.class));
cards.add(new SetCardInfo("Sloplands", 367, Rarity.UNCOMMON, mage.cards.s.Sloplands.class));
cards.add(new SetCardInfo("Snake Hell", 368, Rarity.UNCOMMON, mage.cards.s.SnakeHell.class));
cards.add(new SetCardInfo("Speech Podium", 369, Rarity.UNCOMMON, mage.cards.s.SpeechPodium.class));
cards.add(new SetCardInfo("Suburbia", 370, Rarity.COMMON, mage.cards.s.Suburbia.class));
cards.add(new SetCardInfo("Sunnyside Daycare", 371, Rarity.RARE, mage.cards.s.SunnysideDaycare.class));
cards.add(new SetCardInfo("Temple of Andy", 372, Rarity.RARE, mage.cards.t.TempleOfAndy.class));
cards.add(new SetCardInfo("Uncouscous Sea", 373, Rarity.COMMON, mage.cards.u.UncouscousSea.class));
cards.add(new SetCardInfo("Volcanic Peninsula", 374, Rarity.COMMON, mage.cards.v.VolcanicPeniunsula.class));
cards.add(new SetCardInfo("The Wild West", 375, Rarity.RARE, mage.cards.t.TheWildWest.class));
cards.add(new SetCardInfo("Woody’s Mind Palace", 376, Rarity.RARE, mage.cards.w.WoodysMindPalace.class));
cards.add(new SetCardInfo("Clockwork Conductor", 377, Rarity.SPECIAL, mage.cards.c.ClockworkConductor.class));
cards.add(new SetCardInfo("It That ______s", 378, Rarity.SPECIAL, mage.cards.i.ItThatBlanks.class));
cards.add(new SetCardInfo("Aimless Space Ranger", 379, Rarity.SPECIAL, mage.cards.a.AimlessSpaceRanger.class));
cards.add(new SetCardInfo("Andy-hand Despoiler", 380, Rarity.SPECIAL, mage.cards.a.AndyHandDespoiler.class));
cards.add(new SetCardInfo("Exiled Woody", 381, Rarity.SPECIAL, mage.cards.e.ExiledWoody.class));
cards.add(new SetCardInfo("Flooded Line Lurker", 382, Rarity.SPECIAL, mage.cards.f.FloodedLineLurker.class));
cards.add(new SetCardInfo("Forgotten-asaurus", 383, Rarity.SPECIAL, mage.cards.f.Forgottenasaurus.class));
cards.add(new SetCardInfo("Lobotomite’s Map", 384, Rarity.SPECIAL, mage.cards.l.LobotomitesMap.class));
cards.add(new SetCardInfo("Ramona Flowers Subway Surfer", 385, Rarity.SPECIAL, mage.cards.r.RamonaFlowersSubwaySurfer.class));
cards.add(new SetCardInfo("Sid, Subway Saint", 386, Rarity.SPECIAL, mage.cards.s.SidSubwaySaint.class));
cards.add(new SetCardInfo("Something Toll-Collector", 387, Rarity.SPECIAL, mage.cards.s.SomethingTollCollector.class));
cards.add(new SetCardInfo("Subway Slopper", 388, Rarity.SPECIAL, mage.cards.s.SubwaySlopper.class));
cards.add(new SetCardInfo("_________________’s Adventure", 389, Rarity.SPECIAL, mage.cards.b.BlanksAdventure.class));
cards.add(new SetCardInfo("Subspace Subway", 390, Rarity.SPECIAL, mage.cards.s.SubspaceSubway.class));
    }

    @Override
    public BoosterCollator createCollator() {
        return new SlopCollator();
    }
}

// Booster collation info from https://www.lethe.xyz/mtg/collation/afr.html
// Using USA collation for common/uncommon, rare collation inferred from other information
class SlopCollator implements BoosterCollator {

    private final CardRun commonA = new CardRun(true, "144", "30", "122", "85", "153", "250", "164", "199", "133", "38", "141", "251", "101", "74", "245", "153", "122", "85", "30", "318", "250", "133", "199", "38", "153", "245", "74", "101", "251", "141", "30", "85", "164", "122", "144", "101", "251", "133", "199", "164", "250", "85", "141", "38", "74", "144", "30", "245", "122", "164", "38", "133", "250", "153", "248", "144", "101", "245", "74", "199", "141", "251", "30", "250", "122", "153", "85", "38", "164", "199", "133", "245", "101", "251", "141", "74", "153", "85", "133", "250", "318", "122", "164", "30", "199", "101", "251", "38", "85", "122", "245", "164", "74", "30", "141", "199", "101", "153", "38", "144", "250", "133", "245", "74", "164", "85", "122", "251", "141", "250", "144", "30", "153", "38", "133", "199", "74", "251", "141", "245", "101");
    private final CardRun commonB = new CardRun(true, "115", "182", "37", "47", "134", "119", "204", "16", "70", "146", "103", "189", "31", "51", "139", "102", "177", "14", "72", "158", "128", "205", "10", "46", "168", "108", "203", "43", "75", "150", "110", "178", "19", "52", "142", "123", "174", "40", "83", "140", "94", "213", "34", "73", "130", "109", "206", "9", "71", "162", "97", "183", "1", "65", "148", "118", "187", "11", "84", "159", "115", "204", "37", "51", "146", "119", "182", "31", "47", "134", "102", "177", "16", "70", "139", "103", "189", "14", "46", "168", "108", "205", "10", "72", "158", "128", "178", "19", "75", "150", "123", "203", "43", "52", "140", "110", "174", "40", "73", "142", "97", "206", "9", "83", "130", "118", "183", "34", "71", "162", "94", "213", "1", "65", "159", "109", "187", "11", "84", "148", "248");
    private final CardRun commonC = new CardRun(true, "55", "311", "24", "208", "106", "69", "165", "179", "129", "249", "50", "42", "198", "353", "35", "113", "185", "2", "309", "195", "312", "5", "45", "334", "152", "89", "24", "173", "306", "106", "179", "165", "69", "129", "198", "256", "50", "249", "35", "113", "326", "42", "45", "195", "93", "299", "66", "208", "24", "89", "152", "324", "55", "5", "165", "69", "106", "179", "50", "314", "185", "2", "129", "349", "198", "42", "66", "256", "35", "329", "45", "5", "152", "89", "55", "208", "93", "310", "165", "173", "24", "249", "331", "42", "50", "106", "256", "35", "325", "129", "2", "185", "113", "66", "195", "93", "45", "301", "152", "173");
    private final CardRun uncommonA = new CardRun(true, "76", "234", "92", "67", "175", "132", "96", "79", "154", "98", "188", "21", "125", "215", "61", "13", "120", "44", "136", "99", "244", "214", "135", "6", "81", "114", "170", "59", "116", "200", "68", "22", "240", "111", "58", "26", "210", "145", "25", "77", "242", "131", "33", "180", "163", "12", "117", "57", "32", "137", "212", "107", "36", "169", "191", "234", "76", "92", "132", "67", "96", "175", "79", "98", "21", "188", "125", "154", "44", "13", "120", "215", "61", "244", "136", "214", "99", "81", "135", "6", "59", "114", "170", "200", "22", "68", "116", "240", "26", "58", "111", "25", "131", "210", "33", "145", "77", "12", "163", "242", "180", "137", "107", "57", "32", "212", "117", "169", "191", "36");
    private final CardRun uncommonB = new CardRun(true, "247", "332", "49", "224", "300", "41", "219", "357", "160", "223", "225", "54", "90", "7", "346", "218", "95", "231", "186", "149", "327", "221", "161", "194", "348", "49", "224", "201", "343", "41", "219", "260", "305", "223", "160", "3", "342", "95", "218", "7", "236", "291", "247", "149", "186", "345", "192", "339", "161", "194", "288", "219", "201", "289", "224", "226", "160", "340", "95", "3", "336", "54", "260", "225", "231", "7", "90", "149", "236", "295", "321", "192", "49", "341", "247", "194", "221", "226", "260", "54", "223", "41", "201", "337", "218", "302", "3", "95", "294", "225", "192", "236", "90", "319", "231", "186", "226", "328", "161", "221");
    private final CardRun rareA = new CardRun(false, "87", "53", "100", "181", "143", "17", "20", "151", "62", "112", "227", "64", "197", "4", "91", "241", "207", "235", "239", "172", "216", "88", "217", "253", "176", "8", "138", "254", "56", "220", "255", "243", "222", "15", "104", "184", "105", "60", "18", "257", "246", "258", "147", "190", "259", "193", "23", "155", "63", "156", "228", "27", "196", "157", "229", "28", "29", "202", "230", "232", "233", "121", "78", "39", "48", "252", "261", "237", "80", "209", "238", "124", "211", "126", "127", "166", "82", "167", "86", "171", "216", "88", "217", "253", "176", "8", "138", "254", "56", "220", "255", "243", "222", "15", "104", "184", "105", "60", "18", "257", "246", "258", "147", "190", "259", "193", "23", "155", "63", "156", "228", "27", "196", "157", "229", "28", "29", "202", "230", "232", "233", "121", "78", "39", "48", "252", "261", "237", "80", "209", "238", "124", "211", "126", "127", "166", "82", "167", "86", "171");
    private final CardRun rareB = new CardRun(false, "87", "53", "292", "286", "143", "282", "287", "293", "290", "284", "344", "283", "296", "4", "91", "241", "333", "298", "239", "285", "297", "88", "217", "350", "176", "8", "317", "351", "307", "338", "352", "243", "222", "15", "104", "184", "313", "60", "18", "354", "246", "355", "147", "190", "356", "193", "23", "155", "308", "320", "228", "303", "330", "157", "229", "304", "29", "202", "230", "232", "233", "121", "78", "39", "48", "397", "358", "237", "80", "335", "347", "396", "211", "315", "316", "166", "82", "322", "86", "323", "297", "88", "217", "350", "176", "8", "317", "351", "307", "338", "352", "243", "222", "15", "104", "184", "313", "60", "18", "354", "246", "355", "147", "190", "356", "193", "23", "155", "308", "320", "228", "303", "330", "157", "229", "304", "29", "202", "230", "232", "233", "121", "78", "39", "48", "397", "358", "237", "80", "335", "347", "396", "211", "315", "316", "166", "82", "322", "86", "323");
    private final CardRun land = new CardRun(false, "262", "263", "264", "265", "266", "267", "268", "269", "270", "271", "272", "273", "274", "275", "276", "277", "278", "279", "280", "281");
    private final CardRun special = new CardRun(false, "378", "379", "380", "381", "382", "383", "384", "385", "386", "387", "388", "389", "390");

    private final BoosterStructure ABBBBBBCCC = new BoosterStructure(
            commonA,
            commonB, commonB, commonB, commonB, commonB, commonB,
            commonC, commonC, commonC
    );
    private final BoosterStructure AABBBBBBCC = new BoosterStructure(
            commonA, commonA,
            commonB, commonB, commonB, commonB, commonB, commonB,
            commonC, commonC
    );
    private final BoosterStructure AAA = new BoosterStructure(uncommonA, uncommonA, uncommonA);
    private final BoosterStructure BBB = new BoosterStructure(uncommonB, uncommonB, uncommonB);
    private final BoosterStructure R1 = new BoosterStructure(rareA);
    private final BoosterStructure R2 = new BoosterStructure(rareB);
    private final BoosterStructure L1 = new BoosterStructure(land);
    private final BoosterStructure S1 = new BoosterStructure(special);

    // In order for equal numbers of each common to exist, the average booster must contain:
    // 1.503 A commons (242 / 161)
    // 6.012 B commons (968 / 161)
    // 2.484 C commons (400 / 161)
    // However, boosters with more than six B commons are not known to exist.
    // This discrepancy is presumably related to foils--the above values are based on
    // 10 commons per booster, but real boosters contain only 9.67 non-foil commons
    private final RarityConfiguration commonRuns = new RarityConfiguration(ABBBBBBCCC, AABBBBBBCC);
    private final RarityConfiguration uncommonRuns = new RarityConfiguration(
            AAA, AAA, AAA, AAA, AAA, AAA, AAA, AAA, AAA, AAA, AAA,
            BBB, BBB, BBB, BBB, BBB
    );
    private final RarityConfiguration rareRuns = new RarityConfiguration(R1, R1, R1, R2);
    private final RarityConfiguration landRuns = new RarityConfiguration(L1);

    @Override
    public List<String> makeBooster() {
        List<String> booster = new ArrayList<>();
        booster.addAll(commonRuns.getNext().makeRun());
        booster.addAll(uncommonRuns.getNext().makeRun());
        booster.addAll(rareRuns.getNext().makeRun());
        booster.addAll(landRuns.getNext().makeRun());
        //booster.addAll(special.getNext().makeRun());
        return booster;
    }
}
