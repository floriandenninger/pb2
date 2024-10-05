package defpackage;

import com.google.android.libraries.user.profile.photopicker.edit.EditActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vnq implements dbw {
    final /* synthetic */ EditActivity a;

    public vnq(EditActivity editActivity) {
        this.a = editActivity;
    }

    @Override // defpackage.dbw
    public final boolean a(csz cszVar, Object obj, dcl dclVar, boolean z) {
        vnr vnrVar = this.a.g;
        aofe c = aoff.c();
        aofg b = vlq.b(obj);
        c.copyOnWrite();
        ((aoff) c.instance).n(b);
        aofd a = vlq.a(cszVar);
        c.copyOnWrite();
        ((aoff) c.instance).m(a);
        vnrVar.b(c);
        return false;
    }

    @Override // defpackage.dbw
    public final /* bridge */ /* synthetic */ boolean ka(Object obj, Object obj2, int i) {
        vnr vnrVar = this.a.g;
        aofe c = aoff.c();
        aofg c2 = vlq.c(obj2, i);
        c.copyOnWrite();
        ((aoff) c.instance).n(c2);
        vnrVar.b(c);
        return false;
    }
}
