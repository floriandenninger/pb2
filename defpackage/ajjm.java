package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajjm implements ajjn {
    private final ylz a = new ymh(70);
    private final ymo b = new ymo();

    @Override // defpackage.ajjn
    public final ylz a() {
        return this.a;
    }

    @Override // defpackage.ajjn
    public final ylz b() {
        return this.b;
    }

    @Override // defpackage.ajjn
    public final void c() {
        this.a.c();
        this.b.c();
    }

    @Override // defpackage.ajjn
    public final void d(Uri uri) {
        this.a.b(uri);
        this.b.f(uri);
    }
}
