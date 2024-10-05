package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ipm implements fxi, ajmt {
    private final ajmu a;
    private final azrw b;

    public ipm(ajmu ajmuVar, azrw azrwVar) {
        this.a = ajmuVar;
        this.b = azrwVar;
    }

    @Override // defpackage.fxi
    public final void a() {
        this.a.e(this);
    }

    @Override // defpackage.fxi
    public final void b() {
        this.a.h(ipl.a, this);
    }

    @Override // defpackage.ajmt
    public final void kB(Uri uri, Uri uri2) {
        ipl iplVar;
        if (amkq.b(uri, ipl.a) && (iplVar = (ipl) this.a.b(uri2)) != null && iplVar.f) {
            ((cnd) this.b.get()).b();
        }
    }
}
