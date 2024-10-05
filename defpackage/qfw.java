package defpackage;

import com.google.android.gms.cast.ApplicationMetadata;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qfw extends prh {
    final /* synthetic */ qfy a;

    public qfw(qfy qfyVar) {
        this.a = qfyVar;
    }

    @Override // defpackage.prh
    public final void A() {
        Iterator it = new HashSet(this.a.a).iterator();
        while (it.hasNext()) {
            ((prh) it.next()).A();
        }
    }

    @Override // defpackage.prh
    public final void B(int i) {
        Iterator it = new HashSet(this.a.a).iterator();
        while (it.hasNext()) {
            ((prh) it.next()).B(i);
        }
    }

    @Override // defpackage.prh
    public final void C() {
        Iterator it = new HashSet(this.a.a).iterator();
        while (it.hasNext()) {
            ((prh) it.next()).C();
        }
    }

    @Override // defpackage.prh
    public final void x(int i) {
        Iterator it = new HashSet(this.a.a).iterator();
        while (it.hasNext()) {
            ((prh) it.next()).x(i);
        }
    }

    @Override // defpackage.prh
    public final void y(int i) {
        this.a.d(i);
        this.a.n(i);
        Iterator it = new HashSet(this.a.a).iterator();
        while (it.hasNext()) {
            ((prh) it.next()).y(i);
        }
    }

    @Override // defpackage.prh
    public final void z(ApplicationMetadata applicationMetadata) {
        Iterator it = new HashSet(this.a.a).iterator();
        while (it.hasNext()) {
            ((prh) it.next()).z(applicationMetadata);
        }
    }
}
