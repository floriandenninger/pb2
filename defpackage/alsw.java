package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alsw {
    final int a;
    final alsj b;

    public alsw(int i) {
        this(i, null);
    }

    public alsw(int i, alsj alsjVar) {
        this.a = i;
        this.b = alsjVar;
        if (i == 4) {
            alta.l(alsjVar, "CompatService cannot be null when state is connected");
        }
    }
}
