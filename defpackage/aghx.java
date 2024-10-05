package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aghx {
    public final int a;
    public final agnf b;

    public aghx(int i, agnf agnfVar) {
        this.a = i;
        this.b = agnfVar;
    }

    public static aghx a(String str, Cursor cursor) {
        if (cursor.isAfterLast()) {
            return null;
        }
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(yoj.e(str, "ad_video_id"));
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(yoj.e(str, "playback_count"));
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(yoj.e(str, "status"));
        if (cursor.isNull(columnIndexOrThrow)) {
            return null;
        }
        cursor.getString(columnIndexOrThrow);
        return new aghx(cursor.getInt(columnIndexOrThrow2), agnf.a(cursor.getInt(columnIndexOrThrow3)));
    }
}
