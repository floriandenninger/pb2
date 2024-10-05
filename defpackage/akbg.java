package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akbg {
    private static final amrz a;

    static {
        amrw amrwVar = new amrw();
        avez avezVar = avez.THEME_ATTRIBUTE_BACKGROUND1;
        Integer valueOf = Integer.valueOf(R.attr.ytBrandBackgroundSolid);
        amrwVar.g(avezVar, valueOf);
        amrwVar.g(avez.THEME_ATTRIBUTE_BACKGROUND2, Integer.valueOf(R.attr.ytGeneralBackgroundA));
        amrwVar.g(avez.THEME_ATTRIBUTE_BACKGROUND3, Integer.valueOf(R.attr.ytGeneralBackgroundB));
        amrwVar.g(avez.THEME_ATTRIBUTE_SEPARATOR, Integer.valueOf(R.attr.ytSeparator));
        amrwVar.g(avez.THEME_ATTRIBUTE_CHIP_BACKGROUND, Integer.valueOf(R.attr.ytChipBackground));
        amrwVar.g(avez.THEME_ATTRIBUTE_TEXT1, Integer.valueOf(R.attr.ytTextPrimary));
        amrwVar.g(avez.THEME_ATTRIBUTE_TEXT2, Integer.valueOf(R.attr.ytTextSecondary));
        avez avezVar2 = avez.THEME_ATTRIBUTE_TEXT3;
        Integer valueOf2 = Integer.valueOf(R.attr.ytTextDisabled);
        amrwVar.g(avezVar2, valueOf2);
        amrwVar.g(avez.THEME_ATTRIBUTE_SELECTED_NAV_TEXT, Integer.valueOf(R.attr.ytSelectedNavText));
        amrwVar.g(avez.THEME_ATTRIBUTE_BRAND_RED, Integer.valueOf(R.attr.ytBrandRed));
        amrwVar.g(avez.THEME_ATTRIBUTE_STATIC_BLUE, Integer.valueOf(R.attr.ytStaticBlue));
        amrwVar.g(avez.THEME_ATTRIBUTE_STATIC_BRAND_BLACK, Integer.valueOf(R.attr.ytStaticBrandBlack));
        amrwVar.g(avez.THEME_ATTRIBUTE_STATIC_YELLOW, Integer.valueOf(R.attr.ytStaticYellow));
        amrwVar.g(avez.THEME_ATTRIBUTE_STATIC_GREEN, Integer.valueOf(R.attr.ytStaticGreen));
        amrwVar.g(avez.THEME_ATTRIBUTE_STATIC_WHITE, Integer.valueOf(R.attr.ytStaticWhite));
        amrwVar.g(avez.THEME_ATTRIBUTE_STATIC_GREY, Integer.valueOf(R.attr.ytStaticGrey));
        amrwVar.g(avez.THEME_ATTRIBUTE_ICON1, Integer.valueOf(R.attr.ytIcon1));
        amrwVar.g(avez.THEME_ATTRIBUTE_ICON2, Integer.valueOf(R.attr.ytIcon2));
        amrwVar.g(avez.THEME_ATTRIBUTE_UNSELECTED_NAV_ICON, Integer.valueOf(R.attr.ytBrandIconInactive));
        amrwVar.g(avez.THEME_ATTRIBUTE_SELECTED_NAV_ICON, Integer.valueOf(R.attr.ytBrandIconActive));
        amrwVar.g(avez.THEME_ATTRIBUTE_HEADER_ICON, Integer.valueOf(R.attr.ytHeaderIcon));
        amrwVar.g(avez.THEME_ATTRIBUTE_BADGE_BACKGROUND1, Integer.valueOf(R.attr.ytBadgeBackground1));
        amrwVar.g(avez.THEME_ATTRIBUTE_BADGE_BACKGROUND2, Integer.valueOf(R.attr.ytBadgeBackground2));
        amrwVar.g(avez.THEME_ATTRIBUTE_BADGE_TEXT1, Integer.valueOf(R.attr.ytBadgeText1));
        amrwVar.g(avez.THEME_ATTRIBUTE_BADGE_TEXT2, Integer.valueOf(R.attr.ytBadgeText2));
        amrwVar.g(avez.THEME_ATTRIBUTE_STATIC_DARK_BACKGROUND1, Integer.valueOf(R.attr.ytStaticDarkBackground1));
        amrwVar.g(avez.THEME_ATTRIBUTE_AD_MUTED_BACKGROUND, Integer.valueOf(R.attr.adMutedBackground));
        amrwVar.g(avez.THEME_ATTRIBUTE_AD_BLUE, Integer.valueOf(R.attr.adBlue));
        amrwVar.g(avez.THEME_ATTRIBUTE_AD_BACKGROUND1, Integer.valueOf(R.attr.adBackground1));
        amrwVar.g(avez.THEME_ATTRIBUTE_AD_BACKGROUND2, Integer.valueOf(R.attr.adBackground2));
        amrwVar.g(avez.THEME_ATTRIBUTE_AD_OVERLAY_BACKGROUND, Integer.valueOf(R.attr.adOverlayBackground));
        amrwVar.g(avez.THEME_ATTRIBUTE_AD_TEXT1, Integer.valueOf(R.attr.adText1));
        amrwVar.g(avez.THEME_ATTRIBUTE_AD_TEXT2, Integer.valueOf(R.attr.adText2));
        amrwVar.g(avez.THEME_ATTRIBUTE_AD_TEXT3, Integer.valueOf(R.attr.adText3));
        amrwVar.g(avez.THEME_ATTRIBUTE_AD_TEXT4, Integer.valueOf(R.attr.adText4));
        amrwVar.g(avez.THEME_ATTRIBUTE_AD_SEPARATOR1, Integer.valueOf(R.attr.adSeparator1));
        amrwVar.g(avez.THEME_ATTRIBUTE_ICON_DISABLED, Integer.valueOf(R.attr.ytIconDisabled));
        amrwVar.g(avez.THEME_ATTRIBUTE_TEXT_DISABLED, valueOf2);
        amrwVar.g(avez.THEME_ATTRIBUTE_ICON_INACTIVE, Integer.valueOf(R.attr.ytIconInactive));
        amrwVar.g(avez.THEME_ATTRIBUTE_TEXT_PRIMARY_INVERSE, Integer.valueOf(R.attr.ytTextPrimaryInverse));
        amrwVar.g(avez.THEME_ATTRIBUTE_SUGGESTED_ACTION, Integer.valueOf(R.attr.ytSuggestedAction));
        amrwVar.g(avez.THEME_ATTRIBUTE_ERROR_BACKGROUND, Integer.valueOf(R.attr.ytErrorBackground));
        amrwVar.g(avez.THEME_ATTRIBUTE_BRAND_BACKGROUND_SOLID, valueOf);
        amrwVar.g(avez.THEME_ATTRIBUTE_THEMED_BLUE, Integer.valueOf(R.attr.ytThemedBlue));
        amrwVar.g(avez.THEME_ATTRIBUTE_THEMED_GREEN, Integer.valueOf(R.attr.ytThemedGreen));
        amrwVar.g(avez.THEME_ATTRIBUTE_OVERLAY_BACKGROUND_MEDIUM, Integer.valueOf(R.attr.ytOverlayBackgroundMedium));
        amrwVar.g(avez.THEME_ATTRIBUTE_OVERLAY_BACKGROUND_MEDIUM_LIGHT, Integer.valueOf(R.attr.ytOverlayBackgroundMediumLight));
        a = amrwVar.c();
    }

    public static int a(Context context, avez avezVar, int i) {
        amrz amrzVar = a;
        return amrzVar.containsKey(avezVar) ? wbs.W(context, ((Integer) amrzVar.get(avezVar)).intValue()).orElse(i) : i;
    }

    public static ammv b(Context context, avez avezVar) {
        amrz amrzVar = a;
        if (!amrzVar.containsKey(avezVar)) {
            return amlr.a;
        }
        try {
            return ammv.j(Integer.valueOf(wbs.Q(context, ((Integer) amrzVar.get(avezVar)).intValue())));
        } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            return amlr.a;
        }
    }
}
