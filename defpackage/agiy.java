package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agiy implements yom {
    private final long a;

    public agiy(long j) {
        this.a = j;
    }

    @Override // defpackage.yom
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN metadata_timestamp INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN streams_timestamp INTEGER DEFAULT 0");
        ContentValues contentValues = new ContentValues();
        contentValues.put("metadata_timestamp", Long.valueOf(this.a));
        contentValues.put("streams_timestamp", Long.valueOf(this.a));
        sQLiteDatabase.update("videosV2", contentValues, null, null);
    }
}
