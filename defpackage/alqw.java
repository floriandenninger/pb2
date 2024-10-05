package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alqw extends alpq {
    final /* synthetic */ Collection a;
    final /* synthetic */ Collection b;
    final /* synthetic */ alsf c;
    final /* synthetic */ alqy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alqw(alqy alqyVar, alsf alsfVar, Collection collection, Collection collection2, alsf alsfVar2) {
        super(alsfVar);
        this.e = alqyVar;
        this.a = collection;
        this.b = collection2;
        this.c = alsfVar2;
    }

    @Override // defpackage.alpq
    protected final void a() {
        Collection<String> collection = this.a;
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        Collection<String> collection2 = this.b;
        ArrayList arrayList2 = new ArrayList(collection2.size());
        for (String str2 : collection2) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("language", str2);
            arrayList2.add(bundle2);
        }
        arrayList.addAll(arrayList2);
        try {
            alqy alqyVar = this.e;
            alrd alrdVar = (alrd) alqyVar.b.k;
            String str3 = alqyVar.a;
            Bundle bundle3 = new Bundle();
            bundle3.putInt("playcore_version_code", 11002);
            alqx alqxVar = new alqx(this.e, this.c);
            Parcel pn = alrdVar.pn();
            pn.writeString(str3);
            pn.writeTypedList(arrayList);
            ecr.g(pn, bundle3);
            ecr.i(pn, alqxVar);
            alrdVar.pq(2, pn);
        } catch (RemoteException e) {
            alqy.c.l(e, "startInstall(%s,%s)", this.a, this.b);
            this.c.a(new RuntimeException(e));
        }
    }
}
