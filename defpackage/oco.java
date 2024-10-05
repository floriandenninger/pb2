package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oco extends odc {
    private final float b;
    private final int c;
    private int k;

    public /* synthetic */ oco(Context context, obp obpVar, obp obpVar2, float f, int i) {
        super(obpVar, obpVar2);
        this.c = aih.d(context, R.color.yt_black2);
        this.b = f;
        this.k = i;
        b();
    }

    @Override // defpackage.ocy, defpackage.obp
    public final ammv I() {
        return ammv.j(Integer.valueOf(this.c));
    }

    @Override // defpackage.odc
    public final void b() {
        obp obpVar = this.d;
        obpVar.getClass();
        this.e.getClass();
        fav.z(obpVar.v(), 0.95f, this.g);
        this.g.offset(0, (int) (this.k * this.b));
        this.f.set(this.g);
        this.h.set(this.e.r());
        this.h.offsetTo(this.f.left, this.f.bottom);
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float l() {
        return 0.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float m() {
        return 0.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float n() {
        return 0.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float o() {
        return 0.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float p() {
        return 1.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float q() {
        return 0.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final void z(int i, int i2) {
        this.k = i2;
        b();
    }
}
