package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jyh implements ypd {
    public final Context a;
    public final ypa b;
    public final fjm c;
    public final fjh d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final ViewTreeObserver.OnGlobalLayoutListener h;
    public fjl i;
    public fjg j;
    public audj k;
    public String l;
    public final fiu m;
    private final azrw n;
    private final jry o;

    public jyh(Context context, ypa ypaVar, azrw azrwVar, jry jryVar, fjm fjmVar, fjh fjhVar, fiu fiuVar, View view) {
        this.a = context;
        this.b = ypaVar;
        this.n = azrwVar;
        this.o = jryVar;
        this.c = fjmVar;
        this.d = fjhVar;
        this.m = fiuVar;
        TextView textView = (TextView) view.findViewById(R.id.author);
        this.e = textView;
        this.f = (TextView) view.findViewById(R.id.details);
        TextView textView2 = (TextView) view.findViewById(R.id.overflow_video_size_bytes);
        this.g = textView2;
        this.h = new kbw(textView, textView2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0045, code lost:
    
        if (((defpackage.agof) r6.n.get()).a().i().e(r3) == null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.agnv r7) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jyh.a(agnv):void");
    }

    public final void b() {
        String str = this.l;
        if (ammx.e(str)) {
            return;
        }
        a(((agof) this.n.get()).a().m().e(str));
    }

    public final boolean c(amsx amsxVar, String str) {
        return (ammx.e(this.l) || !this.l.equals(str) || amsxVar.contains(this.l)) ? false : true;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{jqc.class, jqd.class, agkk.class, agko.class, agkr.class, agks.class, agla.class, aglb.class};
            case 0:
                jqc jqcVar = (jqc) obj;
                if (ammx.e(this.l) || !this.l.equals(jqcVar.a)) {
                    return null;
                }
                a(null);
                return null;
            case 1:
                jqd jqdVar = (jqd) obj;
                if (ammx.e(this.l) || !this.l.equals(jqdVar.a)) {
                    return null;
                }
                b();
                return null;
            case 2:
                b();
                return null;
            case 3:
                b();
                return null;
            case 4:
                agkr agkrVar = (agkr) obj;
                audj audjVar = this.k;
                if (audjVar == null) {
                    return null;
                }
                if (!agkrVar.a.equals(audjVar.pY(audg.b) ? this.k.pX(audg.b) : null)) {
                    return null;
                }
                b();
                return null;
            case 5:
                agks agksVar = (agks) obj;
                audj audjVar2 = this.k;
                if (audjVar2 == null) {
                    return null;
                }
                if (!agksVar.a.d().equals(audjVar2.pY(audg.b) ? audjVar2.pX(audg.b) : null)) {
                    return null;
                }
                b();
                return null;
            case 6:
                final agla aglaVar = (agla) obj;
                this.m.b().G(new ayrv() { // from class: jyf
                    @Override // defpackage.ayrv
                    public final Object a(Object obj2) {
                        return Boolean.valueOf(jyh.this.c((amsx) obj2, aglaVar.a.m()));
                    }
                }).V(new jye(this, 1));
                return null;
            case 7:
                aglb aglbVar = (aglb) obj;
                if (ammx.e(this.l) || !this.l.equals(aglbVar.a)) {
                    return null;
                }
                b();
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
