package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajan implements ajai {
    public final azrw a;
    private final Executor b;
    private final aifk c;
    private final acpl d;

    public ajan(Executor executor, azrw azrwVar, aifk aifkVar, acpl acplVar) {
        this.b = executor;
        this.a = azrwVar;
        this.c = aifkVar;
        this.d = acplVar;
    }

    @Override // defpackage.ajai
    public final int a(ajah ajahVar) {
        return 0;
    }

    @Override // defpackage.ajai
    public final int b(final ajah ajahVar) {
        if (ajahVar.b == null) {
            return 0;
        }
        this.b.execute(new Runnable() { // from class: ajam
            @Override // java.lang.Runnable
            public final void run() {
                ajan ajanVar = ajan.this;
                ajah ajahVar2 = ajahVar;
                if (ajahVar2.a()) {
                    return;
                }
                ajar ajarVar = (ajar) ajanVar.a.get();
                aifz d = PlaybackStartDescriptor.d();
                d.a = ajahVar2.b;
                ajarVar.d(d.a());
            }
        });
        ahbj.t(6, 2, ajahVar.a, this.d);
        return 1;
    }

    @Override // defpackage.ajai
    public final aigr c(aryi aryiVar) {
        return null;
    }

    @Override // defpackage.ajai
    public final aigr d(aasx aasxVar) {
        return null;
    }

    @Override // defpackage.ajai
    public final ajaf e() {
        return null;
    }

    @Override // defpackage.ajai
    public final void f(ahef ahefVar) {
    }

    @Override // defpackage.ajai
    public final void g(aheg ahegVar) {
    }

    @Override // defpackage.ajai
    public final void h(ahej ahejVar) {
    }

    @Override // defpackage.ajai
    public final void i() {
    }

    @Override // defpackage.ajai
    public final boolean j(ajad ajadVar, ajah ajahVar) {
        return ajadVar != null && (ajadVar.h || this.c.u()) && ajadVar.e != null;
    }
}
