package defpackage;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afgl implements afgp {
    final /* synthetic */ afgs a;
    private final afqj b;
    private int c = -1;
    private final boolean d;

    public afgl(afgs afgsVar, afqj afqjVar, boolean z) {
        this.a = afgsVar;
        this.b = afqjVar;
        this.d = z;
    }

    @Override // defpackage.afgp
    public final int a() {
        int i = true != this.d ? 0 : 20;
        int i2 = this.c;
        if (i2 == -1) {
            int i3 = 10;
            for (Map.Entry entry : this.b.a().entrySet()) {
                i3 += ((String) entry.getKey()).length() + 2 + ((String) entry.getValue()).length();
            }
            this.c = i3;
            i2 = i3;
        }
        return i2 + 20 + (this.a.j > 0 ? 8 : 0) + i;
    }

    @Override // defpackage.afgp
    public final void c(ajun ajunVar) {
        for (Map.Entry entry : this.b.a().entrySet()) {
            ajunVar.i((String) entry.getKey(), (String) entry.getValue());
        }
        String e = this.a.e();
        int a = this.a.b.a.a();
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 12);
        sb.append(e);
        sb.append(":");
        sb.append(a);
        ajunVar.k("conn", sb.toString());
        afgs afgsVar = this.a;
        if (afgsVar.r != null) {
            String e2 = afgsVar.e();
            String valueOf = String.valueOf(this.a.r);
            StringBuilder sb2 = new StringBuilder(String.valueOf(e2).length() + 1 + String.valueOf(valueOf).length());
            sb2.append(e2);
            sb2.append(":");
            sb2.append(valueOf);
            ajunVar.k("dt", sb2.toString());
        }
        afgs afgsVar2 = this.a;
        if (afgsVar2.q) {
            return;
        }
        int i = afgsVar2.n;
        afgsVar2.n = i + 1;
        ajunVar.i("seq", String.valueOf(i));
        if (this.d) {
            String e3 = this.a.e();
            String valueOf2 = String.valueOf(this.a.i);
            StringBuilder sb3 = new StringBuilder(String.valueOf(e3).length() + 1 + String.valueOf(valueOf2).length());
            sb3.append(e3);
            sb3.append(":");
            sb3.append(valueOf2);
            ajunVar.k("vps", sb3.toString());
        }
    }
}
