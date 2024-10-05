package defpackage;

import com.google.android.libraries.youtube.mdx.model.AppStatus;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acye implements ykl {
    final /* synthetic */ adns a;

    public acye(adns adnsVar) {
        this.a = adnsVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        zga.f(acyg.a, "error updating AppStatus.", exc);
        this.a.a(AppStatus.d(-2));
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        this.a.a((AppStatus) obj2);
    }
}
