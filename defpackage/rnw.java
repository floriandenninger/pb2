package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class rnw implements qqu {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ rnw(String str, String str2, int i) {
        this.c = i;
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.qqu
    public final void a(Object obj, Object obj2) {
        if (this.c == 0) {
            String str = this.a;
            String str2 = this.b;
            roa roaVar = new roa((rpv) obj2);
            rob robVar = (rob) ((roc) obj).D();
            Parcel pn = robVar.pn();
            ecr.i(pn, roaVar);
            pn.writeString("com.youtube.mainapp.android");
            pn.writeString(null);
            pn.writeString(str);
            pn.writeString(str2);
            robVar.pp(23, pn);
            return;
        }
        String str3 = this.a;
        String str4 = this.b;
        roa roaVar2 = new roa((rpv) obj2);
        rob robVar2 = (rob) ((roc) obj).D();
        Parcel pn2 = robVar2.pn();
        ecr.i(pn2, roaVar2);
        pn2.writeString(str3);
        pn2.writeString(str4);
        pn2.writeString(null);
        robVar2.pp(11, pn2);
    }
}
