package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iob implements akxu {
    final /* synthetic */ ioj a;

    public iob(ioj iojVar) {
        this.a = iojVar;
    }

    @Override // defpackage.akxu
    public final void a(final String str, String str2, final aufk aufkVar) {
        this.a.b.execute(new Runnable() { // from class: inx
            @Override // java.lang.Runnable
            public final void run() {
                iob iobVar = iob.this;
                String str3 = str;
                aufk aufkVar2 = aufkVar;
                god godVar = (god) iobVar.a.e.get(str3);
                if (godVar != null) {
                    godVar.g = aufkVar2.b;
                    iobVar.a.k(str3);
                }
            }
        });
    }

    @Override // defpackage.akxu
    public final void b(final String str, String str2, final avgc avgcVar) {
        this.a.b.execute(new Runnable() { // from class: iny
            @Override // java.lang.Runnable
            public final void run() {
                ImageView imageView;
                iob iobVar = iob.this;
                String str3 = str;
                avgc avgcVar2 = avgcVar;
                ioj iojVar = iobVar.a;
                if (iojVar.h) {
                    return;
                }
                avgg avggVar = avgcVar2.b;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                View findViewWithTag = iojVar.f.findViewWithTag(str3);
                if (findViewWithTag == null || (imageView = (ImageView) findViewWithTag.findViewById(R.id.reel_upload_thumbnail)) == null) {
                    return;
                }
                new ajkj(new ajjr(iojVar.c), new yzw(), imageView, true).k(avggVar);
            }
        });
    }

    @Override // defpackage.akxu
    public final void c(final String str, String str2, final avsp avspVar) {
        this.a.b.execute(new Runnable() { // from class: inz
            @Override // java.lang.Runnable
            public final void run() {
                iob iobVar = iob.this;
                String str3 = str;
                avsp avspVar2 = avspVar;
                if (((god) iobVar.a.e.get(str3)) == null || (avspVar2.b & 1) == 0) {
                    return;
                }
                atdf atdfVar = avspVar2.c;
                if (atdfVar == null) {
                    atdfVar = atdf.a;
                }
                if ((atdfVar.b & 1) != 0) {
                    atdf atdfVar2 = avspVar2.c;
                    if (atdfVar2 == null) {
                        atdfVar2 = atdf.a;
                    }
                    if (atdfVar2.c == null) {
                        atdc atdcVar = atdc.a;
                    }
                }
            }
        });
    }

    @Override // defpackage.akxu
    public final void d(final String str, String str2, final avuh avuhVar) {
        this.a.b.execute(new Runnable() { // from class: ioa
            @Override // java.lang.Runnable
            public final void run() {
                iob iobVar = iob.this;
                String str3 = str;
                avuh avuhVar2 = avuhVar;
                god godVar = (god) iobVar.a.e.get(str3);
                if (avuhVar2 == null || godVar == null) {
                    return;
                }
                int ae = awxr.ae(avuhVar2.c);
                if (ae == 0) {
                    ae = 1;
                }
                godVar.i = ae;
                int ae2 = awxr.ae(avuhVar2.c);
                if (ae2 != 0 && ae2 == 3) {
                    iobVar.a.l(godVar);
                }
            }
        });
    }

    @Override // defpackage.akxu
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.akxu
    public final /* synthetic */ void f(String str, Exception exc) {
    }

    @Override // defpackage.akxu
    public final /* synthetic */ void g() {
    }
}
