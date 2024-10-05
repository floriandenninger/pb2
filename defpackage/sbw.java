package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sbw {
    public static final amxj a = amxj.l("com/google/android/libraries/ar/faceviewer/FaceViewerManager");
    public final List b = new ArrayList();
    public ViewGroup c;
    public final scb d;
    public final scj e;
    public final sdy f;
    public final sec g;
    public final Executor h;
    public final Executor i;
    public final Executor j;
    public final anhy k;
    protected final sbv l;

    public sbw(Context context, sem semVar, gxa gxaVar, Executor executor, Executor executor2, Executor executor3, Callable callable, aogo aogoVar, sbx sbxVar) {
        this.c = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.main_view, (ViewGroup) null);
        this.h = executor2;
        this.i = executor;
        this.j = executor3;
        this.k = anaf.S(callable, executor);
        sdy sdyVar = new sdy(context, semVar, aogoVar, executor2, executor);
        a(sdyVar);
        this.f = sdyVar;
        seg segVar = new seg(context);
        ((ViewGroup) this.c.findViewById(R.id.web_container)).addView(segVar.b);
        sec secVar = new sec(segVar);
        a(secVar);
        this.g = secVar;
        scb scbVar = new scb(context, executor, executor2);
        a(scbVar);
        this.d = scbVar;
        scj scjVar = new scj(gxaVar, scbVar);
        a(scjVar);
        this.e = scjVar;
        sci sciVar = new sci(sbxVar);
        a(sciVar);
        sby sbyVar = new sby(amlo.a);
        a(sbyVar);
        this.l = new sbv(this, sciVar, sbyVar);
        this.c.addView(sdyVar.a(), 0);
    }

    protected final void a(seu seuVar) {
        this.b.add(seuVar);
    }
}
