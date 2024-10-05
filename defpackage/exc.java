package defpackage;

import com.google.protos.youtube.api.innertube.DismissalEndpointOuterClass$DismissalEndpoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class exc implements aaha, afwx {
    private final zaw a;
    private final aahd b;
    private final aaxn c;

    public exc(aaxn aaxnVar, zaw zawVar, aahd aahdVar, byte[] bArr, byte[] bArr2) {
        aaxnVar.getClass();
        this.c = aaxnVar;
        zawVar.getClass();
        this.a = zawVar;
        aahdVar.getClass();
        this.b = aahdVar;
    }

    private static boolean d(arpa arpaVar) {
        return arpaVar.c.size() > 0;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aaxn aaxnVar = this.c;
        aawo aawoVar = new aawo(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        DismissalEndpointOuterClass$DismissalEndpoint dismissalEndpointOuterClass$DismissalEndpoint = (DismissalEndpointOuterClass$DismissalEndpoint) apxfVar.pX(DismissalEndpointOuterClass$DismissalEndpoint.dismissalEndpoint);
        aawoVar.a = Arrays.asList(dismissalEndpointOuterClass$DismissalEndpoint.b);
        aawoVar.l(apxfVar.c);
        this.c.b.e(aawoVar, this);
        if (dismissalEndpointOuterClass$DismissalEndpoint.c.size() != 0) {
            this.b.d(dismissalEndpointOuterClass$DismissalEndpoint.c, map);
        }
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.a.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        List list;
        arpa arpaVar = (arpa) obj;
        if (d(arpaVar)) {
            if (!d(arpaVar)) {
                list = Collections.emptyList();
            } else {
                ArrayList arrayList = new ArrayList(arpaVar.c.size());
                Iterator it = arpaVar.c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((arpb) it.next()).b);
                }
                list = arrayList;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String valueOf = String.valueOf((String) it2.next());
                zga.b(valueOf.length() != 0 ? "Dismiss failed: ".concat(valueOf) : new String("Dismiss failed: "));
            }
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
