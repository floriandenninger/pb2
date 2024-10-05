package defpackage;

import android.graphics.Bitmap;
import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class goc {
    public final long a;
    public final boolean b;
    public CharSequence c;
    public atdc d;
    public avgg e;
    public Bitmap f;
    public String g;
    public double h;
    public double i;
    public double j;
    public double k;
    public boolean l;
    public boolean m;
    public double n;
    public Spanned o;
    public Spanned p;
    public Spanned q;
    public Spanned r;
    public apxf s;
    public apxf t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    private int z;

    public goc(CharSequence charSequence, int i, boolean z, String str, atdc atdcVar, long j, avuh avuhVar) {
        this.y = 1;
        atdcVar.getClass();
        this.c = charSequence;
        this.y = i;
        this.b = z;
        this.g = str;
        this.d = atdcVar;
        this.k = Double.POSITIVE_INFINITY;
        this.a = j;
        this.n = -1.0d;
        this.h = -1.0d;
        this.i = -1.0d;
        this.j = -1.0d;
        if (avuhVar != null) {
            d(avuhVar);
        }
    }

    public final void a(boolean z, boolean z2) {
        this.v = z;
        this.w = z2;
    }

    public final void b() {
        this.x = true;
    }

    public final void c(akzp akzpVar) {
        if (alep.i(akzpVar, avtq.UPLOAD_PROCESSOR_FAILURE_REASON_MAX_STORAGE_USAGE_TIME_EXCEEDED)) {
            this.u = true;
        }
        this.z = 0;
        int l = akwg.l(akzpVar.c);
        if (l == 0) {
            l = 1;
        }
        int i = l - 1;
        if (i != 0) {
            if (i == 1) {
                this.j = 1.0d;
                this.k = 0.0d;
                return;
            } else {
                if (i != 3) {
                    return;
                }
                avtq b = avtq.b(akzpVar.d);
                if (b == null) {
                    b = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
                }
                if (b != avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED) {
                    this.l = true;
                    return;
                }
                return;
            }
        }
        avtq b2 = avtq.b(akzpVar.d);
        if (b2 == null) {
            b2 = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
        }
        if (b2 == avtq.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_WIFI) {
            this.z = 1;
            return;
        }
        avtq b3 = avtq.b(akzpVar.d);
        if (b3 == null) {
            b3 = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
        }
        if (b3 == avtq.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_NETWORK) {
            this.z = 2;
        }
    }

    public final void d(avuh avuhVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        apxf apxfVar = null;
        if ((avuhVar.b & 4) != 0) {
            aqygVar = avuhVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        this.q = ajcq.b(aqygVar);
        if ((avuhVar.b & 8) != 0) {
            aqygVar2 = avuhVar.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        this.r = ajcq.b(aqygVar2);
        if ((avuhVar.b & 16) != 0 && (apxfVar = avuhVar.f) == null) {
            apxfVar = apxf.a;
        }
        this.s = apxfVar;
    }

    public final boolean e() {
        return this.z == 2;
    }

    public final boolean f() {
        return this.z == 1;
    }

    public final void g(int i) {
        if (i == 4) {
            this.m = true;
        }
    }
}
