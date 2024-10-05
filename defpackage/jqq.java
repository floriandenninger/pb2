package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jqq {
    private final lkb a;
    private final lkb b;
    private final aloh c;

    public jqq(aloh alohVar, lkb lkbVar, lkb lkbVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.c = alohVar;
        this.b = lkbVar;
        this.a = lkbVar2;
    }

    public final Intent a(String str) {
        return this.c.r().addFlags(67108864).putExtra("pane", this.b.i(str, false, ""));
    }

    public final Intent b() {
        return this.c.r().addFlags(67108864).putExtra("pane", this.a.e());
    }
}
