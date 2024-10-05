package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajz implements akb {
    final InputContentInfo a;

    public ajz(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }

    public ajz(Object obj) {
        this.a = (InputContentInfo) obj;
    }

    @Override // defpackage.akb
    public final ClipDescription a() {
        return this.a.getDescription();
    }

    @Override // defpackage.akb
    public final Uri b() {
        return this.a.getContentUri();
    }

    @Override // defpackage.akb
    public final Uri c() {
        return this.a.getLinkUri();
    }

    @Override // defpackage.akb
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.akb
    public final void e() {
        this.a.requestPermission();
    }
}
