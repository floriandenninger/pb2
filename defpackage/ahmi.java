package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahmi implements ahip {
    final /* synthetic */ ahmj a;
    final /* synthetic */ ahlz b;

    public ahmi(ahmj ahmjVar, ahlz ahlzVar) {
        this.a = ahmjVar;
        this.b = ahlzVar;
    }

    private final long d(float f) {
        ahmj ahmjVar = this.a;
        long j = ahmjVar.g;
        long j2 = ahmjVar.h;
        return (long) Math.ceil((f * ((((float) (j - j2)) / 1000.0f) + 1.0f) * 1000.0f) + ((float) j2));
    }

    @Override // defpackage.ahip
    public final void a(float f) {
        ahmj ahmjVar = this.a;
        ahmjVar.b.l(-ahmjVar.i, 0.0f, 0.0f);
        ahmj ahmjVar2 = this.a;
        float f2 = ahmjVar2.a.h * f;
        ahmjVar2.i = f2;
        ahmjVar2.b.l(f2, 0.0f, 0.0f);
        long d = d(f);
        if (ControlsOverlayStyle.b(this.a.k)) {
            d -= this.a.g;
        }
        ahkt.h(this.a.f, zhq.i(d / 1000));
        this.a.b.g();
    }

    @Override // defpackage.ahip
    public final void b() {
    }

    @Override // defpackage.ahip
    public final void c(float f) {
        this.b.a(d(f));
    }
}
