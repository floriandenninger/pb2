package defpackage;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vyg implements vyf {
    public final VideoMetaData a;
    public final /* synthetic */ vyi d;
    private vxz j;
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private final vyh k = new vyh();
    public final vyh b = new vyh();
    public final vyh c = new vyh();
    private PriorityBlockingQueue i = new PriorityBlockingQueue(10);

    public vyg(vyi vyiVar, VideoMetaData videoMetaData) {
        this.d = vyiVar;
        this.a = videoMetaData;
        e();
    }

    @Override // defpackage.vyf
    public final synchronized vym a() {
        return this.k;
    }

    @Override // defpackage.vyf
    public final synchronized vym b() {
        return this.b;
    }

    public final vyc c() {
        vyc vycVar = (vyc) this.c.a;
        if (vycVar == null) {
            vycVar = new vyc(this.a);
            this.c.a(vycVar);
        }
        amkq.N(this.a.equals(vycVar.a));
        return vycVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(vxv vxvVar) {
        this.i.add(vxvVar);
    }

    public final synchronized void e() {
        int max;
        int i;
        int i2;
        int i3;
        vyi vyiVar = this.d;
        if (vyiVar.d && vyiVar.e && vyiVar.g != null) {
            amkq.N(vyiVar.c != null);
            int dimensionPixelSize = this.d.c.getResources().getDimensionPixelSize(R.dimen.thumbnail_long_edge);
            float a = this.a.a();
            if (a <= 1.0f) {
                dimensionPixelSize = (int) (dimensionPixelSize * a);
            }
            int round = Math.round(dimensionPixelSize / a);
            if (dimensionPixelSize != this.e || round != this.f) {
                this.e = dimensionPixelSize;
                this.f = round;
                amkq.N(dimensionPixelSize > 0 && round > 0);
                long j = this.e * this.f * 4;
                Runtime runtime = Runtime.getRuntime();
                long maxMemory = (runtime.maxMemory() - runtime.totalMemory()) + runtime.freeMemory();
                vyc vycVar = (vyc) this.c.a;
                if (vycVar != null) {
                    synchronized (vycVar.b) {
                        Iterator it = vycVar.b.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            Bitmap b = ((vya) it.next()).b();
                            if (b != null) {
                                i += b.getByteCount();
                            }
                        }
                    }
                    maxMemory += i;
                }
                double d = maxMemory;
                Double.isNaN(d);
                int max2 = (int) (Math.max(0L, Math.min((long) (d * 0.2d), maxMemory - 201326592)) / j);
                DisplayMetrics displayMetrics = this.d.c.getResources().getDisplayMetrics();
                if (this.d.h) {
                    max = displayMetrics.widthPixels;
                } else {
                    max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int max3 = (int) Math.max(1.0d, Math.floor(r3 / Math.round((this.e * this.d.c.getResources().getDimensionPixelSize(R.dimen.video_trim_view_thumbnail_height)) / this.f)));
                this.g = max3;
                this.g = Math.min(max3, this.a.h());
                this.h = Math.max(0, Math.min(Math.min((int) Math.ceil((((float) this.a.g) / 1000000.0f) * 4.0f), this.a.h()), Math.min((int) (max / (this.d.c.getResources().getDisplayMetrics().density * 4.0f)), max2 - this.g)));
                f();
            }
            vyc c = c();
            amkq.N(this.i != null);
            if (((vxw) this.k.a) == null && (i3 = this.g) > 0) {
                vxw vxwVar = new vxw(vyi.f(this.a, i3), c, "Overview", 100);
                d(vxwVar);
                this.k.a(vxwVar);
            }
            if (((vxw) this.b.a) == null && (i2 = this.h) > 0) {
                vxw vxwVar2 = new vxw(vyi.f(this.a, i2), vxo.b, c, "Seek Preview", 0);
                d(vxwVar2);
                this.b.a(vxwVar2);
            }
            if (this.j == null) {
                amkq.N(true);
                vyi vyiVar2 = this.d;
                vxz vxzVar = new vxz(vyiVar2.c, this.a, this.e, this.f, this.i, vyiVar2.a, vyiVar2.b, vyiVar2.g);
                this.j = vxzVar;
                vxzVar.start();
            }
        }
    }

    public final synchronized void f() {
        g();
        vym a = this.k.a(null);
        if (a != null) {
            a.j();
        }
        vym a2 = this.b.a(null);
        if (a2 != null) {
            a2.j();
        }
        this.i.clear();
        this.i = new PriorityBlockingQueue(10);
        vym a3 = this.c.a(null);
        if (a3 != null) {
            a3.j();
        }
    }

    public final synchronized void g() {
        if (this.j != null) {
            amkq.N(true);
            this.j.a();
            this.j = null;
        }
    }
}
