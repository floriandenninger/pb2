package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class base extends barx {
    public final basd a;

    public base(basd basdVar) {
        this.a = basdVar;
    }

    @Override // defpackage.barx
    public final anhy a(int i, byte[] bArr) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("No method found with identifier: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.barx
    public final void b(int i, byte[] bArr) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("No method found with identifier: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.barx
    public final void c() {
    }

    @Override // defpackage.barx
    public final byte[] d(int i, byte[] bArr) {
        if (i == 1299956865) {
            basd basdVar = this.a;
            aone createBuilder = awmj.a.createBuilder();
            float nextFloat = ((SecureRandom) basdVar.c.get()).nextFloat();
            createBuilder.copyOnWrite();
            awmj awmjVar = (awmj) createBuilder.instance;
            awmjVar.b |= 1;
            awmjVar.c = nextFloat;
            return ((awmj) createBuilder.build()).toByteArray();
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("No method found with identifier: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.barx
    public final void e(int i) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("No method found with identifier: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.barx
    public final anhy f(int i) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("No method found with identifier: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
