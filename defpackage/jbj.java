package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jbj extends fks implements abif {
    public final jbe a;
    public final abjf b;
    public final aahd c;
    public final abig d;
    public final acra e;
    public asra f;
    public apmp g;
    public boolean h;
    public boolean i;
    private final ypa j;
    private final aypy k;
    private final aioc l;
    private final ayqw m;
    private final ayqw n;
    private final jbi o;
    private final jbh p;
    private final boolean q;
    private final aadw r;

    public jbj(fln flnVar, jbe jbeVar, abjf abjfVar, aahd aahdVar, abig abigVar, ypa ypaVar, aypy aypyVar, aioc aiocVar, aadw aadwVar, acra acraVar, abiy abiyVar) {
        super(flnVar);
        this.a = jbeVar;
        this.b = abjfVar;
        this.c = aahdVar;
        this.d = abigVar;
        this.j = ypaVar;
        this.k = aypyVar;
        this.l = aiocVar;
        this.r = aadwVar;
        this.e = acraVar;
        this.q = abiyVar.a();
        this.m = new ayqw();
        this.n = new ayqw();
        this.o = new jbi(this);
        this.p = new jbh(this);
    }

    public final Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put("toggle_source", this);
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // defpackage.abif
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L12
            apmp r1 = r3.g
            int r2 = r1.b
            r2 = r2 & 512(0x200, float:7.17E-43)
            if (r2 == 0) goto L12
            apxf r1 = r1.k
            if (r1 != 0) goto L13
            apxf r1 = defpackage.apxf.a
            goto L13
        L12:
            r1 = r0
        L13:
            if (r4 != 0) goto L23
            apmp r4 = r3.g
            int r2 = r4.b
            r2 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L23
            apxf r1 = r4.p
            if (r1 != 0) goto L23
            apxf r1 = defpackage.apxf.a
        L23:
            aahd r4 = r3.c
            r4.c(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbj.d(boolean):void");
    }

    @Override // defpackage.flm
    public final void kG() {
        if (!evr.au(this.r)) {
            this.j.m(this.o);
        }
        this.j.m(this.p);
        this.n.c();
        this.m.c();
    }

    @Override // defpackage.flm
    public final void kH() {
        if (evr.au(this.r)) {
            ayqw ayqwVar = this.n;
            aypn E = this.l.ao().G().E(ayqr.a());
            final jbi jbiVar = this.o;
            jbiVar.getClass();
            ayqwVar.d(E.Y(new ayrs() { // from class: jbf
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    jbi.this.a((ahdv) obj);
                }
            }, izw.c));
        } else {
            this.j.g(this.o);
        }
        this.j.g(this.p);
        this.m.d(this.k.ax(new ayrs() { // from class: jbg
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                jbj jbjVar = jbj.this;
                boolean z = !jbjVar.a.k();
                if (jbjVar.g != null) {
                    aone createBuilder = asht.a.createBuilder();
                    aone createBuilder2 = asio.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    asio asioVar = (asio) createBuilder2.instance;
                    asioVar.c = 1;
                    asioVar.b = 1 | asioVar.b;
                    createBuilder2.copyOnWrite();
                    asio asioVar2 = (asio) createBuilder2.instance;
                    asioVar2.b |= 2;
                    asioVar2.d = z;
                    createBuilder.copyOnWrite();
                    asht ashtVar = (asht) createBuilder.instance;
                    asio asioVar3 = (asio) createBuilder2.build();
                    asioVar3.getClass();
                    ashtVar.H = asioVar3;
                    ashtVar.c |= 134217728;
                    jbjVar.e.I(3, new acqx(jbjVar.g.v.I()), (asht) createBuilder.build());
                }
                apxf apxfVar = null;
                if (z) {
                    apmp apmpVar = jbjVar.g;
                    if ((apmpVar.b & 512) != 0 && (apxfVar = apmpVar.k) == null) {
                        apxfVar = apxf.a;
                    }
                }
                if (!z) {
                    apmp apmpVar2 = jbjVar.g;
                    if ((apmpVar2.b & 16384) != 0 && (apxfVar = apmpVar2.p) == null) {
                        apxfVar = apxf.a;
                    }
                }
                jbjVar.c.c(apxfVar, jbjVar.a());
            }
        }));
        this.a.kX();
    }

    @Override // defpackage.fks
    public final void l() {
        if (this.q) {
            return;
        }
        super.l();
    }
}
