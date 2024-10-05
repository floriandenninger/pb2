package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afqw extends afra implements afrh {
    public static final Long a(ysq ysqVar) {
        h(ysqVar);
        String a = ysqVar.c.a("Content-Length");
        if (a == null) {
            throw new zjg("Missing content length header");
        }
        try {
            return Long.valueOf(Long.parseLong(a));
        } catch (NumberFormatException e) {
            throw new zjg(e);
        }
    }

    @Override // defpackage.afra, defpackage.afri
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return a((ysq) obj);
    }

    @Override // defpackage.afrh
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        Uri uri = (Uri) obj;
        uri.getClass();
        String uri2 = uri.toString();
        ysj a = ysk.a();
        a.c = 5;
        a.a = uri2;
        return a.a();
    }

    @Override // defpackage.afra
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object b(ysq ysqVar) {
        return a(ysqVar);
    }
}
