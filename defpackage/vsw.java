package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vsw implements vsr {
    public static final int a = (int) TimeUnit.SECONDS.toMillis(1);
    public pom c;
    public vsu d;
    public bej e;
    public boolean h;
    public final Context i;
    public final bbr j;
    public final vrx k;
    public final bgw l;
    public final vrw m;
    public final boolean n;
    public final vyw o;
    public final vyv p;
    private bgw q;
    public final Object b = new Object();
    public int f = 4;
    public long g = -1;

    public vsw() {
    }

    public vsw(Context context, bbr bbrVar, vrx vrxVar, bgw bgwVar, vrw vrwVar, vyw vywVar, vyv vyvVar, boolean z) {
        this.i = context;
        this.j = bbrVar;
        this.k = vrxVar;
        this.l = bgwVar;
        this.m = vrwVar;
        this.o = vywVar;
        this.p = vyvVar;
        this.n = z;
    }

    public static vst b() {
        vst vstVar = new vst();
        vstVar.a(false);
        return vstVar;
    }

    public final bgw a() {
        if (this.q == null) {
            this.q = new bgw() { // from class: vss
                @Override // defpackage.bgw
                public final void a(long j, long j2, pms pmsVar, MediaFormat mediaFormat) {
                    vsw vswVar = vsw.this;
                    synchronized (vswVar.b) {
                        vswVar.g = Math.max(vswVar.g, j);
                    }
                    vswVar.k.b(true);
                    bgw bgwVar = vswVar.l;
                    if (bgwVar != null) {
                        ((vrx) bgwVar).d(j2, j);
                    }
                }
            };
        }
        return this.q;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vsw) {
            vsw vswVar = (vsw) obj;
            if (this.i.equals(vswVar.i) && this.j.equals(vswVar.j) && this.k.equals(vswVar.k) && this.l.equals(vswVar.l) && this.m.equals(vswVar.m) && this.o.equals(vswVar.o) && this.p.equals(vswVar.p) && this.n == vswVar.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.i.hashCode() ^ 1000003) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ (true != this.n ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.i);
        String valueOf2 = String.valueOf(this.j);
        String valueOf3 = String.valueOf(this.k);
        String valueOf4 = String.valueOf(this.l);
        String valueOf5 = String.valueOf(this.m);
        String valueOf6 = String.valueOf(this.o);
        String valueOf7 = String.valueOf(this.p);
        boolean z = this.n;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 179 + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("TransformerSourceImpl{context=");
        sb.append(valueOf);
        sb.append(", mediaSource=");
        sb.append(valueOf2);
        sb.append(", videoTextureManager=");
        sb.append(valueOf3);
        sb.append(", videoFrameMetadataListener=");
        sb.append(valueOf4);
        sb.append(", audioBufferManager=");
        sb.append(valueOf5);
        sb.append(", audioListener=");
        sb.append(valueOf6);
        sb.append(", sourceEventListener=");
        sb.append(valueOf7);
        sb.append(", forceAudioOutput=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
