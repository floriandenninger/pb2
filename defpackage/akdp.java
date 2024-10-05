package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akdp {
    public final ysl a;
    public final akdn b;
    public final akdr c;
    private final ylf d;
    private final aeqp e;

    public akdp(ysl yslVar, ylf ylfVar, akdn akdnVar, akdr akdrVar) {
        yslVar.getClass();
        this.a = yslVar;
        ylfVar.getClass();
        this.d = ylfVar;
        akdnVar.getClass();
        this.b = akdnVar;
        akdrVar.getClass();
        this.c = akdrVar;
        long d = akdnVar.d();
        akdnVar.n();
        this.e = new aeqp(0, (int) d);
    }

    public final void a() {
        zga.g("OnDeviceSuggestIndexFetcher: Created fetch task.");
        this.d.e("OnDeviceSuggestIndexFetcher", this.b.d(), true, 0, null, this.e, false);
        long d = this.b.d();
        StringBuilder sb = new StringBuilder(87);
        sb.append("OnDeviceSuggestIndexFetcher: Schedule a download task to run after ");
        sb.append(d);
        zga.g(sb.toString());
    }
}
