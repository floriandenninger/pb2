package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ldu implements ajoq {
    private final azrw a;
    private final azrw b;
    private final /* synthetic */ int c;

    public ldu(azrw azrwVar, azrw azrwVar2, int i, byte[] bArr) {
        this.c = i;
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
    }

    public ldu(azrw azrwVar, azrw azrwVar2, int i) {
        this.c = i;
        azrwVar.getClass();
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public ldu(azrw azrwVar, azrw azrwVar2, int i, char[] cArr) {
        this.c = i;
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }

    public ldu(azrw azrwVar, azrw azrwVar2, int i, short[] sArr) {
        this.c = i;
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
    }

    public ldu(azrw azrwVar, azrw azrwVar2, int i, int[] iArr) {
        this.c = i;
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }

    public ldu(azrw azrwVar, azrw azrwVar2, int i, boolean[] zArr) {
        this.c = i;
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
    }

    @Override // defpackage.ajoq
    public final /* synthetic */ ajom b(ViewGroup viewGroup) {
        switch (this.c) {
            case 0:
                Activity activity = (Activity) this.a.get();
                activity.getClass();
                ajjz ajjzVar = (ajjz) this.b.get();
                ajjzVar.getClass();
                return new ldt(activity, ajjzVar, viewGroup);
            case 1:
                Context context = (Context) ((axqs) this.b).a;
                context.getClass();
                aahd aahdVar = (aahd) this.a.get();
                aahdVar.getClass();
                return new laa(context, aahdVar, viewGroup);
            case 2:
                Context context2 = (Context) this.a.get();
                context2.getClass();
                ypa ypaVar = (ypa) this.b.get();
                ypaVar.getClass();
                viewGroup.getClass();
                return new lfi(context2, ypaVar, viewGroup);
            case 3:
                Context context3 = (Context) this.b.get();
                context3.getClass();
                aahd aahdVar2 = (aahd) this.a.get();
                aahdVar2.getClass();
                viewGroup.getClass();
                return new lfl(context3, aahdVar2, viewGroup);
            case 4:
                Context context4 = (Context) this.a.get();
                context4.getClass();
                ajos ajosVar = (ajos) this.b.get();
                ajosVar.getClass();
                return new lpv(context4, ajosVar, viewGroup);
            case 5:
                Context context5 = (Context) this.b.get();
                context5.getClass();
                aahd aahdVar3 = (aahd) this.a.get();
                aahdVar3.getClass();
                viewGroup.getClass();
                return new mrw(context5, aahdVar3);
            case 6:
                Context context6 = (Context) ((axqs) this.b).a;
                context6.getClass();
                aahd aahdVar4 = (aahd) this.a.get();
                aahdVar4.getClass();
                viewGroup.getClass();
                return new nhp(context6, aahdVar4, viewGroup);
            case 7:
                Context context7 = (Context) ((axqs) this.a).a;
                context7.getClass();
                ajjz ajjzVar2 = (ajjz) this.b.get();
                ajjzVar2.getClass();
                viewGroup.getClass();
                return new yiq(context7, ajjzVar2, R.layout.sponsorships_header_layout, viewGroup);
            case 8:
                Context context8 = (Context) ((axqs) this.b).a;
                context8.getClass();
                aahd aahdVar5 = (aahd) this.a.get();
                aahdVar5.getClass();
                viewGroup.getClass();
                return new yis(context8, aahdVar5, viewGroup);
            default:
                Context context9 = (Context) this.a.get();
                context9.getClass();
                ajut ajutVar = (ajut) this.b.get();
                ajutVar.getClass();
                viewGroup.getClass();
                return new akgu(context9, ajutVar);
        }
    }

    public ldu(azrw azrwVar, azrw azrwVar2, int i, float[] fArr) {
        this.c = i;
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
    }

    public ldu(azrw azrwVar, azrw azrwVar2, int i, byte[][] bArr) {
        this.c = i;
        azrwVar.getClass();
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public ldu(azrw azrwVar, azrw azrwVar2, int i, char[][] cArr) {
        this.c = i;
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
    }

    public ldu(azrw azrwVar, azrw azrwVar2, int i, short[][] sArr) {
        this.c = i;
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }
}
