package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class agjx implements agjm {
    final SparseArray a;
    final /* synthetic */ agka b;
    private String c;
    private boolean d;
    private agnn e;

    public agjx(agka agkaVar, agnm agnmVar, agnm agnmVar2) {
        this.b = agkaVar;
        SparseArray sparseArray = new SparseArray();
        this.a = sparseArray;
        amkq.F((agnmVar == null && agnmVar2 == null) ? false : true, "One stream pair cannot hold a pair of null streams");
        if (agnmVar != null) {
            sparseArray.put(agnmVar.a(), agnmVar);
            this.c = agnmVar.g();
        }
        if (agnmVar2 != null) {
            sparseArray.put(agnmVar2.a(), agnmVar2);
            this.c = agnmVar2.g();
        }
        this.d = true;
    }

    private final void i() {
        this.e = null;
    }

    private final void j(String str) {
        agjy agjyVar = (agjy) this.b.b.get(str);
        if (agjyVar != null) {
            agjyVar.g();
        }
    }

    @Override // defpackage.agjm
    public final agnm a() {
        for (int i = 0; i < this.a.size(); i++) {
            agnm agnmVar = (agnm) this.a.valueAt(i);
            if (agnmVar.c) {
                return agnmVar;
            }
        }
        return null;
    }

    @Override // defpackage.agjm
    public final agnm b(int i) {
        return (agnm) this.a.get(i);
    }

    @Override // defpackage.agjm
    public final agnm c() {
        for (int i = 0; i < this.a.size(); i++) {
            agnm agnmVar = (agnm) this.a.valueAt(i);
            if (!agnmVar.c) {
                return agnmVar;
            }
        }
        return null;
    }

    @Override // defpackage.agjm
    public final agnn d() {
        synchronized (this.b.k) {
            if (this.e == null) {
                agnm c = c();
                agnm a = a();
                if (c == null && a == null) {
                    return null;
                }
                this.e = new agnn(c, a, this.d);
            }
            return this.e;
        }
    }

    @Override // defpackage.agjm
    public final void e(int i) {
        synchronized (this.b.k) {
            if (this.a.get(i) != null) {
                i();
                j(this.c);
            }
            this.a.remove(i);
        }
    }

    @Override // defpackage.agjm
    public final void f(boolean z) {
        synchronized (this.b.k) {
            this.d = z;
            i();
            j(this.c);
        }
    }

    @Override // defpackage.agjm
    public final void g(agnm agnmVar) {
        synchronized (this.b.k) {
            this.a.put(agnmVar.a(), agnmVar);
            i();
            j(this.c);
        }
    }

    @Override // defpackage.agjm
    public final agnn h(aghh aghhVar) {
        Object obj;
        agnn d;
        agjx agjxVar = this;
        Object obj2 = agjxVar.b.k;
        synchronized (obj2) {
            try {
                try {
                    if (aghhVar != null) {
                        int i = 0;
                        agnm agnmVar = null;
                        agnm agnmVar2 = null;
                        while (i < agjxVar.a.size()) {
                            try {
                                agnm agnmVar3 = (agnm) agjxVar.a.valueAt(i);
                                aong aongVar = (aong) agnmVar3.b.a.toBuilder();
                                agnm agnmVar4 = agnmVar;
                                obj = obj2;
                                try {
                                    Uri C = aedn.C(aghhVar.a, agnmVar3.g(), agnmVar3.a(), ((aqxz) aongVar.instance).q, agnmVar3.b(), ((aqxz) aongVar.instance).o, aghhVar.b);
                                    String uri = C == null ? "" : C.toString();
                                    aongVar.copyOnWrite();
                                    aqxz aqxzVar = (aqxz) aongVar.instance;
                                    uri.getClass();
                                    aqxzVar.c |= 2;
                                    aqxzVar.e = uri;
                                    agnl d2 = agnmVar3.d();
                                    d2.d(new FormatStreamModel((aqxz) aongVar.build(), agnmVar3.g(), agnmVar3.b.c));
                                    agnm a = d2.a();
                                    if (a.c && !a.b.M()) {
                                        agnmVar2 = a;
                                        agnmVar = agnmVar4;
                                        i++;
                                        agjxVar = this;
                                        obj2 = obj;
                                    }
                                    agnmVar = a;
                                    i++;
                                    agjxVar = this;
                                    obj2 = obj;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj = obj2;
                            }
                        }
                        Object obj3 = obj2;
                        agnm agnmVar5 = agnmVar;
                        if (agnmVar5 != null || agnmVar2 != null) {
                            agnn agnnVar = new agnn(agnmVar5, agnmVar2, this.d);
                            return agnnVar;
                        }
                        return null;
                    }
                    d = d();
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return d;
    }
}
