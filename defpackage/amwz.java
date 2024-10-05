package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amwz extends ampa {
    public final amvf a;
    public final Object b;

    public amwz(amvf amvfVar, Object obj) {
        this.a = amvfVar;
        this.b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final amqi a() {
        return this.a.c;
    }

    @Override // defpackage.ampa, java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.a;
    }

    @Override // defpackage.ampa, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }
}
