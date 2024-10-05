package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kxh implements ajoq {
    private final azrw a;
    private final /* synthetic */ int b;

    public kxh(azrw azrwVar, int i) {
        this.b = i;
        this.a = azrwVar;
    }

    public kxh(azrw azrwVar, int i, byte[] bArr) {
        this.b = i;
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public kxh(azrw azrwVar, int i, char[] cArr) {
        this.b = i;
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public kxh(azrw azrwVar, int i, short[] sArr) {
        this.b = i;
        azrwVar.getClass();
        this.a = azrwVar;
    }

    @Override // defpackage.ajoq
    public final /* synthetic */ ajom b(ViewGroup viewGroup) {
        int i = this.b;
        if (i == 0) {
            return (kxj) this.a.get();
        }
        if (i == 1) {
            return (esi) this.a.get();
        }
        if (i == 2) {
            return (kxu) this.a.get();
        }
        if (i == 3) {
            Context context = (Context) this.a.get();
            context.getClass();
            return new lfv(context, viewGroup, 0);
        }
        if (i == 4) {
            return new mqj((ajnt) this.a.get());
        }
        Context context2 = (Context) this.a.get();
        context2.getClass();
        viewGroup.getClass();
        return new akgx(context2);
    }
}
