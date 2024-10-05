package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afcl extends aeqt {
    public final aeru a;
    final /* synthetic */ afcm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afcl(afcm afcmVar, aeru aeruVar) {
        super(aeruVar);
        this.b = afcmVar;
        this.a = aeruVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x029f, code lost:
    
        if (r4.e.contains(r32.i()) != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0588, code lost:
    
        if (r4.f.contains(r32.i()) != false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r1.n != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    @Override // defpackage.aeqt, defpackage.aesn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(final defpackage.afih r32) {
        /*
            Method dump skipped, instructions count: 1772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afcl.g(afih):void");
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void h(aeqq aeqqVar) {
        afcm afcmVar = this.b;
        if (afcmVar.h != null && this.a == afcmVar.f) {
            afcmVar.A = aeqqVar;
        }
        this.a.h(aeqqVar);
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void j(afqu afquVar) {
        afcm afcmVar = this.b;
        if (afcmVar.h == null || this.a != afcmVar.f || afcmVar.Q()) {
            this.a.j(afquVar);
        }
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void r() {
        afcm afcmVar = this.b;
        if (afcmVar.h == null || this.a != afcmVar.f || afcmVar.Q()) {
            this.a.r();
        }
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void v() {
        afcm afcmVar = this.b;
        aerv aervVar = afcmVar.h;
        if (aervVar == null || this.a != afcmVar.f || aervVar.e.aN() || !afcmVar.w || afcmVar.x) {
            this.a.v();
        } else {
            afcmVar.x = true;
        }
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void x(final int i) {
        this.b.d.post(new Runnable() { // from class: afck
            @Override // java.lang.Runnable
            public final void run() {
                afcl afclVar = afcl.this;
                afclVar.a.x(i);
            }
        });
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void y(long j) {
        afcm afcmVar = this.b;
        afeb afebVar = afcmVar.C;
        if (afebVar != null && afcmVar.h != null) {
            aerv aervVar = new aerv(afebVar.b);
            aervVar.f = afcmVar.h.b();
            afcmVar.h = aervVar;
            afcmVar.h.g = afebVar.b.a();
        }
        afcmVar.f = afcmVar.g;
        afcmVar.g = aeru.c;
        afcmVar.C = null;
        this.a.i("gts", new afcj(this.b.e.d()));
        this.a.y(j);
    }
}
