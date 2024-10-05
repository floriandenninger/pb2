package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hrp implements akvt {
    private static void c(String str) {
        String valueOf = String.valueOf(str);
        afsi.b(2, 6, valueOf.length() != 0 ? "[ShortsCreation][Android][Upload]".concat(valueOf) : new String("[ShortsCreation][Android][Upload]"));
    }

    @Override // defpackage.akvt
    public final void a(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
        sb.append("Current executing flow failed for ");
        sb.append(str);
        sb.append(".");
        c(sb.toString());
    }

    @Override // defpackage.akvt
    public final void b(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
        sb.append("Upload creation failed for ");
        sb.append(str);
        sb.append(".");
        c(sb.toString());
    }
}
