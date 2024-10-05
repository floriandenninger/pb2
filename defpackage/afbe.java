package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afbe implements oya {
    public final aeru a;
    public int d;
    private final amnv e;
    public volatile afjf c = afjf.a;
    public final String b = "ExoPlayer";

    public afbe(amnv amnvVar, aeru aeruVar) {
        this.e = amnvVar;
        this.a = aeruVar;
    }

    @Override // defpackage.oya
    public final void a(MediaCodec.CryptoException cryptoException) {
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 24);
        sb.append("Audio CryptoError with ");
        sb.append(str);
        sb.append(".");
        zga.d(sb.toString(), cryptoException);
    }

    @Override // defpackage.oya
    public final void b(oxz oxzVar) {
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 41);
        sb.append("Error with ");
        sb.append(str);
        sb.append(" audio decoder initialization.");
        zga.d(sb.toString(), oxzVar);
    }

    @Override // defpackage.oya
    public final void c(String str, long j, long j2) {
        this.c.b(j, j2);
    }

    public final void d(ozg ozgVar) {
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 39);
        sb.append("Error with ");
        sb.append(str);
        sb.append(" audio track initialization.");
        zga.d(sb.toString(), ozgVar);
    }

    public final void e(ozh ozhVar) {
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Error with ");
        sb.append(str);
        sb.append(" audio track write.");
        zga.d(sb.toString(), ozhVar);
    }

    public final void f(long j, long j2) {
        StringBuilder sb = new StringBuilder(45);
        sb.append("b.");
        sb.append(j);
        sb.append(";e.");
        sb.append(j2);
        this.a.g(new afih("underrun", ((Long) this.e.get()).longValue(), sb.toString()));
    }
}
