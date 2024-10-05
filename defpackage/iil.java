package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iil extends iin {
    public final ViewGroup t;
    public final ajdw u;
    public final acqz v;
    public final ijr w;
    public final ajfh x;
    public String y;
    public ihm z;

    public iil(ajdw ajdwVar, ajfh ajfhVar, acqz acqzVar, ijr ijrVar, ViewGroup viewGroup, boolean z) {
        super((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reel_watch_survey_page, viewGroup, false));
        this.u = ajdwVar;
        this.x = ajfhVar;
        this.v = acqzVar;
        this.w = ijrVar;
        this.t = (ViewGroup) this.a.findViewById(R.id.reel_watch_survey_element_container);
        View findViewById = this.a.findViewById(R.id.reel_back_button);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: iik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iil.this.w.b();
            }
        });
        etx.K(findViewById);
        etx.M(findViewById, z);
    }

    @Override // defpackage.iin
    public final ihm E() {
        return this.z;
    }

    @Override // defpackage.iin
    public final void F() {
        ihm ihmVar = this.z;
        if (ihmVar != null) {
            ihmVar.f = null;
            this.z = null;
        }
        this.y = null;
        this.t.removeAllViews();
        this.u.b(null);
    }
}
