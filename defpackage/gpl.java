package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gpl extends algb {
    final /* synthetic */ gpo a;

    public gpl(gpo gpoVar) {
        this.a = gpoVar;
    }

    private final void c(int i) {
        aone createBuilder = awfe.a.createBuilder();
        createBuilder.copyOnWrite();
        ((awfe) createBuilder.instance).b = i - 2;
        awfe awfeVar = (awfe) createBuilder.build();
        acpl acplVar = this.a.ak;
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).em(awfeVar);
        acplVar.c((arpp) a.build());
    }

    @Override // defpackage.algb
    public final void b(View view, int i) {
        if (i == 5) {
            c(5);
        } else if (i == 3) {
            c(3);
        } else if (i == 6) {
            c(4);
        }
    }

    @Override // defpackage.algb
    public final void mx(View view, float f) {
    }
}
