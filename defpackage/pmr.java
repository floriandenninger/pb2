package defpackage;

import androidx.media3.common.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pmr {
    public int A;
    public int B;
    public int C;
    public int D;
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public String h;
    public Metadata i;
    public String j;
    public String k;
    public int l;
    public List m;
    public DrmInitData n;
    public long o;
    public int p;
    public int q;
    public float r;
    public int s;
    public float t;
    public byte[] u;
    public int v;
    public asf w;
    public int x;
    public int y;
    public int z;

    public pmr() {
        this.f = -1;
        this.g = -1;
        this.l = -1;
        this.o = Long.MAX_VALUE;
        this.p = -1;
        this.q = -1;
        this.r = -1.0f;
        this.t = 1.0f;
        this.v = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.C = -1;
        this.D = 0;
    }

    public pmr(pms pmsVar) {
        this.a = pmsVar.c;
        this.b = pmsVar.d;
        this.c = pmsVar.e;
        this.d = pmsVar.f;
        this.e = pmsVar.g;
        this.f = pmsVar.h;
        this.g = pmsVar.i;
        this.h = pmsVar.k;
        this.i = pmsVar.l;
        this.j = pmsVar.m;
        this.k = pmsVar.n;
        this.l = pmsVar.o;
        this.m = pmsVar.p;
        this.n = pmsVar.q;
        this.o = pmsVar.r;
        this.p = pmsVar.s;
        this.q = pmsVar.t;
        this.r = pmsVar.u;
        this.s = pmsVar.v;
        this.t = pmsVar.w;
        this.u = pmsVar.x;
        this.v = pmsVar.y;
        this.w = pmsVar.z;
        this.x = pmsVar.A;
        this.y = pmsVar.B;
        this.z = pmsVar.C;
        this.A = pmsVar.D;
        this.B = pmsVar.E;
        this.C = pmsVar.F;
        this.D = pmsVar.G;
    }

    public final pms a() {
        return new pms(this);
    }

    public final void b(int i) {
        this.a = Integer.toString(i);
    }
}
