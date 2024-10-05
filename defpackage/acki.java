package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acki implements ajvb {
    private final Activity a;
    private final aahd b;
    private final ajut c;
    private final ajos d;
    private ackg e;

    public acki(ci ciVar, aahd aahdVar, acfh acfhVar) {
        ciVar.getClass();
        this.a = ciVar;
        aahdVar.getClass();
        this.b = aahdVar;
        acfhVar.getClass();
        this.c = acfhVar;
        this.d = new ajnq();
    }

    @Override // defpackage.ajvb
    public final void a(Class cls) {
        if (atda.class.isAssignableFrom(cls)) {
            this.d.f(atda.class, b());
        }
    }

    public final ackg b() {
        if (this.e == null) {
            this.e = new ackg(this.a, this.b, this.c);
        }
        return this.e;
    }

    @Override // defpackage.amnv
    public final /* synthetic */ Object get() {
        return this.d;
    }
}
