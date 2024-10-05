package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayig extends aycr {
    @Override // defpackage.aycl
    public final /* bridge */ /* synthetic */ aycq a(URI uri, aycj aycjVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        path.getClass();
        amkq.L(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        String substring = path.substring(1);
        uri.getAuthority();
        return new ayif(substring, aycjVar, ayiu.l, amnp.c(), ayaw.b(getClass().getClassLoader()));
    }

    @Override // defpackage.aycl
    public final String b() {
        return "dns";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aycr
    public final void c() {
    }

    @Override // defpackage.aycr
    public final void d() {
    }
}
