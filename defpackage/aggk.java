package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aggk implements agss {
    static final long a = TimeUnit.MINUTES.toMillis(2);
    public final agft b;
    public final azrw c;
    public final azrw d;
    public final azrw e;
    public final String f;
    public final agvh g;
    public final agsm h;
    public final shf i;
    private final azrw l;
    private final azrw m;
    private final azrw n;
    private final azrw o;
    private final azrw p;
    private final aaea q;
    private final agzz r;
    private final azrw s;
    private final Executor t;
    public final akgl k = new akgl(null, null);
    public final aggj j = new aggj(this);

    public aggk(azrw azrwVar, agft agftVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, aaea aaeaVar, String str, agvh agvhVar, agzz agzzVar, agsm agsmVar, shf shfVar, azrw azrwVar8, azrw azrwVar9, Executor executor) {
        this.l = azrwVar;
        this.b = agftVar;
        this.c = azrwVar2;
        this.m = azrwVar3;
        this.n = azrwVar4;
        this.d = azrwVar5;
        this.e = azrwVar6;
        this.p = azrwVar7;
        this.q = aaeaVar;
        this.f = str;
        this.g = agvhVar;
        this.r = agzzVar;
        this.h = agsmVar;
        this.i = shfVar;
        this.s = azrwVar8;
        this.o = azrwVar9;
        this.t = executor;
    }

    private final synchronized boolean A(bagd bagdVar, List list, agnf agnfVar, atrx atrxVar, int i, byte[] bArr) {
        boolean z;
        SQLiteDatabase a2 = ((agjs) this.p.get()).a();
        a2.beginTransaction();
        try {
            try {
                agjl agjlVar = (agjl) this.e.get();
                agjlVar.q(bagdVar, list, agnfVar, atrxVar, ((agsg) this.l.get()).U(atrxVar), i, bArr);
                agjlVar.o(bagdVar);
                a2.setTransactionSuccessful();
                z = true;
            } catch (SQLException e) {
                zga.d("[Offline] Error syncing playlist", e);
                a2.endTransaction();
                z = false;
            }
        } finally {
            a2.endTransaction();
        }
        return z;
    }

    private final synchronized boolean B(bagd bagdVar, agnp agnpVar, agnf agnfVar, atrx atrxVar, byte[] bArr) {
        boolean z;
        SQLiteDatabase a2 = ((agjs) this.p.get()).a();
        a2.beginTransaction();
        try {
            try {
                agjl agjlVar = (agjl) this.e.get();
                int U = ((agsg) this.l.get()).U(atrxVar);
                String str = bagdVar.a;
                int a3 = ahab.a(atrxVar, 360);
                String f = agnpVar.f();
                List f2 = agjlVar.f(str);
                agjlVar.h(str, f);
                agjlVar.i(str, f, f2.size());
                if (!agjlVar.b.l(f)) {
                    agjlVar.b.n(agnpVar, agnfVar, agno.OFFLINE_IMMEDIATELY, a3, null, U, -1, agjlVar.c.c(), bArr);
                }
                Iterator it = agjlVar.d.iterator();
                while (it.hasNext()) {
                    ((agjj) it.next()).d(bagdVar, agnpVar, atrxVar, bArr, agnfVar, agno.OFFLINE_IMMEDIATELY);
                }
                agjlVar.o(bagdVar);
                a2.setTransactionSuccessful();
                z = true;
            } catch (SQLException e) {
                zga.d("[Offline] Error syncing playlist", e);
                a2.endTransaction();
                z = false;
            }
        } finally {
            a2.endTransaction();
        }
        return z;
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x00c8: INVOKE (r0 I:android.database.sqlite.SQLiteDatabase) VIRTUAL call: android.database.sqlite.SQLiteDatabase.endTransaction():void A[Catch: all -> 0x00cc, MD:():void (c), TRY_ENTER], block:B:26:0x00c8 */
    private final synchronized void y(String str) {
        SQLiteDatabase endTransaction;
        try {
            zhq.m(str);
            SQLiteDatabase a2 = ((agjs) this.p.get()).a();
            a2.beginTransaction();
            try {
                agjl agjlVar = (agjl) this.e.get();
                long delete = agjlVar.a.a().delete("video_listsV13", "id = ?", new String[]{str});
                if (delete == 1) {
                    List f = agjlVar.f(str);
                    agjlVar.a.a().delete("video_list_videos", "video_list_id = ?", new String[]{str});
                    Iterator it = agjlVar.d.iterator();
                    while (it.hasNext()) {
                        ((agjj) it.next()).a(f);
                    }
                    a2.setTransactionSuccessful();
                    this.k.u(str);
                    String.valueOf(str).length();
                    this.b.v(new aglc(str));
                    a2.endTransaction();
                } else {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Delete video list affected ");
                    sb.append(delete);
                    sb.append(" rows");
                    throw new SQLException(sb.toString());
                }
            } catch (SQLException e) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
                sb2.append("[Offline] Error deleting video list ");
                sb2.append(str);
                sb2.append(" from database");
                zga.d(sb2.toString(), e);
                a2.endTransaction();
            }
        } catch (Throwable th) {
            endTransaction.endTransaction();
            throw th;
        }
    }

    private final synchronized boolean z(bagd bagdVar, List list) {
        boolean z;
        SQLiteDatabase a2 = ((agjs) this.p.get()).a();
        a2.beginTransaction();
        try {
            try {
                ((agjl) this.e.get()).n(bagdVar, list);
                a2.setTransactionSuccessful();
                z = true;
            } catch (SQLException e) {
                zga.d("[Offline] Error syncing final video list videos", e);
                a2.endTransaction();
                z = false;
            }
        } finally {
            a2.endTransaction();
        }
        return z;
    }

    @Override // defpackage.agss
    public final agnr a(String str) {
        agns b;
        if (this.b.z()) {
            aghm q = this.k.q(str);
            if (q == null && (b = b(str)) != null) {
                this.k.v(b.d, null);
                q = this.k.q(str);
            }
            if (q != null) {
                return q.b();
            }
        }
        return null;
    }

    public final agns b(String str) {
        agjz r;
        if (!this.b.z() || TextUtils.isEmpty(str) || (r = ((agjs) this.p.get()).r(str)) == null) {
            return null;
        }
        return r.a();
    }

    @Override // defpackage.agss
    public final anhy c(final String str) {
        return aghv.a(this.b.o(), new Callable() { // from class: agga
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aggk aggkVar = aggk.this;
                agns b = aggkVar.b(str);
                if (b == null) {
                    return amru.q();
                }
                ArrayList arrayList = new ArrayList();
                aghc aghcVar = (aghc) aggkVar.d.get();
                Iterator it = b.a.iterator();
                while (it.hasNext()) {
                    agnv e = aghcVar.e((String) it.next());
                    if (e != null) {
                        arrayList.add(e);
                    }
                }
                return amru.o(arrayList);
            }
        }, amru.q(), this.t);
    }

    @Override // defpackage.agss
    public final Collection d() {
        if (this.b.z()) {
            return ((agjs) this.p.get()).e();
        }
        return amru.q();
    }

    @Override // defpackage.agss
    public final Set e(String str) {
        HashSet hashSet;
        if (!this.b.z()) {
            return amvs.a;
        }
        agka c = ((agjs) this.p.get()).c();
        synchronized (c.k) {
            zhq.m(str);
            hashSet = new HashSet();
            Set v = yjj.v(c.i, str);
            if (v != null && !v.isEmpty()) {
                Iterator it = v.iterator();
                while (it.hasNext()) {
                    agjy agjyVar = (agjy) c.b.get((String) it.next());
                    if (agjyVar != null && agjyVar.e() != null) {
                        hashSet.add(agjyVar.e());
                    }
                }
            }
        }
        return hashSet;
    }

    @Override // defpackage.agss
    public final Set f(String str) {
        if (this.b.z()) {
            zhq.m(str);
            return ((agjs) this.p.get()).g(str);
        }
        return amvs.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(agnr agnrVar) {
        if (agnrVar != null) {
            this.b.v(new agld(agnrVar));
        }
    }

    @Override // defpackage.agss
    public final void h(String str) {
        this.b.s(new aggd(this, str, 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(String str) {
        yjk.e();
        if (((agjl) this.e.get()).m(str) == null) {
            return;
        }
        y(str);
    }

    @Override // defpackage.agss
    public final void j(final String str, final List list) {
        this.b.s(new Runnable() { // from class: agge
            @Override // java.lang.Runnable
            public final void run() {
                aggk aggkVar = aggk.this;
                String str2 = str;
                List list2 = list;
                if (aggkVar.b.z()) {
                    aggkVar.k(str2, list2);
                }
            }
        });
    }

    public final synchronized void k(String str, List list) {
        yjk.e();
        agns b = b(str);
        if (b == null) {
            return;
        }
        if (!A(new bagd(b.d, list.size(), (byte[]) null), list, agnf.METADATA_ONLY, atrx.UNKNOWN_FORMAT_TYPE, -1, aaef.b)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
            sb.append("[Offline] Failed syncing video list ");
            sb.append(str);
            sb.append(" to database");
            zga.b(sb.toString());
            return;
        }
        ((ajoy) this.n.get()).j(list);
        aghj aghjVar = (aghj) this.m.get();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aghjVar.d(((agnp) it.next()).f(), false);
        }
    }

    public final synchronized void l(agnp agnpVar) {
        yjk.e();
        agns b = b("smart_downloads_video_list_");
        if (b == null) {
            return;
        }
        bagd bagdVar = b.d;
        if (B(new bagd(bagdVar, bagdVar.c + 1, (byte[]) null), agnpVar, agnf.METADATA_ONLY, atrx.UNKNOWN_FORMAT_TYPE, aaef.b)) {
            return;
        }
        zga.b("[Offline] Failed syncing video list smart_downloads_video_list_ to database");
    }

    @Override // defpackage.agss
    public final void m(final agnp agnpVar) {
        this.b.s(new Runnable() { // from class: aggc
            @Override // java.lang.Runnable
            public final void run() {
                aggk aggkVar = aggk.this;
                agnp agnpVar2 = agnpVar;
                if (aggkVar.b.z()) {
                    aggkVar.l(agnpVar2);
                }
            }
        });
    }

    @Override // defpackage.agss
    public final anhy n() {
        return aghv.a(this.b.o(), new Callable() { // from class: aggb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ammv.i(((agjl) aggk.this.e.get()).m("smart_downloads_video_list_"));
            }
        }, amlr.a, this.t);
    }

    @Override // defpackage.agss
    public final Collection o() {
        if (this.b.z()) {
            ArrayList arrayList = new ArrayList();
            for (agns agnsVar : ((agjs) this.p.get()).e()) {
                if (agnsVar.d.b == 2) {
                    arrayList.add(agnsVar);
                }
            }
            return arrayList;
        }
        return amru.q();
    }

    @Override // defpackage.agss
    public final List p() {
        yjk.e();
        if (!this.b.z()) {
            return amru.q();
        }
        Cursor query = ((agjl) this.e.get()).a.a().query("video_listsV13", agjk.a, "type = ?", new String[]{"1"}, null, null, "saved_timestamp DESC", null);
        try {
            return aedn.N(query, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("size"), query.getColumnIndexOrThrow("type"));
        } finally {
            query.close();
        }
    }

    @Override // defpackage.agss
    public final void q(String str) {
        this.b.s(new aggd(this, str, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(String str) {
        yjk.e();
        zhq.m("smart_downloads_video_list_");
        zhq.m(str);
        if (((agjl) this.e.get()).b("smart_downloads_video_list_", str) == null) {
            return;
        }
        SQLiteDatabase a2 = ((agjs) this.p.get()).a();
        a2.beginTransaction();
        try {
            ((agjl) this.e.get()).h("smart_downloads_video_list_", str);
            ((agil) this.o.get()).D(str, 3);
            a2.setTransactionSuccessful();
            this.k.t(str, "smart_downloads_video_list_");
            str.length();
            this.b.v(new aglf("smart_downloads_video_list_", str));
        } catch (SQLException e) {
            zga.d("[Offline] DefaultOfflineVideoListStore: failed to remove video from video list. ", e);
        } finally {
            a2.endTransaction();
        }
    }

    @Override // defpackage.agss
    public final void s(final String str, final List list) {
        final atrg atrgVar = atrg.OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_ALL_DEDUPE;
        final atrx u = ((agsg) this.l.get()).u();
        final agno agnoVar = agno.OFFLINE_IMMEDIATELY;
        final byte[] bArr = aaef.b;
        this.b.s(new Runnable() { // from class: aggf
            @Override // java.lang.Runnable
            public final void run() {
                aggk aggkVar = aggk.this;
                String str2 = str;
                List list2 = list;
                atrg atrgVar2 = atrgVar;
                atrx atrxVar = u;
                agno agnoVar2 = agnoVar;
                byte[] bArr2 = bArr;
                if (aggkVar.b.z()) {
                    aggkVar.t(str2, list2, atrgVar2, Long.MAX_VALUE, false, atrxVar, agnoVar2, -1, bArr2);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(java.lang.String r31, java.util.List r32, defpackage.atrg r33, long r34, boolean r36, defpackage.atrx r37, defpackage.agno r38, int r39, byte[] r40) {
        /*
            Method dump skipped, instructions count: 1215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aggk.t(java.lang.String, java.util.List, atrg, long, boolean, atrx, agno, int, byte[]):void");
    }

    @Override // defpackage.agss
    public final bagd u(String str) {
        yjk.e();
        if (this.b.z()) {
            return ((agjl) this.e.get()).m(str);
        }
        return null;
    }

    public final boolean v(bagd bagdVar, int i) {
        this.r.b(true);
        try {
            agjl agjlVar = (agjl) this.e.get();
            shf shfVar = agjlVar.c;
            ContentValues contentValues = new ContentValues();
            long c = shfVar.c();
            contentValues.put("id", bagdVar.a);
            contentValues.put("type", Integer.valueOf(bagdVar.b));
            contentValues.put("size", Integer.valueOf(bagdVar.c));
            Long valueOf = Long.valueOf(c);
            contentValues.put("last_update_timestamp", valueOf);
            contentValues.put("saved_timestamp", valueOf);
            contentValues.put("video_list_offline_request_source", Integer.valueOf(i - 1));
            agjlVar.a.a().insertOrThrow("video_listsV13", null, contentValues);
            ((agjs) this.p.get()).u(bagdVar, Collections.emptyList(), null, i);
            return true;
        } catch (SQLException e) {
            zga.d("[Offline] Error inserting offline video list.", e);
            return false;
        }
    }

    @Override // defpackage.agss
    public final void w(bagd bagdVar) {
        yjk.e();
        if (this.b.z()) {
            v(bagdVar, 3);
        }
    }

    @Override // defpackage.agss
    public final anhy x(final bagd bagdVar) {
        final byte[] bArr = null;
        return aghv.a(this.b.o(), new Callable(bagdVar, bArr) { // from class: agfz
            public final /* synthetic */ bagd b;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(aggk.this.v(this.b, 1));
            }
        }, false, this.t);
    }
}
