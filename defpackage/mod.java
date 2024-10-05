package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mod implements ajom {
    public final RadioButton a;
    public final Map b;
    public apxf c;
    public moc d;
    public acra e;
    public arpx f;
    private final int g;
    private final int h;
    private final Context i;
    private final ajop j;
    private final View k;
    private final TextView l;
    private final ViewStub m;
    private View n;
    private final axpg o;

    public mod(Context context, gma gmaVar, aahd aahdVar, axpg axpgVar, axpg axpgVar2, ansv ansvVar, byte[] bArr) {
        this.i = context;
        this.j = gmaVar;
        axpgVar.getClass();
        this.o = axpgVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.dismissal_reason_list_item, (ViewGroup) null);
        this.k = inflate;
        RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.radio_button);
        this.a = radioButton;
        radioButton.setOnClickListener(new moa(this, aahdVar, axpgVar2, context));
        this.l = (TextView) inflate.findViewById(R.id.reason_text);
        this.m = (ViewStub) inflate.findViewById(R.id.video_layout);
        this.b = new HashMap();
        this.g = wbs.Q(context, R.attr.ytTextSecondary);
        this.h = wbs.Q(context, R.attr.ytCallToAction);
        gmaVar.c(inflate);
        gmaVar.b(true);
        gmaVar.d(new View.OnClickListener() { // from class: mny
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mod.this.a.performClick();
            }
        });
        if (ansvVar.a) {
            radioButton.getClass();
            radioButton.setBackground(wbs.T(radioButton.getContext(), R.attr.ytRadioButton));
            radioButton.setButtonDrawable((Drawable) null);
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.j).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.clear();
    }

    public final byte[] d() {
        arpz arpzVar;
        arpz arpzVar2;
        arpy arpyVar;
        arpx arpxVar = this.f;
        if (((arpxVar.b == 106353983 ? (arpy) arpxVar.c : arpy.a).b & 2) == 0) {
            arpx arpxVar2 = this.f;
            if (arpxVar2.b == 106118680) {
                arpzVar = (arpz) arpxVar2.c;
            } else {
                arpzVar = arpz.a;
            }
            if ((arpzVar.b & 2) == 0) {
                return null;
            }
            arpx arpxVar3 = this.f;
            if (arpxVar3.b == 106118680) {
                arpzVar2 = (arpz) arpxVar3.c;
            } else {
                arpzVar2 = arpz.a;
            }
            return arpzVar2.e.I();
        }
        arpx arpxVar4 = this.f;
        if (arpxVar4.b == 106353983) {
            arpyVar = (arpy) arpxVar4.c;
        } else {
            arpyVar = arpy.a;
        }
        return arpyVar.e.I();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x015d  */
    @Override // defpackage.ajom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oB(defpackage.ajok r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mod.oB(ajok, java.lang.Object):void");
    }
}
