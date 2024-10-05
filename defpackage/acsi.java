package defpackage;

import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsi implements acsl {
    private final acre a;
    private final InteractionLoggingScreen b;
    private final ajun c;
    private final ajoy d;

    public acsi(acre acreVar, ajoy ajoyVar, ajun ajunVar, InteractionLoggingScreen interactionLoggingScreen, byte[] bArr, byte[] bArr2) {
        this.a = acreVar;
        this.d = ajoyVar;
        this.c = ajunVar;
        this.b = interactionLoggingScreen;
    }

    @Override // defpackage.acsl
    public final /* bridge */ /* synthetic */ acsm f(acsa acsaVar) {
        this.a.b(this.b, acsaVar.a);
        return this.d.s(this.b);
    }

    @Override // defpackage.acsl
    public final /* bridge */ /* synthetic */ acsm g(acsa acsaVar, acsa acsaVar2) {
        this.a.c(this.b, acsaVar.a, acsaVar2.a);
        return this.d.s(this.b);
    }

    @Override // defpackage.acsl
    public final apxf h(apxf apxfVar) {
        return adyu.cn(this.c, this.b, apxfVar);
    }

    @Override // defpackage.acsl
    public final void t() {
        this.a.f(this.b);
    }
}
