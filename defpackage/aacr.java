package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aacr implements ynl {
    public final /* synthetic */ aacs a;
    private final /* synthetic */ int b;

    public /* synthetic */ aacr(aacs aacsVar, int i) {
        this.b = i;
        this.a = aacsVar;
    }

    @Override // defpackage.ynl, defpackage.zfi
    public final void a(Object obj) {
        if (this.b == 0) {
            aacs aacsVar = this.a;
            if (((arur) obj) == null) {
                aacsVar.b(7);
                return;
            } else {
                aacsVar.b(8);
                return;
            }
        }
        final aacs aacsVar2 = this.a;
        arjd arjdVar = (arjd) obj;
        if (arjdVar == null || (arjdVar.b & 2) == 0) {
            afsi.b(2, 12, "Received an empty response without a challenge.");
            aacsVar2.b(2);
            return;
        }
        final String str = arjdVar.d;
        String valueOf = String.valueOf(str);
        zhy b = zhy.b(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
        if (!aacs.a(b, "c5a") || !b.d("c5a").equals("1")) {
            afsi.b(2, 12, "Received invalid challenge.");
            aacsVar2.b(5);
            return;
        }
        amrz k = amrz.k("atr_challenge", str);
        qtv qtvVar = aacsVar2.d;
        String valueOf2 = String.valueOf(str);
        zhy b2 = zhy.b(Uri.parse(valueOf2.length() != 0 ? "?".concat(valueOf2) : new String("?")));
        qtvVar.a(aacs.a(b2, "c5b") ? b2.d("c5b") : "", k, new qtx() { // from class: aacp
            @Override // defpackage.qtx
            public final void a(String str2) {
                aacs aacsVar3 = aacs.this;
                String str3 = str;
                afsx c = aacsVar3.b.c();
                aayb aaybVar = aacsVar3.e;
                aatx aatxVar = new aatx(aaybVar.f, c, aacsVar3.c.f(), c.g(), null, null, null);
                aatxVar.a = str3;
                aatxVar.b = str2;
                aayb aaybVar2 = aacsVar3.e;
                ynm.k(aaybVar2.a.b(aatxVar, aacsVar3.a), angq.a, new aacq(aacsVar3, 0), new aacr(aacsVar3, 0));
            }
        });
    }
}
