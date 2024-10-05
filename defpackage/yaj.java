package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yaj implements ajms {
    public final Object a;
    public long b;

    public yaj(Object obj, long j) {
        this.a = obj;
        this.b = j;
    }

    @Override // defpackage.ajms
    public final ajms e(ajms ajmsVar) {
        if (ajmsVar instanceof yaj) {
            yaj yajVar = (yaj) ajmsVar;
            yajVar.b = Math.max(this.b, yajVar.b);
        }
        return ajmsVar;
    }
}
