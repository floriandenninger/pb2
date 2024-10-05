package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aibr extends aiay {
    private final int a;
    private final aibq b;
    private aibi c;

    public aibr(int i) {
        this.a = i;
        this.b = new aibq(i);
    }

    public final synchronized int a() {
        aibi aibiVar = this.c;
        if (aibiVar == null) {
            return 0;
        }
        return aibiVar.i(this.a);
    }

    public final synchronized void b(aibi aibiVar) {
        aibi aibiVar2 = this.c;
        if (aibiVar2 == aibiVar) {
            return;
        }
        if (aibiVar2 != null) {
            aibiVar2.q(this.b);
            int a = a();
            if (a > 0) {
                this.b.c(this.a, a);
            }
        }
        this.c = aibiVar;
        if (aibiVar != null) {
            if (a() > 0) {
                this.b.a(this.a, 0, a());
            }
            this.c.k(this.b);
        }
    }

    @Override // defpackage.yor
    public final synchronized void h(int i, int i2) {
        throw null;
    }
}
