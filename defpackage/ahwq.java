package defpackage;

import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahwq implements aioa {
    final /* synthetic */ ahwu a;
    private final /* synthetic */ int b;

    public ahwq(ahwu ahwuVar, int i) {
        this.b = i;
        this.a = ahwuVar;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 0;
        final int i2 = 1;
        if (this.b == 0) {
            return new ayqx[]{aiocVar.G().d.h(ahbw.g(aiocVar.aC(), 32768L)).h(ahbw.e(1)).Y(new ayrs() { // from class: ahwp
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    String format;
                    ahwq ahwqVar = ahwq.this;
                    aheg ahegVar = (aheg) obj;
                    long a = ahegVar.a();
                    long e = ahegVar.e();
                    ahwu ahwuVar = ahwqVar.a;
                    long j = 0;
                    if (e >= 0 && a >= e) {
                        j = a - e;
                    }
                    ahwuVar.q = j;
                    float f = ((float) j) / 1000.0f;
                    ahww ahwwVar = (ahww) ahwuVar.a;
                    ahwwVar.x.setImageBitmap(ahwwVar.w.a(f));
                    ahwwVar.v.setText(String.format(Locale.US, " %.3g s", Float.valueOf(f)));
                    ahwqVar.a.j();
                    ahwu ahwuVar2 = ahwqVar.a;
                    ahwl ahwlVar = ahwuVar2.a;
                    float e2 = ahwuVar2.e();
                    ahww ahwwVar2 = (ahww) ahwlVar;
                    ahwwVar2.t.a.setColor(true != ahwqVar.a.t ? -12671196 : -48060);
                    ahwwVar2.u.setImageBitmap(ahwwVar2.t.a(e2));
                    TextView textView = ahwwVar2.s;
                    double d = e2;
                    if (d < 1000000.0d) {
                        Locale locale = Locale.US;
                        Double.isNaN(d);
                        format = String.format(locale, " %.3g kbps", Double.valueOf(d / 1000.0d));
                    } else if (d < 1.0E9d) {
                        Locale locale2 = Locale.US;
                        Double.isNaN(d);
                        format = String.format(locale2, " %.3g mbps", Double.valueOf(d / 1000000.0d));
                    } else {
                        Locale locale3 = Locale.US;
                        Double.isNaN(d);
                        format = String.format(locale3, " %.3g gbps", Double.valueOf(d / 1.0E9d));
                    }
                    textView.setText(format);
                    int intValue = ((Integer) ahwqVar.a.b.get()).intValue();
                    ahwu ahwuVar3 = ahwqVar.a;
                    int i3 = ahwuVar3.g;
                    ahwl ahwlVar2 = ahwuVar3.a;
                    int intValue2 = ((Integer) ahwuVar3.c.get()).intValue() - ahwqVar.a.h;
                    TextView textView2 = ((ahww) ahwlVar2).z;
                    StringBuilder sb = new StringBuilder(25);
                    sb.append(intValue2);
                    sb.append(" / ");
                    sb.append(intValue2 + (intValue - i3));
                    textView2.setText(sb.toString());
                    ahwu ahwuVar4 = ahwqVar.a;
                    ahwl ahwlVar3 = ahwuVar4.a;
                    long j2 = ((aefq) ahwuVar4.d.get()).f;
                    if (j2 == -1) {
                        ahww ahwwVar3 = (ahww) ahwlVar3;
                        ahwwVar3.C.setVisibility(8);
                        ahwwVar3.D.setVisibility(8);
                    } else {
                        ahww ahwwVar4 = (ahww) ahwlVar3;
                        ahwwVar4.C.setVisibility(0);
                        ahwwVar4.D.setVisibility(0);
                        ahwwVar4.D.setText(String.format(Locale.US, "%.2fs", Float.valueOf(((float) j2) / 1000.0f)));
                    }
                    ahwqVar.a.h();
                }
            }, ahfo.t)};
        }
        final byte[] bArr = null;
        return new ayqx[]{aiocVar.V().t(afly.n).X(new ayrs(this, i, bArr) { // from class: ahwn
            public final /* synthetic */ ahwq a;
            private final /* synthetic */ int b;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (this.b == 0) {
                    ahwq ahwqVar = this.a;
                    Object[] objArr = (Object[]) obj;
                    ajbl ajblVar = (ajbl) objArr[0];
                    afih afihVar = (afih) objArr[1];
                    String Z = ajblVar.Z();
                    if (!ahwqVar.a.r.containsKey(Z)) {
                        ahwqVar.a.r.put(Z, new ArrayList());
                    }
                    ((ArrayList) ahwqVar.a.r.get(Z)).add(afihVar);
                    return;
                }
                this.a.a.r.remove(((ahen) obj).b());
            }
        }), aiocVar.ad().X(new ayrs(this, i2, bArr) { // from class: ahwn
            public final /* synthetic */ ahwq a;
            private final /* synthetic */ int b;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (this.b == 0) {
                    ahwq ahwqVar = this.a;
                    Object[] objArr = (Object[]) obj;
                    ajbl ajblVar = (ajbl) objArr[0];
                    afih afihVar = (afih) objArr[1];
                    String Z = ajblVar.Z();
                    if (!ahwqVar.a.r.containsKey(Z)) {
                        ahwqVar.a.r.put(Z, new ArrayList());
                    }
                    ((ArrayList) ahwqVar.a.r.get(Z)).add(afihVar);
                    return;
                }
                this.a.a.r.remove(((ahen) obj).b());
            }
        })};
    }
}
