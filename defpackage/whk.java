package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class whk implements ajoq {
    private final Context a;
    private final /* synthetic */ int b;

    public whk(Context context, int i, byte[] bArr) {
        this.b = i;
        context.getClass();
        this.a = context;
    }

    public whk(Context context, int i, int[] iArr) {
        this.b = i;
        this.a = context;
    }

    public whk(Context context, int i, boolean[] zArr) {
        this.b = i;
        this.a = context;
    }

    public whk(Context context, int i) {
        this.b = i;
        context.getClass();
        this.a = context;
    }

    public whk(Context context, int i, char[] cArr) {
        this.b = i;
        context.getClass();
        this.a = context;
    }

    public whk(Context context, int i, short[] sArr) {
        this.b = i;
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.ajoq
    public final /* synthetic */ ajom b(ViewGroup viewGroup) {
        int i = this.b;
        if (i == 0) {
            return new lfv(this.a, 2, (byte[]) null);
        }
        if (i == 1) {
            return new mon(this.a);
        }
        if (i == 2) {
            return new whz(this.a);
        }
        if (i != 3) {
            return i != 4 ? new lfv(this.a, 3, (char[]) null) : new akle(this.a);
        }
        return new wif(this.a);
    }
}
