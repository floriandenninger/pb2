package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azpg {
    public boolean a;
    public int b;

    public azpg() {
    }

    public azpg(alug alugVar) {
        this.b = R.style.SudThemeGlif_DayNight;
        this.a = true;
        this.b = alugVar.b;
        String str = alugVar.c;
        this.a = alugVar.d;
    }

    public azpg(byte[] bArr) {
        this.b = R.style.SudThemeGlif_DayNight;
        this.a = true;
    }

    public azpg(byte[] bArr, byte[] bArr2) {
        this.a = false;
        this.b = 0;
    }

    public final alug a() {
        return new alug(this.b, this.a);
    }

    public final void b() {
        this.a = true;
    }
}
