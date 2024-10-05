package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yog implements yom {
    private final String a;
    private final /* synthetic */ int b;

    public yog(int i) {
        this.b = i;
        this.a = "ScheduledTaskProto";
    }

    public yog(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.yom
    public final void a(SQLiteDatabase sQLiteDatabase) {
        if (this.b != 0) {
            String str = this.a;
            sQLiteDatabase.execSQL(str.length() != 0 ? "DROP TABLE IF EXISTS ".concat(str) : new String("DROP TABLE IF EXISTS "));
            return;
        }
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(str2.length() + 127);
        sb.append("CREATE TABLE ");
        sb.append(str2);
        sb.append(" (insertionOrder INTEGER PRIMARY KEY AUTOINCREMENT,key TEXT KEY,value BLOB NOT NULL,sortingValue INTEGER NOT NULL)");
        sQLiteDatabase.execSQL(sb.toString());
    }
}
