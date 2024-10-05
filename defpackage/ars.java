package defpackage;

import android.media.VolumeProvider;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ars {
    public int a;
    private final int b;
    private final int c;
    private final String d;
    private VolumeProvider e;

    public ars(int i, int i2, int i3, String str) {
        this.b = i;
        this.c = i2;
        this.a = i3;
        this.d = str;
    }

    public final Object a() {
        if (this.e == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.e = new arp(this, this.b, this.c, this.a, this.d);
            } else {
                this.e = new arq(this, this.b, this.c, this.a);
            }
        }
        return this.e;
    }

    public void b(int i) {
        throw null;
    }

    public void c(int i) {
        throw null;
    }
}
