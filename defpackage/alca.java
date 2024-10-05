package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alca {
    public Uri a;
    public String b;
    public avtn c;
    public Boolean d;
    public Uri e;
    public akzw f;
    public arvt g;
    public alcy h;
    public String i;
    public Bitmap j;
    public String k;
    public awaf l;
    public akzt m;
    public akzl n;
    public amru o;
    public int p;

    public final Uri a() {
        Uri uri = this.a;
        if (uri != null) {
            return uri;
        }
        throw new IllegalStateException("Property \"sourceUri\" has not been set");
    }

    public final Uri b() {
        Uri uri = this.e;
        if (uri != null) {
            return uri;
        }
        throw new IllegalStateException("Property \"uploadUri\" has not been set");
    }

    public final akzw c() {
        akzw akzwVar = this.f;
        if (akzwVar != null) {
            return akzwVar;
        }
        throw new IllegalStateException("Property \"uploadMetadataProto\" has not been set");
    }

    public final avtn d() {
        avtn avtnVar = this.c;
        if (avtnVar != null) {
            return avtnVar;
        }
        throw new IllegalStateException("Property \"uploadFlowSource\" has not been set");
    }

    public final String e() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"frontendUploadId\" has not been set");
    }

    public final boolean f() {
        Boolean bool = this.d;
        if (bool == null) {
            throw new IllegalStateException("Property \"isShortsEligible\" has not been set");
        }
        return bool.booleanValue();
    }

    public final void g(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uploadUri");
        }
        this.e = uri;
    }

    public final int h() {
        int i = this.p;
        if (i != 0) {
            return i;
        }
        throw new IllegalStateException("Property \"uploadFlowFlavor\" has not been set");
    }
}
