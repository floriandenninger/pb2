package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahhr extends ahga {
    public boolean e;
    public boolean f;
    public boolean g;
    public String h;
    public String i;
    private final Resources j;
    private final ahjp k;
    private final ahgd m;
    private final ahjr n;
    private final ahif o;

    public ahhr(Resources resources, azrw azrwVar, azrw azrwVar2, ahjl ahjlVar, ahkv ahkvVar, ahma ahmaVar, byte[] bArr) {
        super(new ahhp(ahkvVar.clone(), 0.0f, 0.0f));
        this.j = resources;
        Bitmap d = ahkt.d(resources, R.raw.vr_hq);
        float a = ahkt.a(d.getWidth());
        float a2 = ahkt.a(d.getHeight());
        ahjp ahjpVar = new ahjp(d, ahku.a(a, a2, ahku.c), ahkvVar.clone(), azrwVar);
        this.k = ahjpVar;
        ahif ahifVar = new ahif(ahjpVar, 0.5f, 1.0f);
        this.o = ahifVar;
        ahjpVar.a(ahifVar);
        ahku a3 = ahku.a(a, ahiq.c, ahku.c);
        ahgd ahgdVar = new ahgd(a3, ahkvVar.clone(), ahgd.s(ahgd.h(-1695465), a3.f), azrwVar2);
        this.m = ahgdVar;
        ahgdVar.l(0.0f, ((-a2) * 7.0f) / 12.0f, 0.0f);
        ahgdVar.c(new ahil(ahgdVar, new float[]{0.0f, 1.0f, 1.0f}, new float[]{1.0f, 1.0f, 1.0f}));
        ahjr ahjrVar = new ahjr(ahjlVar, ahkvVar.clone(), azrwVar2, ahjpVar, (a2 + a2) / 3.0f);
        this.n = ahjrVar;
        n(ahjpVar);
        n(ahgdVar);
        n(ahjrVar);
        m(a, a2);
        ((ahga) this).c = new ahhq(this, ahmaVar, null);
        a();
    }

    public final void a() {
        String str;
        boolean z = this.e || this.g;
        this.f = z;
        this.o.a = true != z ? 0.5f : 1.0f;
        ahgd ahgdVar = this.m;
        boolean z2 = this.g;
        ahgdVar.h = z2;
        if (!z ? (str = this.h) == null : (str = this.i) == null) {
            str = "";
        }
        this.n.a.y(this.j.getString(true != z2 ? R.string.vr_auto_quality_tooltip : R.string.vr_highest_quality_tooltip, str));
    }
}
