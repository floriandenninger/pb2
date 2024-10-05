package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiul {
    public final int a;
    final aiup b;
    final aiun c;

    public aiul(int i, aiup aiupVar, aiun aiunVar) {
        this.a = i;
        this.b = aiupVar;
        this.c = aiunVar;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "id: %d text: %s settings: %s", Integer.valueOf(this.a), this.b, this.c);
    }
}
