package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ig implements InterfaceC0002if {
    final ClipData a;
    final int b;
    int c;
    Uri d;
    Bundle e;

    public ig(ClipData clipData, int i) {
        this.a = clipData;
        this.b = i;
    }

    @Override // defpackage.InterfaceC0002if
    public final ik a() {
        return new ik(new ij(this));
    }

    @Override // defpackage.InterfaceC0002if
    public final void b(Bundle bundle) {
        this.e = bundle;
    }

    @Override // defpackage.InterfaceC0002if
    public final void c(int i) {
        this.c = i;
    }

    @Override // defpackage.InterfaceC0002if
    public final void d(Uri uri) {
        this.d = uri;
    }
}
