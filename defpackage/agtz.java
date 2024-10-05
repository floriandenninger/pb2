package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agtz implements aguh {
    private static final String[] b = {"file_path", "status", "status_reason", "bytes_transferred", "bytes_total", "extras", "output_extras", "accountname", "priority", "failure_count"};
    SQLiteDatabase a;
    private final Context c;
    private final Object d;

    public agtz(Context context) {
        Object obj = new Object();
        this.c = context;
        this.d = obj;
    }

    private static agtu h(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("file_path");
        int columnIndex2 = cursor.getColumnIndex("status");
        int columnIndex3 = cursor.getColumnIndex("status_reason");
        int columnIndex4 = cursor.getColumnIndex("bytes_transferred");
        int columnIndex5 = cursor.getColumnIndex("bytes_total");
        int columnIndex6 = cursor.getColumnIndex("extras");
        int columnIndex7 = cursor.getColumnIndex("output_extras");
        int columnIndex8 = cursor.getColumnIndex("accountname");
        int columnIndex9 = cursor.getColumnIndex("priority");
        int columnIndex10 = cursor.getColumnIndex("failure_count");
        String string = cursor.getString(columnIndex);
        int i = new int[]{1, 2, 3, 4, 5}[cursor.getInt(columnIndex2)];
        int i2 = cursor.getInt(columnIndex3);
        long j = cursor.getLong(columnIndex4);
        long j2 = cursor.getLong(columnIndex5);
        agny agnyVar = new agny(cursor.getBlob(columnIndex6));
        agny agnyVar2 = new agny(cursor.getBlob(columnIndex7));
        agtu agtuVar = new agtu(cursor.getString(columnIndex8), string, cursor.getInt(columnIndex9), agnyVar, cursor.getInt(columnIndex10));
        int i3 = i - 1;
        avjo avjoVar = avjo.TRANSFER_STATE_UNKNOWN;
        if (i == 0) {
            throw null;
        }
        agtuVar.j = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? avjo.TRANSFER_STATE_UNKNOWN : avjo.TRANSFER_STATE_PAUSED_BY_USER : avjo.TRANSFER_STATE_FAILED : avjo.TRANSFER_STATE_COMPLETE : avjo.TRANSFER_STATE_TRANSFERRING : avjo.TRANSFER_STATE_TRANSFER_IN_QUEUE;
        agtuVar.b = i2;
        agtuVar.d = j2;
        agtuVar.c = j;
        agtuVar.f = agnyVar2;
        return agtuVar;
    }

    private static void i() {
        zga.d("[Offline] Attempting to access closed or null database.", new NullPointerException());
    }

    private static final ContentValues j(agtu agtuVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("file_path", agtuVar.a);
        avjo avjoVar = agtuVar.j;
        avjo avjoVar2 = avjo.TRANSFER_STATE_UNKNOWN;
        int ordinal = avjoVar.ordinal();
        int i = 5;
        if (ordinal == 3) {
            i = 2;
        } else if (ordinal != 4) {
            i = ordinal != 5 ? ordinal != 6 ? 1 : 3 : 4;
        }
        contentValues.put("status", Integer.valueOf(i - 1));
        contentValues.put("status_reason", Integer.valueOf(agtuVar.b));
        contentValues.put("bytes_transferred", Long.valueOf(agtuVar.c));
        contentValues.put("bytes_total", Long.valueOf(agtuVar.d));
        agmx agmxVar = agtuVar.e;
        if (agmxVar instanceof agny) {
            contentValues.put("extras", ((agny) agmxVar).e());
        }
        agmx agmxVar2 = agtuVar.f;
        if (agmxVar2 instanceof agny) {
            contentValues.put("output_extras", ((agny) agmxVar2).e());
        }
        contentValues.put("accountname", agtuVar.g);
        contentValues.put("priority", Integer.valueOf(agtuVar.h));
        contentValues.put("failure_count", Integer.valueOf(agtuVar.i));
        return contentValues;
    }

    @Override // defpackage.aguh
    public final ammv a(String str) {
        agtu h;
        if (this.a == null) {
            i();
            return amlr.a;
        }
        synchronized (this.d) {
            Cursor query = this.a.query("transfers", b, "file_path=?", new String[]{str}, null, null, null);
            try {
                h = query.moveToNext() ? h(query) : null;
            } finally {
                query.close();
            }
        }
        return ammv.i(h);
    }

    @Override // defpackage.aguh
    public final List b(afsx afsxVar) {
        String d = afsxVar.d();
        ArrayList arrayList = new ArrayList();
        if (this.a == null) {
            i();
            return arrayList;
        }
        synchronized (this.d) {
            Cursor query = this.a.query("transfers", b, "accountname=?", new String[]{d}, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(h(query));
                } finally {
                    query.close();
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.aguh
    public final void d() {
        boolean z;
        synchronized (this.d) {
            synchronized (this.d) {
                SQLiteDatabase sQLiteDatabase = this.a;
                z = false;
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    z = true;
                }
            }
            if (!z) {
                this.a = new agty(this.c).getWritableDatabase();
            }
        }
    }

    @Override // defpackage.aguh
    public final void e(agtu agtuVar) {
        f(agtuVar.a);
    }

    @Override // defpackage.aguh
    public final void c(agtu agtuVar) {
        synchronized (this.d) {
            SQLiteDatabase sQLiteDatabase = this.a;
            if (sQLiteDatabase == null) {
                i();
            } else {
                sQLiteDatabase.insert("transfers", null, j(agtuVar));
            }
        }
    }

    @Override // defpackage.aguh
    public final void f(String str) {
        synchronized (this.d) {
            SQLiteDatabase sQLiteDatabase = this.a;
            if (sQLiteDatabase == null) {
                i();
            } else {
                sQLiteDatabase.delete("transfers", "file_path = ?", new String[]{str});
            }
        }
    }

    @Override // defpackage.aguh
    public final void g(agtu agtuVar) {
        synchronized (this.d) {
            SQLiteDatabase sQLiteDatabase = this.a;
            if (sQLiteDatabase == null) {
                i();
            } else {
                sQLiteDatabase.update("transfers", j(agtuVar), "file_path = ?", new String[]{agtuVar.a});
            }
        }
    }
}
