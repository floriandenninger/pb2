package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nno extends nnk {
    public final avzr a;
    public boolean b;

    private nno(Context context, int i, avzr avzrVar) {
        super(context, context.getString(i));
        this.a = avzrVar;
    }

    public static acsc c(avzr avzrVar) {
        avzr avzrVar2 = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
        int ordinal = avzrVar.ordinal();
        int i = 93934;
        if (ordinal == 1) {
            i = 93936;
        } else if (ordinal == 2) {
            i = 93935;
        } else if (ordinal == 3) {
            zga.n("Invalid VE ADVANCED_MENU, using AUTO_QUALITY as placeholder", new Exception());
        }
        return acsb.c(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nno[] d(Context context, avzr avzrVar, boolean z) {
        nno g = g(context, R.string.persistent_video_quality_auto_label, R.string.persistent_video_quality_auto_description, avzr.VIDEO_QUALITY_SETTING_UNKNOWN);
        nno g2 = g(context, R.string.persistent_video_quality_high_label, R.string.persistent_video_quality_high_description, avzr.VIDEO_QUALITY_SETTING_HIGHER_QUALITY);
        nno g3 = g(context, R.string.persistent_video_quality_low_label, R.string.persistent_video_quality_low_description, avzr.VIDEO_QUALITY_SETTING_DATA_SAVER);
        nno g4 = g(context, R.string.video_quality_quick_menu_advanced_menu_label, R.string.video_quality_quick_menu_advanced_menu_description, avzr.VIDEO_QUALITY_SETTING_ADVANCED_MENU);
        int ordinal = avzrVar.ordinal();
        if (ordinal == 0) {
            g.a(true);
        } else if (ordinal == 1) {
            g2.a(true);
        } else if (ordinal == 2) {
            g3.a(true);
        } else if (ordinal == 3) {
            g4.a(true);
        }
        return z ? new nno[]{g, g2, g3} : new nno[]{g, g2, g3, g4};
    }

    private static nno g(Context context, int i, int i2, avzr avzrVar) {
        nno nnoVar = new nno(context, i, avzrVar);
        nnoVar.h = context.getString(i2);
        return nnoVar;
    }

    @Override // defpackage.ajxo, defpackage.uyw, defpackage.uyu
    public final int b() {
        return R.layout.bottom_sheet_list_secondary_text_checkmark_item;
    }
}
