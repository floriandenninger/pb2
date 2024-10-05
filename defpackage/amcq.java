package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amcq {
    public Class a;
    public amcr b;
    public byr c;
    public ammv d;
    private byo e;
    private ammv f;
    private ammv g;
    private amsx h;

    public amcq() {
    }

    public amcq(amct amctVar) {
        this.f = amlr.a;
        this.g = amlr.a;
        this.d = amlr.a;
        this.a = amctVar.a;
        this.e = amctVar.b;
        this.f = amctVar.c;
        this.b = amctVar.d;
        this.c = amctVar.e;
        this.g = amctVar.f;
        this.d = amctVar.g;
        this.h = amctVar.h;
    }

    public amcq(byte[] bArr) {
        this.f = amlr.a;
        this.g = amlr.a;
        this.d = amlr.a;
    }

    public final amct a() {
        byo byoVar;
        amcr amcrVar;
        byr byrVar;
        amsx amsxVar;
        Class cls = this.a;
        if (cls == null || (byoVar = this.e) == null || (amcrVar = this.b) == null || (byrVar = this.c) == null || (amsxVar = this.h) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" workerClass");
            }
            if (this.e == null) {
                sb.append(" constraints");
            }
            if (this.b == null) {
                sb.append(" initialDelay");
            }
            if (this.c == null) {
                sb.append(" inputData");
            }
            if (this.h == null) {
                sb.append(" tags");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new amct(cls, byoVar, this.f, amcrVar, byrVar, this.g, this.d, amsxVar);
    }

    public final void b(byo byoVar) {
        if (byoVar == null) {
            throw new NullPointerException("Null constraints");
        }
        this.e = byoVar;
    }

    public final void c(Set set) {
        this.h = amsx.p(set);
    }
}
