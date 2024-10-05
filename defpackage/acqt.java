package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acqt extends acqq implements acrt, acrq {
    final amnv j;
    public final boolean k;
    private int m;
    private final acrs n;
    private final azrw o;
    private final azrw p;
    private final aadw q;

    public acqt(acrs acrsVar, ajkn ajknVar, ypa ypaVar, acre acreVar, acrj acrjVar, ajun ajunVar, Context context, aaea aaeaVar, aadw aadwVar, azrw azrwVar, azrw azrwVar2, byte[] bArr, byte[] bArr2) {
        this(acrsVar, ajknVar, ypaVar, acreVar, acrjVar, ajunVar, acrz.b, context, aaeaVar, aadwVar, azrwVar, azrwVar2, null, null);
    }

    private final synchronized int K() {
        int i = this.m;
        if (i == -1) {
            i = (int) ((awuv) ((ywr) this.j.get()).c()).g;
        }
        if (i >= 60000 || i < 10000) {
            i = 10000;
        }
        int i2 = i + 1;
        this.m = i2;
        ynm.m(((ywr) this.j.get()).b(new fnz(i2, 7)), abbr.g);
        return this.m;
    }

    @Override // defpackage.acqq
    protected final awav A(int i, int i2) {
        aone createBuilder = awav.a.createBuilder();
        createBuilder.copyOnWrite();
        awav awavVar = (awav) createBuilder.instance;
        awavVar.b |= 2;
        awavVar.d = i;
        if (i2 <= 0) {
            createBuilder.copyOnWrite();
            awav awavVar2 = (awav) createBuilder.instance;
            awavVar2.b |= 4;
            awavVar2.e = 0;
        } else {
            createBuilder.copyOnWrite();
            awav awavVar3 = (awav) createBuilder.instance;
            awavVar3.b |= 4;
            awavVar3.e = i2;
        }
        int K = K();
        createBuilder.copyOnWrite();
        awav awavVar4 = (awav) createBuilder.instance;
        awavVar4.b |= 8;
        awavVar4.f = K;
        return (awav) createBuilder.build();
    }

    @Override // defpackage.acqq, defpackage.acra
    public final void B(InteractionLoggingScreen interactionLoggingScreen) {
        if (interactionLoggingScreen == null) {
            return;
        }
        this.c.d(this.n, interactionLoggingScreen);
        this.c.b(interactionLoggingScreen, this.d);
    }

    @Override // defpackage.acqq, defpackage.acra
    public final acra b(acrz acrzVar) {
        acqt acqtVar = new acqt(this.n, this.h, this.a, this.b, this.c, this.i, acrzVar, this.e, this.f, this.q, this.o, this.p, null, null);
        acqtVar.B(acqtVar.c());
        return acqtVar;
    }

    @Override // defpackage.acqq, defpackage.acra, defpackage.acrq
    public final InteractionLoggingScreen c() {
        return this.c.a(this.n);
    }

    @Override // defpackage.acqq, defpackage.acra
    public final String k() {
        InteractionLoggingScreen c = c();
        return c == null ? "" : c.a;
    }

    @Override // defpackage.acqq, defpackage.acra
    public final void y() {
    }

    public acqt(acrs acrsVar, ajkn ajknVar, ypa ypaVar, acre acreVar, acrj acrjVar, ajun ajunVar, acrz acrzVar, Context context, aaea aaeaVar, aadw aadwVar, final azrw azrwVar, final azrw azrwVar2, byte[] bArr, byte[] bArr2) {
        super(ajknVar, ypaVar, acreVar, acrjVar, ajunVar, acrzVar, context, aaeaVar, null, null, null, null, null);
        this.m = -1;
        acrsVar.getClass();
        this.n = acrsVar;
        aadwVar.getClass();
        this.q = aadwVar;
        atfq atfqVar = aadwVar.b().o;
        auie auieVar = (atfqVar == null ? atfq.a : atfqVar).g;
        this.k = (auieVar == null ? auie.a : auieVar).g;
        this.j = amkq.x(new amnv() { // from class: acqs
            @Override // defpackage.amnv
            public final Object get() {
                return acqt.this.k ? (ywr) azrwVar2.get() : (ywr) azrwVar.get();
            }
        });
        this.o = azrwVar;
        this.p = azrwVar2;
    }
}
