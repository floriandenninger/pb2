package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SfvAudioSearchBoxRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hqc extends ajpc {
    public final aahd a;
    public final ajut b;
    public View c;
    private final Context d;

    public hqc(aahd aahdVar, Context context, ajut ajutVar) {
        this.d = context;
        this.a = aahdVar;
        this.b = ajutVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aurk aurkVar = (aurk) obj;
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.music_picker_header, (ViewGroup) null);
        this.c = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.music_picker_header_title_text);
        aqyg aqygVar = aurkVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        if ((aurkVar.b & 2) != 0) {
            aulq aulqVar = aurkVar.d;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            final aurl aurlVar = (aurl) aulqVar.pX(SfvAudioSearchBoxRendererOuterClass.sfvAudioSearchBoxRenderer);
            View findViewById = this.c.findViewById(R.id.music_picker_search_box);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: hqb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hqc hqcVar = hqc.this;
                    aurl aurlVar2 = aurlVar;
                    aahd aahdVar = hqcVar.a;
                    apxf apxfVar = aurlVar2.b;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.a(apxfVar);
                }
            });
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aurk) obj).e.I();
    }
}
