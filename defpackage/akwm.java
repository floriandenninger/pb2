package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akwm {
    public final Map a;
    private final Context b;
    private final ScheduledExecutorService c;
    private final akyd d;
    private ScheduledFuture e;
    private SQLiteDatabase f;

    public akwm(Context context, ScheduledExecutorService scheduledExecutorService, alep alepVar) {
        akyd akydVar = new akyd(alepVar);
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = akydVar;
        this.a = new ConcurrentHashMap();
    }

    private final akzs j(String str, byte[] bArr, int i) {
        akyd akydVar = this.d;
        akzs akzsVar = null;
        try {
            akzs akzsVar2 = (akzs) aonm.parseFrom(akzs.a, bArr, aomw.b());
            if (i != 1) {
                if (i == 2) {
                    aone builder = akzsVar2.toBuilder();
                    if (!((akzs) builder.instance).U) {
                        builder.copyOnWrite();
                        akzs.a((akzs) builder.instance);
                        akzs akzsVar3 = (akzs) builder.instance;
                        if (!akzsVar3.af) {
                            if (akzsVar3.ae) {
                                akzp akzpVar = akzsVar3.ai;
                                if (akzpVar == null) {
                                    akzpVar = akzp.a;
                                }
                                int l = akwg.l(akzpVar.c);
                                if (l == 0 || l != 2) {
                                    akzp akzpVar2 = ((akzs) builder.instance).an;
                                    if (akzpVar2 == null) {
                                        akzpVar2 = akzp.a;
                                    }
                                    int l2 = akwg.l(akzpVar2.c);
                                    if (l2 == 0 || l2 != 2) {
                                        akzpVar2 = akzp.a;
                                    }
                                    builder.copyOnWrite();
                                    akzs akzsVar4 = (akzs) builder.instance;
                                    akzpVar2.getClass();
                                    akzsVar4.an = akzpVar2;
                                    akzsVar4.d |= 4;
                                    akzp akzpVar3 = akzsVar4.O;
                                    if (akzpVar3 == null) {
                                        akzpVar3 = akzp.a;
                                    }
                                    akzp a = akydVar.a(akzpVar3);
                                    builder.copyOnWrite();
                                    akzs akzsVar5 = (akzs) builder.instance;
                                    a.getClass();
                                    akzsVar5.O = a;
                                    akzsVar5.c |= 4096;
                                    akzp akzpVar4 = akzsVar5.aa;
                                    if (akzpVar4 == null) {
                                        akzpVar4 = akzp.a;
                                    }
                                    akzp a2 = akydVar.a(akzpVar4);
                                    builder.copyOnWrite();
                                    akzs akzsVar6 = (akzs) builder.instance;
                                    a2.getClass();
                                    akzsVar6.aa = a2;
                                    akzsVar6.c |= 2097152;
                                    akzp akzpVar5 = akzsVar6.y;
                                    if (akzpVar5 == null) {
                                        akzpVar5 = akzp.a;
                                    }
                                    akzp a3 = akydVar.a(akzpVar5);
                                    builder.copyOnWrite();
                                    akzs akzsVar7 = (akzs) builder.instance;
                                    a3.getClass();
                                    akzsVar7.y = a3;
                                    akzsVar7.b |= 67108864;
                                    akzp akzpVar6 = akzsVar7.y;
                                    if (akzpVar6 == null) {
                                        akzpVar6 = akzp.a;
                                    }
                                    akzp a4 = akydVar.a(akzpVar6);
                                    builder.copyOnWrite();
                                    akzs akzsVar8 = (akzs) builder.instance;
                                    a4.getClass();
                                    akzsVar8.ac = a4;
                                    akzsVar8.c |= 8388608;
                                    akzp akzpVar7 = akzsVar8.ak;
                                    if (akzpVar7 == null) {
                                        akzpVar7 = akzp.a;
                                    }
                                    akzp a5 = akydVar.a(akzpVar7);
                                    builder.copyOnWrite();
                                    akzs akzsVar9 = (akzs) builder.instance;
                                    a5.getClass();
                                    akzsVar9.ak = a5;
                                    akzsVar9.c |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                                    akzp akzpVar8 = akzsVar9.N;
                                    if (akzpVar8 == null) {
                                        akzpVar8 = akzp.a;
                                    }
                                    akzp a6 = akydVar.a(akzpVar8);
                                    builder.copyOnWrite();
                                    akzs akzsVar10 = (akzs) builder.instance;
                                    a6.getClass();
                                    akzsVar10.N = a6;
                                    akzsVar10.c |= 2048;
                                    akzp akzpVar9 = akzsVar10.K;
                                    if (akzpVar9 == null) {
                                        akzpVar9 = akzp.a;
                                    }
                                    akzp a7 = akydVar.a(akzpVar9);
                                    builder.copyOnWrite();
                                    akzs akzsVar11 = (akzs) builder.instance;
                                    a7.getClass();
                                    akzsVar11.K = a7;
                                    akzsVar11.c |= 256;
                                    akzp akzpVar10 = akzsVar11.f65J;
                                    if (akzpVar10 == null) {
                                        akzpVar10 = akzp.a;
                                    }
                                    akzp a8 = akydVar.a(akzpVar10);
                                    builder.copyOnWrite();
                                    akzs akzsVar12 = (akzs) builder.instance;
                                    a8.getClass();
                                    akzsVar12.f65J = a8;
                                    akzsVar12.c |= 128;
                                    akzp akzpVar11 = akzsVar12.M;
                                    if (akzpVar11 == null) {
                                        akzpVar11 = akzp.a;
                                    }
                                    akzp a9 = akydVar.a(akzpVar11);
                                    builder.copyOnWrite();
                                    akzs akzsVar13 = (akzs) builder.instance;
                                    a9.getClass();
                                    akzsVar13.M = a9;
                                    akzsVar13.c |= 1024;
                                    akzp akzpVar12 = akzsVar13.ad;
                                    if (akzpVar12 == null) {
                                        akzpVar12 = akzp.a;
                                    }
                                    akzp a10 = akydVar.a(akzpVar12);
                                    builder.copyOnWrite();
                                    akzs akzsVar14 = (akzs) builder.instance;
                                    a10.getClass();
                                    akzsVar14.ad = a10;
                                    akzsVar14.c |= 16777216;
                                } else {
                                    akzp d = akydVar.a.d();
                                    builder.copyOnWrite();
                                    akzs akzsVar15 = (akzs) builder.instance;
                                    d.getClass();
                                    akzsVar15.an = d;
                                    akzsVar15.d |= 4;
                                    akzp d2 = akydVar.a.d();
                                    builder.copyOnWrite();
                                    akzs akzsVar16 = (akzs) builder.instance;
                                    d2.getClass();
                                    akzsVar16.O = d2;
                                    akzsVar16.c |= 4096;
                                    akzp d3 = akydVar.a.d();
                                    builder.copyOnWrite();
                                    akzs akzsVar17 = (akzs) builder.instance;
                                    d3.getClass();
                                    akzsVar17.aa = d3;
                                    akzsVar17.c |= 2097152;
                                    akzp d4 = akydVar.a.d();
                                    builder.copyOnWrite();
                                    akzs akzsVar18 = (akzs) builder.instance;
                                    d4.getClass();
                                    akzsVar18.y = d4;
                                    akzsVar18.b |= 67108864;
                                    akzp d5 = akydVar.a.d();
                                    builder.copyOnWrite();
                                    akzs akzsVar19 = (akzs) builder.instance;
                                    d5.getClass();
                                    akzsVar19.ac = d5;
                                    akzsVar19.c |= 8388608;
                                    akzp d6 = akydVar.a.d();
                                    builder.copyOnWrite();
                                    akzs akzsVar20 = (akzs) builder.instance;
                                    d6.getClass();
                                    akzsVar20.ak = d6;
                                    akzsVar20.c |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                                    akzp d7 = akydVar.a.d();
                                    builder.copyOnWrite();
                                    akzs akzsVar21 = (akzs) builder.instance;
                                    d7.getClass();
                                    akzsVar21.N = d7;
                                    akzsVar21.c |= 2048;
                                    akzp d8 = akydVar.a.d();
                                    builder.copyOnWrite();
                                    akzs akzsVar22 = (akzs) builder.instance;
                                    d8.getClass();
                                    akzsVar22.K = d8;
                                    akzsVar22.c |= 256;
                                    akzp d9 = akydVar.a.d();
                                    builder.copyOnWrite();
                                    akzs akzsVar23 = (akzs) builder.instance;
                                    d9.getClass();
                                    akzsVar23.f65J = d9;
                                    akzsVar23.c |= 128;
                                    akzp d10 = akydVar.a.d();
                                    builder.copyOnWrite();
                                    akzs akzsVar24 = (akzs) builder.instance;
                                    d10.getClass();
                                    akzsVar24.M = d10;
                                    akzsVar24.c |= 1024;
                                    akzp d11 = akydVar.a.d();
                                    builder.copyOnWrite();
                                    akzs akzsVar25 = (akzs) builder.instance;
                                    d11.getClass();
                                    akzsVar25.ad = d11;
                                    akzsVar25.c |= 16777216;
                                }
                            } else {
                                akzp akzpVar13 = akzp.a;
                                builder.copyOnWrite();
                                akzs akzsVar26 = (akzs) builder.instance;
                                akzpVar13.getClass();
                                akzsVar26.aa = akzpVar13;
                                int i2 = akzsVar26.c | 2097152;
                                akzsVar26.c = i2;
                                if ((i2 & 32) == 0) {
                                    akzp akzpVar14 = akzp.a;
                                    builder.copyOnWrite();
                                    akzs akzsVar27 = (akzs) builder.instance;
                                    akzpVar14.getClass();
                                    akzsVar27.K = akzpVar14;
                                    akzsVar27.c |= 256;
                                } else {
                                    akzp d12 = akydVar.a.d();
                                    builder.copyOnWrite();
                                    akzs akzsVar28 = (akzs) builder.instance;
                                    d12.getClass();
                                    akzsVar28.K = d12;
                                    akzsVar28.c |= 256;
                                }
                            }
                        }
                        akzsVar = (akzs) builder.build();
                    } else {
                        akzsVar = (akzs) builder.build();
                    }
                } else if (i == 3) {
                    akzsVar = akzsVar2;
                }
            }
        } catch (aoob unused) {
        }
        if (akzsVar == null) {
            g(str);
        } else if (i < 3) {
            i(str, akzsVar);
        }
        return akzsVar;
    }

    private final void k(String str, akzs akzsVar) {
        azrh azrhVar = (azrh) this.a.get(str);
        if (azrhVar == null) {
            azrhVar = azrh.e();
            this.a.put(str, azrhVar);
        }
        azrhVar.c(akzsVar);
    }

    private final synchronized void l() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        f();
        this.e = this.c.schedule(new Runnable() { // from class: akwk
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    akwm.this.e();
                } catch (akwn e) {
                    String valueOf = String.valueOf(e.getMessage());
                    zga.b(valueOf.length() != 0 ? "JobStorageException on closing db for idleness: ".concat(valueOf) : new String("JobStorageException on closing db for idleness: "));
                }
            }
        }, 60L, TimeUnit.SECONDS);
    }

    private static final ContentValues m(String str, akzs akzsVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", str);
        contentValues.put("version", (Integer) 3);
        contentValues.put("data", akzsVar.toByteArray());
        return contentValues;
    }

    public final synchronized akyc a(String str, akwp akwpVar) {
        l();
        try {
            this.f.beginTransaction();
            try {
                akzs b = b(str);
                akzs a = akwpVar.a(b);
                if (amkq.b(a, b)) {
                    return new akyc(b, a);
                }
                if (b != null || a == null) {
                    if (a == null) {
                        if (!g(str)) {
                            throw new AssertionError("Delete failed after a read, in a transaction");
                        }
                    } else if (!i(str, a)) {
                        throw new AssertionError("Update failed after a read, in a transaction");
                    }
                } else if (!h(str, a)) {
                    throw new AssertionError("Insert failed after an empty read, in a transaction");
                }
                SQLiteDatabase sQLiteDatabase = this.f;
                sQLiteDatabase.getClass();
                sQLiteDatabase.setTransactionSuccessful();
                return new akyc(b, a);
            } finally {
            }
        } catch (SQLiteException e) {
            throw new akwn("Error updating the database in a transaction", e);
        }
    }

    public final synchronized akzs b(String str) {
        l();
        try {
            Cursor query = this.f.query("job_storage_jobs", new String[]{"version", "data"}, "id = ?", new String[]{str}, null, null, null);
            try {
                if (!query.moveToFirst()) {
                    return null;
                }
                int i = query.getInt(query.getColumnIndexOrThrow("version"));
                byte[] blob = query.getBlob(query.getColumnIndexOrThrow("data"));
                if (query.moveToNext()) {
                    throw new AssertionError("Multiple jobs with the same id were found");
                }
                return j(str, blob, i);
            } finally {
                query.close();
            }
        } catch (Throwable th) {
            throw new akwn("Error querying the database", th);
        }
    }

    public final synchronized Map c() {
        HashMap hashMap;
        l();
        try {
            hashMap = new HashMap();
            Cursor query = this.f.query("job_storage_jobs", new String[]{"id", "version", "data"}, null, null, null, null, null);
            try {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
                int columnIndexOrThrow2 = query.getColumnIndexOrThrow("version");
                int columnIndexOrThrow3 = query.getColumnIndexOrThrow("data");
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    akzs j = j(string, query.getBlob(columnIndexOrThrow3), query.getInt(columnIndexOrThrow2));
                    if (j != null) {
                        if (hashMap.put(string, j) == null) {
                            k(string, j);
                        } else {
                            throw new AssertionError("Multiple jobs with the same id were found");
                        }
                    }
                }
            } finally {
                query.close();
            }
        } catch (Throwable th) {
            throw new akwn("Error querying the database", th);
        }
        return hashMap;
    }

    public final synchronized Map d(ammy ammyVar) {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList = new ArrayList(c().entrySet());
        Collections.sort(arrayList, new ahaa(4));
        linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i);
            if (ammyVar.a((akzs) entry.getValue())) {
                linkedHashMap.put((String) entry.getKey(), (akzs) entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void e() {
        try {
            SQLiteDatabase sQLiteDatabase = this.f;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
                this.f = null;
            }
        } catch (Throwable th) {
            throw new akwn("Could not close the database", th);
        }
    }

    protected final synchronized void f() {
        try {
            if (this.f == null) {
                this.f = new akwl(this.b).getWritableDatabase();
            }
        } catch (Throwable th) {
            throw new akwn("Could not open the database", th);
        }
    }

    public final synchronized boolean g(String str) {
        boolean z;
        azrh azrhVar;
        l();
        try {
            z = true;
            int delete = this.f.delete("job_storage_jobs", "id = ?", new String[]{str});
            if (delete > 1) {
                throw new AssertionError("Multiple jobs with the same id were found");
            }
            if (delete != 1) {
                z = false;
            }
            if (z && (azrhVar = (azrh) this.a.remove(str)) != null) {
                azrhVar.sh();
            }
        } catch (Throwable th) {
            throw new akwn("Error deleting from the database", th);
        }
        return z;
    }

    public final synchronized boolean h(String str, akzs akzsVar) {
        akwn akwnVar;
        boolean z;
        amkq.E(akzsVar.U);
        l();
        try {
            z = this.f.insertOrThrow("job_storage_jobs", null, m(str, akzsVar)) >= 0;
            if (z) {
                k(str, akzsVar);
            }
        } finally {
        }
        return z;
    }

    public final synchronized boolean i(String str, akzs akzsVar) {
        boolean z;
        l();
        try {
            z = true;
            int update = this.f.update("job_storage_jobs", m(str, akzsVar), "id = ?", new String[]{str});
            if (update > 1) {
                throw new AssertionError("Multiple jobs with the same id were found");
            }
            if (update != 1) {
                z = false;
            }
            if (z) {
                k(str, akzsVar);
            }
        } catch (Throwable th) {
            throw new akwn("Error updating the database", th);
        }
        return z;
    }
}
