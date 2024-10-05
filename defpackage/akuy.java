package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akuy {
    public Uri a;
    public ammv b;
    public ammv c;

    public akuy() {
    }

    public akuy(byte[] bArr) {
        this.b = amlr.a;
        this.c = amlr.a;
    }

    public final akuz a() {
        Uri uri = this.a;
        if (uri == null) {
            throw new IllegalStateException("Missing required properties: uri");
        }
        return new akuz(uri, this.b, this.c);
    }
}
