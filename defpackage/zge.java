package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class zge implements zgg {
    public final int a;

    public zge(int i) {
        this.a = i;
    }

    @Override // defpackage.zgg
    public final int a() {
        if (this.a == 4) {
            return 0;
        }
        return b();
    }

    public int b() {
        return e().size();
    }

    @Override // defpackage.zgg
    public final int c() {
        return this.a;
    }
}
