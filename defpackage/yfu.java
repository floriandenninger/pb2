package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yfu implements ajom, ajyc {
    public final View a;
    public final int b;
    final /* synthetic */ yfv c;
    private final TextView d;
    private final TextView e;
    private final ImageView f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final ScrollView j;
    private final ajyf k;
    private final ajyf l;
    private final ajun m;

    public yfu(yfv yfvVar, int i, ajun ajunVar, byte[] bArr, byte[] bArr2) {
        this.c = yfvVar;
        this.b = i;
        this.m = ajunVar;
        View inflate = LayoutInflater.from(yfvVar.b).inflate(i, yfvVar.f, false);
        this.a = inflate;
        this.j = (ScrollView) inflate.findViewById(R.id.scroll_view);
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.body);
        this.f = (ImageView) inflate.findViewById(R.id.foreground);
        this.g = (ImageView) inflate.findViewById(R.id.background);
        TextView textView = (TextView) inflate.findViewById(R.id.action);
        this.h = textView;
        ajyf a = yfvVar.e.a(textView);
        this.k = a;
        TextView textView2 = (TextView) inflate.findViewById(R.id.dismiss);
        this.i = textView2;
        ajyf a2 = yfvVar.e.a(textView2);
        this.l = a2;
        a.c = this;
        a2.c = this;
        whu.I(inflate, false);
    }

    private final int e() {
        yfv yfvVar = this.c;
        asjh asjhVar = yfvVar.k;
        if (asjhVar.f == 7) {
            try {
                return Color.parseColor((String) asjhVar.g);
            } catch (Resources.NotFoundException | Exception unused) {
                return 0;
            }
        }
        return wbs.W(yfvVar.b, R.attr.ytTextPrimary).orElse(0);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.asjh r14) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfu.d(asjh):void");
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        d((asjh) obj);
    }

    @Override // defpackage.ajyc
    public final void oC(aong aongVar) {
        ajyc ajycVar = this.c.j;
        if (ajycVar != null) {
            ajycVar.oC(aongVar);
        }
        this.c.g.a();
    }
}
