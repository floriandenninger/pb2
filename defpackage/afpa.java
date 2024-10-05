package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afpa extends vw {
    public final aqyg d;
    final /* synthetic */ afpb e;
    private final List f;

    public afpa(afpb afpbVar, aszh aszhVar) {
        this.e = afpbVar;
        this.f = aszhVar.g;
        aqyg aqygVar = aszhVar.d;
        this.d = aqygVar == null ? aqyg.a : aqygVar;
    }

    @Override // defpackage.vw
    public final int b() {
        return this.f.size() + 1;
    }

    @Override // defpackage.vw
    public final int c(int i) {
        return i;
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        return new afoz(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.video_thumbnail_button, viewGroup, false));
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, int i) {
        final afoz afozVar = (afoz) wvVar;
        if (i == 0) {
            afozVar.w.e.a(afozVar.t);
            afozVar.t.setImageDrawable(afozVar.w.e.C().getResources().getDrawable(R.drawable.video_thumbnail_button_selection_box, afozVar.w.e.C().getTheme()));
            afozVar.u.setText(ajcq.b(afozVar.w.d));
            afozVar.v.setVisibility(0);
            afozVar.v.setClickable(true);
            afozVar.v.setOnClickListener(new View.OnClickListener() { // from class: afox
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final apxf apxfVar;
                    aqyg aqygVar;
                    aqyg aqygVar2;
                    final afoz afozVar2 = afoz.this;
                    afpb afpbVar = afozVar2.w.e;
                    if (!afpbVar.ae && (afpbVar.a.b & 262144) != 0) {
                        afpbVar.mO().ai(new afoy(afozVar2), false);
                        afpb afpbVar2 = afozVar2.w.e;
                        aahd aahdVar = afpbVar2.e;
                        apxf apxfVar2 = afpbVar2.a.l;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        aahdVar.a(apxfVar2);
                        return;
                    }
                    aszh aszhVar = afpbVar.a;
                    if (aszhVar.h) {
                        if ((aszhVar.b & 32768) != 0) {
                            apxfVar = aszhVar.j;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                        } else {
                            apxfVar = null;
                        }
                        aszh aszhVar2 = afozVar2.w.e.a;
                        if ((aszhVar2.b & 16384) != 0) {
                            aqygVar = aszhVar2.i;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                        } else {
                            aqygVar = null;
                        }
                        Spanned b = ajcq.b(aqygVar);
                        aszh aszhVar3 = afozVar2.w.e.a;
                        if ((aszhVar3.b & 65536) != 0) {
                            aqygVar2 = aszhVar3.k;
                            if (aqygVar2 == null) {
                                aqygVar2 = aqyg.a;
                            }
                        } else {
                            aqygVar2 = null;
                        }
                        Spanned b2 = ajcq.b(aqygVar2);
                        if (apxfVar == null || TextUtils.isEmpty(b) || TextUtils.isEmpty(b2)) {
                            String.format(Locale.getDefault(), "Can not show info dialog: %s / %s / %s", apxfVar, b, b2);
                        } else {
                            new AlertDialog.Builder(afozVar2.w.e.C()).setMessage(b).setPositiveButton(b2, new DialogInterface.OnClickListener() { // from class: afow
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    afoz afozVar3 = afoz.this;
                                    afozVar3.w.e.e.a(apxfVar);
                                }
                            }).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
                        }
                    }
                }
            });
            return;
        }
        avgg avggVar = (avgg) this.f.get(i - 1);
        afozVar.w.e.a(afozVar.t);
        new afph(afozVar.w.e.C(), afozVar.t, afozVar.w.e.c).a(avggVar);
    }
}
