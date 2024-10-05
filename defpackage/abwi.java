package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abwi implements abxx {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ abwy c;

    public abwi(abwy abwyVar, int i, String str) {
        this.c = abwyVar;
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.abxx
    public final void a(atfw atfwVar, List list) {
        if (this.c.d.d()) {
            this.c.V = atfwVar;
            String.valueOf(String.valueOf(atfwVar)).length();
            this.c.d(this.a, null);
            this.c.g(list);
        }
    }

    @Override // defpackage.abxx
    public final void b(int i, String str) {
        if (this.c.d.d()) {
            int i2 = this.a;
            StringBuilder sb = new StringBuilder(38);
            sb.append("Stop stream failed: status=");
            sb.append(i2);
            zga.b(sb.toString());
            this.c.d(this.a, this.b);
        }
    }
}
