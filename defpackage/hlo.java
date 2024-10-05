package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hlo {
    public final zum a;
    public final zto b;
    public avcy c;
    public avxs d;
    public final hrv e;
    public final hlm f;
    public final boolean g;
    private final String h = "android_shorts_timeline_builtin_effects_settings.binarypb";

    public hlo(zum zumVar, zto ztoVar, hrv hrvVar, hlm hlmVar) {
        this.a = zumVar;
        this.b = ztoVar;
        this.e = hrvVar;
        this.f = hlmVar;
        this.g = hrvVar.l();
    }

    public final void a(String str) {
        if (this.g) {
            zga.c("PresetFilterDebug", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(avxs avxsVar) {
        this.d = avxsVar;
        this.b.g(avxsVar, true, this.h);
    }
}
