package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jvg implements anfz {
    public final /* synthetic */ jvh a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ jvg(jvh jvhVar, String str, int i) {
        this.c = i;
        this.a = jvhVar;
        this.b = str;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.c == 0) {
            this.a.a.d(new jqd(this.b));
            return anhv.a;
        }
        this.a.a.d(new jqc(this.b));
        return anhv.a;
    }
}
