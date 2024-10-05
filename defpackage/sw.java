package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sw implements ajy {
    final /* synthetic */ View a;

    public sw(View view) {
        this.a = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.ajy
    public final boolean a(akc akcVar, int i, Bundle bundle) {
        InterfaceC0002if interfaceC0002if;
        Bundle bundle2 = bundle;
        if (Build.VERSION.SDK_INT >= 25) {
            bundle2 = bundle;
            if ((i & 1) != 0) {
                try {
                    akcVar.a.e();
                    ?? d = akcVar.a.d();
                    Bundle bundle3 = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle3.putParcelable("android.support.v4.view.extra.INPUT_CONTENT_INFO", d);
                    bundle2 = bundle3;
                } catch (Exception e) {
                    Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e);
                    return false;
                }
            }
        }
        ClipData clipData = new ClipData(akcVar.a.a(), new ClipData.Item(akcVar.a.b()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0002if = new ie(clipData, 2);
        } else {
            interfaceC0002if = new ig(clipData, 2);
        }
        interfaceC0002if.d(akcVar.a.c());
        interfaceC0002if.b(bundle2);
        return jw.o(this.a, gp.g(interfaceC0002if)) == null;
    }
}
