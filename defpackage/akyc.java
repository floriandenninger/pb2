package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akyc {
    public final akzs a;
    public final akzs b;

    public akyc(akzs akzsVar, akzs akzsVar2) {
        this.a = akzsVar;
        this.b = akzsVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akyc)) {
            return false;
        }
        akyc akycVar = (akyc) obj;
        return amkq.b(this.a, akycVar.a) && amkq.b(this.b, akycVar.b);
    }
}
