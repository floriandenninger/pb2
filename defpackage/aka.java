package defpackage;

import android.content.ClipDescription;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aka implements akb {
    private final Uri a;
    private final ClipDescription b;
    private final Uri c;

    public aka(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = uri;
        this.b = clipDescription;
        this.c = uri2;
    }

    @Override // defpackage.akb
    public final ClipDescription a() {
        return this.b;
    }

    @Override // defpackage.akb
    public final Uri b() {
        return this.a;
    }

    @Override // defpackage.akb
    public final Uri c() {
        return this.c;
    }

    @Override // defpackage.akb
    public final Object d() {
        return null;
    }

    @Override // defpackage.akb
    public final void e() {
    }
}
