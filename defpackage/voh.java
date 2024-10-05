package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class voh extends apm {
    public static final amxj a = amxj.l("com/google/android/libraries/user/profile/photopicker/edit/viewmodel/EditViewModel");
    public static final aoff b;
    public final anib c;
    public final voe d;
    public final amnp e;
    public final aow f;
    public final AtomicBoolean g;
    public final wki h;
    public final aloh i;

    static {
        aofe c = aoff.c();
        aone createBuilder = aofl.a.createBuilder();
        awzb awzbVar = awzb.OBAKE_LOCAL_IO_SAVE_EDITED_PHOTO;
        createBuilder.copyOnWrite();
        aofl aoflVar = (aofl) createBuilder.instance;
        aoflVar.c = awzbVar.K;
        aoflVar.b |= 1;
        c.copyOnWrite();
        ((aoff) c.instance).p((aofl) createBuilder.build());
        b = (aoff) c.build();
    }

    public voh(wki wkiVar, anib anibVar, aloh alohVar, amnp amnpVar, byte[] bArr, byte[] bArr2) {
        voi a2 = voj.a();
        a2.b = 1;
        this.f = new aow(a2.a());
        this.g = new AtomicBoolean(false);
        this.h = wkiVar;
        this.c = anibVar;
        this.i = alohVar;
        this.d = new voe();
        this.e = amnpVar;
    }
}
