package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amnd implements amnl {
    final /* synthetic */ ammd a;

    public amnd(ammd ammdVar) {
        this.a = ammdVar;
    }

    @Override // defpackage.amnl
    public final /* bridge */ /* synthetic */ Iterator a(amnm amnmVar, CharSequence charSequence) {
        return new amnc(this, amnmVar, charSequence);
    }
}
