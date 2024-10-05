package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agfd implements Runnable {
    public final /* synthetic */ agfe a;
    public final /* synthetic */ agnz b;
    private final /* synthetic */ int c;

    public /* synthetic */ agfd(agfe agfeVar, agnz agnzVar, int i) {
        this.c = i;
        this.a = agfeVar;
        this.b = agnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.a.m(this.b);
            return;
        }
        if (i == 1) {
            this.a.m(this.b);
        } else if (i != 2) {
            this.a.m(this.b);
        } else {
            this.a.m(this.b);
        }
    }
}
