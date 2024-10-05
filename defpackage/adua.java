package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adua {
    public String a;
    public String b;
    public adtx c;
    public WatchNextResponseModel d;
    public adtz e;
    private Integer f;
    private Integer g;
    private Integer h;
    private aigk i;
    private aign j;
    private Integer k;
    private String l;

    public adua() {
    }

    public adua(adub adubVar) {
        this.f = Integer.valueOf(adubVar.a);
        this.a = adubVar.b;
        this.b = adubVar.c;
        this.g = Integer.valueOf(adubVar.d);
        this.h = Integer.valueOf(adubVar.e);
        this.c = adubVar.f;
        this.d = adubVar.g;
        this.i = adubVar.h;
        this.j = adubVar.i;
        this.k = Integer.valueOf(adubVar.j);
        this.e = adubVar.k;
        this.l = adubVar.l;
    }

    public final adub a() {
        Integer num = this.f;
        if (num == null || this.g == null || this.h == null || this.c == null || this.i == null || this.j == null || this.k == null || this.e == null || this.l == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f == null) {
                sb.append(" playbackState");
            }
            if (this.g == null) {
                sb.append(" totalVideosInQueue");
            }
            if (this.h == null) {
                sb.append(" currentVideoIndexInQueue");
            }
            if (this.c == null) {
                sb.append(" mdxAdState");
            }
            if (this.i == null) {
                sb.append(" sequencerStage");
            }
            if (this.j == null) {
                sb.append(" videoStage");
            }
            if (this.k == null) {
                sb.append(" mdxConnectionState");
            }
            if (this.e == null) {
                sb.append(" autonavState");
            }
            if (this.l == null) {
                sb.append(" currentVideoId");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adub(num.intValue(), this.a, this.b, this.g.intValue(), this.h.intValue(), this.c, this.d, this.i, this.j, this.k.intValue(), this.e, this.l);
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null currentVideoId");
        }
        this.l = str;
    }

    public final void c(int i) {
        this.h = Integer.valueOf(i);
    }

    public final void d(int i) {
        this.k = Integer.valueOf(i);
    }

    public final void e(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void f(aigk aigkVar) {
        if (aigkVar == null) {
            throw new NullPointerException("Null sequencerStage");
        }
        this.i = aigkVar;
    }

    public final void g(int i) {
        this.g = Integer.valueOf(i);
    }

    public final void h(aign aignVar) {
        if (aignVar == null) {
            throw new NullPointerException("Null videoStage");
        }
        this.j = aignVar;
    }
}
