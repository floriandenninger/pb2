package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ygr extends ajpc {
    public final ajjz a;
    public final aahd b;
    public final FrameLayout c;
    public final Context d;
    public final ajyg e;
    ygq f;
    ygq g;
    ygq h;
    final int i;
    private final ajtf j;

    public ygr(Context context, ajjz ajjzVar, aahd aahdVar, ajyg ajygVar, ajtd ajtdVar) {
        ajjzVar.getClass();
        this.a = ajjzVar;
        aahdVar.getClass();
        this.b = aahdVar;
        this.d = context;
        this.e = ajygVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        int Q = wbs.Q(context, R.attr.ytCallToAction);
        this.i = Q;
        ajte ajteVar = ajtdVar.a;
        ajteVar.e(-1);
        ajteVar.d(Q);
        ajteVar.c();
        this.j = ajteVar.a();
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0233  */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajok r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygr.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avnh) obj).k.I();
    }
}
