package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agfy implements agso {
    private final azrw a;
    private final azrw b;
    private final agft c;

    public agfy(azrw azrwVar, azrw azrwVar2, agft agftVar) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = agftVar;
    }

    @Override // defpackage.agso
    public final void a(List list, long j) {
        if (this.c.z()) {
            agid agidVar = (agid) this.a.get();
            SQLiteDatabase a = agidVar.a.a();
            try {
                a.beginTransaction();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    agidVar.a.a().insertWithOnConflict("channelsV13", null, agid.a((agnb) it.next()), 4);
                }
                a.setTransactionSuccessful();
                agid.e(a);
                agjg agjgVar = (agjg) this.b.get();
                List<String> aU = amkq.aU(list, afyf.g);
                Long valueOf = Long.valueOf(j);
                SQLiteDatabase a2 = agjgVar.a.a();
                try {
                    a2.beginTransaction();
                    a2.delete("subscriptionsV31", "client_modified_timestamp < ?", new String[]{valueOf.toString()});
                    for (String str : aU) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("id", str);
                        contentValues.put("display_state", (Integer) 1);
                        contentValues.put("should_sync_to_server", (Boolean) true);
                        contentValues.put("client_modified_timestamp", valueOf);
                        agjgVar.a.a().insertWithOnConflict("subscriptionsV31", null, contentValues, 4);
                    }
                    a2.setTransactionSuccessful();
                } finally {
                    agjg.a(a2);
                }
            } catch (Throwable th) {
                agid.e(a);
                throw th;
            }
        }
    }
}
