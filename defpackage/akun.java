package defpackage;

import android.graphics.Bitmap;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class akun implements anfz {
    public final /* synthetic */ akux a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ akun(akux akuxVar, String str, int i) {
        this.c = i;
        this.a = akuxVar;
        this.b = str;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.c == 0) {
            akux akuxVar = this.a;
            String str = this.b;
            ammv ammvVar = (ammv) obj;
            if (ammvVar.h() && !((akve) ammvVar.c()).n) {
                akzh a = akzi.a(str);
                a.d = ((akve) ammvVar.c()).b;
                Bitmap bitmap = ((akve) ammvVar.c()).h;
                if (bitmap != null) {
                    a.b = bitmap;
                }
                akze akzeVar = (akze) akuxVar.j.get();
                akzeVar.d.execute(new akyt(akzeVar, a.a(), 2));
            }
            return anaf.O(ammvVar);
        }
        akux akuxVar2 = this.a;
        String str2 = this.b;
        Pair pair = (Pair) obj;
        akve akveVar = (akve) pair.first;
        if (akveVar == null) {
            return anaf.O(amlr.a);
        }
        ammv ammvVar2 = (ammv) pair.second;
        if (!ammvVar2.h()) {
            return anaf.O(ammv.j(akveVar));
        }
        akuxVar2.A(str2, (akyc) ammvVar2.c());
        akzs akzsVar = ((akyc) ammvVar2.c()).b;
        akzsVar.getClass();
        return anaf.O(ammv.j(akuxVar2.a(akzsVar)));
    }
}
