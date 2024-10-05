package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ageg implements ylb {
    private final Context a;
    private final /* synthetic */ int b;

    public ageg(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        if (this.b != 0) {
            String string = bundle.getString("servicePath");
            if (string != null) {
                try {
                    Class<?> cls = Class.forName(string);
                    String string2 = bundle.getString("intentAction");
                    agzy.a(this.a, new Intent(this.a, cls).setAction(string2).putExtra("messageId", bundle.getInt("messageId")).putExtra("messageData", bundle.getString("messageData")));
                    return 0;
                } catch (ClassNotFoundException unused) {
                    zga.b(string.length() != 0 ? "[Offline] Cannot find class: ".concat(string) : new String("[Offline] Cannot find class: "));
                }
            }
            return 1;
        }
        String string3 = bundle.getString("servicePath");
        if (string3 != null) {
            try {
                Class<?> cls2 = Class.forName(string3);
                String string4 = bundle.getString("intentAction");
                Context context = this.a;
                agzy.a(context, new Intent(context, cls2).setAction(string4));
                return 0;
            } catch (ClassNotFoundException unused2) {
                zga.b(string3.length() != 0 ? "[Offline] Cannot find class: ".concat(string3) : new String("[Offline] Cannot find class: "));
            }
        }
        return 1;
    }
}
