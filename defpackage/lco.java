package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lco {
    public final TextView a;
    public final aaea b;

    public lco(View view, final aahd aahdVar, aaea aaeaVar) {
        this.b = aaeaVar;
        this.a = (TextView) view.findViewById(R.id.text);
        view.findViewById(R.id.help_button).setOnClickListener(new View.OnClickListener() { // from class: lcn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                lco lcoVar = lco.this;
                aahd aahdVar2 = aahdVar;
                aswb aswbVar = lcoVar.b.a().e;
                if (aswbVar == null) {
                    aswbVar = aswb.a;
                }
                String str = aswbVar.aV;
                aong aongVar = (aong) apxf.a.createBuilder();
                aonk aonkVar = UrlEndpointOuterClass.urlEndpoint;
                aone createBuilder = avuo.a.createBuilder();
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(Locale.getDefault().getLanguage());
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                createBuilder.copyOnWrite();
                avuo avuoVar = (avuo) createBuilder.instance;
                concat.getClass();
                avuoVar.b |= 1;
                avuoVar.c = concat;
                aongVar.e(aonkVar, (avuo) createBuilder.build());
                aahdVar2.a((apxf) aongVar.build());
            }
        });
    }
}
