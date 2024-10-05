package defpackage;

import android.content.IntentFilter;
import android.os.Build;
import com.google.android.apps.youtube.app.extensions.appindexing.WatchVideoIndexer;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class egz implements Runnable {
    final /* synthetic */ ehb a;
    private final /* synthetic */ int b;

    public egz(ehb ehbVar, int i) {
        this.b = i;
        this.a = ehbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                whl.u(this.a.bd);
                asvu asvuVar = ((aadw) this.a.au.get()).b().e;
                if (asvuVar == null) {
                    asvuVar = asvu.a;
                }
                if (asvuVar.y) {
                    ((ywf) this.a.aI.get()).a();
                }
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
                this.a.bd.registerReceiver(new fhr(), intentFilter);
                return;
            case 1:
                atfq atfqVar = ((aadw) this.a.au.get()).b().o;
                if (atfqVar == null) {
                    atfqVar = atfq.a;
                }
                if (atfqVar.k) {
                    atfq atfqVar2 = ((aadw) this.a.au.get()).b().o;
                    if (atfqVar2 == null) {
                        atfqVar2 = atfq.a;
                    }
                    if (atfqVar2.j) {
                        ((fhj) this.a.af.get()).a();
                        ((fhk) this.a.ae.get()).a();
                        ((haa) this.a.ad.get()).a();
                        return;
                    }
                }
                fhk.b((ylf) this.a.ap.get());
                haa.b((ylf) this.a.ap.get());
                return;
            case 2:
                aadw aadwVar = (aadw) this.a.au.get();
                if (Build.VERSION.SDK_INT < 23 || !afze.d(aadwVar)) {
                    return;
                }
                ((fhn) this.a.aJ.get()).a(this.a.bd);
                return;
            case 3:
                asvu asvuVar2 = ((aadw) this.a.au.get()).b().e;
                if (asvuVar2 == null) {
                    asvuVar2 = asvu.a;
                }
                if (asvuVar2.au) {
                    ((hah) this.a.I.get()).a();
                    return;
                }
                return;
            case 4:
                ((jjo) this.a.K.get()).d();
                return;
            case 5:
                ((joh) this.a.M.get()).a();
                return;
            case 6:
                ((jni) this.a.N.get()).c();
                return;
            case 7:
                ((akey) this.a.p.get()).d();
                ((WatchVideoIndexer) this.a.q.get()).g();
                return;
            case 8:
                this.a.Y.get();
                ehb ehbVar = this.a;
                ynm.k(ehbVar.f, (Executor) ehbVar.am.get(), egw.a, new ynl(null) { // from class: egx
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        ehb ehbVar2 = egz.this.a;
                        if (((Boolean) obj).booleanValue() || !((Boolean) ehbVar2.g.get()).booleanValue()) {
                            return;
                        }
                        avdj avdjVar = ((aadw) ehbVar2.au.get()).b().u;
                        if (avdjVar == null) {
                            avdjVar = avdj.a;
                        }
                        apev apevVar = avdjVar.g;
                        if (apevVar == null) {
                            apevVar = apev.a;
                        }
                        if (apevVar.i && ((ysy) ehbVar2.aq.get()).o() && ((elf) ehbVar2.av.get()).a() == 1) {
                            ((eni) ehbVar2.aP.get()).a().S(new ego(ehbVar2, 17), eoo.b);
                        }
                    }
                });
                ((aaqo) this.a.Z.get()).b();
                ((iyu) this.a.aa.get()).a();
                this.a.ab.get();
                this.a.c();
                return;
            case 9:
                File[] listFiles = ((File) this.a.ar.get()).listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        file.delete();
                    }
                }
                ((akey) this.a.p.get()).d();
                ((WatchVideoIndexer) this.a.q.get()).g();
                return;
            case 10:
                ((akru) this.a.v.get()).b();
                return;
            case 11:
                ((enl) this.a.bb.get()).a();
                return;
            case 12:
                ((aiwg) this.a.w.get()).c();
                this.a.c();
                return;
            case 13:
                ((aior) this.a.aC.get()).a();
                this.a.c();
                return;
            default:
                ((aior) this.a.aC.get()).a();
                this.a.c();
                return;
        }
    }
}
