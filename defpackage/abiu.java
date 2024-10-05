package defpackage;

import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abiu implements abgd, abij, afwx {
    private String a;
    private asrh b;
    private ajsa c;
    private final abht d;
    private final abge e;
    private final zaw f;
    private final String g;
    private abqe h;
    private abqa i;
    private TextView j;

    public abiu(abht abhtVar, abge abgeVar, zaw zawVar, ajsa ajsaVar, asrh asrhVar, String str, abqe abqeVar, abqa abqaVar, TextView textView) {
        this.d = abhtVar;
        this.e = abgeVar;
        this.f = zawVar;
        this.c = ajsaVar;
        this.b = asrhVar;
        this.g = str;
        this.h = abqeVar;
        this.i = abqaVar;
        this.j = textView;
    }

    public abiu(abht abhtVar, abge abgeVar, zaw zawVar, String str, String str2) {
        this.d = abhtVar;
        this.e = abgeVar;
        this.f = zawVar;
        this.a = str;
        this.g = str2;
    }

    @Override // defpackage.abij
    public final abgd d() {
        return this;
    }

    @Override // defpackage.abgd
    public final abgi e() {
        abht abhtVar = this.d;
        if (abhtVar != null) {
            return abhtVar.k;
        }
        return null;
    }

    @Override // defpackage.abgd
    public final abgk f() {
        abht abhtVar = this.d;
        if (abhtVar != null) {
            return abhtVar.b;
        }
        return null;
    }

    @Override // defpackage.abgd
    public final abgm g() {
        abht abhtVar = this.d;
        if (abhtVar != null) {
            return abhtVar;
        }
        return null;
    }

    @Override // defpackage.abgd
    public final abgo h() {
        abht abhtVar = this.d;
        if (abhtVar != null) {
            return abhtVar.l;
        }
        return null;
    }

    @Override // defpackage.abgd
    public final abgs i() {
        abht abhtVar = this.d;
        if (abhtVar != null) {
            return abhtVar.o();
        }
        return null;
    }

    @Override // defpackage.abgd
    public final abha k() {
        abht abhtVar = this.d;
        if (abhtVar != null) {
            return abhtVar.d;
        }
        return null;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.f.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        aspb aspbVar;
        asav asavVar = (asav) obj;
        if (this.d == null) {
            return;
        }
        abqa abqaVar = this.i;
        if (abqaVar != null) {
            abqaVar.n(false);
        }
        abqe abqeVar = this.h;
        if (abqeVar != null && (asavVar.b & 4) == 0) {
            abqeVar.p();
        }
        this.e.a(asavVar.d, this, true);
        asat asatVar = asavVar.e;
        if (asatVar == null) {
            asatVar = asat.a;
        }
        if (asatVar.b == 136403337) {
            asat asatVar2 = asavVar.e;
            if (asatVar2 == null) {
                asatVar2 = asat.a;
            }
            if (asatVar2.b == 136403337) {
                aspbVar = (aspb) asatVar2.c;
            } else {
                aspbVar = aspb.a;
            }
            aqyg aqygVar = aspbVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            whu.G(this.j, ajcq.b(aqygVar));
        }
    }

    @Override // defpackage.abgd
    public final Object l(String str) {
        ajsa ajsaVar;
        if (TextUtils.equals(str, "ClientMessageIdKey")) {
            return this.g;
        }
        if (!TextUtils.equals(str, "MessageKey")) {
            return null;
        }
        asrh asrhVar = this.b;
        return (asrhVar == null || (ajsaVar = this.c) == null) ? this.a : ajsaVar.a(asrhVar);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }

    @Override // defpackage.abgd
    public final abgf qL() {
        abht abhtVar = this.d;
        if (abhtVar != null) {
            return abhtVar.g;
        }
        return null;
    }

    @Override // defpackage.abij
    public final afwx qM() {
        return this;
    }

    @Override // defpackage.abij
    public final asrh qN() {
        return this.b;
    }

    @Override // defpackage.abij
    public final String qO() {
        return this.g;
    }

    @Override // defpackage.abij
    public final String qP() {
        return this.a;
    }
}
