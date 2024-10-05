package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.mdx.remote.internal.MdxSessionFactory;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adol extends adot {
    private final adga a;
    private final MdxSessionFactory b;
    private final acsx c;
    private final acsx d;

    public adol(adga adgaVar, MdxSessionFactory mdxSessionFactory, Context context, adpf adpfVar, adln adlnVar, zaw zawVar, acsx acsxVar, acsx acsxVar2, int i, Optional optional, acun acunVar, atbj atbjVar) {
        super(context, adpfVar, adlnVar, zawVar, acunVar, atbjVar);
        this.a = adgaVar;
        this.b = mdxSessionFactory;
        this.c = acsxVar;
        this.d = acsxVar2;
        adlo a = adlp.a();
        a.i(4);
        a.e(adgaVar.c());
        a.f(i);
        a.d(adcp.f(adgaVar));
        if (optional.isPresent()) {
            a.g((String) optional.get());
        }
        this.aq = a.a();
    }

    @Override // defpackage.adot, defpackage.adlm
    public final boolean ac() {
        adot adotVar = this.ar;
        return adotVar != null ? adotVar.ac() : super.ac();
    }

    @Override // defpackage.adot
    public final void at() {
    }

    @Override // defpackage.adot
    public final boolean aw() {
        return true;
    }

    @Override // defpackage.adot
    public final void ax(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adot
    public final void ay(adle adleVar) {
        super.ay(adleVar);
        this.ao.e(10);
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.ay(adleVar);
        }
    }

    @Override // defpackage.adlm
    public final adgb k() {
        return this.a;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final anhy q(atbi atbiVar, Optional optional) {
        adot adotVar = this.ar;
        return adotVar != null ? adotVar.q(atbiVar, optional) : super.q(atbiVar, optional);
    }

    @Override // defpackage.adot
    public final /* bridge */ /* synthetic */ int re() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adot
    public final void rh() {
        adot adotVar = this.ar;
        if (adotVar != null) {
            adotVar.rh();
        }
    }

    @Override // defpackage.adot
    public final void ri(adle adleVar) {
        MdxSessionFactory mdxSessionFactory = this.b;
        adfw adfwVar = this.a.a;
        adpf aM = aM();
        adln adlnVar = this.ao;
        acsx acsxVar = this.c;
        acsx acsxVar2 = this.d;
        adlp adlpVar = this.aq;
        int i = adlpVar.h;
        Optional.of(adlpVar.g);
        this.ar = mdxSessionFactory.h(adfwVar, aM, adlnVar, this, acsxVar, acsxVar2, null);
        super.ri(adleVar);
    }

    @Override // defpackage.adot
    public final boolean rj() {
        adot adotVar = this.ar;
        return adotVar != null ? adotVar.rj() : super.rj();
    }
}
