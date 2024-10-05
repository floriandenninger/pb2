package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afqv extends afra implements afrh {
    public static final Long e(ysq ysqVar) {
        h(ysqVar);
        String a = ysqVar.c.a("Content-Range");
        if (a == null) {
            throw new zjg("Missing content range header");
        }
        int lastIndexOf = a.lastIndexOf("/") + 1;
        if (lastIndexOf <= 0 || lastIndexOf >= a.length()) {
            throw new zjg("Invalid content range header");
        }
        try {
            return Long.valueOf(Long.parseLong(a.substring(lastIndexOf)));
        } catch (NumberFormatException e) {
            throw new zjg(e);
        }
    }

    @Override // defpackage.afrh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ysk c(Uri uri) {
        uri.getClass();
        ysj b = ysk.b(uri.toString());
        b.b("Range", "bytes=0-1");
        return b.a();
    }

    @Override // defpackage.afra, defpackage.afri
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return e((ysq) obj);
    }

    @Override // defpackage.afra
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object b(ysq ysqVar) {
        return e(ysqVar);
    }
}
