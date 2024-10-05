package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fug implements fuj {
    private final fuo a;
    private String b = "";
    private String c = "";
    private int d;
    private long e;

    public fug(fuo fuoVar) {
        this.a = fuoVar;
    }

    private final void e() {
        this.b = "";
        this.c = "";
        this.d = 0;
        this.e = 0L;
    }

    @Override // defpackage.fuj
    public final void b(aheg ahegVar) {
        this.e = ahegVar.e();
    }

    @Override // defpackage.fuj
    public final void c() {
        if (TextUtils.isEmpty(this.b)) {
            return;
        }
        final fuo fuoVar = this.a;
        final String str = this.b;
        final String str2 = this.c;
        final int i = this.d;
        final long j = this.e;
        ynm.m(((ywr) fuoVar.a.get()).b(new amml() { // from class: ful
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                fuo fuoVar2 = fuo.this;
                String str3 = str;
                String str4 = str2;
                int i2 = i;
                long j2 = j;
                aone builder = ((fuk) obj).toBuilder();
                builder.copyOnWrite();
                fuk fukVar = (fuk) builder.instance;
                str3.getClass();
                fukVar.b |= 1;
                fukVar.c = str3;
                builder.copyOnWrite();
                fuk fukVar2 = (fuk) builder.instance;
                str4.getClass();
                fukVar2.b |= 2;
                fukVar2.d = str4;
                builder.copyOnWrite();
                fuk fukVar3 = (fuk) builder.instance;
                fukVar3.b |= 4;
                fukVar3.e = i2;
                builder.copyOnWrite();
                fuk fukVar4 = (fuk) builder.instance;
                fukVar4.b |= 8;
                fukVar4.f = j2;
                long d = fuoVar2.b.d();
                builder.copyOnWrite();
                fuk fukVar5 = (fuk) builder.instance;
                fukVar5.b |= 16;
                fukVar5.g = d;
                return (fuk) builder.build();
            }
        }), egw.o);
    }

    @Override // defpackage.fuj
    public final boolean d() {
        return !TextUtils.isEmpty(this.b);
    }

    @Override // defpackage.flk
    public final void i() {
        e();
    }

    @Override // defpackage.flk
    public final void j(apxf apxfVar, avgg avggVar) {
        aigp aigpVar = new aigp();
        if (!apxfVar.pY(WatchEndpointOuterClass.watchEndpoint)) {
            e();
            return;
        }
        owi h = aigpVar.h(apxfVar);
        if (h == null) {
            return;
        }
        this.b = h.c;
        this.c = h.e;
        this.d = h.f;
        this.e = h.l;
    }
}
