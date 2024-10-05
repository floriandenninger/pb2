package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cea implements Runnable {
    private final caj a;
    private final String b;
    private final abm c;

    public cea(caj cajVar, String str, abm abmVar, byte[] bArr) {
        this.a = cajVar;
        this.b = str;
        this.c = abmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f.g(this.b);
    }
}
