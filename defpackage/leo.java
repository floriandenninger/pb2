package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class leo extends ajpc implements ajof {
    private final View a;
    private final aahd b;
    private final TextView c;
    private final TextView d;
    private final ajoi e;
    private final ajoi f;
    private arey g;

    public leo(Context context, aahd aahdVar) {
        aahdVar.getClass();
        this.b = aahdVar;
        View inflate = View.inflate(context, R.layout.title_and_button_list_header, null);
        this.a = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        this.c = textView;
        TextView textView2 = (TextView) inflate.findViewById(R.id.button);
        this.d = textView2;
        this.e = new ajoi(aahdVar, textView);
        this.f = new ajoi(aahdVar, textView2, this);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.e.c();
        this.f.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e5  */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void d(defpackage.ajok r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.leo.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arey) obj).g.I();
    }

    @Override // defpackage.ajof
    public final boolean h(View view) {
        apmg apmgVar;
        apmg apmgVar2;
        aump aumpVar = this.g.e;
        if (aumpVar == null) {
            aumpVar = aump.a;
        }
        if (aumpVar.b == 65153809) {
            apmgVar = (apmg) aumpVar.c;
        } else {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 8192) == 0) {
            return false;
        }
        aahd aahdVar = this.b;
        aump aumpVar2 = this.g.e;
        if (aumpVar2 == null) {
            aumpVar2 = aump.a;
        }
        if (aumpVar2.b == 65153809) {
            apmgVar2 = (apmg) aumpVar2.c;
        } else {
            apmgVar2 = apmg.a;
        }
        apxf apxfVar = apmgVar2.n;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, null);
        return false;
    }
}
