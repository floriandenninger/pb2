package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bug {
    public final int a;
    public bte b;
    public final btm c;
    public final String d;
    public final String e;

    public bug(int i) {
        this.a = i;
    }

    public bug(bte bteVar, btm btmVar, String str, String str2) {
        this(btmVar.a);
        this.b = bteVar;
        this.c = btmVar;
        this.d = str;
        this.e = str2;
    }

    public static final void a(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: " + str);
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006e A[EDGE_INSN: B:53:0x006e->B:6:0x006e BREAK  A[LOOP:1: B:20:0x0015->B:41:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.buo r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bug.b(buo, int, int):void");
    }

    public final void c(buo buoVar) {
        buoVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        buoVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.d + "')");
    }
}
