package defpackage;

import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ict implements amml {
    public final /* synthetic */ ida a;
    private final /* synthetic */ int b;

    public /* synthetic */ ict(ida idaVar, int i) {
        this.b = i;
        this.a = idaVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b != 0) {
            ida idaVar = this.a;
            if (!((idr) obj).c) {
                akcy akcyVar = idaVar.h;
                akci a = akcj.a();
                a.a = idaVar.k;
                a.b = idaVar.b.getResources().getText(R.string.mentions_in_text_hint);
                a.i(1);
                a.c(2);
                a.g(-1);
                a.h(0.5f);
                akcyVar.c(a.a());
                return true;
            }
            return false;
        }
        ida idaVar2 = this.a;
        idr idrVar = (idr) obj;
        if (idrVar == null) {
            return null;
        }
        int i = idrVar.g;
        int i2 = idrVar.h;
        int i3 = idrVar.i;
        axch b = axch.b(idrVar.j);
        ArrayList arrayList = new ArrayList();
        idaVar2.h(true);
        if (b == null) {
            b = axch.FONT_FAMILY_UNSPECIFIED;
        }
        idaVar2.e(i3, b, 36.0f, "", i, i2, arrayList);
        return null;
    }
}
