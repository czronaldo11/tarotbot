package liberus.tarot.spread.gothic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import liberus.tarot.android.R;
import liberus.tarot.deck.Deck;
import liberus.tarot.deck.RiderWaiteDeck;
import liberus.tarot.interpretation.BotaInt;
import liberus.tarot.interpretation.Interpretation;
import liberus.tarot.os.activity.AbstractTarotBotActivity;
import liberus.tarot.os.activity.TarotBotActivity;
import liberus.tarot.spread.Spread;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;

public class GothicBrowseSpread extends GothicSpread {
	
	
	private static int significatorIn;
	private int myNum;


	public GothicBrowseSpread(Interpretation in) {
		super(in);
		browsing = true;
		myNum = 78;
		myLabels = new String[78];	
		myDeck.reversed = Interpretation.myDeck.noreversal;
	}
	
	@Override
	public void operate(Context context, boolean loading) {
		Spread.working = new ArrayList<Integer>(Arrays.asList(RiderWaiteDeck.cards));
		Spread.circles = Spread.working;
	}
	

	@Override
	public int getLayout() {
		return R.layout.browserlayout;
	}

	public View populateSpread(View layout, AbstractTarotBotActivity act, Context ctx) {
		layout = populateTrumps(layout,act,ctx);
		layout = populateWands(layout,act,ctx);
		layout = populateCups(layout,act,ctx);
		layout = populateSwords(layout,act,ctx);
		layout = populatePentacles(layout,act,ctx);
		return layout;
	}

	private View populateWands(View layout, AbstractTarotBotActivity act,Context ctx) {
		ImageView card = (ImageView) layout.findViewById(R.id.wands_01);
		placeImage(Interpretation.getCardIndex(R.id.wands_01),card,ctx);
		card.setId(R.id.wands_01);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.wands_02);
		placeImage(Interpretation.getCardIndex(R.id.wands_02),card,ctx);
		card.setId(R.id.wands_02);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.wands_03);
		placeImage(Interpretation.getCardIndex(R.id.wands_03),card,ctx);
		card.setId(R.id.wands_03);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.wands_04);
		placeImage(Interpretation.getCardIndex(R.id.wands_04),card,ctx);
		card.setId(R.id.wands_04);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.wands_05);
		placeImage(Interpretation.getCardIndex(R.id.wands_05),card,ctx);
		card.setId(R.id.wands_05);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.wands_06);
		placeImage(Interpretation.getCardIndex(R.id.wands_06),card,ctx);
		card.setId(R.id.wands_06);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.wands_07);
		placeImage(Interpretation.getCardIndex(R.id.wands_07),card,ctx);
		card.setId(R.id.wands_07);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.wands_08);
		placeImage(Interpretation.getCardIndex(R.id.wands_08),card,ctx);
		card.setId(R.id.wands_08);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.wands_09);
		placeImage(Interpretation.getCardIndex(R.id.wands_09),card,ctx);
		card.setId(R.id.wands_09);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.wands_10);
		placeImage(Interpretation.getCardIndex(R.id.wands_10),card,ctx);
		card.setId(R.id.wands_10);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.wands_page);
		placeImage(Interpretation.getCardIndex(R.id.wands_page),card,ctx);
		card.setId(R.id.wands_page);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.wands_knight);
		placeImage(Interpretation.getCardIndex(R.id.wands_knight),card,ctx);
		card.setId(R.id.wands_knight);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.wands_queen);
		placeImage(Interpretation.getCardIndex(R.id.wands_queen),card,ctx);
		card.setId(R.id.wands_queen);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.wands_king);
		placeImage(Interpretation.getCardIndex(R.id.wands_king),card,ctx);
		card.setId(R.id.wands_king);
		card.setOnClickListener(act);
		
		//layout.setOnTouchListener(act);	
		return layout;
	}

	private View populateCups(View layout, AbstractTarotBotActivity act,Context ctx) {
		ImageView card = (ImageView) layout.findViewById(R.id.cups_01);
		placeImage(Interpretation.getCardIndex(R.id.cups_01),card,ctx);
		card.setId(R.id.cups_01);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.cups_02);
		placeImage(Interpretation.getCardIndex(R.id.cups_02),card,ctx);
		card.setId(R.id.cups_02);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.cups_03);
		placeImage(Interpretation.getCardIndex(R.id.cups_03),card,ctx);
		card.setId(R.id.cups_03);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.cups_04);
		placeImage(Interpretation.getCardIndex(R.id.cups_04),card,ctx);
		card.setId(R.id.cups_04);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.cups_05);
		placeImage(Interpretation.getCardIndex(R.id.cups_05),card,ctx);
		card.setId(R.id.cups_05);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.cups_06);
		placeImage(Interpretation.getCardIndex(R.id.cups_06),card,ctx);
		card.setId(R.id.cups_06);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.cups_07);
		placeImage(Interpretation.getCardIndex(R.id.cups_07),card,ctx);
		card.setId(R.id.cups_07);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.cups_08);
		placeImage(Interpretation.getCardIndex(R.id.cups_08),card,ctx);
		card.setId(R.id.cups_08);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.cups_09);
		placeImage(Interpretation.getCardIndex(R.id.cups_09),card,ctx);
		card.setId(R.id.cups_09);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.cups_10);
		placeImage(Interpretation.getCardIndex(R.id.cups_10),card,ctx);
		card.setId(R.id.cups_10);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.cups_page);
		placeImage(Interpretation.getCardIndex(R.id.cups_page),card,ctx);
		card.setId(R.id.cups_page);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.cups_knight);
		placeImage(Interpretation.getCardIndex(R.id.cups_knight),card,ctx);
		card.setId(R.id.cups_knight);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.cups_queen);
		placeImage(Interpretation.getCardIndex(R.id.cups_queen),card,ctx);
		card.setId(R.id.cups_queen);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.cups_king);
		placeImage(Interpretation.getCardIndex(R.id.cups_king),card,ctx);
		card.setId(R.id.cups_king);
		card.setOnClickListener(act);
		
		//layout.setOnTouchListener(act);	
		return layout;
	}
	
	private View populateSwords(View layout, AbstractTarotBotActivity act,Context ctx) {
		ImageView card = (ImageView) layout.findViewById(R.id.swords_01);
		placeImage(Interpretation.getCardIndex(R.id.swords_01),card,ctx);
		card.setId(R.id.swords_01);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.swords_02);
		placeImage(Interpretation.getCardIndex(R.id.swords_02),card,ctx);
		card.setId(R.id.swords_02);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.swords_03);
		placeImage(Interpretation.getCardIndex(R.id.swords_03),card,ctx);
		card.setId(R.id.swords_03);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.swords_04);
		placeImage(Interpretation.getCardIndex(R.id.swords_04),card,ctx);
		card.setId(R.id.swords_04);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.swords_05);
		placeImage(Interpretation.getCardIndex(R.id.swords_05),card,ctx);
		card.setId(R.id.swords_05);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.swords_06);
		placeImage(Interpretation.getCardIndex(R.id.swords_06),card,ctx);
		card.setId(R.id.swords_06);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.swords_07);
		placeImage(Interpretation.getCardIndex(R.id.swords_07),card,ctx);
		card.setId(R.id.swords_07);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.swords_08);
		placeImage(Interpretation.getCardIndex(R.id.swords_08),card,ctx);
		card.setId(R.id.swords_08);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.swords_09);
		placeImage(Interpretation.getCardIndex(R.id.swords_09),card,ctx);
		card.setId(R.id.swords_09);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.swords_10);
		placeImage(Interpretation.getCardIndex(R.id.swords_10),card,ctx);
		card.setId(R.id.swords_10);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.swords_page);
		placeImage(Interpretation.getCardIndex(R.id.swords_page),card,ctx);
		card.setId(R.id.swords_page);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.swords_knight);
		placeImage(Interpretation.getCardIndex(R.id.swords_knight),card,ctx);
		card.setId(R.id.swords_knight);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.swords_queen);
		placeImage(Interpretation.getCardIndex(R.id.swords_queen),card,ctx);
		card.setId(R.id.swords_queen);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.swords_king);
		placeImage(Interpretation.getCardIndex(R.id.swords_king),card,ctx);
		card.setId(R.id.swords_king);
		card.setOnClickListener(act);
		
		//layout.setOnTouchListener(act);	
		return layout;
	}
	
	private View populatePentacles(View layout, AbstractTarotBotActivity act,Context ctx) {
		ImageView card = (ImageView) layout.findViewById(R.id.pent_01);
		placeImage(Interpretation.getCardIndex(R.id.pent_01),card,ctx);
		card.setId(R.id.pent_01);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.pent_02);
		placeImage(Interpretation.getCardIndex(R.id.pent_02),card,ctx);
		card.setId(R.id.pent_02);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.pent_03);
		placeImage(Interpretation.getCardIndex(R.id.pent_03),card,ctx);
		card.setId(R.id.pent_03);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.pent_04);
		placeImage(Interpretation.getCardIndex(R.id.pent_04),card,ctx);
		card.setId(R.id.pent_04);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.pent_05);
		placeImage(Interpretation.getCardIndex(R.id.pent_05),card,ctx);
		card.setId(R.id.pent_05);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.pent_06);
		placeImage(Interpretation.getCardIndex(R.id.pent_06),card,ctx);
		card.setId(R.id.pent_06);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.pent_07);
		placeImage(Interpretation.getCardIndex(R.id.pent_07),card,ctx);
		card.setId(R.id.pent_07);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.pent_08);
		placeImage(Interpretation.getCardIndex(R.id.pent_08),card,ctx);
		card.setId(R.id.pent_08);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.pent_09);
		placeImage(Interpretation.getCardIndex(R.id.pent_09),card,ctx);
		card.setId(R.id.pent_09);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.pent_10);
		placeImage(Interpretation.getCardIndex(R.id.pent_10),card,ctx);
		card.setId(R.id.pent_10);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.pent_page);
		placeImage(Interpretation.getCardIndex(R.id.pent_page),card,ctx);
		card.setId(R.id.pent_page);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.pent_knight);
		placeImage(Interpretation.getCardIndex(R.id.pent_knight),card,ctx);
		card.setId(R.id.pent_knight);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.pent_queen);
		placeImage(Interpretation.getCardIndex(R.id.pent_queen),card,ctx);
		card.setId(R.id.pent_queen);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.pent_king);
		placeImage(Interpretation.getCardIndex(R.id.pent_king),card,ctx);
		card.setId(R.id.pent_king);
		card.setOnClickListener(act);
		
		//layout.setOnTouchListener(act);	
		return layout;
	}
	
	private View populateTrumps(View layout, AbstractTarotBotActivity act,Context ctx) {
		ImageView card = (ImageView) layout.findViewById(R.id.the_fool_00);
		placeImage(Interpretation.getCardIndex(R.id.the_fool_00),card,ctx);
		card.setId(R.id.the_fool_00);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.the_magician_01);
		placeImage(Interpretation.getCardIndex(R.id.the_magician_01),card,ctx);
		card.setId(R.id.the_magician_01);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.the_high_priestess_02);
		placeImage(Interpretation.getCardIndex(R.id.the_high_priestess_02),card,ctx);
		card.setId(R.id.the_high_priestess_02);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.the_empress_03);
		placeImage(Interpretation.getCardIndex(R.id.the_empress_03),card,ctx);
		card.setId(R.id.the_empress_03);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.the_emperor_04);
		placeImage(Interpretation.getCardIndex(R.id.the_emperor_04),card,ctx);
		card.setId(R.id.the_emperor_04);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.the_hierophant_05);
		placeImage(Interpretation.getCardIndex(R.id.the_hierophant_05),card,ctx);
		card.setId(R.id.the_hierophant_05);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.the_lovers_06);
		placeImage(Interpretation.getCardIndex(R.id.the_lovers_06),card,ctx);
		card.setId(R.id.the_lovers_06);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.the_chariot_07);
		placeImage(Interpretation.getCardIndex(R.id.the_chariot_07),card,ctx);
		card.setId(R.id.the_chariot_07);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.strength_08);
		placeImage(Interpretation.getCardIndex(R.id.strength_08),card,ctx);
		card.setId(R.id.strength_08);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.the_hermit_09);
		placeImage(Interpretation.getCardIndex(R.id.the_hermit_09),card,ctx);
		card.setId(R.id.the_hermit_09);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.the_wheel_of_fortune_10);
		placeImage(Interpretation.getCardIndex(R.id.the_wheel_of_fortune_10),card,ctx);
		card.setId(R.id.the_wheel_of_fortune_10);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.justice_11);
		placeImage(Interpretation.getCardIndex(R.id.justice_11),card,ctx);
		card.setId(R.id.justice_11);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.the_hanged_man_12);
		placeImage(Interpretation.getCardIndex(R.id.the_hanged_man_12),card,ctx);
		card.setId(R.id.the_hanged_man_12);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.death_13);
		placeImage(Interpretation.getCardIndex(R.id.death_13),card,ctx);
		card.setId(R.id.death_13);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.temperance_14);
		placeImage(Interpretation.getCardIndex(R.id.temperance_14),card,ctx);
		card.setId(R.id.temperance_14);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.the_devil_15);
		placeImage(Interpretation.getCardIndex(R.id.the_devil_15),card,ctx);
		card.setId(R.id.the_devil_15);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.the_tower_16);
		placeImage(Interpretation.getCardIndex(R.id.the_tower_16),card,ctx);
		card.setId(R.id.the_tower_16);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.the_star_17);
		placeImage(Interpretation.getCardIndex(R.id.the_star_17),card,ctx);
		card.setId(R.id.the_star_17);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.the_moon_18);
		placeImage(Interpretation.getCardIndex(R.id.the_moon_18),card,ctx);
		card.setId(R.id.the_moon_18);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.the_sun_19);
		placeImage(Interpretation.getCardIndex(R.id.the_sun_19),card,ctx);
		card.setId(R.id.the_sun_19);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.judgement_20);
		placeImage(Interpretation.getCardIndex(R.id.judgement_20),card,ctx);
		card.setId(R.id.judgement_20);
		card.setOnClickListener(act);
		
		card = (ImageView) layout.findViewById(R.id.the_world_21);
		placeImage(Interpretation.getCardIndex(R.id.the_world_21),card,ctx);
		card.setId(R.id.the_world_21);
		card.setOnClickListener(act);
		
		//layout.setOnTouchListener(act);	
		return layout;
	}
}