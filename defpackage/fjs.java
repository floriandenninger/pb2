package defpackage;

import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fjs {
    public final azrw a;
    public final afsy b;
    public final aais c;
    public volatile amru d = amru.q();
    public final ayqx e;
    private final azrw f;
    private final azrw g;
    private final fif h;
    private final axzg i;

    public fjs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, axzg axzgVar, ayqi ayqiVar, afsy afsyVar, aais aaisVar, fif fifVar, byte[] bArr, byte[] bArr2) {
        this.f = azrwVar;
        this.a = azrwVar2;
        this.g = azrwVar3;
        this.i = axzgVar;
        this.b = afsyVar;
        this.c = aaisVar;
        this.h = fifVar;
        final int i = 1;
        final int i2 = 0;
        this.e = aaisVar.a(afsyVar.c()).h(fhe.d(), true).ab(ayqiVar).L(eng.q).Y(fiv.i).k(asxi.class).B().ay(new ayrs(this) { // from class: fjr
            public final /* synthetic */ fjs a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    fjs fjsVar = this.a;
                    ayqx ayqxVar = fjsVar.e;
                    if (ayqxVar == null || ayqxVar.e()) {
                        return;
                    }
                    ayrz.c((AtomicReference) fjsVar.e);
                    return;
                }
                this.a.c((asxi) obj);
            }
        }, new ayrs(this) { // from class: fjr
            public final /* synthetic */ fjs a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    fjs fjsVar = this.a;
                    ayqx ayqxVar = fjsVar.e;
                    if (ayqxVar == null || ayqxVar.e()) {
                        return;
                    }
                    ayrz.c((AtomicReference) fjsVar.e);
                    return;
                }
                this.a.c((asxi) obj);
            }
        });
    }

    public final int a() {
        try {
            return ((Integer) wbs.I(this.h.b(fid.a().a()).G(fiv.h)).get(4L, TimeUnit.SECONDS)).intValue();
        } catch (InterruptedException e) {
            zga.d("Get offlined Downloads Count was interrupted", e);
            return 0;
        } catch (ExecutionException e2) {
            zga.d("Failed to get offlined Downloads Count", e2);
            return 0;
        } catch (TimeoutException e3) {
            zga.d("Get offlined Downloads Count timed out", e3);
            return 0;
        }
    }

    public final anhy b() {
        return ((fjt) this.g.get()).h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void c(asxi asxiVar) {
        amrp f = amru.f();
        amxe it = ((amru) asxiVar.getItemsModels()).iterator();
        while (it.hasNext()) {
            asxd a = ((asxf) it.next()).a();
            if (a != null) {
                f.h(a.d());
            }
        }
        this.d = f.g();
    }

    public final boolean d() {
        try {
            return ((Boolean) ((anhv) ((fjt) this.g.get()).h()).b).booleanValue();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        } catch (Exception e) {
            zga.d("Failed to get has access to offline.", e);
            return false;
        }
    }

    public final boolean e() {
        return ((agzz) this.f.get()).c() && (!((agof) this.a.get()).a().k().e(bagd.b(2)).isEmpty() || f());
    }

    public final boolean f() {
        return !this.d.isEmpty();
    }

    public final boolean g(String str) {
        return this.d.contains(str);
    }

    public final boolean h() {
        if (!((agzz) this.f.get()).c()) {
            return false;
        }
        if (this.i.p().booleanValue()) {
            return f() || a() > 0;
        }
        try {
            if (((Collection) ((agof) this.a.get()).a().m().i().get(4L, TimeUnit.SECONDS)).isEmpty()) {
                if (!f()) {
                    return false;
                }
            }
            return true;
        } catch (InterruptedException e) {
            zga.d("Get offline video snapshots was interrupted", e);
            return false;
        } catch (ExecutionException e2) {
            zga.d("Failed to get offline video snapshots", e2);
            return false;
        } catch (TimeoutException e3) {
            zga.d("Get offline video snapshots timed out", e3);
            return false;
        }
    }

    public final boolean i(String str) {
        return (ammx.e(str) || !j() || ((agof) this.a.get()).a().i().e(str) == null) ? false : true;
    }

    public final boolean j() {
        return ((agzz) this.f.get()).c() && !((agof) this.a.get()).a().i().j().isEmpty();
    }

    public final boolean k() {
        return ((agzz) this.f.get()).c() && !((agof) this.a.get()).a().m().k().isEmpty();
    }

    public final boolean l(String str) {
        agnv e;
        return (!h() || (e = ((agof) this.a.get()).a().m().e(str)) == null || e.s()) ? false : true;
    }

    public final boolean m() {
        return ((agzz) this.f.get()).c() && !((agof) this.a.get()).a().k().d().isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (((defpackage.agof) r4.a.get()).a().k().d().size() > ((defpackage.agof) r4.a.get()).a().k().o().size()) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() {
        /*
            r4 = this;
            axzg r0 = r4.i
            java.lang.Boolean r0 = r0.p()
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            boolean r0 = r4.f()
            if (r0 == 0) goto L1b
            int r0 = r4.a()
            if (r0 > 0) goto L1b
            return r1
        L1b:
            return r2
        L1c:
            boolean r0 = r4.m()
            if (r0 == 0) goto L6f
            boolean r0 = r4.e()
            if (r0 == 0) goto L6f
            boolean r0 = r4.m()
            if (r0 != 0) goto L2f
            goto L62
        L2f:
            azrw r0 = r4.a
            java.lang.Object r0 = r0.get()
            agof r0 = (defpackage.agof) r0
            agsn r0 = r0.a()
            agss r0 = r0.k()
            java.util.Collection r0 = r0.o()
            int r0 = r0.size()
            azrw r3 = r4.a
            java.lang.Object r3 = r3.get()
            agof r3 = (defpackage.agof) r3
            agsn r3 = r3.a()
            agss r3 = r3.k()
            java.util.Collection r3 = r3.d()
            int r3 = r3.size()
            if (r3 <= r0) goto L62
            goto L6f
        L62:
            boolean r0 = r4.k()
            if (r0 != 0) goto L6f
            boolean r0 = r4.j()
            if (r0 != 0) goto L6f
            return r1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjs.n():boolean");
    }
}
