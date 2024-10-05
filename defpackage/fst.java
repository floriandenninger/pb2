package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fst implements ajom {
    private final fss a;
    private final /* synthetic */ int b;

    public fst(akht akhtVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.b = i;
        this.a = akhtVar.i(R.layout.message_item_banner);
    }

    @Override // defpackage.ajom
    public final View a() {
        if (this.b != 0) {
        }
        return this.a.a;
    }

    public fst(akht akhtVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.b = i;
        this.a = akhtVar.i(R.layout.message_item_default);
    }

    public fst(akht akhtVar, int i, char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.b = i;
        this.a = akhtVar.i(R.layout.message_item_horizontal);
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        int i = this.b;
        if (i == 0) {
            this.a.b(ajosVar);
        } else if (i != 1) {
            this.a.b(ajosVar);
        } else {
            this.a.b(ajosVar);
        }
    }

    @Override // defpackage.ajom
    public final /* synthetic */ void oB(ajok ajokVar, Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.oB(ajokVar, (fsv) obj);
        } else if (i == 1) {
            this.a.oB(ajokVar, (fsu) obj);
        } else {
            this.a.oB(ajokVar, (fsw) obj);
        }
    }
}
