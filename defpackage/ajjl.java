package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajjl implements ykl {
    final /* synthetic */ Uri a;
    final /* synthetic */ afqa b;

    public ajjl(afqa afqaVar, Uri uri) {
        this.b = afqaVar;
        this.a = uri;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        zga.g("error");
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        afpz afpzVar = new afpz((byte[]) obj2, this.b.c.c());
        if (this.b.f != null) {
            zga.g("put in bitmap bytes requester cache.");
            this.b.f.d(this.a, afpzVar);
        }
        this.b.g.a().d(this.a, afpzVar);
    }
}
