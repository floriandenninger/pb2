package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ie implements InterfaceC0002if {
    private final ContentInfo.Builder a;

    public ie(ClipData clipData, int i) {
        this.a = new ContentInfo.Builder(clipData, i);
    }

    @Override // defpackage.InterfaceC0002if
    public final ik a() {
        return new ik(new ih(this.a.build()));
    }

    @Override // defpackage.InterfaceC0002if
    public final void b(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // defpackage.InterfaceC0002if
    public final void c(int i) {
        this.a.setFlags(i);
    }

    @Override // defpackage.InterfaceC0002if
    public final void d(Uri uri) {
        this.a.setLinkUri(uri);
    }
}
