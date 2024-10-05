package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afgi implements afia {
    public long a;
    final /* synthetic */ afgs b;

    public afgi(afgs afgsVar) {
        this.b = afgsVar;
    }

    @Override // defpackage.afia
    public final /* synthetic */ void a(afio afioVar) {
    }

    @Override // defpackage.afia
    public final void b(Exception exc) {
        this.b.v(new afih(afif.DEFAULT, "cache.exception", this.b.l, exc.getCause()));
    }

    @Override // defpackage.afia
    public final void c(int i) {
        String str = i != 0 ? i != 1 ? null : "cache.ignored.unsetlength" : "cache.ignored.onerror";
        afgs afgsVar = this.b;
        VideoStreamingData videoStreamingData = afgsVar.p;
        boolean z = videoStreamingData == null || videoStreamingData.l == 1;
        if (afgsVar.o || str == null || !z) {
            return;
        }
        afgq afgqVar = afgsVar.e;
        String e = afgsVar.e();
        String d = this.b.d();
        String c = afhm.c();
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 3 + str.length() + String.valueOf(d).length() + String.valueOf(c).length());
        sb.append(e);
        sb.append(":");
        sb.append(str);
        sb.append(":");
        sb.append(d);
        sb.append(":");
        sb.append(c);
        afgqVar.a("error", sb.toString());
        this.b.o = true;
    }

    @Override // defpackage.afia
    public final void rP(long j) {
        this.a += j;
    }
}
