package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agid {
    public final agik a;
    public final List b = new ArrayList();
    private final azrw c;

    public agid(agik agikVar, azrw azrwVar) {
        this.a = agikVar;
        this.c = azrwVar;
    }

    public static ContentValues a(agnb agnbVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", agnbVar.a);
        contentValues.put("offline_channel_data_proto", agnbVar.d.toByteArray());
        return contentValues;
    }

    public static final void e(SQLiteDatabase sQLiteDatabase) {
        try {
            if (sQLiteDatabase.inTransaction()) {
                sQLiteDatabase.endTransaction();
            }
        } catch (SQLiteException e) {
            zga.n("Error while terminating OfflineChannels db transaction", e);
        }
    }

    public final agnb b(String str) {
        Cursor query = this.a.a().query("channelsV13", agic.a, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return aedn.U(query, (agmm) this.c.get(), query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("offline_channel_data_proto"));
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final void c(agnb agnbVar) {
        this.a.a().insertOrThrow("channelsV13", null, a(agnbVar));
    }

    public final void d(agnb agnbVar) {
        long update = this.a.a().update("channelsV13", a(agnbVar), "id = ?", new String[]{agnbVar.a});
        if (update == 1) {
            return;
        }
        StringBuilder sb = new StringBuilder(49);
        sb.append("Update channel affected ");
        sb.append(update);
        sb.append(" rows");
        throw new SQLException(sb.toString());
    }
}
