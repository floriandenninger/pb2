package defpackage;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class rgi implements Callable {
    public final /* synthetic */ rgm a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ rgi(rgm rgmVar, String str, int i) {
        this.c = i;
        this.a = rgmVar;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                return new dxo(new rgl(this.a, this.b));
            }
            return new dxt(new rgi(this.a, this.b, 0));
        }
        rgm rgmVar = this.a;
        String str = this.b;
        rdw f = rgmVar.R().f(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", str);
        rgmVar.J().y();
        hashMap.put("gmp_version", 44000L);
        if (f != null) {
            String p = f.p();
            if (p != null) {
                hashMap.put("app_version", p);
            }
            hashMap.put("app_version_int", Long.valueOf(f.b()));
            hashMap.put("dynamite_version", Long.valueOf(f.e()));
        }
        return hashMap;
    }
}
