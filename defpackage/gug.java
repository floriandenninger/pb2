package defpackage;

import com.google.protos.youtube.api.innertube.PreloadAppStoreCommandOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gug implements aaha {
    public final guf a;
    private final alpe b;

    public gug(alpe alpeVar, eni eniVar, Executor executor, final ayqi ayqiVar, aadw aadwVar) {
        guf gufVar = new guf(eniVar);
        this.a = gufVar;
        this.b = alpeVar;
        apbn z = wbs.z(aadwVar);
        if (z == null || !z.o) {
            gufVar.a();
        } else {
            executor.execute(new Runnable() { // from class: gud
                @Override // java.lang.Runnable
                public final void run() {
                    gug gugVar = gug.this;
                    ayqi ayqiVar2 = ayqiVar;
                    final guf gufVar2 = gugVar.a;
                    gufVar2.a.b().B(ayqiVar2).R(new ayrm() { // from class: gue
                        @Override // defpackage.ayrm
                        public final void a() {
                            guf.this.a();
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(PreloadAppStoreCommandOuterClass.preloadAppStoreCommand) && this.a.b) {
            auey aueyVar = (auey) apxfVar.pX(PreloadAppStoreCommandOuterClass.preloadAppStoreCommand);
            vak vakVar = new vak((short[]) null);
            if ((aueyVar.b & 4) != 0) {
                vakVar.a.add(aueyVar.c);
            }
            alpe alpeVar = this.b;
            vak vakVar2 = new vak(vakVar, (byte[]) null, (byte[]) null);
            alph alphVar = alpeVar.a;
            if (alphVar.a == null) {
                alph.c.k("error: %s", "Play Store not found.");
            } else {
                alsf alsfVar = new alsf();
                alphVar.a.b(new alpg(alphVar, alsfVar, vakVar2, alsfVar, null), alsfVar);
            }
        }
    }
}
