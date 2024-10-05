package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amnf implements amnl {
    final /* synthetic */ String a;

    public amnf(String str) {
        this.a = str;
    }

    @Override // defpackage.amnl
    public final /* bridge */ /* synthetic */ Iterator a(amnm amnmVar, CharSequence charSequence) {
        return new amne(this, amnmVar, charSequence);
    }
}
