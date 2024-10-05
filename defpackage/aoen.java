package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoen {
    public Uri a;
    public Bitmap b;
    public Long c;
    public aoeg d;
    public Integer e;

    public aoen() {
    }

    public aoen(aoeo aoeoVar) {
        this.a = aoeoVar.a;
        this.b = aoeoVar.b;
        this.c = aoeoVar.c;
        this.d = aoeoVar.d;
        this.e = aoeoVar.e;
    }

    public final aoeo a() {
        return new aoeo(this.a, this.b, this.c, this.d, this.e);
    }
}
