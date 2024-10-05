package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ztj implements zfi {
    public final /* synthetic */ ztk a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ztq c;

    public /* synthetic */ ztj(ztk ztkVar, String str, ztq ztqVar) {
        this.a = ztkVar;
        this.b = str;
        this.c = ztqVar;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        ztk ztkVar = this.a;
        String str = this.b;
        ztq ztqVar = this.c;
        synchronized (ztkVar.d) {
            ztkVar.e.put(str, ztqVar);
            ztkVar.d.remove(str);
        }
    }
}
