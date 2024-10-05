package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afol {
    public final afok a;
    public final afoi b;
    public final afoj c;
    private final acra d;
    private final afot e;

    public afol(acra acraVar, afot afotVar, aaxn aaxnVar, afok afokVar, afoi afoiVar, byte[] bArr) {
        this.d = acraVar;
        this.e = afotVar;
        this.a = afokVar;
        this.b = afoiVar;
        this.c = new afoj(aaxnVar, afokVar, null);
        LocationSearchView locationSearchView = (LocationSearchView) afokVar;
        locationSearchView.e = this;
        locationSearchView.d.e = this;
    }

    public final void a() {
        final LocationSearchView locationSearchView = (LocationSearchView) this.a;
        if (!TextUtils.isEmpty(locationSearchView.a.getText())) {
            locationSearchView.a(Collections.emptyList());
            locationSearchView.a.setText("");
        }
        locationSearchView.b(false);
        locationSearchView.a.requestFocus();
        locationSearchView.a.postDelayed(new Runnable() { // from class: afoo
            @Override // java.lang.Runnable
            public final void run() {
                whu.J(LocationSearchView.this.a);
            }
        }, 100L);
        this.e.b(new afos() { // from class: afoh
            @Override // defpackage.afos
            public final void a(astx astxVar) {
                afol afolVar = afol.this;
                if (astxVar != null) {
                    afoj afojVar = afolVar.c;
                    afojVar.a = astxVar;
                    afojVar.filter(((LocationSearchView) afolVar.a).a.getText());
                }
            }
        });
        this.d.d(acsb.b(39553), null, null);
    }
}
