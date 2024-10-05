package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abnk implements View.OnClickListener {
    public final /* synthetic */ abns a;
    public final /* synthetic */ apmg b;
    private final /* synthetic */ int c;

    public /* synthetic */ abnk(abns abnsVar, apmg apmgVar, int i) {
        this.c = i;
        this.a = abnsVar;
        this.b = apmgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c == 0) {
            abns abnsVar = this.a;
            abnsVar.k.e(this.b);
            return;
        }
        abns abnsVar2 = this.a;
        apmg apmgVar = this.b;
        if ((apmgVar.b & 16384) != 0) {
            abjl abjlVar = abnsVar2.k;
            apxf apxfVar = apmgVar.o;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            abjlVar.h(apxfVar);
        }
        if ((apmgVar.b & 8192) != 0) {
            abjl abjlVar2 = abnsVar2.k;
            apxf apxfVar2 = apmgVar.n;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            abjlVar2.h(apxfVar2);
        }
        if ((apmgVar.b & 32768) != 0) {
            abjl abjlVar3 = abnsVar2.k;
            apxf apxfVar3 = apmgVar.p;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            abjlVar3.h(apxfVar3);
        }
    }
}
