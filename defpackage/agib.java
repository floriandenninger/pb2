package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agib {
    public static final String[] a = {"original_video_id", "ad_break_id", "ad_video_id", "ad_intro_video_id", "vast_type", "expiry_timestamp", "asset_frequency_cap", "vast_playback_count"};
    public final agik b;

    public agib(agik agikVar) {
        agikVar.getClass();
        this.b = agikVar;
    }

    public final int a(String str, String[] strArr) {
        Cursor rawQuery = this.b.a().rawQuery(str, strArr);
        try {
            if (rawQuery.getCount() <= 0) {
                return 0;
            }
            rawQuery.moveToNext();
            return rawQuery.getInt(0);
        } finally {
            rawQuery.close();
        }
    }

    public final int b(String str) {
        return a("SELECT COUNT(DISTINCT original_video_id) FROM ads WHERE ad_video_id=?", new String[]{str});
    }

    public final aghz c(String str, String str2) {
        Cursor query = this.b.a().query("ads", a, "original_video_id=? AND ad_break_id=?", new String[]{str, str2}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return aghz.a(null, query);
            }
            return null;
        } finally {
            query.close();
        }
    }
}
