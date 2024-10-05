package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpa implements ajoq {
    private final Context a;
    private final amnv b;
    private final ajjz c;
    private final aahd d;
    private final ajuw e;
    private final shf f;
    private final lsb g;
    private final aaea h;
    private final ohg i;
    private final c j;
    private final ajoy k;

    public mpa(Context context, amnv amnvVar, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, shf shfVar, lsb lsbVar, ohg ohgVar, aaea aaeaVar, ajoy ajoyVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.a = context;
        this.b = amnvVar;
        this.c = ajjzVar;
        this.d = aahdVar;
        this.e = ajuwVar;
        this.f = shfVar;
        this.g = lsbVar;
        this.i = ohgVar;
        this.h = aaeaVar;
        this.k = ajoyVar;
        this.j = cVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ajop, java.lang.Object] */
    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new mpb(this.a, this.c, this.b.get(), this.d, this.e, this.f, viewGroup, this.g, this.i, this.h, this.k, this.j, null, null, null, null, null, null);
    }
}
