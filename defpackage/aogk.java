package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aogk extends SQLiteOpenHelper {
    private static final amxj a = amxj.l("com/google/mediapipe/framework/AssetCacheDbHelper");

    public aogk(Context context) {
        super(context, "drishti.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    public static final Cursor a(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2) {
        return sQLiteDatabase.query("AssetVersion", strArr, str, strArr2, null, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0010, code lost:
    
        if (r5.moveToFirst() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0012, code lost:
    
        r6 = r5.getString(r5.getColumnIndexOrThrow("cache_path"));
        r7 = new java.io.File(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r7.exists() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r7.delete() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        ((defpackage.amxh) ((defpackage.amxh) defpackage.aogk.a.g()).i("com/google/mediapipe/framework/AssetCacheDbHelper", "removeCachedFiles", 168, "AssetCacheDbHelper.java")).s("Stale cached file: %s can't be deleted.", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        if (r5.moveToNext() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(android.database.sqlite.SQLiteDatabase r5, java.lang.String r6, java.lang.String[] r7) {
        /*
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "cache_path"
            r0[r1] = r2
            android.database.Cursor r5 = a(r5, r0, r6, r7)
            boolean r6 = r5.moveToFirst()
            if (r6 == 0) goto L4c
        L12:
            int r6 = r5.getColumnIndexOrThrow(r2)
            java.lang.String r6 = r5.getString(r6)
            java.io.File r7 = new java.io.File
            r7.<init>(r6)
            boolean r0 = r7.exists()
            if (r0 == 0) goto L46
            boolean r7 = r7.delete()
            if (r7 != 0) goto L46
            amxj r7 = defpackage.aogk.a
            amxz r7 = r7.g()
            amxh r7 = (defpackage.amxh) r7
            r0 = 168(0xa8, float:2.35E-43)
            java.lang.String r1 = "com/google/mediapipe/framework/AssetCacheDbHelper"
            java.lang.String r3 = "removeCachedFiles"
            java.lang.String r4 = "AssetCacheDbHelper.java"
            amxz r7 = r7.i(r1, r3, r0, r4)
            amxh r7 = (defpackage.amxh) r7
            java.lang.String r0 = "Stale cached file: %s can't be deleted."
            r7.s(r0, r6)
        L46:
            boolean r6 = r5.moveToNext()
            if (r6 != 0) goto L12
        L4c:
            r5.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aogk.b(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[]):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE AssetVersion (_id INTEGER PRIMARY KEY,asset TEXT NOT NULL UNIQUE,cache_path TEXT,version INTEGER )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS AssetVersion");
        onCreate(sQLiteDatabase);
    }
}
