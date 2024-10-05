package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class guo implements aaha {
    public static final /* synthetic */ int b = 0;
    public final azrw a;
    private final aahv c;
    private final afsy d;
    private final aivb e;
    private final fgq f;

    public guo(aahv aahvVar, afsy afsyVar, azrw azrwVar, aivb aivbVar, fgq fgqVar) {
        this.c = aahvVar;
        afsyVar.getClass();
        this.d = afsyVar;
        this.a = azrwVar;
        fgqVar.getClass();
        this.f = fgqVar;
        this.e = aivbVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(auph.b)) {
            final auph auphVar = (auph) apxfVar.pX(auph.b);
            fhg g = this.f.g();
            if (auphVar.d) {
                if (g.b()) {
                    return;
                }
                if (auphVar.f && g.l()) {
                    return;
                }
                if (!auphVar.e || this.e.d()) {
                    ((nnc) this.a.get()).p(true);
                    final aahu a = this.c.a(this.d.c());
                    a.f(auphVar.c).g(aoxq.class).l(new ayrm() { // from class: gum
                        @Override // defpackage.ayrm
                        public final void a() {
                            auph auphVar2 = auph.this;
                            aakv aakvVar = a;
                            int i = guo.b;
                            afsi.b(2, 1, "Could not retrieve ad player fullscreen state entity on enter");
                            String str = auphVar2.c;
                            str.getClass();
                            amkq.O(!str.isEmpty(), "key cannot be empty");
                            aone createBuilder = aoxr.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aoxr aoxrVar = (aoxr) createBuilder.instance;
                            aoxrVar.b |= 1;
                            aoxrVar.c = str;
                            aoxp aoxpVar = new aoxp(createBuilder);
                            aoxpVar.b(true);
                            aoxq c = aoxpVar.c();
                            aalc c2 = aakvVar.c();
                            c2.d(c);
                            c2.b().T();
                        }
                    }).c(new fiy(a, 2)).q(ggk.i).Q();
                    return;
                }
                return;
            }
            if (g.b()) {
                this.c.a(this.d.c()).f(auphVar.c).g(aoxq.class).o(new ayrs() { // from class: gun
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        guo guoVar = guo.this;
                        aoxq aoxqVar = (aoxq) obj;
                        if (aoxqVar == null) {
                            afsi.b(2, 1, "Ad player fullscreen state entity is null in onSuccess on exit");
                        } else if (aoxqVar.getFullscreenForced().booleanValue()) {
                            ((nnc) guoVar.a.get()).p(false);
                        }
                    }
                }).m(ggk.j).l(ggc.e).T();
            }
        }
    }
}
