package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ipa implements TextWatcher, ipg {
    public final Context a;
    public final ioz b;
    public final iph c;
    public final EditText d;
    private final ImageButton e;
    private final ImageButton f;
    private final RecyclerView g;
    private final TextView h;

    public ipa(Context context, jlb jlbVar, ViewGroup viewGroup, ioz iozVar, acra acraVar, avuu avuuVar, apxf apxfVar, byte[] bArr, byte[] bArr2) {
        this.a = context;
        this.b = iozVar;
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(R.id.back_to_basic_settings_button);
        this.e = imageButton;
        EditText editText = (EditText) viewGroup.findViewById(R.id.autocomplete_text);
        this.d = editText;
        ImageButton imageButton2 = (ImageButton) viewGroup.findViewById(R.id.reset_autocomplete_button);
        this.f = imageButton2;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.autocomplete_results);
        this.g = recyclerView;
        this.h = (TextView) viewGroup.findViewById(R.id.autocomplete_no_results_text);
        final int i = 1;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: ioy
            public final /* synthetic */ ipa a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i == 0) {
                    this.a.d.setText("");
                    return;
                }
                ipa ipaVar = this.a;
                ((ibe) ipaVar.b).d();
                whu.C(ipaVar.d);
                ipaVar.c.f();
            }
        });
        editText.addTextChangedListener(this);
        final int i2 = 0;
        imageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: ioy
            public final /* synthetic */ ipa a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 == 0) {
                    this.a.d.setText("");
                    return;
                }
                ipa ipaVar = this.a;
                ((ibe) ipaVar.b).d();
                whu.C(ipaVar.d);
                ipaVar.c.f();
            }
        });
        this.c = jlbVar.a(this, recyclerView, apxfVar, acraVar, avuuVar);
    }

    public final void a(CharSequence charSequence) {
        this.h.setText(charSequence);
        this.g.setVisibility(8);
        this.h.setVisibility(0);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.length() == 0) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
        }
        this.c.d(editable.toString());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // defpackage.ipg
    public final void e(boolean z) {
        String string;
        if (z) {
            if (this.d.getText().length() > 0) {
                string = this.a.getString(R.string.user_mention_search_view_no_results_message);
            } else {
                string = this.a.getString(R.string.user_mention_search_view_results_box_hint);
            }
            a(string);
            return;
        }
        this.g.setVisibility(0);
        this.h.setVisibility(8);
    }

    @Override // defpackage.ipg
    public final void g(avuy avuyVar) {
        ibe ibeVar = (ibe) this.b;
        ibeVar.o.h(ibeVar.i, ibeVar.c);
        ibeVar.d();
        ibeVar.m.a();
        axdj j = axdk.j();
        aone createBuilder = axbr.a.createBuilder();
        String str = avuyVar.d;
        createBuilder.copyOnWrite();
        axbr axbrVar = (axbr) createBuilder.instance;
        str.getClass();
        axbrVar.b |= 2;
        axbrVar.d = str;
        if ((avuyVar.b & 4) != 0) {
            avgg avggVar = avuyVar.e;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            String uri = ahbw.B(avggVar).toString();
            createBuilder.copyOnWrite();
            axbr axbrVar2 = (axbr) createBuilder.instance;
            uri.getClass();
            axbrVar2.b |= 4;
            axbrVar2.e = uri;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(axbs.CHANNEL_MENTION_NORMAL);
        arrayList.add(axbs.CHANNEL_MENTION_LIGHT);
        aone createBuilder2 = axbq.b.createBuilder();
        createBuilder2.copyOnWrite();
        axbq axbqVar = (axbq) createBuilder2.instance;
        aonu aonuVar = axbqVar.e;
        if (!aonuVar.c()) {
            axbqVar.e = aonm.mutableCopy(aonuVar);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            axbqVar.e.g(((axbs) it.next()).d);
        }
        axbs axbsVar = ibe.b;
        createBuilder2.copyOnWrite();
        axbq axbqVar2 = (axbq) createBuilder2.instance;
        axbqVar2.d = axbsVar.d;
        axbqVar2.c |= 1;
        createBuilder.copyOnWrite();
        axbr axbrVar3 = (axbr) createBuilder.instance;
        axbq axbqVar3 = (axbq) createBuilder2.build();
        axbqVar3.getClass();
        axbrVar3.f = axbqVar3;
        axbrVar3.b |= 8;
        aone createBuilder3 = axdi.a.createBuilder();
        boolean z = ibeVar.j;
        createBuilder3.copyOnWrite();
        axdi axdiVar = (axdi) createBuilder3.instance;
        axdiVar.b |= 4096;
        axdiVar.e = z;
        createBuilder3.copyOnWrite();
        axdi axdiVar2 = (axdi) createBuilder3.instance;
        axbr axbrVar4 = (axbr) createBuilder.build();
        axbrVar4.getClass();
        axdiVar2.d = axbrVar4;
        axdiVar2.c = 6;
        boolean u = ibeVar.q.u();
        createBuilder3.copyOnWrite();
        axdi axdiVar3 = (axdi) createBuilder3.instance;
        axdiVar3.b |= 8192;
        axdiVar3.f = u;
        j.copyOnWrite();
        ((axdk) j.instance).F((axdi) createBuilder3.build());
        aone createBuilder4 = axcr.a.createBuilder();
        String str2 = avuyVar.c;
        createBuilder4.copyOnWrite();
        axcr axcrVar = (axcr) createBuilder4.instance;
        str2.getClass();
        axcrVar.b |= 1;
        axcrVar.c = str2;
        axcr axcrVar2 = (axcr) createBuilder4.build();
        aone createBuilder5 = axcv.a.createBuilder();
        createBuilder5.copyOnWrite();
        axcv axcvVar = (axcv) createBuilder5.instance;
        axcvVar.e = 1;
        axcvVar.b |= 1;
        createBuilder5.copyOnWrite();
        axcv axcvVar2 = (axcv) createBuilder5.instance;
        axcrVar2.getClass();
        axcvVar2.d = axcrVar2;
        axcvVar2.c = 2;
        aone createBuilder6 = axct.a.createBuilder();
        aorq H = wcy.H();
        createBuilder6.copyOnWrite();
        axct axctVar = (axct) createBuilder6.instance;
        H.getClass();
        axctVar.c = H;
        axctVar.b = 1;
        createBuilder5.bD(createBuilder6);
        j.a((axcv) createBuilder5.build());
        ibeVar.c(j, ibe.b, true);
        ibeVar.f.mM().n(new acqx(acsb.c(65452)));
        whu.C(this.d);
        this.c.f();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
