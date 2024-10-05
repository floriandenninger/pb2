package defpackage;

import android.content.Intent;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yfd implements ykj {
    final /* synthetic */ yfe a;

    public yfd(yfe yfeVar) {
        this.a = yfeVar;
    }

    @Override // defpackage.ykj
    public final void kD(int i, int i2, Intent intent) {
        if (i == 1901) {
            if (i2 == -1) {
                Iterator it = this.a.d.iterator();
                while (it.hasNext()) {
                    ((yek) it.next()).a.a.m();
                }
                this.a.d.clear();
                return;
            }
            if (i2 == 0) {
                Iterator it2 = this.a.d.iterator();
                while (it2.hasNext()) {
                    ((yek) it2.next()).a.a.m();
                }
                this.a.d.clear();
                return;
            }
            if (i2 == 1) {
                for (yek yekVar : this.a.d) {
                }
                this.a.d.clear();
                return;
            }
            String str = yfe.a;
            StringBuilder sb = new StringBuilder(56);
            sb.append("Unknown add instrument result code received: ");
            sb.append(i2);
            zga.c(str, sb.toString());
        }
    }
}
