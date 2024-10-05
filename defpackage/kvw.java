package defpackage;

import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kvw {
    public final aahd a;
    public final PrivacySpinner b;
    public AdapterView.OnItemSelectedListener c;
    private final ajut d;

    public kvw(aahd aahdVar, ajut ajutVar, PrivacySpinner privacySpinner) {
        this.a = aahdVar;
        this.d = ajutVar;
        this.b = privacySpinner;
    }

    private final boolean d() {
        return this.b.getSelectedItem() instanceof aqpg;
    }

    public final void a(aqph aqphVar) {
        if (aqphVar != null && !aqphVar.c.isEmpty()) {
            for (aqpe aqpeVar : aqphVar.c) {
                aqpg aqpgVar = aqpeVar.c;
                if (aqpgVar == null) {
                    aqpgVar = aqpg.a;
                }
                if ((aqpgVar.b & 16384) != 0) {
                    aqpg aqpgVar2 = aqpeVar.c;
                    if (aqpgVar2 == null) {
                        aqpgVar2 = aqpg.a;
                    }
                    if ((aqpgVar2.b & 4) != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (aqpe aqpeVar2 : aqphVar.c) {
                            if ((aqpeVar2.b & 8) != 0) {
                                aqpg aqpgVar3 = aqpeVar2.c;
                                if (aqpgVar3 == null) {
                                    aqpgVar3 = aqpg.a;
                                }
                                arrayList.add(aqpgVar3);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        this.b.setAdapter((SpinnerAdapter) new kvv(this, this.b.getContext(), this.d, arrayList));
                        PrivacySpinner privacySpinner = this.b;
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList.size()) {
                                break;
                            }
                            if (((aqpg) arrayList.get(i2)).h) {
                                i = i2;
                                break;
                            }
                            i2++;
                        }
                        privacySpinner.setSelection(i);
                        this.b.setOnItemSelectedListener(new kvt(this));
                    }
                }
            }
        }
        this.b.c(3);
        this.b.setOnItemSelectedListener(new kvt(this));
    }

    public final int b() {
        if (!d()) {
            return this.b.d();
        }
        aqpg aqpgVar = (aqpg) this.b.getSelectedItem();
        return anaf.bu(aqpgVar.c == 6 ? ((Integer) aqpgVar.d).intValue() : 0);
    }

    public final void c(int i) {
        if (b() == i) {
            return;
        }
        if (d()) {
            for (int i2 = 0; i2 < this.b.getAdapter().getCount(); i2++) {
                aqpg aqpgVar = (aqpg) this.b.getAdapter().getItem(i2);
                int intValue = aqpgVar.c == 6 ? ((Integer) aqpgVar.d).intValue() : 0;
                int i3 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (intValue == i3) {
                    this.b.setSelection(i2);
                }
            }
            return;
        }
        this.b.e(i);
    }
}
