package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class smz {
    public final /* synthetic */ String a;
    public final /* synthetic */ ayue b;

    public smz(String str, ayue ayueVar) {
        this.a = str;
        this.b = ayueVar;
    }

    public final void a(String str, int i) {
        if (this.b.e()) {
            return;
        }
        ayue ayueVar = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 52);
        sb.append("Progress failed on ID: ");
        sb.append(str);
        sb.append(" with error code: ");
        sb.append(i);
        ayueVar.c(new Throwable(sb.toString()));
    }
}
