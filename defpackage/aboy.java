package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aboy extends abol implements abov {
    public Editable A;
    private final View B;
    private final EditText C;
    private final boolean D;
    public final abow y;
    public asqx z;

    public aboy(Context context, ajjz ajjzVar, ajut ajutVar, aahd aahdVar, abjr abjrVar, abji abjiVar, zim zimVar, ajsa ajsaVar, acpk acpkVar, abow abowVar, aoae aoaeVar, akcy akcyVar, axze axzeVar, adyu adyuVar, advq advqVar, View view, final boolean z, acra acraVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super(context, ajjzVar, ajutVar, aahdVar, abjrVar, abjiVar, ajsaVar, acpkVar, zimVar, aoaeVar, akcyVar, axzeVar, advqVar, view, !z, false, acraVar, null, null, null, null, null, null);
        this.y = abowVar;
        this.D = z;
        if (!abowVar.c.contains(this)) {
            abowVar.c.add(this);
        }
        EditText r = r();
        r.getClass();
        this.C = r;
        View l = l();
        l.getClass();
        this.B = l;
        r.setOnClickListener(new View.OnClickListener() { // from class: abox
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                aboy aboyVar = aboy.this;
                boolean z2 = z;
                abib abibVar = aboyVar.u;
                if (abibVar != null) {
                    abibVar.a();
                }
                aboyVar.y.k(aboyVar.z, aboyVar.A, false, z2);
                aboyVar.l().setVisibility(8);
            }
        });
        r.setFocusable(false);
        l.setVisibility(0);
    }

    @Override // defpackage.abns
    public final void C() {
        super.C();
        this.A = null;
    }

    @Override // defpackage.abns
    protected final void I() {
        abow abowVar = this.y;
        if (abowVar != null) {
            abowVar.k(this.z, this.A, true, this.D);
            l().setVisibility(8);
        }
    }

    @Override // defpackage.abns
    protected final boolean J() {
        return this.D;
    }

    @Override // defpackage.abov
    public final void a(Editable editable) {
        if (this.y != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable);
            this.B.setVisibility(0);
            this.A = spannableStringBuilder;
            if (this.D) {
                this.C.setHint(i());
            } else {
                this.C.setText(editable);
            }
        }
    }

    @Override // defpackage.abns, defpackage.abjn
    public final void c() {
        super.c();
        this.A = null;
    }

    @Override // defpackage.abns, defpackage.abjn
    public final void d(asqx asqxVar) {
        super.d(asqxVar);
        this.z = asqxVar;
        this.y.j();
    }

    @Override // defpackage.abns, defpackage.abjn
    public final void f() {
        super.f();
        abow abowVar = this.y;
        abowVar.b.setText((CharSequence) null);
        abowVar.i = false;
        abowVar.j();
        this.A = null;
    }

    @Override // defpackage.abns
    protected final Spanned i() {
        return !TextUtils.isEmpty(this.A) ? this.A : this.n;
    }

    @Override // defpackage.abns
    protected final void y(asrf asrfVar) {
        if (this.D) {
            D(false);
        } else {
            super.y(asrfVar);
        }
    }

    @Override // defpackage.abns
    protected final void z(atdn atdnVar) {
        if (this.D) {
            D(false);
        } else {
            super.z(atdnVar);
        }
    }
}
