package defpackage;

import android.app.AlertDialog;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class erq {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ AlertDialog c;
    final /* synthetic */ TextInputLayout d;
    final /* synthetic */ TextInputLayout e;
    final /* synthetic */ eru f;
    final /* synthetic */ aone g;
    final /* synthetic */ aone h;
    final /* synthetic */ aone i;

    public erq(eru eruVar, aone aoneVar, String str, aone aoneVar2, aone aoneVar3, String str2, AlertDialog alertDialog, TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        this.f = eruVar;
        this.g = aoneVar;
        this.a = str;
        this.h = aoneVar2;
        this.i = aoneVar3;
        this.b = str2;
        this.c = alertDialog;
        this.d = textInputLayout;
        this.e = textInputLayout2;
    }

    public final void a(int i, String str) {
        int i2 = i - 1;
        if (i2 == 1) {
            this.d.v(str);
        } else if (i2 == 2) {
            this.e.v(str);
        } else {
            this.f.d.d(str);
        }
    }
}
