package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class snc implements swv {
    public final slr a;
    private final syd b;
    private final /* synthetic */ int c;

    public snc(slr slrVar, syd sydVar, int i) {
        this.c = i;
        this.a = slrVar;
        this.b = sydVar;
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.swv
    public final aomu a() {
        return this.c != 0 ? awty.b : awug.b;
    }

    @Override // defpackage.swv
    public final /* synthetic */ ayph b(Object obj, final swu swuVar) {
        if (this.c == 0) {
            final awug awugVar = (awug) obj;
            if ((awugVar.c & 4) == 0) {
                this.b.c(23, "UpdateActionSheetCommand needs to have a sheet id.", swuVar.i);
                return ayph.f();
            }
            ayph t = ayph.t(new ayrm() { // from class: snb
                @Override // defpackage.ayrm
                public final void a() {
                    snc sncVar = snc.this;
                    sncVar.a.e(awugVar);
                }
            });
            return Looper.myLooper() == Looper.getMainLooper() ? t.E(ayqr.a()) : t;
        }
        final awty awtyVar = (awty) obj;
        if (awtyVar.f.size() > 0 || (awtyVar.c & 4) != 0) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a.d(awtyVar, swuVar);
                return ayph.f();
            }
            final byte[] bArr = null;
            return ayph.t(new ayrm(awtyVar, swuVar, bArr) { // from class: smo
                public final /* synthetic */ awty a;
                public final /* synthetic */ swu b;

                @Override // defpackage.ayrm
                public final void a() {
                    snc sncVar = snc.this;
                    sncVar.a.d(this.a, this.b);
                }
            }).E(ayqr.a());
        }
        this.b.c(23, "ShowActionSheetCommand needs to have at least one list option if there is no sheet id.", swuVar.i);
        return ayph.f();
    }
}
