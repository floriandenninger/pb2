package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kiw implements fng, ahto {
    private CharSequence A;
    public final acra a;
    public final Resources b;
    public final Rect c;
    public final aahd d;
    public boolean e;
    public boolean f;
    public CharSequence g;
    public CharSequence h;
    public CharSequence i;
    public final yzr j;
    public final yzr k;
    public final yzr l;
    public final yzr m;
    public final yzr n;
    private final ayqw o = new ayqw();
    private final int p;
    private final ahtp q;
    private final boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private boolean w;
    private CharSequence x;
    private boolean y;
    private StringBuilder z;

    public kiw(yzr yzrVar, yzr yzrVar2, yzr yzrVar3, yzr yzrVar4, yzr yzrVar5, ahtp ahtpVar, final khz khzVar, final acra acraVar, aahd aahdVar, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        this.j = yzrVar3;
        this.k = yzrVar;
        this.l = yzrVar2;
        this.m = yzrVar4;
        this.n = yzrVar5;
        this.a = acraVar;
        this.d = aahdVar;
        Resources resources = ((TextView) yzrVar.b).getResources();
        this.b = resources;
        this.c = new Rect();
        this.q = ahtpVar;
        this.p = resources.getDimensionPixelSize(R.dimen.player_live_video_current_time_right_margin);
        this.r = axzgVar.b().booleanValue();
        this.s = true;
        this.v = 0;
        yzrVar3.a(this.u, false);
        jw.M(yzrVar4.b, new kiv(this));
        yzrVar4.b.setOnClickListener(new View.OnClickListener() { // from class: kis
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kiw kiwVar = kiw.this;
                khz khzVar2 = khzVar;
                acra acraVar2 = acraVar;
                kiwVar.f = !kiwVar.f;
                kiwVar.h();
                khzVar2.m();
                aone createBuilder = asht.a.createBuilder();
                aone createBuilder2 = asia.a.createBuilder();
                boolean z = kiwVar.f;
                createBuilder2.copyOnWrite();
                asia asiaVar = (asia) createBuilder2.instance;
                asiaVar.b |= 1;
                asiaVar.c = z;
                createBuilder.copyOnWrite();
                asht ashtVar = (asht) createBuilder.instance;
                asia asiaVar2 = (asia) createBuilder2.build();
                asiaVar2.getClass();
                ashtVar.v = asiaVar2;
                ashtVar.c |= 4096;
                acraVar2.I(3, new acqx(acsb.c(86640)), (asht) createBuilder.build());
            }
        });
        ahtpVar.i(ahyo.CHAPTER, this);
        m(ahtpVar.a(ahyo.CHAPTER));
    }

    private final void l() {
        if (p()) {
            ((TextView) this.k.b).setText((CharSequence) null);
        }
    }

    private final void m(TimelineMarker timelineMarker) {
        TimelineMarker[] m = this.q.m(ahyo.CHAPTER);
        CharSequence charSequence = null;
        if (m != null && m.length > 0) {
            charSequence = this.b.getString(R.string.open_chapters_list);
        }
        if (timelineMarker != null) {
            charSequence = timelineMarker.e;
        }
        if (TextUtils.equals(charSequence, this.A)) {
            return;
        }
        this.A = charSequence;
        o(true);
    }

    private final void n(boolean z, boolean z2) {
        if (this.s == z) {
            return;
        }
        this.s = z;
        yzr yzrVar = this.j;
        boolean z3 = false;
        if (z && this.u) {
            z3 = true;
        }
        yzrVar.a(z3, z2);
        j(z2);
    }

    private final void o(boolean z) {
        boolean isEmpty = TextUtils.isEmpty(this.A);
        boolean z2 = false;
        if (!this.e && this.s && this.t && !isEmpty) {
            z2 = true;
        }
        if (z2 || isEmpty) {
            ((TextView) this.n.b).setText(this.A);
        }
        this.n.a(z2, z);
    }

    private final boolean p() {
        return this.u && this.v == 1;
    }

    private static boolean q(CharSequence charSequence, CharSequence charSequence2) {
        return TextUtils.equals(charSequence, charSequence2) || (TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(charSequence2));
    }

    @Override // defpackage.fng
    public final void a(boolean z) {
        n(false, z);
    }

    @Override // defpackage.ahto
    public final /* synthetic */ void b(ahyo ahyoVar) {
    }

    @Override // defpackage.fng
    public final void c(boolean z) {
        if (this.u == z) {
            return;
        }
        this.u = z;
        this.j.k(true != z ? 8 : 4);
        this.j.a(this.s && this.u, false);
        j(false);
        l();
        this.m.b.setClickable(!this.u);
        if (this.u) {
            return;
        }
        yny.z(this.k.b, yny.u(0), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.fng
    public final void d(boolean z) {
        if (this.t == z) {
            return;
        }
        this.t = z;
        j(false);
    }

    @Override // defpackage.fng
    public final void e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        if (!TextUtils.equals(this.x, charSequence3) || this.y != this.u) {
            this.x = charSequence3;
            this.y = this.u;
            if (this.z == null) {
                this.z = new StringBuilder();
            }
            StringBuilder sb = this.z;
            sb.delete(0, sb.length());
            if (this.y) {
                this.z.append('-');
            }
            this.z.append(charSequence3);
            TextView textView = (TextView) this.l.b;
            textView.setText(this.z);
            textView.setMinimumWidth(0);
            textView.measure(0, 0);
            ((TextView) this.l.b).setMinimumWidth(textView.getMeasuredWidth());
        }
        this.g = charSequence;
        this.h = charSequence2;
        this.i = charSequence3;
        h();
        String string = this.b.getString(R.string.total_time, charSequence3);
        if (q(string, ((TextView) this.l.b).getText())) {
            return;
        }
        ((TextView) this.l.b).setText(string);
    }

    @Override // defpackage.fng
    public final void f(boolean z) {
        n(true, z);
    }

    @Override // defpackage.fng
    public final void g(boolean z) {
        int i = ((!p() || this.w) && true != z) ? 2 : 1;
        if (this.v == i) {
            return;
        }
        this.v = i;
        TextView textView = (TextView) this.j.b;
        jm.u(textView, aii.a(textView.getContext(), this.v == 1 ? R.drawable.player_live_dot : R.drawable.player_notlive_dot), null, null);
        l();
        yny.z(this.k.b, yny.u(true == this.u ? p() ? 0 : this.p : 0), ViewGroup.MarginLayoutParams.class);
    }

    public final void h() {
        CharSequence charSequence;
        if (p()) {
            charSequence = null;
        } else {
            charSequence = this.f ? this.b.getString(R.string.remaining_time, this.h) : this.g;
        }
        if (q(charSequence, ((TextView) this.k.b).getText())) {
            return;
        }
        ((TextView) this.k.b).setText(charSequence);
    }

    public final void i(aypy aypyVar) {
        this.o.c();
        this.o.d(aypyVar.ax(new kpv(this, 1)));
    }

    public final void j(boolean z) {
        boolean z2 = this.s;
        boolean z3 = false;
        boolean z4 = z2 && this.t;
        boolean z5 = z2 && this.t && !this.u;
        boolean z6 = z2 && this.u;
        if ((z4 || z6) && k()) {
            z3 = true;
        }
        this.m.a(z3, z);
        this.a.n(new acqx(acsb.c(86640)));
        this.l.k(true != this.u ? 4 : 8);
        this.k.a(z4, z);
        this.l.a(z5, z);
        o(z);
    }

    public final boolean k() {
        return (this.e && this.r) ? false : true;
    }

    @Override // defpackage.ahto
    public final void nr(ahyo ahyoVar, boolean z) {
        if (ahyoVar != ahyo.CHAPTER) {
            return;
        }
        m(this.q.a(ahyo.CHAPTER));
    }

    @Override // defpackage.ahto
    public final void nx(TimelineMarker timelineMarker, TimelineMarker timelineMarker2, ahyo ahyoVar, int i) {
        if (ahyoVar != ahyo.CHAPTER) {
            return;
        }
        m(timelineMarker2);
    }

    @Override // defpackage.fng
    public final void ny(boolean z) {
        if (this.w == z) {
            return;
        }
        this.w = z;
        ((TextView) this.j.b).setClickable(z);
    }
}
