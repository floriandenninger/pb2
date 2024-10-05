package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aivo {
    public final azrw a;
    public final zbw b;
    public aivx c;
    public aivw d;
    public aivv e;
    public boolean f = false;
    private final azrw g;
    private final aifs h;
    private final banw i;
    private aivn j;

    static {
        zga.a("player.ui.PlayerControlsListener");
    }

    public aivo(final azrw azrwVar, azrw azrwVar2, zbw zbwVar, aifs aifsVar, aivz aivzVar, banw banwVar) {
        this.a = azrwVar;
        this.g = azrwVar2;
        zbwVar.getClass();
        this.b = zbwVar;
        aifsVar.getClass();
        this.h = aifsVar;
        this.i = banwVar;
        aivzVar.a.B().ax(new ayrs() { // from class: aivm
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aivo aivoVar = aivo.this;
                azrw azrwVar3 = azrwVar;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                aivoVar.f = booleanValue;
                if (booleanValue) {
                    ((aivl) azrwVar3.get()).a();
                }
            }
        });
    }

    public final hg a() {
        if (this.j == null) {
            this.j = new aivn(this);
        }
        return this.j;
    }

    public final void b() {
        this.b.b();
        if (this.h.k) {
            this.i.c(ahbp.c);
        }
        aivv aivvVar = this.e;
        if (aivvVar != null) {
            adon adonVar = (adon) aivvVar;
            if (adonVar.b.o()) {
                ((adpj) ((adpe) adonVar.b).g.get()).d();
                return;
            }
            adot adotVar = ((adpe) adonVar.b).d;
            if (adotVar != null) {
                adotVar.D();
                return;
            } else {
                zga.m(adon.a, "onDismissPlayback got called when mdx session isn't active");
                return;
            }
        }
        ((aivl) this.a.get()).L();
    }

    public final void c() {
        this.b.b();
        ((aivl) this.a.get()).a();
    }

    public final void d() {
        if (this.f) {
            return;
        }
        this.b.b();
        ((aivl) this.a.get()).b();
    }

    public final void e() {
        this.b.b();
        ((aivl) this.a.get()).B();
    }

    public final void f() {
        this.b.b();
        ((aivl) this.a.get()).aa();
    }

    public final void g(long j) {
        h(j, aupb.SEEK_SOURCE_UNKNOWN);
    }

    public final void h(long j, aupb aupbVar) {
        this.b.b();
        ((aivl) this.a.get()).ab(j, aupbVar);
    }

    public final void i(long j) {
        j(j, aupb.SEEK_SOURCE_UNKNOWN);
    }

    public final void j(long j, aupb aupbVar) {
        this.b.b();
        ((aivl) this.a.get()).V(j, aupbVar);
    }

    public final void k() {
        this.b.b();
        aivw aivwVar = this.d;
        if (aivwVar != null) {
            aivwVar.a();
        } else {
            ((aivk) this.g.get()).a(aims.a);
        }
    }

    public final void l() {
        this.b.b();
        aivx aivxVar = this.c;
        if (aivxVar == null) {
            ((aivl) this.a.get()).R();
            if (!((aivk) this.g.get()).j(aims.b)) {
                ((aivl) this.a.get()).U(0L);
                return;
            } else {
                ((aivk) this.g.get()).a(aims.b);
                return;
            }
        }
        aivxVar.b();
    }
}
