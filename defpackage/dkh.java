package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dkh {
    final int a;
    boolean b;
    String c;

    /* JADX WARN: Multi-variable type inference failed */
    public dkh(Object obj) {
        int i;
        if (obj instanceof View) {
            View view = (View) obj;
            boolean isClickable = view.isClickable();
            int i2 = view.isLongClickable() ? (isClickable ? 1 : 0) | 2 : isClickable;
            int i3 = view.isFocusable() ? (i2 == true ? 1 : 0) | 4 : i2;
            int i4 = view.isEnabled() ? (i3 == true ? 1 : 0) | 8 : i3;
            i = i4;
            if (view.isSelected()) {
                i = (i4 == true ? 1 : 0) | 16;
            }
        } else {
            i = 0;
        }
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dkh a(dum dumVar) {
        Object obj = dumVar.e;
        if (obj instanceof dkh) {
            return (dkh) obj;
        }
        throw new RuntimeException("MountData should not be null when using Litho's MountState.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Context context, dum dumVar, String str) {
        dju djuVar = (dju) dumVar.d.a;
        dha dhaVar = djuVar.b;
        if (this.b) {
            String o = dhaVar.o();
            String str2 = dhaVar.m;
            String valueOf = String.valueOf(djuVar.g);
            String str3 = this.c;
            int length = String.valueOf(o).length();
            int length2 = String.valueOf(str2).length();
            StringBuilder sb = new StringBuilder(length + 98 + length2 + String.valueOf(valueOf).length() + String.valueOf(str3).length());
            sb.append("Releasing released mount content! component: ");
            sb.append(o);
            sb.append(", globalKey: ");
            sb.append(str2);
            sb.append(", transitionId: ");
            sb.append(valueOf);
            sb.append(", previousReleaseCause: ");
            sb.append(str3);
            throw new dkg(sb.toString());
        }
        Object obj = dumVar.a;
        dkt a = dhx.a(context, dhaVar);
        if (a != null) {
            a.c(obj);
        }
        this.b = true;
        this.c = str;
    }
}
