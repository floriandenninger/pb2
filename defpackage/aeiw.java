package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeiw implements ozt {
    public static final Uri a = Uri.parse("http://dummy.googlevideo.com/videoplayback");
    public final String b;
    private final ExecutorService c;
    private final boolean d;
    private MediaFormat e;
    private boolean f;
    private int g;
    private long h;
    private String i;
    private aeiu j;
    private boolean k = true;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private ozt p;

    public aeiw(String str, ExecutorService executorService, boolean z) {
        zhq.m(str);
        this.b = str;
        afki.a(executorService);
        this.c = executorService;
        this.d = z;
        this.j = null;
        this.e = null;
    }

    @Override // defpackage.ozt
    public final int a() {
        return 1;
    }

    @Override // defpackage.ozt
    public final synchronized MediaFormat b(int i) {
        if (this.m) {
            return this.e;
        }
        ozt oztVar = this.p;
        if (oztVar != null) {
            return oztVar.b(i);
        }
        afsi.b(2, 8, "OnesieDashChunkSource.getFormat() has nothing to return.");
        return null;
    }

    @Override // defpackage.ozt
    public final synchronized void c(long j) {
        ozt oztVar = this.p;
        if (oztVar == null || !this.n) {
            return;
        }
        oztVar.c(j);
    }

    @Override // defpackage.ozt
    public final synchronized void d(List list) {
        this.l = false;
        ozt oztVar = this.p;
        if (oztVar != null) {
            oztVar.d(list);
            this.n = false;
        }
    }

    @Override // defpackage.ozt
    public final synchronized void e(int i) {
        this.l = true;
        this.o = i;
        ozt oztVar = this.p;
        if (oztVar != null) {
            oztVar.e(i);
            this.n = true;
        }
    }

    @Override // defpackage.ozt
    public final synchronized void f(List list, long j, ozn oznVar) {
        aeiu aeiuVar;
        ozt oztVar = this.p;
        if (oztVar != null) {
            if (this.n) {
                oztVar.f(list, j, oznVar);
                return;
            } else {
                aelz.g("getChunkOperation on disabled innerChunkSource.");
                return;
            }
        }
        if (oznVar.b != null || (aeiuVar = this.j) == null || this.f) {
            return;
        }
        oznVar.b = aeiuVar;
        this.f = true;
    }

    @Override // defpackage.ozt
    public final synchronized void g() {
        ozt oztVar = this.p;
        if (oztVar != null) {
            oztVar.g();
        }
    }

    @Override // defpackage.ozt
    public final synchronized void h(ozk ozkVar) {
        ozt oztVar = this.p;
        if (oztVar == null || !this.n || (ozkVar instanceof aeiu)) {
            return;
        }
        oztVar.h(ozkVar);
    }

    @Override // defpackage.ozt
    public final synchronized void i(ozk ozkVar, Exception exc) {
    }

    @Override // defpackage.ozt
    public final synchronized boolean j() {
        ozt oztVar = this.p;
        if (oztVar != null) {
            return oztVar.j();
        }
        if (this.e == null) {
            return false;
        }
        this.m = true;
        return true;
    }

    public final synchronized pcm k() {
        aeiu aeiuVar = this.j;
        if (aeiuVar == null) {
            return null;
        }
        return aeiuVar.n;
    }

    public final synchronized void l(aeiu aeiuVar) {
        this.j = aeiuVar;
        this.e = aeiuVar.m;
    }

    public final synchronized void m(int i, long j, String str, byte[] bArr) {
        if (this.k) {
            this.k = false;
            this.c.submit(new aeiv(this, i, str, bArr, this.d));
            this.g = i;
            this.h = j;
            this.i = str;
        }
    }

    public final synchronized void n(ozt oztVar) {
        if (this.p != null) {
            aelz.g("innerChunkSource already set.");
        }
        this.p = oztVar;
        if (this.m && !oztVar.j()) {
            afsi.b(2, 8, "chunkSource.prepare() returned false.");
            return;
        }
        if (this.l) {
            this.p.e(this.o);
            this.n = true;
        }
    }

    public final synchronized void o() {
        this.k = false;
    }

    public final synchronized boolean p(VideoStreamingData videoStreamingData) {
        if (this.g == 0 && this.h == 0) {
            return true;
        }
        for (FormatStreamModel formatStreamModel : videoStreamingData.n) {
            if (formatStreamModel.e() == this.g) {
                if (!TextUtils.equals(formatStreamModel.w(), this.i)) {
                    return false;
                }
                String queryParameter = formatStreamModel.d.getQueryParameter("lmt");
                if (queryParameter != null) {
                    try {
                        if (Long.parseLong(queryParameter) == this.h) {
                            return true;
                        }
                    } catch (NumberFormatException unused) {
                        return false;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
