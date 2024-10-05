package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aibn extends aiay {
    private final aibm a = new aibm(this);
    private final int[] b;
    private aibi c;

    public aibn() {
        int[] iArr = aibi.b;
        this.b = new int[3];
    }

    public final synchronized int a() {
        int[] iArr;
        iArr = this.b;
        int[] iArr2 = aibi.b;
        return iArr[2];
    }

    public final synchronized int b(int i, int i2) {
        return this.b[i] + i2;
    }

    public final synchronized void c(aibi aibiVar) {
        aibi aibiVar2 = this.c;
        if (aibiVar2 == aibiVar) {
            return;
        }
        if (aibiVar2 != null) {
            aibiVar2.q(this.a);
            int a = a();
            if (a > 0) {
                this.a.e(0, a);
            }
        }
        this.c = aibiVar;
        d();
        if (this.c != null) {
            int a2 = a();
            if (a2 > 0) {
                this.a.d(0, a2);
            }
            this.c.k(this.a);
        }
    }

    public final synchronized void d() {
        int[] iArr = aibi.b;
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = iArr[i2];
            aibi aibiVar = this.c;
            i += aibiVar != null ? aibiVar.i(i3) : 0;
            this.b[i3 + 1] = i;
        }
    }

    @Override // defpackage.yor
    public final void h(int i, int i2) {
        throw null;
    }
}
