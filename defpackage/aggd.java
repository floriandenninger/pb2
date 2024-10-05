package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aggd implements Runnable {
    public final /* synthetic */ aggk a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ aggd(aggk aggkVar, String str, int i) {
        this.c = i;
        this.a = aggkVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            aggk aggkVar = this.a;
            String str = this.b;
            if (aggkVar.b.z()) {
                aggkVar.i(str);
                return;
            }
            return;
        }
        aggk aggkVar2 = this.a;
        String str2 = this.b;
        if (aggkVar2.b.z()) {
            aggkVar2.r(str2);
        }
    }
}
