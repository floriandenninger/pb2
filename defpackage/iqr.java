package defpackage;

import com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class iqr implements aypj {
    public final /* synthetic */ iqw a;
    public final /* synthetic */ asty b;
    private final /* synthetic */ int c;

    public /* synthetic */ iqr(iqw iqwVar, asty astyVar, int i) {
        this.c = i;
        this.a = iqwVar;
        this.b = astyVar;
    }

    @Override // defpackage.aypj
    public final void a(final ayue ayueVar) {
        if (this.c == 0) {
            final iqw iqwVar = this.a;
            final asty astyVar = this.b;
            iqwVar.L = new akam(akal.d(iqwVar), iqwVar.mM(), Arrays.asList(new PermissionDescriptor(3, acrb.EDIT_VIDEO_APPROVE_LOCATION_BUTTON, acrb.EDIT_VIDEO_DENY_LOCATION_BUTTON)), R.string.permission_open_settings_location, R.string.permissions_missing_location, new Runnable() { // from class: iqo
                @Override // java.lang.Runnable
                public final void run() {
                    iqw iqwVar2 = iqw.this;
                    asty astyVar2 = astyVar;
                    final ayue ayueVar2 = ayueVar;
                    iqwVar2.w(astyVar2).R(new ayrm() { // from class: iqs
                        @Override // defpackage.ayrm
                        public final void a() {
                            ayue.this.a();
                        }
                    });
                }
            }, new Runnable() { // from class: iqp
                @Override // java.lang.Runnable
                public final void run() {
                    ayue.this.a();
                }
            }, iqwVar.H);
            iqwVar.L.a();
            return;
        }
        iqw iqwVar2 = this.a;
        asty astyVar2 = this.b;
        iqu iquVar = iqwVar2.P;
        ayue ayueVar2 = iquVar.c;
        if (ayueVar2 != null && !ayueVar2.e()) {
            iquVar.c.a();
        }
        iquVar.c = ayueVar;
        iquVar.a = astyVar2;
        afol afolVar = iqwVar2.K;
        if (afolVar == null) {
            afolVar = iqwVar2.R.d((LocationSearchView) iqwVar2.findViewById(R.id.location_search_view), iqwVar2.P);
        }
        iqwVar2.m().setVisibility(8);
        iqwVar2.n().b(R.id.location_search_view);
        afolVar.a();
        iqwVar2.K = afolVar;
    }
}
