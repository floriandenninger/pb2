package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpn extends ars {
    final /* synthetic */ bpo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpn(bpo bpoVar, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.b = bpoVar;
    }

    @Override // defpackage.ars
    public final void b(int i) {
        this.b.c.m.post(new bpm(this, i, 0));
    }

    @Override // defpackage.ars
    public final void c(int i) {
        this.b.c.m.post(new bpm(this, i, 1));
    }
}
