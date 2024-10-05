package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aghy {
    public static final String[] a = {"ad_video_id", "playback_count", "status"};
    public final agik b;

    public aghy(agik agikVar) {
        agikVar.getClass();
        this.b = agikVar;
    }

    public final aghx a(String str) {
        Cursor query = this.b.a().query("ad_videos", a, "ad_video_id=?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return aghx.a(null, query);
            }
            return null;
        } finally {
            query.close();
        }
    }

    public final boolean b(String str) {
        Cursor rawQuery = this.b.a().rawQuery("SELECT COUNT(*) FROM ad_videos WHERE ad_video_id=?", new String[]{str});
        try {
            if (rawQuery.moveToNext()) {
                return rawQuery.getInt(0) > 0;
            }
            return false;
        } finally {
            rawQuery.close();
        }
    }
}
