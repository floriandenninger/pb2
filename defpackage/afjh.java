package defpackage;

import com.google.android.libraries.youtube.media.player.scripted.jni.NativeSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afjh {
    public final long a;
    public final long b;

    public afjh(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public afjh(long j, long j2, byte[] bArr) {
        boolean z = false;
        if (j2 != 0 && j != 0) {
            z = true;
        }
        amkq.E(z);
        this.b = j;
        this.a = j2;
    }

    public final void a() {
        NativeSupport.nativeDestroyPersistentValue(this.b, this.a);
    }

    public final byte[] b(String str, byte[] bArr) {
        return NativeSupport.nativeCall(this.b, this.a, str, bArr);
    }
}
