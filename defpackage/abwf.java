package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abwf {
    public final /* synthetic */ abwy a;
    public final /* synthetic */ abwv b;

    public /* synthetic */ abwf(abwy abwyVar, abwv abwvVar) {
        this.a = abwyVar;
        this.b = abwvVar;
    }

    public final void a(int i, boolean z) {
        abwy abwyVar = this.a;
        abwv abwvVar = this.b;
        if (i != 0) {
            StringBuilder sb = new StringBuilder(75);
            sb.append("Error updating mic for live capture: status=");
            sb.append(i);
            sb.append(", isMicEnabled=");
            sb.append(z);
            zga.b(sb.toString());
            if (abwyVar.S) {
                abwyVar.f.d(2, abwyVar.N, abwyVar.t.getString(R.string.lc_error_mute_failed), false);
            }
        }
        abwvVar.a(z);
        abwyVar.y = z;
    }
}
