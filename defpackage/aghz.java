package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aghz {
    public final String a;
    public final String b;
    public final String c;
    public final agkb d;
    public final long e;
    public final int f;
    public final int g;

    public aghz(String str, String str2, String str3, String str4, agkb agkbVar, long j, int i, int i2) {
        str.getClass();
        this.a = str;
        str2.getClass();
        this.b = str3;
        this.c = str4;
        agkbVar.getClass();
        this.d = agkbVar;
        this.e = j;
        this.f = i;
        this.g = i2;
    }

    public static aghz a(String str, Cursor cursor) {
        if (cursor.isAfterLast()) {
            return null;
        }
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(yoj.e(str, "original_video_id"));
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(yoj.e(str, "ad_break_id"));
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(yoj.e(str, "ad_video_id"));
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow(yoj.e(str, "ad_intro_video_id"));
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow(yoj.e(str, "vast_type"));
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow(yoj.e(str, "expiry_timestamp"));
        int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow(yoj.e(str, "asset_frequency_cap"));
        int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow(yoj.e(str, "vast_playback_count"));
        return new aghz(cursor.getString(columnIndexOrThrow), cursor.getString(columnIndexOrThrow2), cursor.getString(columnIndexOrThrow3), cursor.getString(columnIndexOrThrow4), (agkb) agkb.d.get(cursor.getInt(columnIndexOrThrow5)), cursor.getLong(columnIndexOrThrow6), cursor.getInt(columnIndexOrThrow7), cursor.getInt(columnIndexOrThrow8));
    }
}
