package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hyh implements icp {
    public final Activity a;
    public final icq b;
    public final hye c;
    public final acqz d;
    public final iax e;
    public final wcy f;
    public final axze g;

    public hyh(Activity activity, icq icqVar, hye hyeVar, wcy wcyVar, iax iaxVar, acqz acqzVar, axze axzeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = activity;
        this.b = icqVar;
        this.c = hyeVar;
        this.f = wcyVar;
        this.e = iaxVar;
        this.d = acqzVar;
        this.g = axzeVar;
    }

    private final TextView c(String str) {
        TextView textView = (TextView) LayoutInflater.from(this.a).inflate(R.layout.unicode_emoji_sticker, (ViewGroup) null);
        textView.setText(str);
        return textView;
    }

    private static final String d(axdk axdkVar) {
        axed axedVar;
        axdi i = axdkVar.i();
        if (i.c == 7) {
            axedVar = (axed) i.d;
        } else {
            axedVar = axed.a;
        }
        if ((axedVar.b & 4) == 0) {
            return axedVar.d;
        }
        axee axeeVar = axedVar.e;
        if (axeeVar == null) {
            axeeVar = axee.a;
        }
        aony aonyVar = axeeVar.d;
        return (String) aonyVar.get((aonyVar.indexOf(axeeVar.c) + 1) % aonyVar.size());
    }

    private static final axdj e(axdk axdkVar, String str) {
        axed axedVar;
        axed axedVar2;
        axdi i = axdkVar.i();
        if (i.c == 7) {
            axedVar = (axed) i.d;
        } else {
            axedVar = axed.a;
        }
        axee axeeVar = axedVar.e;
        if (axeeVar == null) {
            axeeVar = axee.a;
        }
        aone builder = axeeVar.toBuilder();
        builder.copyOnWrite();
        axee axeeVar2 = (axee) builder.instance;
        str.getClass();
        axeeVar2.b |= 1;
        axeeVar2.c = str;
        axee axeeVar3 = (axee) builder.build();
        axdj axdjVar = (axdj) axdkVar.toBuilder();
        aone builder2 = axdkVar.i().toBuilder();
        axdi i2 = axdkVar.i();
        if (i2.c == 7) {
            axedVar2 = (axed) i2.d;
        } else {
            axedVar2 = axed.a;
        }
        aone builder3 = axedVar2.toBuilder();
        builder3.copyOnWrite();
        axed axedVar3 = (axed) builder3.instance;
        str.getClass();
        axedVar3.b |= 2;
        axedVar3.d = str;
        builder3.copyOnWrite();
        axed axedVar4 = (axed) builder3.instance;
        axeeVar3.getClass();
        axedVar4.e = axeeVar3;
        axedVar4.b |= 4;
        builder2.copyOnWrite();
        axdi axdiVar = (axdi) builder2.instance;
        axed axedVar5 = (axed) builder3.build();
        axedVar5.getClass();
        axdiVar.d = axedVar5;
        axdiVar.c = 7;
        axdjVar.copyOnWrite();
        ((axdk) axdjVar.instance).F((axdi) builder2.build());
        return axdjVar;
    }

    @Override // defpackage.icp
    public final void a(axcg axcgVar) {
        final aone builder = axcgVar.toBuilder();
        axdk c = axcgVar.c();
        String d = d(c);
        TextView c2 = c(d);
        this.d.mM().I(3, new acqx(acsb.c(65452)), null);
        etx.aq(this.a, this.f, c2, e(c, d), new ici() { // from class: hyg
            @Override // defpackage.ici
            public final void a(axdj axdjVar) {
                hyh hyhVar = hyh.this;
                aone aoneVar = builder;
                aoneVar.copyOnWrite();
                ((axcg) aoneVar.instance).e((axdk) axdjVar.build());
                hyhVar.b.aT(aoneVar);
            }
        });
    }

    @Override // defpackage.icp
    public final void my(axdk axdkVar) {
        String d = d(axdkVar);
        TextView c = c(d);
        this.d.mM().I(3, new acqx(acsb.c(65452)), null);
        etx.aq(this.a, this.f, c, e(axdkVar, d), new hyf(this, 0));
    }
}
