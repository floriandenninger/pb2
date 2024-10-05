package defpackage;

import android.content.Intent;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afyk implements uda {
    private final azrw a;

    public afyk(azrw azrwVar) {
        this.a = azrwVar;
    }

    @Override // defpackage.uda
    public final ucz a(twy twyVar) {
        azrw azrwVar = this.a;
        if (azrwVar == null) {
            throw new IllegalStateException("The intent provider for opening the YouTube app is absent.");
        }
        Intent intent = (Intent) azrwVar.get();
        Optional Z = aear.Z(twyVar);
        if (!Z.isPresent()) {
            zga.b("Could not get the YouTube custom payload.");
            return ucz.a(amru.r(intent));
        }
        return (ucz) Z.flatMap(new afyi(intent, 1)).map(acxx.o).orElseGet(new afyj(intent, 1));
    }

    @Override // defpackage.uda
    public final ucz b(List list) {
        azrw azrwVar = this.a;
        if (azrwVar == null) {
            throw new IllegalStateException("The intent provider for opening the YouTube app is absent.");
        }
        Intent intent = (Intent) azrwVar.get();
        Optional aa = aear.aa(list);
        if (!aa.isPresent()) {
            zga.b("Could not get the YouTube custom payload.");
            return ucz.a(amru.r(intent));
        }
        return (ucz) aa.flatMap(new afyi(intent, 0)).map(acxx.p).orElseGet(new afyj(intent, 0));
    }
}
