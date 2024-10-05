package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adiz {
    protected final ypa a;
    public final adja b;
    public final adlt c;
    public boolean e;
    private final azrw g;
    private final azrw h;
    private ainy i;
    private ainl j;
    private final adix k;
    public final ayqw d = new ayqw();
    public final adiy f = new adiy(this);

    static {
        zga.a("MDX.player.localPlaybackControl");
    }

    public adiz(ypa ypaVar, adja adjaVar, azrw azrwVar, azrw azrwVar2, adlt adltVar) {
        adix adixVar = new adix(this);
        this.k = adixVar;
        this.a = ypaVar;
        this.b = adjaVar;
        this.g = azrwVar;
        this.h = azrwVar2;
        this.c = adltVar;
        adltVar.i(adixVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(adle adleVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void c(adle adleVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d(aibu aibuVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final ainl e() {
        if (this.j == null) {
            this.j = (ainl) this.h.get();
        }
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ainy f() {
        if (this.i == null) {
            this.i = (ainy) this.g.get();
        }
        return this.i;
    }
}
