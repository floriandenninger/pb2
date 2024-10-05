package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aewb extends beq {
    private final List a = new ArrayList();
    private final aetw b;
    private final Handler c;

    public aewb(aetw aetwVar, Handler handler) {
        this.b = aetwVar;
        this.c = handler;
    }

    private final bel j(final aezf aezfVar, asj asjVar, FormatStreamModel[] formatStreamModelArr, aezh aezhVar) {
        PlayerConfigModel a;
        String str;
        final affc g;
        afcr afdlVar;
        for (int i = 0; i < asjVar.b; i++) {
            asi b = asjVar.b(i);
            List k = k(b, formatStreamModelArr);
            if (!k.isEmpty()) {
                if (k.size() == 1) {
                    return new bem(b, ((Integer) k.get(0)).intValue(), 1, aezhVar);
                }
                aeve aeveVar = this.b.a;
                aeuw aeuwVar = new aeuw(aezfVar, 4);
                aetw aetwVar = this.b;
                int[] aj = anaf.aj(k);
                synchronized (aezfVar) {
                    a = aezfVar.a();
                    str = aezfVar.b().c;
                    g = aezfVar.g();
                }
                aeex aeexVar = aezhVar.b.f;
                afhs afhsVar = aetwVar.s;
                ysy ysyVar = aetwVar.d;
                if (afhsVar.aJ()) {
                    afdlVar = new afcy(afhsVar, aezfVar.K);
                } else {
                    aenf aenfVar = aeveVar.c;
                    adxr adxrVar = aeveVar.d;
                    boolean aM = a.aM();
                    afkn afknVar = aetwVar.f;
                    float e = a.e();
                    float d = a.d();
                    String str2 = aezfVar.a;
                    g.getClass();
                    afdlVar = new afdl(aenfVar, ysyVar, a, adxrVar, aM, afknVar, aeexVar, aeuwVar, e, d, str, str2, afhsVar, new amnv() { // from class: aeux
                        @Override // defpackage.amnv
                        public final Object get() {
                            return Long.valueOf(affc.this.e());
                        }
                    }, new afig() { // from class: aeuv
                        @Override // defpackage.afig
                        public final void a(final afih afihVar) {
                            final aezf aezfVar2 = aezf.this;
                            final aeut aeutVar = (aeut) aezfVar2.e;
                            aeutVar.k.post(new Runnable() { // from class: aeue
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aeut aeutVar2 = aeut.this;
                                    aezf aezfVar3 = aezfVar2;
                                    afih afihVar2 = afihVar;
                                    aezfVar3.b.v();
                                    aeutVar2.u(aezfVar3.b, afihVar2);
                                }
                            });
                        }
                    }, aezfVar.K, aezfVar.b);
                }
                aetq aetqVar = new aetq(afdlVar, b, aezhVar, aezfVar.d, aetwVar.s, a.J(), aj);
                synchronized (this.a) {
                    this.a.add(new WeakReference(aetqVar));
                }
                return aetqVar;
            }
        }
        throw new IllegalStateException("getTrackSelection() failed");
    }

    private static final List k(asi asiVar, FormatStreamModel[] formatStreamModelArr) {
        ArrayList arrayList = new ArrayList(asiVar.a);
        for (int i = 0; i < asiVar.a; i++) {
            String str = asiVar.a(i).c;
            int i2 = 0;
            while (true) {
                if (i2 >= formatStreamModelArr.length) {
                    break;
                }
                if (formatStreamModelArr[i2].e.equals(str)) {
                    arrayList.add(Integer.valueOf(i));
                    break;
                }
                i2++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df A[LOOP:0: B:46:0x00df->B:50:0x0159, LOOP_START, PHI: r3 r7
  0x00df: PHI (r3v7 afjd) = (r3v0 afjd), (r3v10 afjd) binds: [B:45:0x00dd, B:50:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x00df: PHI (r7v1 int) = (r7v0 int), (r7v5 int) binds: [B:45:0x00dd, B:50:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ber a(final defpackage.aezf r30, defpackage.asj r31) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aewb.a(aezf, asj):ber");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(aezf aezfVar) {
        aelf aelfVar;
        if (aezfVar != null && (aelfVar = aezfVar.d) != null) {
            aelfVar.e(null, null, null);
        }
        i();
    }

    public final void c(plr plrVar, Object obj, int i) {
        synchronized (this.a) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                aetq aetqVar = (aetq) ((WeakReference) it.next()).get();
                if (aetqVar != null) {
                    pod d = plrVar.d(aetqVar);
                    d.e(obj);
                    d.f(i);
                    d.d();
                } else {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(plr plrVar, float f) {
        c(plrVar, Float.valueOf(f), 10003);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(plr plrVar, aeex aeexVar) {
        c(plrVar, aeexVar, 10002);
    }

    @Override // defpackage.beq
    public final void g(Object obj) {
        if (obj == null) {
            return;
        }
        afki.b(obj instanceof aezh);
        aezh aezhVar = (aezh) obj;
        aezf aezfVar = aezhVar.a;
        aetw aetwVar = this.b;
        afkn afknVar = aetwVar.f;
        afhs afhsVar = aetwVar.s;
        ysy ysyVar = aetwVar.d;
        aezh aezhVar2 = aezfVar.w;
        boolean z = false;
        if (aezhVar2 != null && aezhVar2.d && !aezhVar.d) {
            z = true;
        }
        synchronized (aezfVar) {
            aezfVar.w = aezhVar;
        }
        Object obj2 = afknVar.get();
        if (z) {
            aezfVar.y(afhsVar, ysyVar, (afkm) obj2, 10002, false);
        }
    }

    @Override // defpackage.beq
    public final ber h(pof[] pofVarArr, asj asjVar, ash ashVar, pou pouVar) {
        aezf aezfVar;
        pot y = pouVar.y(pouVar.a(pouVar.d(ashVar.a), new pos(), false).c, new pot());
        Object obj = y.c;
        if (obj instanceof aevu) {
            aevu aevuVar = (aevu) obj;
            afki.d(aevuVar.a instanceof aezf);
            aezfVar = (aezf) aevuVar.a;
        } else {
            afki.d(obj instanceof aezf);
            aezfVar = (aezf) y.c;
        }
        return a(aezfVar, asjVar);
    }
}
