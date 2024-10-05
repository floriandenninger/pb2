package defpackage;

import android.database.Cursor;
import com.google.android.libraries.notifications.data.impl.room.ChimePerAccountRoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class txn implements txd {
    public final ChimePerAccountRoomDatabase a;
    public final shf b;

    public txn(ChimePerAccountRoomDatabase chimePerAccountRoomDatabase, shf shfVar) {
        this.a = chimePerAccountRoomDatabase;
        this.b = shfVar;
    }

    @Override // defpackage.txd
    public final List a(String... strArr) {
        txt d = d();
        StringBuilder j = js.j();
        j.append("SELECT * FROM chime_thread_states WHERE thread_id IN (");
        int length = strArr.length;
        js.k(j, length);
        j.append(")");
        btn a = btn.a(j.toString(), length);
        int i = 1;
        for (String str : strArr) {
            if (str == null) {
                a.e(i);
            } else {
                a.f(i, str);
            }
            i++;
        }
        txw txwVar = (txw) d;
        txwVar.a.g();
        Cursor e = jr.e(txwVar.a, a, false);
        try {
            int h = jr.h(e, "id");
            int h2 = jr.h(e, "thread_id");
            int h3 = jr.h(e, "last_updated_version");
            int h4 = jr.h(e, "read_state");
            int h5 = jr.h(e, "deletion_status");
            int h6 = jr.h(e, "count_behavior");
            int h7 = jr.h(e, "system_tray_behavior");
            int h8 = jr.h(e, "modified_timestamp");
            ArrayList arrayList = new ArrayList(e.getCount());
            while (e.moveToNext()) {
                long j2 = e.getLong(h);
                String string = e.isNull(h2) ? null : e.getString(h2);
                long j3 = e.getLong(h3);
                int i2 = e.getInt(h4);
                int i3 = h;
                tyo tyoVar = ((txw) d).e;
                int t = aobq.t(i2);
                int i4 = e.getInt(h5);
                tyo tyoVar2 = ((txw) d).e;
                int w = aobq.w(i4);
                int i5 = e.getInt(h6);
                tyo tyoVar3 = ((txw) d).e;
                int z = aobq.z(i5);
                int i6 = e.getInt(h7);
                tyo tyoVar4 = ((txw) d).e;
                arrayList.add(txc.c(j2, string, j3, t, w, z, aobq.o(i6), e.getLong(h8)));
                h = i3;
            }
            return arrayList;
        } finally {
            e.close();
            a.i();
        }
    }

    @Override // defpackage.txd
    public final void b(long j) {
        txt d = d();
        long c = this.b.c();
        txw txwVar = (txw) d;
        txwVar.a.g();
        buu d2 = txwVar.d.d();
        d2.d(1, c - j);
        txwVar.a.h();
        try {
            d2.b();
            ((txw) d).a.j();
        } finally {
            txwVar.a.i();
            txwVar.d.e(d2);
        }
    }

    @Override // defpackage.txd
    public final void c(final txc txcVar) {
        ChimePerAccountRoomDatabase chimePerAccountRoomDatabase = this.a;
        Callable callable = new Callable() { // from class: txm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                txc txcVar2;
                txw txwVar;
                txn txnVar = txn.this;
                twt b = txcVar.b();
                b.c(txnVar.b.c());
                txc a = b.a();
                txt d = txnVar.d();
                String str = a.b;
                btn a2 = btn.a("SELECT * FROM chime_thread_states WHERE thread_id = ?", 1);
                if (str == null) {
                    a2.e(1);
                } else {
                    a2.f(1, str);
                }
                txw txwVar2 = (txw) d;
                txwVar2.a.g();
                Cursor e = jr.e(txwVar2.a, a2, false);
                try {
                    int h = jr.h(e, "id");
                    int h2 = jr.h(e, "thread_id");
                    int h3 = jr.h(e, "last_updated_version");
                    int h4 = jr.h(e, "read_state");
                    int h5 = jr.h(e, "deletion_status");
                    int h6 = jr.h(e, "count_behavior");
                    int h7 = jr.h(e, "system_tray_behavior");
                    int h8 = jr.h(e, "modified_timestamp");
                    if (e.moveToFirst()) {
                        long j = e.getLong(h);
                        String string = e.isNull(h2) ? null : e.getString(h2);
                        long j2 = e.getLong(h3);
                        int i = e.getInt(h4);
                        tyo tyoVar = ((txw) d).e;
                        int t = aobq.t(i);
                        int i2 = e.getInt(h5);
                        tyo tyoVar2 = ((txw) d).e;
                        int w = aobq.w(i2);
                        int i3 = e.getInt(h6);
                        tyo tyoVar3 = ((txw) d).e;
                        int z = aobq.z(i3);
                        int i4 = e.getInt(h7);
                        tyo tyoVar4 = ((txw) d).e;
                        txcVar2 = txc.c(j, string, j2, t, w, z, aobq.o(i4), e.getLong(h8));
                    } else {
                        txcVar2 = null;
                    }
                    if (txcVar2 == null) {
                        txt q = txnVar.a.q();
                        txwVar = (txw) q;
                        txwVar.a.g();
                        txwVar.a.h();
                        try {
                            btg btgVar = ((txw) q).b;
                            buu d2 = btgVar.d();
                            try {
                                btgVar.c(d2, a);
                                d2.a();
                                btgVar.e(d2);
                                ((txw) q).a.j();
                                txwVar.a.i();
                                return txe.INSERTED;
                            } catch (Throwable th) {
                                btgVar.e(d2);
                                throw th;
                            }
                        } finally {
                        }
                    }
                    if (txcVar2.c >= a.c) {
                        return txe.REJECTED_SAME_VERSION;
                    }
                    txt d3 = txnVar.d();
                    long j3 = txcVar2.a;
                    twt b2 = a.b();
                    b2.b(j3);
                    txc a3 = b2.a();
                    txwVar = (txw) d3;
                    txwVar.a.g();
                    txwVar.a.h();
                    try {
                        btf btfVar = ((txw) d3).c;
                        buu d4 = btfVar.d();
                        try {
                            d4.d(1, a3.a);
                            String str2 = a3.b;
                            if (str2 == null) {
                                d4.e(2);
                            } else {
                                d4.f(2, str2);
                            }
                            d4.d(3, a3.c);
                            int i5 = a3.e;
                            int i6 = i5 - 1;
                            if (i5 == 0) {
                                throw null;
                            }
                            d4.d(4, i6);
                            int i7 = a3.f;
                            int i8 = i7 - 1;
                            if (i7 == 0) {
                                throw null;
                            }
                            d4.d(5, i8);
                            int i9 = a3.g;
                            int i10 = i9 - 1;
                            if (i9 == 0) {
                                throw null;
                            }
                            d4.d(6, i10);
                            int i11 = a3.h;
                            int i12 = i11 - 1;
                            if (i11 == 0) {
                                throw null;
                            }
                            d4.d(7, i12);
                            d4.d(8, a3.d);
                            d4.d(9, a3.a);
                            d4.b();
                            btfVar.e(d4);
                            ((txw) d3).a.j();
                            txwVar.a.i();
                            return txe.REPLACED;
                        } catch (Throwable th2) {
                            btfVar.e(d4);
                            throw th2;
                        }
                    } finally {
                    }
                } finally {
                    e.close();
                    a2.i();
                }
            }
        };
        chimePerAccountRoomDatabase.h();
        try {
            try {
                Object call = callable.call();
                chimePerAccountRoomDatabase.j();
                chimePerAccountRoomDatabase.i();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Throwable th) {
            chimePerAccountRoomDatabase.i();
            throw th;
        }
    }

    public final txt d() {
        return this.a.q();
    }
}
