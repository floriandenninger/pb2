package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class txp {
    private final Context a;
    private final twx b;
    private final axpg c;
    private final shf d;
    private final HashMap e = new HashMap();

    public txp(Context context, twx twxVar, axpg axpgVar, shf shfVar) {
        this.a = context;
        this.b = twxVar;
        this.c = axpgVar;
        this.d = shfVar;
    }

    private final synchronized txl f(String str) {
        Long l;
        l = -1L;
        if (str != null) {
            l = this.b.b(str).a;
        }
        if (!this.e.containsKey(l)) {
            this.e.put(l, new txl(this.a, l.longValue()));
        }
        return (txl) this.e.get(l);
    }

    private final synchronized amrz g(String str, SQLiteDatabase sQLiteDatabase, uzh uzhVar) {
        amrz c;
        Cursor query = sQLiteDatabase.query("threads", null, uzhVar.a, uzhVar.a(), null, null, "last_notification_version DESC", null);
        try {
            amrw h = amrz.h();
            while (query.moveToNext()) {
                try {
                    tws b = txb.b();
                    b.e(query.getString(tyo.b(query, "thread_id")));
                    b.i(aobq.t(query.getInt(tyo.b(query, "read_state"))));
                    b.g(aobq.z(query.getInt(tyo.b(query, "count_behavior"))));
                    b.k(aobq.o(query.getInt(tyo.b(query, "system_tray_behavior"))));
                    b.a = Long.valueOf(query.getLong(tyo.b(query, "last_updated__version")));
                    b.b = Long.valueOf(query.getLong(tyo.b(query, "last_notification_version")));
                    b.d = query.getString(tyo.b(query, "payload_type"));
                    b.f(tyo.h(query, aokg.a, "notification_metadata"));
                    List h2 = tyo.h(query, aojx.a, "actions");
                    ArrayList arrayList = new ArrayList();
                    Iterator it = h2.iterator();
                    while (it.hasNext()) {
                        ammv a = twy.a((aojx) it.next());
                        if (a.h()) {
                            arrayList.add((twy) a.c());
                        }
                    }
                    b.b(arrayList);
                    b.c = Long.valueOf(query.getLong(tyo.b(query, "creation_id")));
                    b.c((aokd) tyo.g(query, aokd.a, "rendered_message"));
                    b.e = (aols) tyo.g(query, aols.a, "payload");
                    b.f = query.getString(tyo.b(query, "update_thread_state_token"));
                    b.d(query.getString(tyo.b(query, "group_id")));
                    b.g = Long.valueOf(query.getLong(tyo.b(query, "expiration_timestamp")));
                    b.h = Long.valueOf(query.getLong(tyo.b(query, "thread_stored_timestamp")));
                    b.j(aobq.s(query.getInt(tyo.b(query, "storage_mode"))));
                    b.h(aobq.w(query.getInt(tyo.b(query, "deletion_status"))));
                    h.g(b.a(), Long.valueOf(query.getLong(tyo.b(query, "reference"))));
                } catch (txr unused) {
                    tzf c2 = ((tzh) this.c.get()).c(41);
                    ((tzj) c2).l = str;
                    c2.i();
                }
            }
            c = h.c();
            if (query != null) {
                query.close();
            }
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable unused2) {
                }
            }
            throw th;
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final synchronized void h(String str, uzh uzhVar, List list) {
        try {
            SQLiteDatabase writableDatabase = f(str).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                try {
                    amxe it = ((amru) list).iterator();
                    while (it.hasNext()) {
                        uzh uzhVar2 = (uzh) it.next();
                        uzi b = uzi.b();
                        b.c("UPDATE ");
                        b.c("threads");
                        b.c(" SET ");
                        b.c(uzhVar.a);
                        b.c(" WHERE ");
                        b.c(uzhVar2.a);
                        String str2 = b.a().a;
                        String[] a = uzhVar.a();
                        String[] a2 = uzhVar2.a();
                        int length = a.length;
                        int length2 = a2.length;
                        Object[] az = amkq.az(String.class, length + length2);
                        System.arraycopy(a, 0, az, 0, length);
                        System.arraycopy(a2, 0, az, length, length2);
                        writableDatabase.execSQL(str2, az);
                    }
                    writableDatabase.setTransactionSuccessful();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (RuntimeException | tww e) {
            tzk.c("ChimeThreadStorageHelper", e, "Error updating ChimeThread for %s. Set: %s, Queries: %s", str, uzhVar, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized amru a(String str, List list) {
        amrp f = amru.f();
        try {
            SQLiteDatabase writableDatabase = f(str).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                try {
                    amxe it = ((amru) list).iterator();
                    while (it.hasNext()) {
                        f.j(g(str, writableDatabase, (uzh) it.next()).keySet());
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    amru g = f.g();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                    return g;
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (Throwable th2) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        } catch (RuntimeException | tww e) {
            tzk.c("ChimeThreadStorageHelper", e, "Error getting ChimeThreads for %s. Queries: %s", str, list);
            return amru.q();
        }
    }

    public final synchronized void b(String str, List list) {
        uzi b = uzi.b();
        b.c("reference");
        b.c(" = ");
        b.c("reference");
        b.d(" & ~?", 1L);
        h(str, b.a(), list);
    }

    public final synchronized Pair c(String str, txb txbVar, boolean z) {
        try {
            SQLiteDatabase writableDatabase = f(str).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                try {
                    ContentValues contentValues = new ContentValues(16);
                    contentValues.put("thread_id", txbVar.a);
                    int i = txbVar.o;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    contentValues.put("read_state", Integer.valueOf(i2));
                    int i3 = txbVar.q;
                    int i4 = i3 - 1;
                    if (i3 == 0) {
                        throw null;
                    }
                    contentValues.put("count_behavior", Integer.valueOf(i4));
                    int i5 = txbVar.r;
                    int i6 = i5 - 1;
                    if (i5 == 0) {
                        throw null;
                    }
                    contentValues.put("system_tray_behavior", Integer.valueOf(i6));
                    contentValues.put("last_updated__version", txbVar.b);
                    contentValues.put("last_notification_version", txbVar.c);
                    contentValues.put("payload_type", txbVar.g);
                    contentValues.put("update_thread_state_token", txbVar.i);
                    contentValues.put("group_id", txbVar.j);
                    contentValues.put("expiration_timestamp", txbVar.k);
                    contentValues.put("thread_stored_timestamp", Long.valueOf(this.d.c()));
                    contentValues.put("locally_removed", (Boolean) false);
                    int i7 = txbVar.s;
                    int i8 = i7 - 1;
                    if (i7 == 0) {
                        throw null;
                    }
                    contentValues.put("storage_mode", Integer.valueOf(i8));
                    contentValues.put("creation_id", txbVar.f);
                    contentValues.put("reference", (Long) 1L);
                    int i9 = txbVar.p;
                    int i10 = i9 - 1;
                    if (i9 == 0) {
                        throw null;
                    }
                    contentValues.put("deletion_status", Integer.valueOf(i10));
                    aokd aokdVar = txbVar.d;
                    if (aokdVar != null) {
                        contentValues.put("rendered_message", aokdVar.toByteArray());
                    }
                    if (!txbVar.e.isEmpty()) {
                        aone createBuilder = ucw.a.createBuilder();
                        for (aokg aokgVar : txbVar.e) {
                            aone createBuilder2 = aols.a.createBuilder();
                            aomf byteString = aokgVar.toByteString();
                            createBuilder2.copyOnWrite();
                            ((aols) createBuilder2.instance).c = byteString;
                            createBuilder.B((aols) createBuilder2.build());
                        }
                        contentValues.put("notification_metadata", ((ucw) createBuilder.build()).toByteArray());
                    }
                    if (!txbVar.n.isEmpty()) {
                        aone createBuilder3 = ucw.a.createBuilder();
                        for (twy twyVar : txbVar.n) {
                            aone createBuilder4 = aols.a.createBuilder();
                            aomf byteString2 = twyVar.b().toByteString();
                            createBuilder4.copyOnWrite();
                            ((aols) createBuilder4.instance).c = byteString2;
                            createBuilder3.B((aols) createBuilder4.build());
                        }
                        contentValues.put("actions", ((ucw) createBuilder3.build()).toByteArray());
                    }
                    aols aolsVar = txbVar.h;
                    if (aolsVar != null) {
                        contentValues.put("payload", aolsVar.toByteArray());
                    }
                    uzi b = uzi.b();
                    b.c("thread_id");
                    b.d(" = ?", txbVar.a);
                    uzh a = b.a();
                    amrz g = g(str, writableDatabase, a);
                    if (g.isEmpty()) {
                        writableDatabase.insertWithOnConflict("threads", null, contentValues, 4);
                        writableDatabase.setTransactionSuccessful();
                        Pair pair = new Pair(txe.INSERTED, amlr.a);
                        if (writableDatabase != null) {
                            writableDatabase.close();
                        }
                        return pair;
                    }
                    txb txbVar2 = (txb) g.keySet().g().get(0);
                    long longValue = txbVar2.b.longValue();
                    long longValue2 = txbVar.b.longValue();
                    boolean z2 = txbVar2.b.equals(txbVar.b) && !txbVar2.equals(txbVar);
                    if (longValue >= longValue2 && (!z || !z2)) {
                        Pair pair2 = new Pair(txe.REJECTED_SAME_VERSION, amlr.a);
                        if (writableDatabase != null) {
                            writableDatabase.close();
                        }
                        return pair2;
                    }
                    writableDatabase.update("threads", contentValues, a.a, a.a());
                    writableDatabase.setTransactionSuccessful();
                    txe txeVar = (((Long) g.get(txbVar2)).longValue() & 1) > 0 ? txe.REPLACED : txe.INSERTED;
                    Pair pair3 = new Pair(txeVar, txeVar == txe.REPLACED ? ammv.j(txbVar2) : amlr.a);
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                    return pair3;
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (RuntimeException | tww e) {
            tzk.c("ChimeThreadStorageHelper", e, "Error inserting ChimeThread for account: %s, %s", str, txbVar);
            return new Pair(txe.REJECTED_DB_ERROR, amlr.a);
        }
    }

    public final synchronized void d(String str) {
        try {
            this.a.deleteDatabase(f(str).getDatabaseName());
        } catch (RuntimeException | tww e) {
            tzk.c("ChimeThreadStorageHelper", e, "Error deleting database for %s", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void e(String str, List list) {
        try {
            SQLiteDatabase writableDatabase = f(str).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                try {
                    amxe it = ((amru) list).iterator();
                    while (it.hasNext()) {
                        uzh uzhVar = (uzh) it.next();
                        writableDatabase.delete("threads", uzhVar.a, uzhVar.a());
                    }
                    writableDatabase.setTransactionSuccessful();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (RuntimeException | tww e) {
            tzk.c("ChimeThreadStorageHelper", e, "Error deleting ChimeThreads for %s. Queries: %s", str, list);
        }
    }
}
