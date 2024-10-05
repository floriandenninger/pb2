package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnr {
    final /* synthetic */ bpv a;
    final /* synthetic */ bof b;

    public bnr(bof bofVar, bpv bpvVar) {
        this.b = bofVar;
        this.a = bpvVar;
    }

    public final void a() {
        this.b.t.remove(this.a);
        this.b.p.notifyDataSetChanged();
    }
}
