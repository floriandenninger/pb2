package defpackage;

import android.content.ContentValues;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class aajj {
    /* JADX INFO: Access modifiers changed from: protected */
    public static void c(aaka aakaVar, viq viqVar, aaln aalnVar, long j, aoqa aoqaVar) {
        aakt aaktVar = aalnVar.b;
        aaktVar.getClass();
        String d = aaktVar.d();
        try {
            long d2 = d(d);
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("key", d);
                contentValues.put("entity", aaktVar.c());
                contentValues.put("last_modified_datetime", Long.valueOf(j));
                contentValues.put("data_type", Long.valueOf(d2));
                aora.g(aoqaVar);
                contentValues.put("batch_update_timestamp", Long.valueOf(anaf.ar(anaf.as(aoqaVar.b, 1000000000L), aoqaVar.c)));
                contentValues.put("metadata", aalnVar.c.b.toByteArray());
                long f = viqVar.f("entity_table", contentValues);
                if (f >= 0) {
                    aaku aakuVar = aalnVar.c;
                    aakaVar.b(viqVar);
                    Collection collection = (Collection) aakaVar.b.b.get(aaktVar.getClass());
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            viqVar.d(aaka.a((aajb) it.next(), aaktVar, aakuVar));
                        }
                    }
                    viqVar.e("DELETE FROM entity_associations WHERE parent_entity_key=?", aaktVar.d());
                    whu.ag(viqVar, aaktVar);
                    return;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 59);
                sb.append("Could not insert entity: ");
                sb.append(d);
                sb.append(" with status: ");
                sb.append(f);
                throw new IllegalStateException(sb.toString());
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                throw aaiq.c(e, (int) d2);
            }
        } catch (Exception e2) {
            throw aaiq.c(e2, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long d(String str) {
        int a = aalt.a(str);
        if (a != Integer.MIN_VALUE) {
            return a;
        }
        throw aaiq.b(null, -1, 4, 3);
    }

    public abstract void b(aaka aakaVar, viq viqVar, amrp amrpVar);
}
