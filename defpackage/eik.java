package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eik implements aaha {
    public static final /* synthetic */ int d = 0;
    public final afsy a;
    public final wiz b;
    public final wgv c;
    private final ci e;
    private final aftn f;
    private final afte g;
    private final Executor h;

    public eik(ci ciVar, aftn aftnVar, afsy afsyVar, afte afteVar, wiz wizVar, wgv wgvVar, Executor executor) {
        this.e = ciVar;
        this.f = aftnVar;
        this.a = afsyVar;
        this.g = afteVar;
        this.b = wizVar;
        this.c = wgvVar;
        this.h = executor;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar == null || !apxfVar.pY(SignInEndpointOuterClass.signInEndpoint)) {
            return;
        }
        final auuo auuoVar = (auuo) apxfVar.pX(SignInEndpointOuterClass.signInEndpoint);
        boolean z = false;
        boolean booleanValue = ((Boolean) yjj.t(map, "FromTopBarMenu", false)).booleanValue();
        List list = (List) yjj.u(map, "AccountItemsForDirectSignIn", List.class);
        final aftl aftlVar = (aftl) yjj.u(map, "sign_in_callback", aftl.class);
        afsx c = this.a.c();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object obj : list) {
                if (obj instanceof aata) {
                    arrayList.add((aata) obj);
                }
            }
        }
        apxf apxfVar2 = null;
        if (!c.g() && (auuoVar.b & 32) != 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                aata aataVar = (aata) arrayList.get(i);
                i++;
                if (auuoVar.d.equals(aataVar.h())) {
                    wiz wizVar = this.b;
                    if ((auuoVar.b & 2) != 0 && (apxfVar2 = auuoVar.c) == null) {
                        apxfVar2 = apxf.a;
                    }
                    wizVar.i(aataVar, apxfVar2, aftlVar);
                    return;
                }
            }
        }
        int i2 = auuoVar.b;
        if ((i2 & 64) != 0) {
            apud apudVar = auuoVar.e;
            if (apudVar == null) {
                apudVar = apud.b;
            }
            wiz wizVar2 = this.b;
            avuz avuzVar = auuoVar.f;
            if (avuzVar == null) {
                avuzVar = avuz.a;
            }
            if ((auuoVar.b & 2) != 0 && (apxfVar2 = auuoVar.c) == null) {
                apxfVar2 = apxf.a;
            }
            wizVar2.j(apudVar, avuzVar, apxfVar2, aftlVar);
            return;
        }
        boolean z2 = booleanValue || ((i2 & 32) != 0 && "pre-incognito-id".equals(auuoVar.d));
        if ((auuoVar.b & 32) != 0 && "pre_child_id".equals(auuoVar.d)) {
            z = true;
        }
        if (!c.g() || !z2) {
            if (z) {
                ynm.k(this.c.d(), this.h, egw.d, new ynl() { // from class: eii
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj2) {
                        eik eikVar = eik.this;
                        auuo auuoVar2 = auuoVar;
                        aftl aftlVar2 = aftlVar;
                        String str = (String) obj2;
                        apxf apxfVar3 = null;
                        afsx d2 = str != null ? eikVar.a.d(str) : null;
                        if (d2 instanceof AccountIdentity) {
                            wiz wizVar3 = eikVar.b;
                            AccountIdentity accountIdentity = (AccountIdentity) d2;
                            if ((auuoVar2.b & 2) != 0 && (apxfVar3 = auuoVar2.c) == null) {
                                apxfVar3 = apxf.a;
                            }
                            wizVar3.h(accountIdentity, apxfVar3, aftlVar2);
                        } else {
                            eikVar.b.l("child switch back to signed out mode", false);
                        }
                        ynm.i(eikVar.c.a(), llr.b);
                    }
                });
                return;
            } else {
                this.f.b(this.e, apxfVar, aftlVar);
                return;
            }
        }
        afte afteVar = this.g;
        afsp afspVar = new afsp() { // from class: eij
            @Override // defpackage.afsp
            public final void a() {
                aftl aftlVar2 = aftl.this;
                int i3 = eik.d;
                if (aftlVar2 != null) {
                    aftlVar2.b();
                }
            }
        };
        if ((auuoVar.b & 2) != 0 && (apxfVar2 = auuoVar.c) == null) {
            apxfVar2 = apxf.a;
        }
        afteVar.f(afspVar, apxfVar2);
    }
}
