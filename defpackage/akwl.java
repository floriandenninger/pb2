package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akwl extends SQLiteOpenHelper {
    public akwl(Context context) {
        super(context, "youtube_upload_service", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS job_storage_jobs");
        sQLiteDatabase.execSQL("CREATE TABLE job_storage_jobs (id TEXT PRIMARY KEY,version INTEGER,data BLOB)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        amkq.E(i > 1);
        amkq.E(i2 == 1);
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        amkq.E(i <= 0);
        amkq.E(i2 == 1);
        onCreate(sQLiteDatabase);
    }
}
