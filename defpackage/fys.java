package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.AutoplayRendererOuterClass;
import com.google.protos.youtube.api.innertube.UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand;
import com.google.protos.youtube.api.innertube.UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction;
import com.google.protos.youtube.api.innertube.UpdateViewershipActionOuterClass$UpdateViewershipAction;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fys implements Runnable, fxi {
    public final Handler a;
    public final String b;
    public boolean i;
    public boolean j;
    private final Executor k;
    private final fxj l;
    private final azrw m;
    private final shf n;
    private long o = 0;
    public List h = amru.q();
    public ammv g = amlr.a;
    final ArrayList c = new ArrayList();
    final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public fys(Handler handler, shf shfVar, fxj fxjVar, azrw azrwVar, String str, Executor executor) {
        this.a = handler;
        this.n = shfVar;
        this.l = fxjVar;
        this.m = azrwVar;
        this.b = str;
        this.k = executor;
    }

    public static final void d(List list, List list2, List list3, List list4, List list5, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apxf apxfVar = (apxf) it.next();
            if (apxfVar.pY(UpdateViewershipActionOuterClass$UpdateViewershipAction.updateViewershipAction)) {
                UpdateViewershipActionOuterClass$UpdateViewershipAction updateViewershipActionOuterClass$UpdateViewershipAction = (UpdateViewershipActionOuterClass$UpdateViewershipAction) apxfVar.pX(UpdateViewershipActionOuterClass$UpdateViewershipAction.updateViewershipAction);
                if (!updateViewershipActionOuterClass$UpdateViewershipAction.c) {
                    avyq avyqVar = updateViewershipActionOuterClass$UpdateViewershipAction.b;
                    if (avyqVar == null) {
                        avyqVar = avyq.a;
                    }
                    if ((avyqVar.b & 1) != 0) {
                        avyq avyqVar2 = updateViewershipActionOuterClass$UpdateViewershipAction.b;
                        if (avyqVar2 == null) {
                            avyqVar2 = avyq.a;
                        }
                        awaj awajVar = avyqVar2.c;
                        if (awajVar == null) {
                            awajVar = awaj.a;
                        }
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            fyw fywVar = (fyw) ((WeakReference) it2.next()).get();
                            if (fywVar != null) {
                                fywVar.d(str, awajVar);
                            }
                        }
                    }
                }
            } else if (apxfVar.pY(UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.updateDonationShelfCommand)) {
                aulq aulqVar = ((UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand) apxfVar.pX(UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.updateDonationShelfCommand)).b;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                aqlc aqlcVar = (aqlc) aulqVar.pX(aqld.a);
                if (aqlcVar != null) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        fyv fyvVar = (fyv) ((WeakReference) it3.next()).get();
                        if (fyvVar != null) {
                            fyvVar.f(str, aqlcVar);
                        }
                    }
                }
            } else if (apxfVar.pY(UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.updateToggleButtonTextAction)) {
                UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction = (UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction) apxfVar.pX(UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.updateToggleButtonTextAction);
                if ((updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.b & 4) != 0) {
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        fyu fyuVar = (fyu) ((WeakReference) it4.next()).get();
                        if (fyuVar != null) {
                            int ao = awxr.ao(updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.e);
                            if (ao == 0) {
                                ao = 1;
                            }
                            aqyg aqygVar = updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.c;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                            aqyg aqygVar2 = updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.d;
                            if (aqygVar2 == null) {
                                aqygVar2 = aqyg.a;
                            }
                            fyuVar.a(str, ao, aqygVar, aqygVar2);
                        }
                    }
                }
            } else if (apxfVar.pY(avry.b)) {
                avry avryVar = (avry) apxfVar.pX(avry.b);
                aulq aulqVar2 = avryVar.c;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                aphg aphgVar = (aphg) aulqVar2.pX(AutoplayRendererOuterClass.a);
                aulq aulqVar3 = avryVar.d;
                if (aulqVar3 == null) {
                    aulqVar3 = aulq.a;
                }
                atzm atzmVar = (atzm) aulqVar3.pX(auaa.a);
                if (aphgVar != null && atzmVar != null) {
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        fyt fytVar = (fyt) ((WeakReference) it5.next()).get();
                        if (fytVar != null) {
                            fytVar.a(atzmVar);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.fxi
    public final void a() {
        this.a.removeCallbacks(this);
    }

    @Override // defpackage.fxi
    public final void b() {
        this.a.post(this);
    }

    public final void c() {
        String str = fyx.a;
        String valueOf = String.valueOf(this.b);
        if (valueOf.length() != 0) {
            "Cancelling ".concat(valueOf);
        }
        this.a.removeCallbacks(this);
        this.l.i(this);
        this.g = amlr.a;
        this.h = amru.q();
        this.o = 0L;
        this.j = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long c = this.n.c();
        long j = this.o;
        if (j != 0 && c - j < 15000) {
            String str = fyx.a;
            this.a.postDelayed(this, 15000L);
            return;
        }
        this.o = c;
        this.l.g(this);
        abdl abdlVar = (abdl) this.m.get();
        String str2 = this.g.h() ? null : this.b;
        String str3 = (String) this.g.f();
        abdj abdjVar = new abdj(abdlVar.f, abdlVar.a.c(), null, null, null);
        abdjVar.a = str2;
        abdjVar.b = str3;
        ynm.l(abdlVar.c(asdd.a, abdlVar.b, abce.o, abdk.a).a(abdjVar), this.k, new ynk() { // from class: fyq
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                fys fysVar = fys.this;
                zga.o(fyx.a, "Could not load updated metadata", th.getCause());
                fysVar.a.postDelayed(fysVar, 30000L);
            }
        }, new ynl() { // from class: fyr
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                avgs avgsVar;
                fys fysVar = fys.this;
                asdd asddVar = (asdd) obj;
                if (fysVar.j) {
                    return;
                }
                fys.d(asddVar.e, fysVar.c, fysVar.d, fysVar.e, fysVar.f, fysVar.b);
                if ((asddVar.b & 2) != 0) {
                    asde asdeVar = asddVar.d;
                    if (asdeVar == null) {
                        asdeVar = asde.a;
                    }
                    avgsVar = asdeVar.b;
                    if (avgsVar == null) {
                        avgsVar = avgs.a;
                    }
                } else {
                    avgsVar = null;
                }
                if (avgsVar == null) {
                    fysVar.g = amlr.a;
                    fysVar.c();
                } else {
                    fysVar.g = ammv.j(avgsVar.d);
                    int i = avgsVar.c;
                    fysVar.a.postDelayed(fysVar, i != 0 ? i : 30000L);
                    String str4 = fyx.a;
                }
                fysVar.h = asddVar.e;
            }
        }, anij.a);
    }
}
