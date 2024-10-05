package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alwo implements alwq {
    private final ci a;
    private aae b;
    private aae c;
    private final ames d;

    public alwo(ci ciVar, ames amesVar) {
        this.a = ciVar;
        this.d = amesVar;
    }

    @Override // defpackage.alwq
    public final Intent a() {
        return this.a.getIntent();
    }

    @Override // defpackage.alwq
    public final aae b() {
        return this.c;
    }

    @Override // defpackage.alwq
    public final aae c() {
        return this.b;
    }

    @Override // defpackage.alwq
    public final void d(aac aacVar, aac aacVar2) {
        this.b = this.a.registerForActivityResult(new aap(), aacVar);
        this.c = this.a.registerForActivityResult(new aap(), aacVar2);
    }

    @Override // defpackage.alwq
    public final boolean e() {
        return this.a.isChangingConfigurations();
    }

    @Override // defpackage.alwq
    public final boolean f() {
        return this.a.isFinishing();
    }

    @Override // defpackage.alwq
    public final boolean g() {
        return this.d.b().Y();
    }
}
