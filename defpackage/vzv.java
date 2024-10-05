package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vzv implements ylb {
    private final wdd a;
    private final wdm b;
    private final wco c;
    private final azrw d;
    private final ypa e;
    private final wki f;
    private final axzf g;

    public vzv(wdd wddVar, wdm wdmVar, wco wcoVar, wki wkiVar, azrw azrwVar, axzf axzfVar, ypa ypaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = wddVar;
        this.b = wdmVar;
        this.c = wcoVar;
        this.f = wkiVar;
        this.d = azrwVar;
        this.g = axzfVar;
        this.e = ypaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        Boolean bool;
        aqvj aqvjVar = this.g.a.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45354251L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45354251L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45354251L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (!bool.booleanValue()) {
            return 0;
        }
        yjk.e();
        try {
            List<AccountIdentity> h = this.a.h(this.f.b());
            if (this.a.t() && (this.a.c() instanceof AccountIdentity)) {
                ArrayList arrayList = new ArrayList(h);
                Collection.EL.removeIf(arrayList, new opz(((AccountIdentity) this.a.c()).a(), 2));
                h = arrayList;
            }
            this.c.i(h);
            for (AccountIdentity accountIdentity : h) {
                this.b.j(accountIdentity);
                this.e.d(new aftb(accountIdentity));
                Iterator it = ((Set) this.d.get()).iterator();
                while (it.hasNext()) {
                    ((aftc) it.next()).b(accountIdentity);
                }
            }
            this.a.m(h);
        } catch (RemoteException | qnk | qnl unused) {
        }
        return 0;
    }
}
