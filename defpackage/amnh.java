package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amnh implements amnl {
    final /* synthetic */ ammg a;

    public amnh(ammg ammgVar) {
        this.a = ammgVar;
    }

    @Override // defpackage.amnl
    public final /* bridge */ /* synthetic */ Iterator a(amnm amnmVar, CharSequence charSequence) {
        return new amng(amnmVar, charSequence, this.a.a(charSequence));
    }
}
