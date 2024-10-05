package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteAbortException;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDatatypeMismatchException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteMisuseException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import android.database.sqlite.SQLiteTableLockedException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aajv implements aair, aalk {
    public final aakl c;
    public final Executor d;
    public final aals e;
    private final shf g;
    private final aalo h;
    private final amrz i;
    private final aaip j;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public volatile boolean f = false;

    public aajv(afsx afsxVar, Executor executor, shf shfVar, amrz amrzVar, amea ameaVar, azrw azrwVar, aals aalsVar, aaip aaipVar, azrw azrwVar2, byte[] bArr, byte[] bArr2) {
        this.g = shfVar;
        this.d = executor;
        this.i = amrzVar;
        this.e = aalsVar;
        aalo aaloVar = new aalo(azrwVar, this);
        this.h = aaloVar;
        this.j = aaipVar;
        this.c = new aakl(afsxVar, ameaVar, aaloVar, azrwVar2, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aaiq l() {
        return aaiq.a(new IllegalStateException("Store has been disposed."), 1);
    }

    @Override // defpackage.aair
    public final ayqj a(final String str) {
        return this.f ? ayqj.z(l()) : wbs.J(((vhj) this.c.c.get()).a(new vip() { // from class: aakh
            @Override // defpackage.vip
            public final Object a(viq viqVar) {
                String str2 = str;
                amsv amsvVar = new amsv();
                Cursor b = viqVar.b("SELECT DISTINCT parent_entity_key FROM entity_associations WHERE child_entity_key=?", str2);
                while (b.moveToNext()) {
                    try {
                        amsvVar.c(b.getString(0));
                    } catch (Throwable th) {
                        if (b != null) {
                            try {
                                b.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                }
                if (b != null) {
                    b.close();
                }
                return amsvVar.g();
            }
        }));
    }

    @Override // defpackage.aakv
    public final aakt b(String str) {
        return (aakt) f(str).X();
    }

    @Override // defpackage.aalk
    public final aalc d(aoqa aoqaVar) {
        aajl c = c();
        c.a = aoqaVar;
        return c;
    }

    @Override // defpackage.aair
    public final ayqj e(final aaiz aaizVar) {
        if (this.f) {
            return ayqj.z(l());
        }
        final aaka aakaVar = (aaka) this.c.d.get();
        return wbs.J(aakaVar.c.a(new vip() { // from class: aajw
            @Override // defpackage.vip
            public final Object a(viq viqVar) {
                aaka aakaVar2 = aaka.this;
                aaiz aaizVar2 = aaizVar;
                aakaVar2.b(viqVar);
                if (!aakaVar2.a.contains(aaizVar2.a)) {
                    throw new IllegalArgumentException("QueryTable missing, did you forget to inject it?");
                }
                amrp amrpVar = new amrp();
                Cursor a = viqVar.a(aaizVar2.b);
                while (a.moveToNext()) {
                    try {
                        amrpVar.h(a.getString(0));
                    } catch (Throwable th) {
                        if (a != null) {
                            try {
                                a.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                }
                if (a != null) {
                    a.close();
                }
                return amrpVar.g();
            }
        }));
    }

    @Override // defpackage.aakv
    public final ayps f(String str) {
        return this.f ? ayps.q(l()) : wbs.L(anfq.h(anht.q(this.c.e(str)), yml.s, angq.a)).m(new aajs(this));
    }

    @Override // defpackage.aakv
    public final aypy g(Class cls) {
        return n(cls).U();
    }

    @Override // defpackage.aakv
    public final aypy h(String str, boolean z) {
        aypy U = o(str).U();
        return z ? aypy.y(new aajq(this, str, U, 1)) : U;
    }

    @Override // defpackage.aakv
    public final aypy i(String str) {
        return aypy.y(new aajq(this, str, o(str).Y(zcz.o), 0));
    }

    @Override // defpackage.aakv
    public final ayqj j(String str) {
        return this.f ? ayqj.z(l()) : wbs.J(anfq.h(anht.q(this.c.e(str)), yml.t, angq.a)).x(new aajs(this));
    }

    @Override // defpackage.aair
    public final ayqj k(final int i) {
        return this.f ? ayqj.z(l()) : wbs.J(((vhj) this.c.c.get()).a(new vip() { // from class: aake
            @Override // defpackage.vip
            public final Object a(viq viqVar) {
                int i2 = i;
                vin vinVar = new vin();
                vinVar.b("SELECT ");
                vinVar.b("key");
                vinVar.b(" FROM ");
                vinVar.b("entity_table");
                vinVar.b(" WHERE ");
                vinVar.b("data_type");
                vinVar.b(" = ?");
                vinVar.c(Integer.toString(i2));
                try {
                    Cursor a = viqVar.a(vinVar.a());
                    try {
                        amrp amrpVar = new amrp();
                        while (a.moveToNext()) {
                            amrpVar.h(a.getString(a.getColumnIndex("key")));
                        }
                        amru g = amrpVar.g();
                        if (a != null) {
                            a.close();
                        }
                        return g;
                    } catch (Throwable th) {
                        if (a != null) {
                            try {
                                a.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw aaiq.a(e, 3);
                }
            }
        }));
    }

    @Override // defpackage.aakv
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final aajl c() {
        return new aajl(this.c, new aajr(this), new aajr(this), new aajr(this), this.h, this.g, this.i, null, null);
    }

    public final aali n(final Class cls) {
        aali aaliVar = (aali) this.b.get(cls);
        if (aaliVar == null) {
            synchronized (this.b) {
                aaliVar = (aali) this.b.get(cls);
                if (aaliVar == null) {
                    aaliVar = aali.e(new Runnable() { // from class: aajt
                        @Override // java.lang.Runnable
                        public final void run() {
                            aajv aajvVar = aajv.this;
                            aajvVar.b.remove(cls);
                        }
                    });
                    this.b.put(cls, aaliVar);
                }
            }
        }
        return aaliVar;
    }

    public final aali o(final String str) {
        aali aaliVar = (aali) this.a.get(str);
        if (aaliVar == null) {
            synchronized (this.a) {
                aaliVar = (aali) this.a.get(str);
                if (aaliVar == null) {
                    aaliVar = aali.e(new Runnable() { // from class: aajp
                        @Override // java.lang.Runnable
                        public final void run() {
                            aajv aajvVar = aajv.this;
                            aajvVar.a.remove(str);
                        }
                    });
                    this.a.put(str, aaliVar);
                }
            }
        }
        return aaliVar;
    }

    public final void p(Throwable th) {
        Throwable c = amnz.c(th);
        if (c instanceof aaiq) {
            aaiq aaiqVar = (aaiq) c;
            aaip aaipVar = this.j;
            if (aaiqVar.b) {
                return;
            }
            aaiqVar.b = true;
            if (aaipVar.a) {
                aone createBuilder = aqtx.a.createBuilder();
                int i = aaiqVar.d;
                createBuilder.copyOnWrite();
                aqtx aqtxVar = (aqtx) createBuilder.instance;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                aqtxVar.f = i2;
                aqtxVar.b |= 8;
                createBuilder.copyOnWrite();
                aqtx aqtxVar2 = (aqtx) createBuilder.instance;
                aqtxVar2.c = 2;
                aqtxVar2.b |= 1;
                int i3 = aaiqVar.c;
                createBuilder.copyOnWrite();
                aqtx aqtxVar3 = (aqtx) createBuilder.instance;
                int i4 = i3 - 1;
                if (i3 != 0) {
                    aqtxVar3.e = i4;
                    aqtxVar3.b |= 4;
                    Throwable cause = aaiqVar.getCause();
                    if (cause instanceof SQLiteAbortException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar4 = (aqtx) createBuilder.instance;
                        aqtxVar4.g = 17;
                        aqtxVar4.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar5 = (aqtx) createBuilder.instance;
                        aqtxVar5.f = 3;
                        aqtxVar5.b |= 8;
                    } else if (cause instanceof SQLiteAccessPermException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar6 = (aqtx) createBuilder.instance;
                        aqtxVar6.g = 2;
                        aqtxVar6.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar7 = (aqtx) createBuilder.instance;
                        aqtxVar7.f = 3;
                        aqtxVar7.b |= 8;
                    } else if (cause instanceof SQLiteBindOrColumnIndexOutOfRangeException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar8 = (aqtx) createBuilder.instance;
                        aqtxVar8.g = 3;
                        aqtxVar8.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar9 = (aqtx) createBuilder.instance;
                        aqtxVar9.f = 3;
                        aqtxVar9.b |= 8;
                    } else if (cause instanceof SQLiteBlobTooBigException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar10 = (aqtx) createBuilder.instance;
                        aqtxVar10.g = 4;
                        aqtxVar10.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar11 = (aqtx) createBuilder.instance;
                        aqtxVar11.f = 3;
                        aqtxVar11.b |= 8;
                    } else if (cause instanceof SQLiteCantOpenDatabaseException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar12 = (aqtx) createBuilder.instance;
                        aqtxVar12.g = 5;
                        aqtxVar12.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar13 = (aqtx) createBuilder.instance;
                        aqtxVar13.f = 3;
                        aqtxVar13.b |= 8;
                    } else if (cause instanceof SQLiteConstraintException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar14 = (aqtx) createBuilder.instance;
                        aqtxVar14.g = 6;
                        aqtxVar14.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar15 = (aqtx) createBuilder.instance;
                        aqtxVar15.f = 3;
                        aqtxVar15.b |= 8;
                    } else if (cause instanceof SQLiteDatabaseCorruptException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar16 = (aqtx) createBuilder.instance;
                        aqtxVar16.g = 7;
                        aqtxVar16.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar17 = (aqtx) createBuilder.instance;
                        aqtxVar17.f = 3;
                        aqtxVar17.b |= 8;
                    } else if (cause instanceof SQLiteDatabaseLockedException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar18 = (aqtx) createBuilder.instance;
                        aqtxVar18.g = 8;
                        aqtxVar18.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar19 = (aqtx) createBuilder.instance;
                        aqtxVar19.f = 3;
                        aqtxVar19.b |= 8;
                    } else if (cause instanceof SQLiteDatatypeMismatchException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar20 = (aqtx) createBuilder.instance;
                        aqtxVar20.g = 9;
                        aqtxVar20.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar21 = (aqtx) createBuilder.instance;
                        aqtxVar21.f = 3;
                        aqtxVar21.b |= 8;
                    } else if (cause instanceof SQLiteDiskIOException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar22 = (aqtx) createBuilder.instance;
                        aqtxVar22.g = 10;
                        aqtxVar22.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar23 = (aqtx) createBuilder.instance;
                        aqtxVar23.f = 3;
                        aqtxVar23.b |= 8;
                    } else if (cause instanceof SQLiteDoneException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar24 = (aqtx) createBuilder.instance;
                        aqtxVar24.g = 11;
                        aqtxVar24.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar25 = (aqtx) createBuilder.instance;
                        aqtxVar25.f = 3;
                        aqtxVar25.b |= 8;
                    } else if (cause instanceof SQLiteFullException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar26 = (aqtx) createBuilder.instance;
                        aqtxVar26.g = 12;
                        aqtxVar26.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar27 = (aqtx) createBuilder.instance;
                        aqtxVar27.f = 3;
                        aqtxVar27.b |= 8;
                    } else if (cause instanceof SQLiteMisuseException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar28 = (aqtx) createBuilder.instance;
                        aqtxVar28.g = 13;
                        aqtxVar28.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar29 = (aqtx) createBuilder.instance;
                        aqtxVar29.f = 3;
                        aqtxVar29.b |= 8;
                    } else if (cause instanceof SQLiteOutOfMemoryException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar30 = (aqtx) createBuilder.instance;
                        aqtxVar30.g = 14;
                        aqtxVar30.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar31 = (aqtx) createBuilder.instance;
                        aqtxVar31.f = 3;
                        aqtxVar31.b |= 8;
                    } else if (cause instanceof SQLiteReadOnlyDatabaseException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar32 = (aqtx) createBuilder.instance;
                        aqtxVar32.g = 15;
                        aqtxVar32.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar33 = (aqtx) createBuilder.instance;
                        aqtxVar33.f = 3;
                        aqtxVar33.b |= 8;
                    } else if (cause instanceof SQLiteTableLockedException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar34 = (aqtx) createBuilder.instance;
                        aqtxVar34.g = 16;
                        aqtxVar34.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar35 = (aqtx) createBuilder.instance;
                        aqtxVar35.f = 3;
                        aqtxVar35.b |= 8;
                    } else if (cause instanceof SQLiteException) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar36 = (aqtx) createBuilder.instance;
                        aqtxVar36.g = 1;
                        aqtxVar36.b |= 64;
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar37 = (aqtx) createBuilder.instance;
                        aqtxVar37.f = 3;
                        aqtxVar37.b |= 8;
                    }
                    int i5 = aaiqVar.a;
                    if (i5 > 0) {
                        createBuilder.copyOnWrite();
                        aqtx aqtxVar38 = (aqtx) createBuilder.instance;
                        aqtxVar38.b = 2 | aqtxVar38.b;
                        aqtxVar38.d = i5;
                    }
                    aaipVar.a((aqtx) createBuilder.build());
                    return;
                }
                throw null;
            }
            return;
        }
        if (this.j.a) {
            aone createBuilder2 = aqtx.a.createBuilder();
            createBuilder2.copyOnWrite();
            aqtx aqtxVar39 = (aqtx) createBuilder2.instance;
            aqtxVar39.f = 0;
            aqtxVar39.b = 8 | aqtxVar39.b;
            createBuilder2.copyOnWrite();
            aqtx aqtxVar40 = (aqtx) createBuilder2.instance;
            aqtxVar40.c = 2;
            aqtxVar40.b |= 1;
            createBuilder2.copyOnWrite();
            aqtx aqtxVar41 = (aqtx) createBuilder2.instance;
            aqtxVar41.e = 0;
            aqtxVar41.b = 4 | aqtxVar41.b;
            this.j.a((aqtx) createBuilder2.build());
        }
    }
}
