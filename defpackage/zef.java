package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zef implements amml {
    public final /* synthetic */ amml a;
    private final /* synthetic */ int b;

    public /* synthetic */ zef(amml ammlVar, int i) {
        this.b = i;
        this.a = ammlVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        return this.b != 0 ? this.a.apply((aooy) obj) : this.a.apply((aooy) obj);
    }
}
