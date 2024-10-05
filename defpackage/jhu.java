package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jhu {
    public String a;
    public String b;
    public String c;
    public Optional d;
    public amru e;
    public Integer f;
    public Optional g;

    public jhu(byte[] bArr) {
        this.d = Optional.empty();
        this.g = Optional.empty();
    }

    public final void a(String str) {
        if (str == null) {
            throw new NullPointerException("Null subtitle");
        }
        this.c = str;
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str;
    }

    public final void c(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void d(amru amruVar) {
        if (amruVar == null) {
            throw new NullPointerException("Null videos");
        }
        this.e = amruVar;
    }

    public jhu() {
    }
}
