package defpackage;

import defpackage.aok;
import defpackage.hpy;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hpy {
    public final aahd a;
    public igt b;
    private final ajut c;
    private final acqz d;

    public hpy(aahd aahdVar, ajut ajutVar, acqz acqzVar) {
        this.a = aahdVar;
        this.c = ajutVar;
        this.d = acqzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ci ciVar, atdc atdcVar) {
        if (this.b != null) {
            return;
        }
        igt aI = igt.aI(atdcVar, this.c, this.d);
        this.b = aI;
        aI.ag = new ajxy() { // from class: hpx
            @Override // defpackage.ajxy
            public final void a(atda atdaVar) {
                hpy hpyVar = hpy.this;
                HashMap hashMap = new HashMap();
                hashMap.put(acrc.b, Boolean.TRUE);
                if (adyu.dl(atdaVar) != null) {
                    hpyVar.a.c(adyu.dl(atdaVar), hashMap);
                } else if (adyu.dk(atdaVar) != null) {
                    hpyVar.a.c(adyu.dk(atdaVar), hashMap);
                }
            }
        };
        this.b.X.b(new any() { // from class: com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.PivotMenuBottomSheetController$1
            @Override // defpackage.aoa
            public final /* synthetic */ void lc(aok aokVar) {
            }

            @Override // defpackage.any, defpackage.aoa
            public final /* synthetic */ void lg(aok aokVar) {
            }

            @Override // defpackage.any, defpackage.aoa
            public final void lh(aok aokVar) {
                hpy.this.b = null;
            }

            @Override // defpackage.any, defpackage.aoa
            public final /* synthetic */ void nu(aok aokVar) {
            }

            @Override // defpackage.aoa
            public final /* synthetic */ void nv(aok aokVar) {
            }

            @Override // defpackage.any, defpackage.aoa
            public final /* synthetic */ void ot(aok aokVar) {
            }
        });
        this.b.qh(ciVar.getSupportFragmentManager(), null);
    }
}
